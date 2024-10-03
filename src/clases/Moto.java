package clases;

/**
 *
 * @author ffeli
 */
public class Moto extends Vehiculo {

    private String conduccion;

    public Moto() {
        super();
        setConduccion();
    }

    public String getConduccion() {
        return conduccion;
    }

    public void setConduccion() {
        try {
            System.out.println("Ingrese el tipo de conduccion en la moto: ");
            String aux = leer.nextLine();
            if (aux.equals("Estandar")) {
                conduccion = aux;
            } else if (aux.equals("Crucero")) {
                conduccion = aux;
            } else if (aux.equals("Deportiva")) {
                conduccion = aux;
            } else {
                throw new Exception("Debe ingresar solo 3 opciones Sedan, Compacto o Deportivo");
            }
        } catch (Exception e) {
            System.out.println("Detalle del Error: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Moto [Patente = " + patente + ", Marca = " + marca + ", Modelo = " + modelo + ", Fecha de Fabricacion = " + fechaFabricacion + ", Conduccion = " + conduccion + ", Valor = $" + valor + ", Valor venta = $" + getValorVenta() + "]";
    }
}
