
package model;
/*   Author: Griselda Medina Avendaño
    Creado : 8 mar 2022
    Actualización: 
    Descripción:
*/
import bd.Conexion;
import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.List;

public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;
    private static Usuario usuario;

    public void crearRegistro(Usuario usuario) throws SQLException {

        try {

            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();

            String sql = "insert into usuario(codigo,nombreUsuario,contraseña) values(?,?,?)";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, usuario.getCodigo());
                statement.setString(2, usuario.getNombreUsuario());
                statement.setString(3, usuario.getContraseña());
                statement.executeUpdate();
                System.out.println("datos insertados correctamente...");

            }
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }

    }

    @Override
    public void crearRegisto(Usuario usuario) {
        try{
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "INSERT INTO carrera (nombre) VALUES (?,?)";
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setString(1,usuario.getNombreUsuario());
                statement.executeUpdate();
            }
            conexion.desconectar();
            
        }catch(SQLException e){
            System.out.println("Error al crear el registro: "+e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {

            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();

            String sql = "update usuario set codigo=?,nombreUsuario=?,contraseña=? where codigo=?";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, usuario.getCodigo());
                statement.setString(2, usuario.getNombreUsuario());
                statement.setString(3, usuario.getContraseña());
                statement.setString(4, usuario.getCodigo());
                statement.executeUpdate();
                System.out.println("datos insertados correctamente...");

            }
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }

    }

    @Override
    public List<Usuario> obtenerRegistros() {
        // throw new UnsupportedOperationException("Not supported yet.");
        return null;
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return null;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminarResgistro(int idUsuario) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args) throws SQLException {

        UsuarioModelImpl um = new UsuarioModelImpl();
        Usuario u = new Usuario();

        u.setCodigo("1233");
        u.setNombreUsuario("pedro");
        u.setContraseña("ab");
        //  um.crearRegistro(u);
        um.actualizarRegistro(u);
       
    }

}
