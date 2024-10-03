package principal;

import interfaces.IProyecto;

/**
 *
 * @author ffeli
 */
public class Principal implements IProyecto {

    public static void main(String[] args) {
        int op;
        do {
            menu();
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
