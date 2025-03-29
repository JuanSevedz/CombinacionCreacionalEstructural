package products.web;


import products.Output;

public class WebOutput implements Output {

  @Override
  public void showData(Object data) {
    // Aquí podrías abrir otra página o realizar cualquier acción simulando "web".
    // Para la demo, solo mostramos en consola que "se envía" a la web.
    System.out.println("Simulando salida en una página web: " + data);
  }
  
}
