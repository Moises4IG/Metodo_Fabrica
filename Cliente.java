import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaDeCarros fabrica = null;
        String eleccion;
        
        while (true) { // Bucle hasta que el usuario introduzca un carro válido
            System.out.println("¿Qué carro deseas fabricar? (KiaPicanto o FerrariSF90XXStradale)");
            eleccion = scanner.nextLine();
            
            if (eleccion.equalsIgnoreCase("KiaPicanto")) {
                fabrica = new FabricaKiaPicanto();
                break; 
            } else if (eleccion.equalsIgnoreCase("FerrariSF90XXStradale")) {
                fabrica = new FabricaFerrariSF90XXStradale();
                break;
            } else {
                System.out.println("Modelo de auto no disponible. Inténtalo de nuevo.");
            }
        }

        Carro carro = fabrica.crearCarro(scanner);
        carro.mostrarDetalles();
        
        String accion;
        do {
            System.out.println("¿Qué deseas hacer? (encender, acelerar, apagar)");
            accion = scanner.nextLine();
            switch (accion.toLowerCase()) {
                case "encender":
                    carro.encender();
                    System.out.println("¡Escucha cómo ruge esa máquina!");
                    break;
                case "acelerar":
                    carro.acelerar();
                    System.out.println("¡Siente la potencia y velocidad!");
                    break;
                case "apagar":
                    carro.apagar();
                    System.out.println("¡Disfruta tu bestia! ¡Esperamos verte pronto!");
                    break;
                default:
                    System.out.println("Acción no reconocida. Por favor, elige entre 'encender', 'acelerar' o 'apagar'.");
                    break;
            }
        } while (!accion.equalsIgnoreCase("apagar"));

        scanner.close();
    }
}

