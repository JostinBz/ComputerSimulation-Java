/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import DTO.IComponentsActions;
import DTO.*;

/**
 *
 * @author Jostin
 */
public class RepoSSD implements IComponentsActions<SSD> {

    private SSD ssd;
    private static RepoSSD instancia;

    public RepoSSD() {
    }

    public RepoSSD(SSD ssd) {
        this.ssd = ssd;
    }

    public static RepoSSD getInstance() {
        if (instancia == null) {
            instancia = new RepoSSD();
        }
        return instancia;
    }

    @Override
    public void agregar(SSD ssd) {
        if (ssd == null) {
            this.ssd = ssd;
        }
    }

    @Override
    public void modificar(SSD ssd) {
        if (this.ssd != null) {
            this.ssd.setTipo(ssd.getTipo());
            this.ssd.setVelocidad(ssd.getVelocidad());
            this.ssd.setNombre(ssd.getNombre());
            this.ssd.setCapacidad(ssd.getCapacidad());
            this.ssd.setEspacioUsado(ssd.getEspacioUsado());
            this.ssd.setFunciona(ssd.isFunciona());
        }
    }

    @Override
    public void eliminar(SSD ssd) {
        if (this.ssd != null) {
            this.ssd = null;
        }
    }

    @Override
    public String verInformacion() {
        if (this.ssd != null) {
            return this.ssd.toString();
        } else {
            return "No se encontro componente";
        }
    }

    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
