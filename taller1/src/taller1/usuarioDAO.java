/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * UsuarioDAO-> Data Access Object
 * @author aleja
 */
public class usuarioDAO {
    
    public static Connection getConexionBD(){
        
        Connection c = null;
        String host = "localhost";
        String user = "root";
        String password = "";
        int port = 3306;
        String database = "ventasdb";
        String url = "";
        
        //detectar q se encuentre enlazado el driver o conector con la aplicacion de escritorio(Java).
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Libreria Encontrada!");
        }
        catch(Exception ex){
            System.out.println("Libreria No Encontrada." + "" + ex.getMessage());
        }
        
        try{
            //http://servidor:puerto/database
            url = String.format("jdbc:mysql://%s:%d/%s", host, port, database);
            System.out.println("URL" + url);
            
            c = DriverManager.getConnection(url, user, password);
            System.out.println("La conexion a la BD es correcta.");
        }
        catch(SQLException ex){    
            System.out.println("Error en la conexion. " + ex);
        }
        return c;
    }   
    
    public void registrarUsuario(String ident, String nom, String apel, String cor, String usu, String pwd){
        
        String sql = "INSERT INTO tblusuario (identificacion, nombres, apellidos, correo, usuario, contrasena) VALUES (?,?,?,?,?,?)";

        try {
             Connection conn = getConexionBD();
             PreparedStatement pstmt = conn.prepareStatement(sql); 

            pstmt.setString(1, ident);
            pstmt.setString(2, nom);
            pstmt.setString(3, apel);
            pstmt.setString(4, cor);
            pstmt.setString(5, usu);
            pstmt.setString(6, pwd);

            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Un nuevo usuario fue insertado exitosamente.");
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar el usuario: " + e.getMessage());
        }
        
    }
}
