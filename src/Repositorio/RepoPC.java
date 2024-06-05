/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import DTO.IPcActions;
import DTO.PC;
import DTO.TarjetaMadre;

/**
 *
 * @author Jostin
 */
public class RepoPC implements IPcActions {

    private PC computador;
    private static RepoPC instancia;

    public RepoPC() {
    }

    public RepoPC(PC computador) {
        this.computador = computador;
    }

    public static RepoPC getInstance() {
        if (instancia == null) {
            instancia = new RepoPC();
        }
        return instancia;
    }

    public PC getComputador() {
        return computador;
    }

    @Override
    public void encender() {
        if (!this.computador.isPowerActive()) {
            this.computador.setPowerActive(true);
        }
    }

    @Override
    public void Apagar() {
        if (this.computador.isPowerActive()) {
            this.computador.setPowerActive(false);
        }
    }

    @Override
    public boolean isPower() {
        boolean result = false;
        if(this.computador != null){
        result = this.computador.isPowerActive();
        }
        return result;
    }

    @Override
    public void crearPc(TarjetaMadre board) {
        if (this.computador == null) {
            this.computador = new PC(board, false);
        }
    }

    @Override
    public boolean pcIsCreated() {
        boolean resultado;
        resultado = this.computador != null;
        return resultado;
    }

}
