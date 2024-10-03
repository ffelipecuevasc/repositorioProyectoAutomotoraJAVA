package clases;

import interfaces.IProyecto;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author ffeli
 */
public class Automotora implements IProyecto {

    private List<Auto> autos;
    private List<Moto> motos;
    private String rut;

    public Automotora() {
        autos = new ArrayList<Auto>();
        motos = new ArrayList<Moto>();
        setRut();
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos() {
        Auto a = new Auto();
        autos.add(a);
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos() {
        Moto m = new Moto();
        motos.add(m);
    }

    public String getRut() {
        return rut;
    }

    public void setRut() {
        System.out.println("Ingrese el RUT de la automotora: ");
        rut = leer.nextLine();
    }

    public void buscarVehiculo(String patente) {
        System.out.println("Seleccione qué desea buscar (1 - Autos, 2 - Motos): ");
        int op = leer.nextInt();
        leer.nextLine();
        if (op == 1) {
            Optional<Auto> auto = autos.stream().filter(a -> a.getPatente().equals(patente)).findFirst();
            if (auto.isPresent()) {
                System.out.println("Auto encontrado: " + auto.get());
            } else {
                System.out.println("Auto no encontrado");
            }
        } else {
            Optional<Moto> moto = motos.stream().filter(m -> m.getPatente().equals(patente)).findFirst();
            if (moto.isPresent()) {
                System.out.println("Moto encontrada: " + moto.get());
            } else {
                System.out.println("Moto no encontrada.");
            }
        }
    }

    public void mostrarVehiculosAgrupadosPorMarca() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos.");
        } else {
            autos.stream().collect(Collectors.groupingBy(Auto::getMarca)).forEach((marca, autos) -> {
                System.out.println("Marca: " + marca);
                autos.forEach(System.out::println);
            });
        }
        if (motos.isEmpty()) {
            System.out.println("No hay motos.");
        } else {
            motos.stream().collect(Collectors.groupingBy(Moto::getMarca)).forEach((marca, motos) -> {
                System.out.println("Marca: " + marca);
                motos.forEach(System.out::println);
            });
        }
    }

    public void mostrarVehiculos() {
        autos.forEach(System.out::println);
        motos.forEach(System.out::println);
    }

    public void venderVehiculo(String patente) {
        System.out.println("Seleccione qué desea vender (1 - Autos, 2 - Motos): ");
        int op = leer.nextInt();
        leer.nextLine();
        if (op == 1) {
            Optional<Auto> auto = autos.stream().filter(a -> a.getPatente().equals(patente)).findFirst();
            if (auto.isPresent()) {
                autos.remove(auto.get());
                System.out.println("Auto vendido: " + auto.get());
            } else {
                System.out.println("Auto no encontrado, no se pudo vender.");
            }
        } else {
            Optional<Moto> moto = motos.stream().filter(m -> m.getPatente().equals(patente)).findFirst();
            if (moto.isPresent()) {
                motos.remove(moto.get());
                System.out.println("Moto vendida: " + moto.get());
            } else {
                System.out.println("Moto no encontrada, no se pudo vender.");
            }
        }
    }
}
