package clases;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import interfaces.IProyecto;

/**
 *
 * @author ffeli
 */
public class Vehiculo implements IProyecto {

    protected String patente, marca, modelo;
    protected Date fechaFabricacion;
    protected Integer valor;
    protected Calendar gestionFecha;
    protected SimpleDateFormat formatoFecha;

    public Vehiculo() {
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        gestionFecha = Calendar.getInstance();
        setPatente();
        setMarca();
        setModelo();
        setFechaFabricacion();
        setValor();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente() {
        System.out.println("Ingrese la patente del vehiculo:");
        patente = leer.nextLine();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca() {
        System.out.println("Ingrese la marca del vehiculo:");
        marca = leer.nextLine();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo() {
        System.out.println("Ingrese el modelo del vehiculo:");
        modelo = leer.nextLine();
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion() {
        try {
            System.out.println("Ingresar la fecha de fabricacion del vehiculo (FORMATO - 01/01/2024): ");
            fechaFabricacion = formatoFecha.parse(leer.nextLine());
            gestionFecha.setTime(fechaFabricacion);
        } catch (ParseException e) {
            System.err.println("Error en el formato: " + e.getMessage() + ".\nPor favor use el formato '01/01/2024'.");
        }
    }

    public Integer getAñoFabricacion() {
        return gestionFecha.get(Calendar.YEAR);
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor() {
        System.out.println("Ingrese el valor del vehiculo:");
        valor = leer.nextInt();
        leer.nextLine();
    }

    public Integer getIva() {
        Integer iva = valor * (19 / 100);
        return iva;
    }
}
