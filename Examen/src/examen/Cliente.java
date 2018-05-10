
package examen;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
   private String nombre;
   private int dni;
   private List<Orden> ordenes;

   public Cliente(String nombre, int dni){
      this.nombre=nombre;
      this.dni=dni;
      ordenes=new ArrayList<>();
   }
   
   public void agregarOrden(Orden orden){
       ordenes.add(orden);
   }
   
   public String getNombre(){
      return nombre;
   }

   public int getDni(){
      return dni;
   }
}
