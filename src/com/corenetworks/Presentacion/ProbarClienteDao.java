package Presentacion;

import modelo.AccesoDesarrollo;
import modelo.AccesoProduccion;
import modelo.Cliente;
import modelo.ClienteDao;

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
