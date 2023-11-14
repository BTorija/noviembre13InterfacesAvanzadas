package com.corenetworks.Presentacion;

import com.corenetworks.modelo.AccesoDesarrollo;
import com.corenetworks.modelo.AccesoProduccion;
import com.corenetworks.modelo.Cliente;
import com.corenetworks.modelo.ClienteDao;

public class ProbarClienteDao {
    public static void main(String[] args) {
        Cliente c1=new Cliente("Juan Garcia","5456461L");
        AccesoProduccion aP1= new AccesoProduccion();
        AccesoDesarrollo aD1= new AccesoDesarrollo();
        ClienteDao cDAO= new ClienteDao();
        cDAO.setConexion(aD1);
        System.out.println(cDAO.insertar(c1));
        cDAO.setConexion(aP1);
        System.out.println(cDAO.insertar(c1));
    }
}
