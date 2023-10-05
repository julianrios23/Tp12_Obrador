package construirsa;

import java.sql.*;

/**
 *
 * @author Julian Rios
 */
public class ConstruirSA {

    public static void main(String[] args) {

        Connection con;
        con = Conexion.getConexion();

        String sql = "INSERT INTO empleado (dni, apellido, nombre, acceso, estado) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //empleado 1
            int dni = 40999256;
            String apellido = "Sbodio";
            String nombre = "Mateo";
            int acc = 1;
            boolean estado = true;

            ps.setInt(1, dni);
            ps.setString(2, apellido);
            ps.setString(3, nombre);
            ps.setInt(4, acc);
            ps.setBoolean(5, estado);
            ps.executeUpdate();

            System.out.println("Se cargo el empleado correctamenet");
        } catch (SQLException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }

//        String sql1 = "INSERT INTO herramientas (nombre, descripcion, stock, estado) VALUES (?, ?, ?, ?)";
//
//        try (PreparedStatement ps = con.prepareStatement(sql1)) {
//            //  herramienta
//            ps.setString(1, "Amoladora");
//            ps.setString(2, "De mano");
//            ps.setInt(3, 11); 
//            ps.setBoolean(4, true); 
//            ps.executeUpdate();
//
//            System.out.println("Se cargo la herramienta.");
//        } catch (SQLException e) {
//            System.err.println("Error al cargar datos: " + e.getMessage());
//
//        }
    }

}
