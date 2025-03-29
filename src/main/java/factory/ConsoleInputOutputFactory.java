package src.java.factory;

import src.java.input.ConsoleInput;
import src.java.output.ConsoleOutput;
import src.patrones.factory.InputOutputFactory;

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
