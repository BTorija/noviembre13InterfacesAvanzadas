package com.corenetworks.Presentacion;

import com.corenetworks.modelo.Coche1;
import com.corenetworks.modelo.Conductor;

public class ProbarConductor {
    public static void main(String[] args) {
            Coche1 c1 = new Coche1(-1);
            Conductor c2 = new Conductor(c1);
            System.out.println(c2.conducir());
    }

}
