/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import DTO.IComponentsActions;
import DTO.Puertos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jostin
 */
public class RepoPuertos implements IComponentsActions<Puertos> {

    private List<Puertos> puerto;
    private static RepoPuertos instancia; // Instancia única de la clase

    private RepoPuertos() {
        this.puerto = new ArrayList<>(); // Inicializar la lista de puertos
    }

    public RepoPuertos(List<Puertos> puerto) {
        this.puerto = puerto != null ? puerto : new ArrayList<>(); // Inicializar la lista de puertos si no es nula
    }

    public static RepoPuertos getInstance() {
        if (instancia == null) {
            instancia = new RepoPuertos();
        }
        return instancia;
    }

    public List<Puertos> getPuerto() {
        return puerto;
    }

    @Override
    public void agregar(Puertos componente) {
        this.puerto.add(componente);
    }

    @Override
    public void modificar(Puertos componente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Puertos componente) {

    }

    @Override
    public String verInformacion() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("<html>"); 
        if (this.puerto != null && !this.puerto.isEmpty()) {
            for (Puertos p : this.puerto) {
                resultado.append(p.toString()); // Agregar un salto de línea HTML después de cada puerto
            }
        } else {
            resultado.append("No se encontraron Puertos");
        }
        resultado.append("</html>"); 
        return "<html>" + resultado.toString() + "</html>";
    }

    public int getNumeroDePuertos() {
        return puerto.size();
    }

    public void elimiarPuerto() {
        if (!this.puerto.isEmpty()) {
            int ultimo = getNumeroDePuertos() - 1;
            this.puerto.remove(ultimo);
        }
    }

    public void eliminar(int id) {
    }
    
    
}
