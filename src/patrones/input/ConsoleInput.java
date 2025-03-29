package src.patrones.input;

import src.patrones.products.Input;

public class ConsoleInput implements Input {

  @Override
  public Object getData() {
    // Implementación de ejemplo para obtener datos desde la consola
    System.out.println("Ingrese datos desde la consola:");
    return new java.util.Scanner(System.in).nextLine();
  }
}