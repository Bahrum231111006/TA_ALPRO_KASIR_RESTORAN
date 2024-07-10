package restorant_231111009;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class koneksi {
    private String url="jdbc:mysql://localhost/restorant_231111009";
    private String username_xammp = "root";
    private String password_xammp = "";
    private Connection con;
    
    public void connect() {
        try {
            con = DriverManager.getConnection(url,username_xammp,password_xammp);
            System.out.println("Koneksi Berhasil");
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon() {
        return con;
    }
}
