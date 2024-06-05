/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Jostin
 */
public class UnidadOptica {

    private String type;
    private double capacidad;
    private boolean funciona;

    public UnidadOptica() {
    }

    public UnidadOptica(String type, double capacidad, boolean funciona) {
        this.type = type;
        this.capacidad = capacidad;
        this.funciona = funciona;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }

    @Override
    public String toString() {
        return "<html>"
                + "Tipo:" + "<p>" + type + "</p>"
                + "<p>Capacidad:</p>" + "<p>" + this.capacidad + "</p>"
                + "<p>Funciona:</p>" + "<p>" + this.funciona + "</p>"
                + "</html>";
    }

}
