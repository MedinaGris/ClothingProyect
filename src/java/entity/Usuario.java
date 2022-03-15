
package entity;
/*   Author: Griselda Medina Avendaño
    Creado : 8 mar 2022
    Actualización: 
    Descripción:
*/
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioModelImpl;


public class Usuario extends Persona{
    private String codigo;
    private String nombreUsuario;
    private String contraseña;
    private static Usuario usuario;

    public Usuario() {
    }

    public Usuario(String codigo, String nombreUsuario, String contraseña) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
      public static void main(String[] args) throws SQLException {
        Usuario u1=new Usuario();
        u1.setCodigo("1");
        u1.setNombreUsuario("griselda");
        u1.setContraseña("medina");
  
        
    }
    
    
}
