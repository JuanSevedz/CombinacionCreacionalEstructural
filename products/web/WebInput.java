package products.web;

import products.Input;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class WebInput implements Input{

  @Override
  public Object getData() {
    try {
    
      // Simula abrir una página local "web_input.html" para ingresar datos
      File file = new File("web_input.html");
      if (file.exists()) {
        Desktop.getDesktop().browse(file.toURI());
        // Para la demostración, simplemente devolvemos algo "simulado"
        // En un caso real, deberíamos recibir datos del formulario web.
        return "Datos simulados desde WebInput";
      } else {
        System.out.println("No se encontró el archivo web_input.html. Se usará un valor por defecto.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    // Valor por defecto
    return "Datos web por defecto";
  }
  
}
