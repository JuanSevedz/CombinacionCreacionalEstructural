package src.java.factory;

import src.java.input.WebInput;
import src.java.output.WebOutput;
import src.patrones.factory.InputOutputFactory;

public class WebInputOutputFactory implements InputOutputFactory {
  @Override
  public WebInput createInput() {
    return new WebInput();
  }

  @Override
  public WebOutput createOutput() {
    return new WebOutput();
  }
}
