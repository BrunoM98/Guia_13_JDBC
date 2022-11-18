package estancia.entidades;

/**
 *
 * @author Bruno
 */
public class familias {

    private String nombre;
    private int edad_minima;
    private int edad_maxima;
    private int num_hijos;
    private String correo_electronico;

    public familias() {
    }

    public familias(String nombre, int edad_minima, int edad_maxima, int numero_hijos, String correo_electronico) {
        this.nombre = nombre;
        this.edad_minima = edad_minima;
        this.edad_maxima = edad_maxima;
        this.num_hijos = numero_hijos;
        this.correo_electronico = correo_electronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public int getEdad_maxima() {
        return edad_maxima;
    }

    public void setEdad_maxima(int edad_maxima) {
        this.edad_maxima = edad_maxima;
    }

    public int getNumero_hijos() {
        return num_hijos;
    }

    public void setNumero_hijos(int numero_hijos) {
        this.num_hijos = numero_hijos;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
   
}
