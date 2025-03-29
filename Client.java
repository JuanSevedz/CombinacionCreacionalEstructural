import java.util.Scanner;

import adapter.EntryAdapter;
import adapter.ExitAdapter;
import factory.ConsoleDisplayFactory;
import factory.DisplayFactory;
import factory.FrameDisplayFactory;
import factory.WebDisplayFactory;
import products.Input;
import products.Output;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona el entorno de despliegue:");
        System.out.println("1) Consola");
        System.out.println("2) Frame (JOptionPane)");
        System.out.println("3) Web (simulado)");
        System.out.print("Opción: ");
        int option = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        DisplayFactory factory;
        switch(option) {
            case 1:
                factory = new ConsoleDisplayFactory();
                break;
            case 2:
                factory = new FrameDisplayFactory();
                break;
            case 3:
                factory = new WebDisplayFactory();
                break;
            default:
                System.out.println("Opción inválida. Saliendo.");
                return;
        }

        // Creamos los productos (Input/Output) a partir de la fábrica seleccionada
        Input input = factory.createInput();
        Output output = factory.createOutput();

        // Envolvemos los productos en adaptadores (si necesitamos adaptar datos)
        EntryAdapter entryAdapter = new EntryAdapter(input);
        ExitAdapter exitAdapter = new ExitAdapter(output);

        // Aquí podrías pasar datos extra al adaptador de entrada si fuera necesario
        Object inputData = entryAdapter.adaptAndGetData(null);

        // Por ejemplo, adaptamos y mostramos el valor que se obtuvo
        exitAdapter.adaptAndShowData("Valor ingresado: " + inputData);

        sc.close();
    }
}