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

        try {
            //empleado 1
            int dni = 21450;
            String apellido = "Perez";
            String nombre = "Juan";
            int acc = 1;
            boolean estado = true;
           
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, dni);
                ps.setString(2, apellido);
                ps.setString(3, nombre);
                ps.setInt(4, acc);
                ps.setBoolean(5, estado);
                ps.executeUpdate();
            }

            //empleado2
            int dni1 = 30256145;
            String apellido1 = "Torrez";
            String nombre1 = "Gabriel";
            int acc1 = 1;
            boolean estado1 = true;

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, dni1);
                ps.setString(2, apellido1);
                ps.setString(3, nombre1);
                ps.setInt(4, acc1);
                ps.setBoolean(5, estado1);
                ps.executeUpdate();
            }

            //empleado3
            int dni2 = 25037238;
            String apellido2 = "Rios";
            String nombre2 = "Julian";
            int acc2 = 1;
            boolean estado2 = true;

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, dni2);
                ps.setString(2, apellido2);
                ps.setString(3, nombre2);
                ps.setInt(4, acc2);
                ps.setBoolean(5, estado2);
                ps.executeUpdate();
            }

            System.out.println("Se cargaron los empleados correctamente");
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
