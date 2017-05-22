/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTEST6;

/**
 *
 * @author X455LA
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/p_visual","root","");
        JOptionPane.showMessageDialog(null, "koneksi berhasil");
                
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Koneksi Gagal: "+e.getMessage());
    
    }
        return con;
    }
    
    public static void main(String[] args) {
        koneksi koneksi = new koneksi();
        koneksi.getConnection();
    }
}
