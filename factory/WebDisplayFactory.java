package factory;

import products.Input;
import products.Output;
import products.web.WebInput;
import products.web.WebOutput;


public class WebDisplayFactory {

  @Override
  public Input createInput() {
    return new WebInput();
  }


  @Override
  public Output createOutput() {
    return new WebOutput();
  }




  
}


