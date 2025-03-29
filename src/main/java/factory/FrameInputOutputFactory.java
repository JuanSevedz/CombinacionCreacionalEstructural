package src.java.factory;

import src.java.input.FrameInput;
import src.java.input.Input;
import src.java.output.FrameOutput;
import src.java.output.Output;
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
