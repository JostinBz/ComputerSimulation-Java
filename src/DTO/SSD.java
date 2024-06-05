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
public class SSD extends StorageDevice {

    private double tiempoEscritura;

    public SSD(double tiempoEscritura) {
        this.tiempoEscritura = tiempoEscritura;
    }

    public SSD(double tiempoEscritura, String nombre, String tipo, boolean funciona, double capacidad, double velocidad, double espacioUsado, List<Archivo> archivos) {
        super(nombre, tipo, funciona, capacidad, velocidad, espacioUsado, archivos);
        this.tiempoEscritura = tiempoEscritura;
    }

    public SSD() {
    }

    public double getTiempoEscritura() {
        return tiempoEscritura;
    }

    public void setTiempoEscritura(double tiempoEscritura) {
        this.tiempoEscritura = tiempoEscritura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (super.isFunciona()) {
            
            sb.append("<p>Nombre:</p><p>").append(super.getNombre()).append("</p>");
            sb.append("<p>Capacidad:</p><p>").append(super.getCapacidad()).append("</p>");
            sb.append("<p>Velocidad:</p><p>").append(super.getVelocidad()).append("</p>");
            sb.append("<p>Tiempo de escritura:").append("<p>").append(tiempoEscritura).append("</p>");
            sb.append("<p>Estado:</p><p>").append("Funciona").append("</p>");
        } else {
            sb.append("<p>Nombre:</p><p>").append(super.getNombre()).append("</p>");
            sb.append("<p>Capacidad:</p><p>").append(super.getCapacidad()).append("</p>");
            sb.append("<p>Velocidad:</p><p>").append(super.getVelocidad()).append("</p>");
            sb.append("<p>Tiempo de escritura:").append("<p>").append(tiempoEscritura).append("</p>");
            sb.append("<p>Estado:</p><p>").append("No funciona").append("</p>");
        }
            return sb.toString();
    }

    @Override
    public void simulateCopySpeed(int fileSize) {
        
    }
}
