/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jonathan-David
 */
public class ConnectionUtils {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "JONATHAN";
    private static final String PASS = "12345";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }   
}
