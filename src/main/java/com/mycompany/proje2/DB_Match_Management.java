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
public class DB_Match_Management {

    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/db_sport?user=root&password=Mihra2021.";//Hangi veritabanına bağlandığımızı gösterir

    private static Connection conn;//Java kütüphanesi için connection tipinde bi değişken oluşturuyoruz

    public static boolean UpdateMatch(Match m1) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "UPDATE tbl_match SET "//Parametre olarak gönderilen maçın bilgileri id'si alınarak update edilir
                    + "first_team='" + m1.first_team
                    + "', second_team='" + m1.second_team
                    + "', week='" + m1.week
                    + "', time='" + m1.time
                    + "', score='" + m1.score
                    + "' WHERE id=" + m1.id + ";";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public static ArrayList<Match> SearchByMatchNameOrWeek(String search) {
        ArrayList<Match> mlist = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            //Takım ismine ve maç haftasına göre arama işlemi yapılır
            String query = "SELECT * FROM db_sport.tbl_match WHERE first_team = '" + search + "' OR second_team = '" + search + "' OR week = '" + search + "';";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {//Eğer bir data varsa rs.next'in içine girer ve ilgili datalar alınır
                Match match = new Match();
                match.id = rs.getInt("id");//Veri tabanındaki tipine ve ismine göre
                match.first_team = rs.getString("first_team");
                match.second_team = rs.getString("second_team");
                match.week = rs.getInt("week");
                match.time = rs.getString("time");
                match.score = rs.getString("score");

                mlist.add(match); 
            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
        return mlist;//Aranan özellikteki maçlar arraylist olarak döndürülür

    }

    public static Match SearchMatchById(int id) {
        Match match = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM db_sport.tbl_match WHERE id=" + id + ";";//Eğer bu id'ye sahip maç varsa veritabanından maç bilgileri çekilir
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {//Eğer bir data varsa rs.next'in içine girer ve ilgili datalar alınır
                
                match = new Match();
                match.id = rs.getInt("id");//Veri tabanındaki tipine ve ismine göre
                match.first_team = rs.getString("first_team");
                match.second_team = rs.getString("second_team");
                match.week = rs.getInt("week");
                match.time = rs.getString("time");
                match.score = rs.getString("score");

            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
        return match;//Aranan id'deki maç return ile döndürülür

    }

    public static boolean DeleteMatchById(int id) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "DELETE FROM db_sport.tbl_match WHERE id=" + id;//Parametre olarak verilen id'ye sahip maç veritabanından silinir
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;

        }
    }

    public static ArrayList<Match> GetMatches() {
        ArrayList<Match> matches = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM db_sport.tbl_match;";//Veritabanındaki tüm maçlar 
            ResultSet rs = stmt.executeQuery(query);
            matches = new ArrayList<>();
            while (rs.next()) {
                Match match = new Match();
                match.id = rs.getInt("id");
                match.first_team = rs.getString("first_team");
                match.second_team = rs.getString("second_team");
                match.week = rs.getInt("week");
                match.time = rs.getString("time");
                match.score = rs.getString("score");
                matches.add(match);
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return matches;

    }

    public static boolean AddMatch(Match m1) {
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO db_sport.tbl_match VALUES(" + m1.id + ",'" + m1.first_team + "','" + m1.second_team + "'," + m1.week + ",'" + m1.time + "','" + m1.score + "');";
            //verilen özelliklerde veritabanına maç eklenir
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;

        }
    }

}
