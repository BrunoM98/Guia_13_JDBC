
package estancia.entidades;

import java.sql.Date;

/**
 *
 * @author Bruno
 */
public class estancia {
    
    private String nombre_huesped;
    private Date fecha_entrada;
    private Date fecha_salida;

    public estancia() {
    }

    public estancia(String nombre_huesped, Date fecha_entrada, Date fecha_salida) {
        this.nombre_huesped = nombre_huesped;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
}
