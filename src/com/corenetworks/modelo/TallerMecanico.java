package com.corenetworks.modelo;

public class TallerMecanico implements ITaller{
    @Override
    public String repararCoche(Coche c) {
        return "El coche está en el taller Mecanico " +c.getMatricula()+ " modelo: " +c.getModelo() +
                "\n Ya ha salido de la reparación";
    }
}
