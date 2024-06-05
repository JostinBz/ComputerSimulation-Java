/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Jostin
 */
public class PC{
    private TarjetaMadre tarjetaMadre;
    private boolean powerActive;

    public PC(TarjetaMadre tarjetaMadre) {
        this.tarjetaMadre = tarjetaMadre;
    }

    public PC(TarjetaMadre tarjetaMadre, boolean powerActive) {
        this.tarjetaMadre = tarjetaMadre;
        this.powerActive = powerActive;
    }

    public PC() {
    }

    public TarjetaMadre getTarjetaMadre() {
        return tarjetaMadre;
    }

    public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
        this.tarjetaMadre = tarjetaMadre;
    }

    public boolean isPowerActive() {
        return powerActive;
    }

    public void setPowerActive(boolean powerActive) {
        this.powerActive = powerActive;
    }
}
