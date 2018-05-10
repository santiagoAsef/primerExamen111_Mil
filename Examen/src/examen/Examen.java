
package examen;

import java.time.Instant;
import java.util.Date;


public class Examen {

    
    public static void main(String[] args) {
        Cliente santiago= new Cliente("santiago", 35966753);
        Orden miOrden=new Orden(1, Date.from(Instant.EPOCH));
        Notebook miCompu=new Notebook("compac", "presario", "intel ci5", 10000024);
        Notebook miCompu2=new Notebook("compac", "presario", "intel ci5", 1000000024);
        DetalleOrden miDetalle= new DetalleOrden(miCompu, 10000, 1);
        DetalleOrden miDetalle2= new DetalleOrden(miCompu2, 10006, 2);
        miOrden.agregarItem(miDetalle);
        miOrden.agregarItem(miDetalle2);
        santiago.agregarOrden(miOrden);
        
        
    }
    
}
