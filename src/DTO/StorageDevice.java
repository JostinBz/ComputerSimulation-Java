/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author Jostin
 */
public abstract class StorageDevice {

    private String nombre;
    private String tipo;
    private boolean funciona;
    private double capacidad;
    private double velocidad;
    private double espacioUsado;
    private List<Archivo> archivos;

    public StorageDevice() {
    }

    public StorageDevice(String nombre, String tipo, boolean funciona, double capacidad, double velocidad, double espacioUsado, List<Archivo> archivos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.funciona = funciona;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.espacioUsado = 0;
        this.archivos = archivos;
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

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getEspacioUsado() {
        return espacioUsado;
    }

    public void setEspacioUsado(double espacioUsado) {
        this.espacioUsado = espacioUsado;
    }

    public double getAvailableSpace() {
        return capacidad - this.espacioUsado;
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<Archivo> archivos) {
        this.archivos = archivos;
    }

    public boolean agregarArchivo(Archivo archivo) {
        if (archivos == null) {
            archivos = new ArrayList<>();
        }
        if (archivo.getTamaño() + espacioUsado <= capacidad) {
            archivos.add(archivo);
            espacioUsado += archivo.getTamaño();
            return true;
        }
        return false;
    }

    public boolean modificarArchivo(Archivo archivo) {
        for (int i = 0; i < archivos.size(); i++) {
            Archivo a = archivos.get(i);
            if (a.getNombre().equals(archivo.getNombre())) {
                espacioUsado -= a.getTamaño();
                espacioUsado += archivo.getTamaño();
                if (espacioUsado <= capacidad) {
                    archivos.set(i, archivo);
                    return true;
                }
                espacioUsado -= archivo.getTamaño();
                espacioUsado += a.getTamaño();
            }
        }
        return false;
    }

    public boolean eliminarArchivo(Archivo archivo) {
        if (archivos.remove(archivo)) {
            espacioUsado -= archivo.getTamaño();
            return true;
        }
        return false;
    }

    public double getEspacioDisponible() {
        return capacidad - espacioUsado;
    }

    public void agregarArchivoConProgreso(Archivo archivo, JProgressBar progressBar) {
        if (archivo.getTamaño() + espacioUsado > capacidad) {
            JOptionPane.showMessageDialog(null, "No hay suficiente espacio en el dispositivo de almacenamiento.");
            return;
        }

        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                double tiempoCopia = archivo.getTamaño() / (getVelocidad() * 100); // Tiempo en segundos
                long tiempoCopiaMs = (long) (tiempoCopia * 500); // Convertir a milisegundos
                int progress = 0;
                long startTime = System.currentTimeMillis();

                while (progress < 100) {
                    long currentTime = System.currentTimeMillis();
                    progress = (int) ((currentTime - startTime) * 100 / tiempoCopiaMs);
                    publish(progress);
                    Thread.sleep(50);
                }
                publish(100);
                return null;
            }

            @Override
            protected void process(List<Integer> chunks) {
                for (int progress : chunks) {
                    progressBar.setValue(progress);
                }
            }

            @Override
            protected void done() {
                agregarArchivo(archivo);
                JOptionPane.showMessageDialog(null, "Archivo copiado exitosamente.");
            }
        };

        worker.execute();
    }

    public abstract void simulateCopySpeed(int fileSize);

}
