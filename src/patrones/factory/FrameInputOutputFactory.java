package src.patrones.factory;

import src.patrones.input.FrameInput;
import src.patrones.input.Input;
import src.patrones.output.FrameOutput;
import src.patrones.output.Output;

public class FrameInputOutputFactory implements InputOutputFactory {
    @Override
    public Input createInput() {
        return new FrameInput();
    }

    @Override
    public Output createOutput() {
        return new FrameOutput();
    }
}
