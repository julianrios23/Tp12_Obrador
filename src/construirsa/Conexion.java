
package construirsa;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 
 * @author Julian Rios
 */
public class Conexion {
    
    private static String url = "jdbc:mariadb://localhost/obrador";    
    private static String usuario = "root";
    private static String password = "";
    private static Conexion conexion;// = null;

    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("carga driver ok");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error carga driver");
        }
    }

    public static Connection getConexion() {
        Connection con = null;

        if (conexion == null) {
            conexion = new Conexion();
        }

        try {
            con = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
            System.out.println("conexion ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error conexion");
        }
        return con;
    }
    /*
    public static void setData(String consulta, String mje) {

        Connection con = null;
        Statement sta = null;
        try {
            con = Conexion.getConnection();
            sta = con.createStatement();
            sta.executeUpdate(consulta);
            if (!mje.equals("")) {
                JOptionPane.showMessageDialog(null, mje);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        } finally {

        }
        try {
            con.close();
            sta.close();
        } catch (Exception e) {

        }
    }
    */
    
    /*
    public static ResultSet getResultSet(String consulta){
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            con = Conexion.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            return rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
    }
    
    */
}
