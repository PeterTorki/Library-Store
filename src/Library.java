
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

/**
 *
 * @author Peter
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    //To Chane
    private static int loginId;
    private static boolean isAdmin;
    private static String usernameId;
    private static String nameId;
    private static String passwordId;
    private static String emailId;
    private static Set<Integer> favBooks = new HashSet<Integer>();
    private static char genderId;
    private static String phoneId;
    private static String pathId;
    private static Mainmenu  menuu;
    private static int choosedBook;
    private static String choosedBookPath;
    private static String genere = "All";
    private static Map<String, Vector<Integer>> booksMap = new HashMap<String, Vector<Integer>>();

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static boolean isIsAdmin() {
        return isAdmin;
    }

    public static void setIsAdmin(boolean isAdmin) {
        Library.isAdmin = isAdmin;
    }

    public static Mainmenu getMenuu() {
        return menuu;
    }

    public static void setMenuu(Mainmenu menuu) {
        Library.menuu = menuu;
    }

    
    
    public static String getUsernameId() {
        return usernameId;
    }

    public static void setUsernameId(String usernameId) {
        Library.usernameId = usernameId;
    }

    public static String getNameId() {
        return nameId;
    }

    public static void setNameId(String nameId) {
        Library.nameId = nameId;
    }

    public static String getPasswordId() {
        return passwordId;
    }

    public static void setPasswordId(String passwordId) {
        Library.passwordId = passwordId;
    }

    public static String getEmailId() {
        return emailId;
    }

    public static void setEmailId(String emailId) {
        Library.emailId = emailId;
    }

    public static char getGenderId() {
        return genderId;
    }

    public static void setGenderId(char genderId) {
        Library.genderId = genderId;
    }

    public static String getPhoneId() {
        return phoneId;
    }

    public static void setPhoneId(String phoneId) {
        Library.phoneId = phoneId;
    }

    public static String getPathId() {
        return pathId;
    }

    public static void setPathId(String pathId) {
        Library.pathId = pathId;
    }
    
    
    
    public static int getChoosedBook() {
        return choosedBook;
    }

    public static void setChoosedBook(int choosedBook) {
        Library.choosedBook = choosedBook;
    }
    public static void setLoginId(int loginId) {
        Library.loginId = loginId;
    }
    
    public static int getLoginId() {
        return loginId;
    }

    public static String getGenere() {
        return genere;
    }

    public static void setGenere(String genere) {
        Library.genere = genere;
    }
    
    public static void initFavBooks() {
        //To Chane
        int id = Library.getLoginId();
        String st = "SELECT favBooks FROM persons WHERE id='"+id+"';";
        try {
            Tools.connectionToSql();
            ResultSet rs = Tools.selectQuery(st);
            while(rs.next()){
            String[] sa = rs.getString(1).split(",");
            
            for(String i : sa)  
                favBooks.add(parseInt(i));
            }
            
            Tools.closeConnection();
        }catch(Exception ex) {
            System.out.println("User" + id+ " has no fav Books");
        }
    }

    public static String getChoosedBookPath() {
        return choosedBookPath;
    }

    public static void setChoosedBookPath(String choosedBookPath) {
        Library.choosedBookPath = choosedBookPath;
    }
    
    public static Set<Integer> getFavBooks() {
        return favBooks;
    }
 
    public static void initMap() {
        Tools.connectionToSql();
        String sql = "SELECT * FROM books";
        booksMap.put("All",new Vector<Integer>());
        Vector<Integer>All = new Vector<Integer>();

        try {
            ResultSet rs = Tools.selectQuery(sql);
            while(rs.next()){ 
                All.add(rs.getInt(1));
                if(booksMap.get(rs.getString(4)) == null) {
                    booksMap.put(rs.getString(4),new Vector<Integer>()) ;
                }
                
                booksMap.get(rs.getString(4)).add(rs.getInt(1));
                System.out.println(booksMap.get(rs.getString(4)));
                booksMap.put(rs.getString(4), booksMap.get(rs.getString(4)));
            }
            booksMap.put("All", All);
            
            for (Map.Entry<String, Vector<Integer>> e : booksMap.entrySet()){
              for(int i: e.getValue())  
                  System.out.print(i);
            }

            } catch(Exception ex) {
                ex.printStackTrace();
        }
        Tools.closeConnection();

    }

    public static Map<String, Vector<Integer>> getBooksMap() {
        return booksMap;
    }
    
    
}
