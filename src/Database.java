
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Peter
 */
public class Database {
    static Vector database = new Vector();
     public static void setDatabase() {
        database.add("CREATE TABLE persons(\n"
                + "     id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "     username VARCHAR(50),\n"
                + "     name VARCHAR(30) NOT NULL,\n"
                + "     password VARCHAR(50) NOT NULL, \n"
                + "     email VARCHAR(50) NOT NULL, \n"
                + "     role VARCHAR(50) NOT NULL, \n" 
                + "     favBooks TEXT, \n"
                + "     gender CHAR NOT NULL, \n"
                + "     phone VARCHAR(20) NOT NULL \n"
                + "     );");
        
        database.add("CREATE TABLE books(\n"
                + "     id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "     name VARCHAR(30) NOT NULL,\n"
                + "     img VARCHAR(50),\n"
                + "     genere VARCHAR(30),\n"
                + "     language VARCHAR(30),\n"
                + "     author VARCHAR(30) NOT NULL,\n"
                + "     rate REAL NOT NULL,\n"
                + "     price REAL NOT NULL,\n"
                + "     pages INTEGER NOT NULL \n"
                + "     );");
    }
     
    
    public static void main(String []args) {
        setDatabase();
        for(int i = 0 ; i < database.size(); i++) {
            System.out.println(database.get(i));
            boolean check = Tools.excecuateStatement(database.get(i).toString());
            if(check) {
                System.out.println(i + " _successful");
            } else {
                System.out.println(i + " _failed");
            }
        }
    }
}
