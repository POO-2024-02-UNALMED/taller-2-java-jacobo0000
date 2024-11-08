package test;

public class Asiento {
  String color;
  int precio;
  int registro;

  public void cambiarColor(String colorNuevo){
    String[] colores ={"rojo","verde","amarillo","negro","blanco"};
    for (int c = 0; c < colores.length;c++){
      if(colores[c] == colorNuevo){
        this.color = colorNuevo;
        break;
      }
    }
  }
}