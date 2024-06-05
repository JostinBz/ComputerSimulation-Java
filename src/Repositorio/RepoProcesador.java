/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import DTO.Procesador;
import DTO.IComponentsActions;

/**
 *
 * @author Jostin
 */
public class RepoProcesador implements IComponentsActions<Procesador> {

    private Procesador procesador;
    private static RepoProcesador instancia; // Instancia única de la clase

    private RepoProcesador() {
        // Constructor privado para evitar instanciación directa
    }

    public RepoProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public static RepoProcesador getInstance() {
        if (instancia == null) {
            instancia = new RepoProcesador();
        }
        return instancia;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    @Override
    public void agregar(Procesador componente) {
        if (this.procesador == null) {
            this.procesador = componente; // Si no hay un procesador almacenado, lo agregamos
        }
    }

    @Override
    public void modificar(Procesador componente) {
        if (this.procesador != null) {
            this.procesador.setModelo(componente.getModelo());
            this.procesador.setVelocidad(componente.getVelocidad());
            this.procesador.setNucleos(componente.getNucleos());
            this.procesador.setFuncional(componente.isFuncional());
        }
    }

    @Override
    public void eliminar(Procesador tipo) {
        if (this.procesador != null) {
        this.procesador = null;
        }
    }

    @Override
    public String verInformacion() {
        if (this.procesador != null) {
            return this.procesador.toString();
        } else {
            return "No se encontro componente";
        }
    }

}
