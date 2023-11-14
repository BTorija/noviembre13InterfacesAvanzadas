package com.corenetworks.modelo;

public class SeguroCoche {
    private ITaller taller; // que es el acoplamiento??
    private  String aseguradora;

    public String reparar(Coche c){
        return taller.repararCoche(c);
    }

    @Override
    public String toString() {
        return "SeguroCoche{" +
                "taller=" + taller +
                ", aseguradora='" + aseguradora + '\'' +
                '}';
    }

    public SeguroCoche() {
    }

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
