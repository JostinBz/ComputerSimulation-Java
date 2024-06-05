/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import DTO.Archivo;
import DTO.DiscoDuro;
import DTO.IComponentsActions;

/**
 *
 * @author Jostin
 */
public class RepoDiscoDuro implements IComponentsActions<DiscoDuro> {

    private DiscoDuro discoDuro;
    private static RepoDiscoDuro instancia;

    public RepoDiscoDuro() {
    }

    public RepoDiscoDuro(DiscoDuro disco) {
        this.discoDuro = disco;
    }

    public static RepoDiscoDuro getInstance() {
        if (instancia == null) {
            instancia = new RepoDiscoDuro();
        }
        return instancia;
    }

    @Override
    public void agregar(DiscoDuro disco) {
        this.discoDuro = disco;
    }

    @Override
    public void modificar(DiscoDuro disco) {
        if (this.discoDuro != null) {
            this.discoDuro.setCapacidad(disco.getCapacidad());
            this.discoDuro.setVelocidad(disco.getVelocidad());
        }
    }

    @Override
    public void eliminar(DiscoDuro tipo) {
        this.discoDuro = null;
    }

    @Override
    public String verInformacion() {
        if (this.discoDuro != null) {
            return this.discoDuro.toString();
        } else {
            return "No se encontro componente";
        }
    }

    public static double getEspacioDiponible() {
        double rr = 0;
        return rr;
    }
    
    public static void addArchivo(Archivo archivo){
        
    }

}
