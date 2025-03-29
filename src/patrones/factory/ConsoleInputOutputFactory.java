package src.patrones.factory;

import src.patrones.input.ConsoleInput;
import src.patrones.output.ConsoleOutput;

public class ConsoleInputOutputFactory implements InputOutputFactory {
  @Override
  public ConsoleInput createInput() {
    return new ConsoleInput();
  }

  @Override
  public ConsoleOutput createOutput() {
    return new ConsoleOutput();
  }
}
