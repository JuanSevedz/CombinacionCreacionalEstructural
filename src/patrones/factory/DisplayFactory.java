package src.patrones.factory;

import src.patrones.products.Input;
import src.patrones.products.Output;

public abstract class DisplayFactory {
  public abstract Input createInput();
  public abstract Output createOutput();
}
