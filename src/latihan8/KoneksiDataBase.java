/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author obbyrashied
 */
public class KoneksiDataBase {
    private static Connection koneksi;
    
    public static Connection getKoneksi () 
    {
        // cek apakah koneksi null
        if(koneksi == null);
        {
            try{
                String url = "jdbc:mysql://localhost:3306/universitas";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Sukses");
            } catch (SQLException t) {
                System.out.println("Error Membuat Koneksi" + t);
            }
        }
        return koneksi;
    }
}
