package src.patrones.output;

import src.patrones.products.Output;

public class ConsoleOutput implements Output {

  @Override
  public void showData(Object data) {
    // Aquí podrías mostrar datos en la consola.
    System.out.println("Salida en consola: " + data);
  }
  
}