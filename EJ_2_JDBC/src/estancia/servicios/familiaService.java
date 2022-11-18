package estancia.servicios;

import estancia.entidades.familias;
import estancia.persistencia.familiasDAO;

/**
 *
 * @author Bruno
 */
public class familiaService {

    familiasDAO fd = new familiasDAO();

    public void queryA() throws Exception {

        System.out.println("\n /////////////////////// Las familias con 3 hijos o menos y que tengan de 10 para abajo son /////////////////////// \n");
        for (familias aux : fd.queryHijos()) {
            System.out.println("nombre->" + aux.getNombre() + "/////////////////////// edad maxima ->" + aux.getEdad_maxima() + "/////////////////////// cantidad de hijos ->" + aux.getNumero_hijos());
        }
    }

}
