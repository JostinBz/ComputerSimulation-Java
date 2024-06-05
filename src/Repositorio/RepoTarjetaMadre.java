/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import DTO.IComponentsActions;
import DTO.TarjetaMadre;

/**
 *
 * @author Jostin
 */
public class RepoTarjetaMadre implements IComponentsActions<TarjetaMadre>{

    private TarjetaMadre board;
    private static RepoTarjetaMadre instancia;

    public RepoTarjetaMadre() {
    }

    public RepoTarjetaMadre(TarjetaMadre board) {
        this.board = board;
    }
    
    public static RepoTarjetaMadre getInstance() {
        if (instancia == null) {
            instancia = new RepoTarjetaMadre();
        }
        return instancia;
    }

    public TarjetaMadre getBoard() {
        return board;
    }
    
    
    @Override
    public void agregar(TarjetaMadre componente) {
        if(this.board == null)
        this.board = componente;
    }

    @Override
    public void modificar(TarjetaMadre componente) {
        if(this.board != null){
            this.board.setNombre(componente.getNombre());
            this.board.setProcesador(componente.getProcesador());
            this.board.setPuertos(componente.getPuertos());
            this.board.setRom(componente.getRom());
            this.board.setStorageDevice(componente.getStorageDevice());
            this.board.setFuncional(componente.isFuncional());
        }
    }

    @Override
    public void eliminar(TarjetaMadre tipo) {
        this.board = null;
    }

    @Override
    public String verInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
