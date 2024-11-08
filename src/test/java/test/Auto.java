package test;

public class Auto {
  String modelo;
  int precio;
  Asiento[] asientos;
  String marca;
  Motor motor;
  int registro;
  Static String cantidadCreados;

  public int cantidadAsientos(){
    return asientos.length();
  }

  public String verifiarIntegridad(){
    for (int i = 0; i < this.asientos.length(); i++){
      if (this.registro != this.motor.registro || this. registro != this.asientos[i].registro){
        return "Las piezas no son originales";
      } else{
        return "Auto original";
      }
    }
  }
}