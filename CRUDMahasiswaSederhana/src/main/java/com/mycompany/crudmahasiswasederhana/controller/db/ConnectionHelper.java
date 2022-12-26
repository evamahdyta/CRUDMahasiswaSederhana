/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudmahasiswasederhana.controller.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059) 
 */
public class ConnectionHelper {
    public static Connection connect;
    public static Statement st;
    public static ResultSet rs;
    
    public static Connection getConnection(){
        if(connect==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sisteminformasi", "root", "");
                st = connect.createStatement();
                JOptionPane.showMessageDialog(null, "Terkoneksi");
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Tidak Terkoneksi");
            }
        }
        return connect;
    }
    
    public static void main(String[] args){
        ConnectionHelper.getConnection();
    }

}
