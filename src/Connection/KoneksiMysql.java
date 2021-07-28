/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;
import com.mysql.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class KoneksiMysql {

   
    public Connection conn;
    public Statement stm;
    
    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/penjahit";
    String username = "root";
    String password = "";
 
    public void getKoneksiMysql(){
        try {
            conn = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Sukses ");
            stm = (Statement) conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("Koneksi Gagal");
            Logger.getLogger(KoneksiMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
