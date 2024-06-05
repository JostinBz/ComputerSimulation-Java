/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Jostin
 */
public class Puertos {

    private String nombre;
    private boolean funciona;

    public Puertos() {
    }

    public Puertos(String nombre, boolean funciona) {
        this.nombre = nombre;
        this.funciona = funciona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.funciona) {
            sb.append("<p>Nombre:</p>").append("<p>").append(nombre).append("</p>");
            sb.append("<p>Funciona:</p>").append("<p>").append("Funciona").append("</p>");
        } else {
            sb.append("<p>Nombre:</p>").append("<p>").append(nombre).append("</p>");
            sb.append("<p>Funciona:</p>").append("<p>").append("No funciona").append("</p>");
        }
        return sb.toString();
    }

}
