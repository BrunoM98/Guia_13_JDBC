package estancia.persistencia;

import estancia.entidades.familias;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Bruno
 */
public final class familiasDAO extends DAO {

    public Collection<familias> query(String sql) throws Exception {

        try {
            Collection<familias> familia = new ArrayList();
            familias f = null;
            System.out.println(sql);
            consultarBase(sql);
            while (resultado.next()) {
                f = new familias();
                f.setNombre(resultado.getString("nombre"));
                f.setNumero_hijos(resultado.getInt("num_hijos"));
                f.setEdad_maxima(resultado.getInt("edad_maxima"));
                familia.add(f);
            }
            desconectarBase();
            return familia;

        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
            desconectarBase();
            throw e;
        }
    }
    //Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public Collection<familias> queryHijos() throws Exception {

        String sql = "SELECT nombre , edad_maxima , num_hijos FROM familias WHERE num_hijos <= 3 AND edad_maxima < 10";
        return query(sql);
    }

    //Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
}
