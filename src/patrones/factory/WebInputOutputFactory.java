package src.patrones.factory;

import src.patrones.input.WebInput;
import src.patrones.output.WebOutput;

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
