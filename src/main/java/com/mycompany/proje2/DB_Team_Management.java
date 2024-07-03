/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nesma
 */
public class DB_Team_Management {

    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/db_sport?user=root&password=Mihra2021.";//Hangi veritabanına bağlandığımızı gösterir

    private static Connection conn;//Java kütüphanesi için connection tipinde bi değişken oluşturuyoruz

    

    public static ArrayList<Team> GetTeams() {
        ArrayList<Team> teams = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM db_sport.tbl_team;";//Veritabanındaki tüm takımlar 
            ResultSet rs = stmt.executeQuery(query);
            teams = new ArrayList<>();
            while (rs.next()) {
                Team team = new Team();
                team.id = rs.getInt("id");
                team.name = rs.getString("team_name");
                team.coach = rs.getString("coach_name");
                teams.add(team);
            }
            conn.close();

        } catch (SQLException ex) {
          System.out.println(ex.getMessage());

        }
        return teams;

    }

    public static boolean UpdateTeam(Team tm1) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "UPDATE tbl_team SET "//Parametre olarak gönderilen takımın bilgileri id'si alınarak update edilir
                    + "team_name='" + tm1.name
                    + "', coach_name='" + tm1.coach
                    + "' WHERE id=" + tm1.id + ";";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }
     public static boolean DeleteTeamById(int id) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "DELETE FROM db_sport.tbl_team WHERE id=" + id;//Bu id'ye sahip takım veritabanından silinir
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

            return false;

        }
    }
    public static Team SearchTeamById(int id) {
        Team team = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM db_sport.tbl_team WHERE id="+id+";";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {//Eğer bir data varsa rs.next'in içine girer ve ilgili datalar alınır

                team = new Team();
                team.id = rs.getInt("id");//Veri tabanındaki tipine ve ismine göre
                team.name = rs.getString("team_name");
                team.coach = rs.getString("coach_name");

            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
        return team;

    }
    public static Team SearchTeamByName(String teamName) {
        Team team = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM db_sport.tbl_team WHERE team_name = '" + teamName + "';";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {//Eğer bir data varsa rs.next'in içine girer ve ilgili datalar alınır

                team = new Team();
                team.id = rs.getInt("id");//Veri tabanındaki tipine ve ismine göre
                team.name = rs.getString("team_name");
                team.coach = rs.getString("coach_name");

            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
        return team;

    }


    public static ArrayList<Team> SearchByTeamName(String search) {
        ArrayList<Team> tlist = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM db_sport.tbl_team WHERE team_name = '" + search + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {//Eğer bir data varsa rs.next'in içine girer ve ilgili datalar alınır
                Team tm1 = new Team();
                tm1.id = rs.getInt("id");//Veri tabanındaki tipine ve ismine göre
                tm1.name = rs.getString("team_name");
                tm1.coach = rs.getString("coach_name");

                tlist.add(tm1);
            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
        return tlist;//Aranan özellikteki takımlar arraylist olarak döndürülür

    }

    public static boolean AddTeam(Team tm1) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "INSERT INTO db_sport.tbl_team VALUES(" + tm1.id + ",'" + tm1.name + "','" + tm1.coach + "');";
            // Verilen özelliklerde veritabanına takım eklenir
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;

        }
    }

    public static boolean Register(Person person) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO db_sport.tbl_person"
                    + "(name_surname, email, password, telephone, user_type, is_receiveEmail) "//Verilen özelliklerde veritabanına kişi eklenir
                    + "VALUES('" + person.name_surname + "','" + person.email
                    + "','" + person.password + "','" + person.telephone + "','" + person.user_type + "'," + person.isReceiveEmail + ");";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;

        }
    }

    public static Person Login(String email, String password) {
        Person person = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM db_sport.tbl_person WHERE email='" + email + "' AND password='" + password + "';";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {////Eğer verilen email ve şifreyle eşleşen birisi varsa return olarak o kişi döndürülür

                person = new Person();
                person.id = rs.getInt("id");//Veritabanındaki tipine ve ismine göre
                person.name_surname = rs.getString("name_surname");
                person.email = rs.getString("email");
                person.password = rs.getString("password");
                person.telephone = rs.getString("telephone");
                person.user_type = rs.getString("user_type");
                person.isReceiveEmail = rs.getBoolean("is_receiveEmail");
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return person;

    }
}
