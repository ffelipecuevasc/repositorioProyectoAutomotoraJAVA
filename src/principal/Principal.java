package principal;

import interfaces.IProyecto;
import clases.*;

/**
 * Proyecto que abarca la aplicación de excepciones
 * @author Felipe Cuevas
 */
public class Principal implements IProyecto {


    public static void main(String[] args) {
        Automotora miAutomotora = new Automotora();
        int op;
        do {
            menu();
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:
                    miAutomotora.setAutos();
                    break;
                case 2:
                    miAutomotora.setMotos();
                    break;
                case 3:
                    miAutomotora.mostrarVehiculos();
                    break;
                case 4:
                    System.out.println("Ingrese la patente del vehiculo a buscar: ");
                    String patenteB = leer.nextLine();
                    miAutomotora.buscarVehiculo(patenteB);
                    break;
                case 5:
                    miAutomotora.mostrarVehiculosAgrupadosPorMarca();
                    break;
                case 6:
                    System.out.println("Ingrese la patente del vehiculo a vender: ");
                    String patenteV = leer.nextLine();
                    miAutomotora.venderVehiculo(patenteV);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (op != 7);
    }

    public static void menu() {
        System.out.println("|-------------------- AUTOMOTORA ------------------------ |");
        System.out.println("|  1- Ingresar un nuevo auto.                             |");
        System.out.println("|  2- Ingresar una nueva moto.                            |");
        System.out.println("|  3- Mostrar todos los vehículos con su valor de venta.  |");
        System.out.println("|  4- Buscar un vehículo por su patente.                  |");
        System.out.println("|  5- Mostrar todos los vehículos agrupados por marca.    |");
        System.out.println("|  6- Vender un vehículo por su patente.                  |");
        System.out.println("|  7- Salir                                               |");
        System.out.println("|---------------------------------------------------------|");
        System.out.println("Digite la opción: ");
    }
}
