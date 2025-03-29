package src.patrones.factory;

import src.patrones.input.FrameInput;
import src.patrones.output.FrameOutput;

public class FrameInputOutputFactory implements InputOutputFactory {
  @Override
  public FrameInput createInput() {
    return new FrameInput();
  }

  @Override
  public FrameOutput createOutput() {
    return new FrameOutput();
  }
}
