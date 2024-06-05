/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DTO;

import java.util.List;

/**
 *
 * @author Jostin
 */
public interface IComponentsActions<T> {
    void agregar(T componente);
    void modificar(T componente);
    void eliminar(T componente);
    String verInformacion();
}
