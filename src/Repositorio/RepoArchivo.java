/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import DTO.Archivo;
import DTO.IComponentsActions;
import DTO.PC;
import DTO.StorageDevice;
import javax.swing.JProgressBar;

/**
 *
 * @author Jostin
 */
public class RepoArchivo implements IComponentsActions<Archivo> {

    private PC pc;
    private static RepoArchivo instancia;

    private RepoArchivo() {
        this.pc = RepoPC.getInstance().getComputador(); // Obtenemos el computador desde el repositorio
    }

    public static RepoArchivo getInstance() {
        if (instancia == null) {
            instancia = new RepoArchivo();
        }
        return instancia;
    }
    
    @Override
    public void agregar(Archivo componente) {
    }

    @Override
    public void modificar(Archivo componente) {
//        if (!computador.getTarjetaMadre().getStorageDevice().storageDevice.modificarArchivo(componente)) {
//            System.out.println("No se pudo modificar el archivo. Asegúrate de que haya suficiente espacio disponible.");
//        }
    }

    @Override
    public void eliminar(Archivo componente) {
//        if (!storageDevice.eliminarArchivo(componente)) {
//            System.out.println("No se pudo eliminar el archivo.");
//        }
    }

    @Override
    public String verInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void agregarArchivoSSD(Archivo archivo, JProgressBar progressBar) {
        var lsd = pc.getTarjetaMadre().getStorageDevice();
        for (int i = 0; i < lsd.size(); i++) {
            if (lsd.get(i).getTipo().equals("SSD")) {
                lsd.get(i).agregarArchivoConProgreso(archivo, progressBar);
            }
        }
    }

    public void agregarArchivoDiscoDuro(Archivo archivo, JProgressBar progressBar) {
        var ldd = pc.getTarjetaMadre().getStorageDevice();
        for (int i = 0; i < ldd.size(); i++) {
            if (ldd.get(i).getTipo().equals("Disco Duro")) {
                ldd.get(i).agregarArchivoConProgreso(archivo, progressBar);
            }
        }
    }

}
