package clases;

/**
 *
 * @author ffeli
 */
public class Moto extends Vehiculo {

    private String conduccion;

    public Moto(String conduccion) {
        super();
        setConduccion(conduccion);

    }

    public String getConduccion() {
        return conduccion;
    }

    public void setConduccion(String conduccion) {
        try {
            if (conduccion.equals("Estandar")) {
                this.conduccion = conduccion;
            } else if (conduccion.equals("Crucero")) {
                this.conduccion = conduccion;
            } else if (conduccion.equals("Deportiva")) {
                this.conduccion = conduccion;
            } else {
                throw new Exception("Debe ingresar solo 3 opciones Sedan, Compacto o Deportivo");
            }
        } catch (Exception e) {
            System.out.println("Detalle del Error: " + e.getMessage());
        }
    }
}
