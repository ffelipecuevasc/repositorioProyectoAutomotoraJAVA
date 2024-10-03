package clases;

/**
 *
 * @author ffeli
 */
public class Auto extends Vehiculo {

    private Integer cantidadPuertas;
    private String tipo;

    public Auto(String tipo) {
        super();
        setCantidadPuertas();
        setTipo(tipo);
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas() {
        System.out.println("Ingrese la cantidad de puertas");
        cantidadPuertas = leer.nextInt();
        leer.nextLine();

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try {

            if (tipo.equals("Sedan")) {
                this.tipo = tipo;
            } else if (tipo.equals("Compacto")) {
                this.tipo = tipo;
            } else if (tipo.equals("Deportivo")) {
                this.tipo = tipo;
            } else {
                throw new Exception("Debe ingresar solo 3 opciones Sedan, Compacto o Deportivo");
            }
        } catch (Exception e) {
            System.out.println("Detalle del Error: " + e.getMessage());
        }
    }

}
