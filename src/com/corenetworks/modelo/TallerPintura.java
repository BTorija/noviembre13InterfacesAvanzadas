package com.corenetworks.modelo;

public class TallerPintura implements ITaller{
    @Override
    public String repararCoche(Coche c) {
        return "El coche se está pintando " +c.getMatricula() + " modelo: " +c.getModelo() +
                "\n Ya ha salido de la pintura";
    }
}
