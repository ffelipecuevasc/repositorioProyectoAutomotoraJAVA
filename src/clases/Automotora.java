package clases;

import interfaces.IProyecto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ffeli
 */
public class Automotora implements IProyecto {

    private List<Vehiculo> vehiculos;
    private List<Moto> motos;
    private String rut;

    public Automotora(List<Vehiculo> vehiculos, List<Moto> motos, String rut) {
        this.vehiculos = vehiculos;
        this.motos = motos;
        this.rut = rut;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void buscarVehiculo(String patente) {
        Optional<Vehiculo> vehiculo = vehiculos.stream().filter(v -> v.getPatente().equals(patente)).findFirst();
        if (vehiculo.isPresent()) {
            System.out.println("Vehiculo encontrado: " + vehiculo.get());
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }

    public void mostrarVehiculos() {
        vehiculos.forEach(System.out::println);
    }

    public void venderVehiculo(String patente) {
        Optional<Vehiculo> vehiculo = vehiculos.stream().filter(v -> v.getPatente().equals(patente)).findFirst();
        if (vehiculo.isPresent()) {
            vehiculos.remove(vehiculo.get());
            System.out.println("Vehiculo vendido: " + vehiculo.get());
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }

    @Override
    public String toString() {
        return "Automotora{"
                + "vehiculos=" + vehiculos
                + ", motos=" + motos
                + ", rut='" + rut + '\''
                + '}';
    }
}
