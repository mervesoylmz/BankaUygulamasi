
package database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection { // Süper Sınıf: bağlantı değişkenleri kullanılacak
    
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String VERITABANI_ISMI = "Orenda_Bank";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    protected Connection connection = null;
    protected Statement statement = null;

    public DbConnection() {
        // jdbc:mysql://localhost://3306/Orenda_Bank
        String url = "jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.VERITABANI_ISMI;
        
        try {
            Class.forName("com.mysql.jbdc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            this.connection = DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("Bağlantı Başarılı :)");
        }
        catch (SQLException ex){
            System.out.println("Bağlantı Başarısız :(");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null ,ex);
        }
    }

    private void log(Level SEVERE, Object object, SQLException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
