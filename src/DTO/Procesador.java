/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Jostin
 */
public class Procesador {
    private int nucleos;
    private String modelo;
    private double velocidad;
    private boolean funcional;

    public Procesador() {
    }

    public Procesador(int nucleos, String modelo, double velocidad, boolean funcional) {
        this.nucleos = nucleos;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.funcional = funcional;
    }

    
    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    @Override
    public String toString() {
        if (this.funcional) {
        return "<html>Modelo:<p>" + modelo + "<p>Velocidad:</p>" + velocidad
                + "<p>Nucleos:</p>" + nucleos +
                "<p>Estado:</p>" + "Funciona"+"</html>";
        }else{
            return "<html>Modelo:<p>" + modelo + "</br><p>Velocidad:</p>" + velocidad
                    + "<p>Nucleos:</p>" + nucleos +
                "<p>Estado:</p>" + "Dañado"+"</html>";
        }
    }   
}
