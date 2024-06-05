/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DTO;

/**
 *
 * @author Jostin
 */
public interface IPcActions {
    void encender();
    void Apagar();
    boolean isPower();
    void crearPc(TarjetaMadre board);
    boolean pcIsCreated();
}
