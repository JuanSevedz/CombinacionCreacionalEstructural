import java.util.Scanner;
import src.patrones.factory.ConsoleInputOutputFactory;
import src.patrones.factory.FrameInputOutputFactory;
import src.patrones.factory.InputOutputFactory;
import src.patrones.factory.WebInputOutputFactory;
import src.patrones.input.Input;
import src.patrones.output.Output;

public class Client {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Selecciona el entorno de despliegue:");
    System.out.println("1) Consola");
    System.out.println("2) Frame (JOptionPane)");
    System.out.println("3) Web (simulado)");
    System.out.print("Opción: ");
    int option = sc.nextInt();
    sc.nextLine(); 

    InputOutputFactory factory;
    switch (option) {
      case 1:
        factory = new ConsoleInputOutputFactory();
        break;
      case 2:
        factory = new FrameInputOutputFactory();
        break;
      case 3:
        factory = new WebInputOutputFactory();
        break;
      default:
        System.out.println("Opción inválida. Saliendo.");
        sc.close();
        return;
    }

    Input input = factory.createInput();
    Output output = factory.createOutput();

    Object data = input.getData();

    output.sendData(data);

    sc.close();
  }
}
