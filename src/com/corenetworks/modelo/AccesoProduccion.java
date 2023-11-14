package com.corenetworks.modelo;

public class AccesoProduccion implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Se inserta el cliente en PRODUCCION " +c1.getNombre();
    }
}
