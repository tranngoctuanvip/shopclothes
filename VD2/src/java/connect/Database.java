/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Database {
    public static String url=
            "jdbc:mysql://localhost:3306/webdidong?useUnicode=true&characterEncoding=utf8";
    public static String user="root";
    public static String pass="";
    public static Connection KetnoiConnection(){
        Connection conn= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null,e);
        }
        catch(ClassNotFoundException e){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null,e);
        }
        return conn;
    }
}
