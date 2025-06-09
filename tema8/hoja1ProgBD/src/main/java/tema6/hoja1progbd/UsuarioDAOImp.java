/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hoja1progbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM109
 */
public class UsuarioDAOImp implements Repositorio<Usuario> {

    private Connection conn;

    public UsuarioDAOImp() {
        conn = AccesoBaseDatos.getInstance().getConn();
    }

    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT id,username,password,email FROM usuarios");) {
            while (rs.next()) {
                Usuario usuario = this.crearUsuario(rs);
                if (rs.next()) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return usuarios;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM usuarios WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, id);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha borrado un solo registro");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Usuario actualizar(int id) {
        Usuario usuario = null;
        String sql = "SELECT id,username,password,email FROM usuarios WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    usuario = this.crearUsuario(rs);
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        return usuario;
    }

    @Override
    public void agregar(Usuario usuario) {
        String sql = null;
        if (usuario.getId() > 0) {
            sql = "UPDATE usuarios SET username=?,password=md5(?),email=? WHERE id=?";
        } else {
            sql = "INSERT INTO usuarios(username,password,email) VALUES (?,MD5(?),?)";
        }
        try (PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            if (usuario.getId() > 0) {
                stmt.setInt(4, usuario.getId());
            }
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            }
            try (ResultSet rs = stmt.getGeneratedKeys();) {
                if (rs.next()) {
                    usuario.setId(rs.getInt(1));
                }
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private Usuario crearUsuario(final ResultSet rs) throws SQLException {
        return new Usuario(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("email"));
    }

    

    

    
}
