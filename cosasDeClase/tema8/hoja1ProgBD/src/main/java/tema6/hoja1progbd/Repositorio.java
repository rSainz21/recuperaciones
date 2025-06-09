/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema6.hoja1progbd;

import java.util.List;

/**
 *
 * @author DAM109
 */
public interface Repositorio<T> {
    public List<T> listar();
    
    public void eliminar(int id);
    void agregar(T t);
    public T actualizar(int id);
}
