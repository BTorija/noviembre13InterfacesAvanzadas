package com.corenetworks.modelo;

public class Coche1 implements IVehiculo{
    private int deposito;

    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche se está moviendo";
        }
        else{
            return "---SIN GASOLINA---";
        }

    }

    @Override
    public String toString() {
        return "Coche1{" +
                "deposito=" + deposito +
                '}';
    }

    public Coche1() {
    }

    public Coche1(int deposito) {
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
