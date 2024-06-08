/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Karaarslan
 */
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DbConnection {
    
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "sweet_bank";
    
    private final String USER = "root";
    private final String PASSWORD = "";
    
    protected Connection connection = null;
    protected Statement statement = null;
    
    public DbConnection()
    {
        //jdbc:myaql://localhost:3306/sweet_bank
        String url = "jdbc:mysql://" + this.HOST +":" +this.PORT+"/"+this.DB_NAME;
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.connection = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Connection succesful:)");
        } catch (SQLException ex) {
            System.out.println("Connection failed:(");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
