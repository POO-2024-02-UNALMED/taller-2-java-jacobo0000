package test;

public class Motor {
  int numeoCilindros;
  String tipo;
  int registro;

  public void cambiarRegistro(int nuevoRegistro){
    this.registro = nuevoRegistro;
  }

  public void asignarTipo(String nuevoTipo){
    if (nuevoTipo == electrico || nuevoTipo == gasolina){
      this.tipo = nuevoTipo;
    }
  }

}
