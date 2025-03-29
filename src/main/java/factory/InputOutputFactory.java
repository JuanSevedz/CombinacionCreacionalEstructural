package src.patrones.factory;

import src.patrones.input.Input;
import src.patrones.output.Output;

public interface InputOutputFactory {
  public abstract Input createInput();
  public abstract Output createOutput();
}
