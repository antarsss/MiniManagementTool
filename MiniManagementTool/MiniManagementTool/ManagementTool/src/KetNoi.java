
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class KetNoi {

    public static Connection con;
    public static Statement s;

    public void KN() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection( "jdbc:sqlserver://ANTARSSS\\SQLEXPRESS:1433;databaseName = qlLV; user = sa; password = sa");
            s = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not connected");
        }

    }
}
