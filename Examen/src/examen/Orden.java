
package examen;

import java.util.*;



public class Orden {
   private List<DetalleOrden> items;
   private Date creacion;
   private Date envio;
   private int id;
   
   public Orden(int id, Date creacion){
    this.id=id;
    this.creacion=creacion;
    items=new ArrayList<>();
   }

   public int getNroItems(){
    return items.size();
   }

   public void agregarItem(DetalleOrden detalle){
    items.add(detalle);
   }

   public void setEnvio(Date enviar){
    envio=enviar;
   }
   
   public float calcularTotalOrden(List<DetalleOrden> items){
    float precioTotal=0;
    for(DetalleOrden orden:items){
      precioTotal+=orden.getCantidad()*orden.getPrecioUnitario();
    }
    return precioTotal;
    }
}