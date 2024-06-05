package Repositorio;

import DTO.IComponentsActions;
import DTO.StorageDevice;
import java.util.ArrayList;
import java.util.List;


public class RepoStorageDivice implements IComponentsActions<StorageDevice> {
    
    private List<StorageDevice> storagedevice;
    private static RepoStorageDivice instancia;

    public RepoStorageDivice() {
        this.storagedevice = new ArrayList<>();
    }

    public RepoStorageDivice(List<StorageDevice> storagedevice) {
        this.storagedevice = storagedevice;
    }

    public static RepoStorageDivice getInstance() {
        if (instancia == null) {
            instancia = new RepoStorageDivice();
        }
        return instancia;
    }

    public List<StorageDevice> getStoragedevice() {
        return storagedevice;
    }

    @Override
    public void agregar(StorageDevice componente) {
        this.storagedevice.add(componente);
    }

    @Override
    public void modificar(StorageDevice componente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(StorageDevice componente) {
        for (int i = 0; i < this.storagedevice.size(); i++) {
            if (componente.getNombre().equals(this.storagedevice.get(i).getNombre())) {
                this.storagedevice.remove(i);
            }
        }
    }

    @Override
    public String verInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void eliminar(int id) {
        this.storagedevice.remove(id);
    }
    
    public boolean existStorageDevice(){
        boolean resultado;
        resultado = this.storagedevice.isEmpty();
        return resultado;
    }
    
}
