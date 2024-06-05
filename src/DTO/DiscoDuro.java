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
public class DiscoDuro extends StorageDevice {

    private int numberOfPlatters;
    private double platterCapacity;

    public DiscoDuro() {
    }

    public DiscoDuro(int numberOfPlatters, double platterCapacity) {
        this.numberOfPlatters = numberOfPlatters;
        this.platterCapacity = platterCapacity;
    }

    public DiscoDuro(int numberOfPlatters, double platterCapacity, String nombre, String tipo, boolean funciona, double capacidad, double velocidad, double espacioUsado, List<Archivo> archivos) {
        super(nombre, tipo, funciona, capacidad, velocidad, espacioUsado, archivos);
        this.numberOfPlatters = numberOfPlatters;
        this.platterCapacity = platterCapacity;
    }
    
    
    public int getNumberOfPlatters() {
        return numberOfPlatters;
    }

    public void setNumberOfPlatters(int numberOfPlatters) {
        this.numberOfPlatters = numberOfPlatters;
    }

    public double getPlatterCapacity() {
        return platterCapacity;
    }

    public void setPlatterCapacity(double platterCapacity) {
        this.platterCapacity = platterCapacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (super.isFunciona()) {
            sb.append("<html>");
            sb.append("<p>Nombre:</p><p>").append(super.getNombre()).append("</p>");
            sb.append("<p>Capacidad:</p><p>").append(super.getCapacidad()).append("</p>");
            sb.append("<p>Velocidad:</p><p>").append(super.getVelocidad()).append("</p>");
            sb.append("<p>Numero de Discos:").append("<p>").append(getNumberOfPlatters()).append("</p>");
            sb.append("<p>Capacidad de los Discos:").append("<p>").append(getPlatterCapacity()).append("</p>");
            sb.append("<p>Espacio disponible:").append("<p>").append(super.getEspacioDisponible()).append("GB</p>");
            sb.append("<p>Estado:</p><p>").append("Funciona").append("</p>");
            sb.append("</html>");
        } else {
            sb.append("<html>");
            sb.append("<p>Nombre:</p><p>").append(super.getNombre()).append("</p>");
            sb.append("<p>Capacidad:</p><p>").append(super.getCapacidad()).append("</p>");
            sb.append("<p>Velocidad:</p><p>").append(super.getVelocidad()).append("</p>");
            sb.append("<p>Numero de Discos:").append("<p>").append(getNumberOfPlatters()).append("</p>");
            sb.append("<p>Capacidad de los Discos:").append("<p>").append(getPlatterCapacity()).append("</p>");
            sb.append("<p>Estado:</p><p>").append("No funciona").append("</p>");
            sb.append("</html>");
        }
        return sb.toString();
    }

    @Override
    public void simulateCopySpeed(int fileSize) {
        
    }
}
