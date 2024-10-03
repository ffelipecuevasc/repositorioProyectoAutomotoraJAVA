package clases;

/**
 *
 * @author ffeli
 */
public class Auto extends Vehiculo {

    private Integer cantidadPuertas;
    private String tipo;

    public Auto() {
        super();
        setCantidadPuertas();
        setTipo();
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas() {
        System.out.println("Ingrese la cantidad de puertas: ");
        cantidadPuertas = leer.nextInt();
        leer.nextLine();

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        try {
            System.out.println("Ingrese el tipo de auto: ");
            String aux = leer.nextLine();
            if (aux.equals("Sedan")) {
                tipo = aux;
            } else if (aux.equals("Compacto")) {
                tipo = aux;
            } else if (aux.equals("Deportivo")) {
                tipo = aux;
            } else {
                throw new Exception("Debe ingresar solo 3 opciones Sedan, Compacto o Deportivo");
            }
        } catch (Exception e) {
            System.out.println("Detalle del Error: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Auto [Patente = " + patente + ", Marca = " + marca + ", Modelo = " + modelo + ", Fecha fabricacion = " + fechaFabricacion + ", Cantidad de puertas = " + cantidadPuertas + ", Tipo = " + tipo + ", Valor = $" + valor + ", Valor de venta = $" + getValorVenta() + "]";
    }
}
