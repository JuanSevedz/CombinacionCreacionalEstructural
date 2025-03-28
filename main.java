// Interfaz para Entrada
interface Entrada {
    String ingresarDatos();
}

// Implementaciones concretas de Entrada
class EntradaConsola implements Entrada {
    public String ingresarDatos() {
        System.out.print("Ingrese datos por consola: ");
        return new java.util.Scanner(System.in).nextLine();
    }
}

class EntradaFrame implements Entrada {
    public String ingresarDatos() {
        return javax.swing.JOptionPane.showInputDialog("Ingrese datos:");
    }
}

class EntradaWeb implements Entrada {
    public String ingresarDatos() {
        // Simulación de entrada web (en un entorno real, podría venir de una petición HTTP)
        return "Datos ingresados desde web";
    }
}

// Interfaz para Salida
interface Salida {
    void mostrarDatos(String datos);
}

// Implementaciones concretas de Salida
class SalidaConsola implements Salida {
    public void mostrarDatos(String datos) {
        System.out.println("Salida en consola: " + datos);
    }
}

class SalidaFrame implements Salida {
    public void mostrarDatos(String datos) {
        javax.swing.JOptionPane.showMessageDialog(null, "Salida: " + datos);
    }
}

class SalidaWeb implements Salida {
    public void mostrarDatos(String datos) {
        // Simulación de salida web (podría ser una respuesta HTTP en un entorno real)
        System.out.println("<html><body><h1>" + datos + "</h1></body></html>");
    }
}

// Interfaz Abstract Factory
interface IOFactory {
    Entrada crearEntrada();
    Salida crearSalida();
}

// Fábricas concretas
class ConsolaFactory implements IOFactory {
    public Entrada crearEntrada() { return new EntradaConsola(); }
    public Salida crearSalida() { return new SalidaConsola(); }
}

class FrameFactory implements IOFactory {
    public Entrada crearEntrada() { return new EntradaFrame(); }
    public Salida crearSalida() { return new SalidaFrame(); }
}

class WebFactory implements IOFactory {
    public Entrada crearEntrada() { return new EntradaWeb(); }
    public Salida crearSalida() { return new SalidaWeb(); }
}

// Cliente
public class Main {
    public static void main(String[] args) {
        IOFactory factory;
        String tipo = "consola"; // Se podría pedir al usuario
        
        if (tipo.equals("consola")) {
            factory = new ConsolaFactory();
        } else if (tipo.equals("frame")) {
            factory = new FrameFactory();
        } else {
            factory = new WebFactory();
        }
        
        Entrada entrada = factory.crearEntrada();
        Salida salida = factory.crearSalida();
        
        String datos = entrada.ingresarDatos();
        salida.mostrarDatos(datos);
    }
}
