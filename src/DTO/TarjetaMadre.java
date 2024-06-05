/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 *
 * @author Jostin
 */
public class TarjetaMadre {

    private String nombre;
    private List<Puertos> puertos;
    private List<StorageDevice> interfaces;
    private Procesador procesador;
    private UnidadOptica rom;
    private boolean funcional;

    public TarjetaMadre() {
    }

    public TarjetaMadre(String nombre, List<Puertos> puertos, List<StorageDevice> interfaces, Procesador procesador, UnidadOptica rom, boolean funcional) {
        this.nombre = nombre;
        this.puertos = puertos;
        this.interfaces = interfaces;
        this.procesador = procesador;
        this.rom = rom;
        this.funcional = funcional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Puertos> getPuertos() {
        return puertos;
    }

    public void setPuertos(List<Puertos> puertos) {
        this.puertos = puertos;
    }

    public List<StorageDevice> getStorageDevice() {
        return interfaces;
    }

    public void setStorageDevice(List<StorageDevice> interfaces) {
        this.interfaces = interfaces;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public UnidadOptica getRom() {
        return rom;
    }

    public void setRom(UnidadOptica rom) {
        this.rom = rom;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    
}
