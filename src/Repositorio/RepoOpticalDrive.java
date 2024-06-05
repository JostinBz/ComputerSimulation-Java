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
public class RepoOpticalDrive implements IComponentsActions<UnidadOptica> {

    private UnidadOptica manejador;
    private static RepoOpticalDrive instancia;

    public RepoOpticalDrive() {
    }

    public RepoOpticalDrive(UnidadOptica manejador) {
        this.manejador = manejador;
    }

    public static RepoOpticalDrive getInstance() {
        if (instancia == null) {
            instancia = new RepoOpticalDrive();
        }
        return instancia;
    }

    public UnidadOptica getManejador() {
        return manejador;
    }
    

    @Override
    public void agregar(UnidadOptica manejador) {
        if (this.manejador == null) {
            this.manejador = manejador;
        }
    }

    @Override
    public void modificar(UnidadOptica manejador) {
        try {
            if (this.manejador != null) {
                this.manejador.setType(manejador.getType());
                this.manejador.setCapacidad(manejador.getCapacidad());
                this.manejador.setFunciona(manejador.isFunciona());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(UnidadOptica manejador) {
        try {
            if (this.manejador != null) {
                this.manejador = null;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String verInformacion() {
        if (this.manejador != null) {
            return this.manejador.toString();
        } else {
            return "No se encontro componente";
        }
    }

}
