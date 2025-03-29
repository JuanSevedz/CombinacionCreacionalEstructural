package src.patrones.factory;

import src.patrones.products.Input;
import src.patrones.products.Output;
import src.patrones.products.web.WebInput;
import src.patrones.products.web.WebOutput;


public class WebDisplayFactory extends DisplayFactory{

  @Override
  public Input createInput() {
    return new WebInput();
  }


  @Override
  public Output createOutput() {
    return new WebOutput();
  }

}


