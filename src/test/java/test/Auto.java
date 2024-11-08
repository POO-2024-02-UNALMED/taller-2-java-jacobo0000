package test;

public class Auto {
  String modelo;
  int precio;
  Asiento[] asientos;
  String marca;
  Motor motor;
  int registro;
  static String cantidadCreados;

  public int cantidadAsientos(){
    int cantidad = 0;
    for (int = 0; i < this.asientos.length; i++){
      if (this.asientos[i] instanceof Asiento){
        cantidad +=1;
      }
    }
    return cantidad;
  }

  public String verificarIntegridad(){
    for (int i = 0; i < this.asientos.length; i++){
      if (this.registro != this.motor.registro || this. registro != this.asientos[i].registro){
        return "Las piezas no son originales";
      }
    }
    return "Auto original"; 
  }
}