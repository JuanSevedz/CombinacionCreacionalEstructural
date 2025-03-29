package factory;

import products.Input;
import products.Output;

public abstract class DisplayFactory {
  public abstract Input createInput();
  public abstract Output createOutput();
}
