
package estancia.persistencia;

import estancia.entidades.casas;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Bruno
 */
public final class casasDAO extends DAO{
    
        public Collection<casas> query(String sql) throws Exception {

        try {
            Collection<casas> casa = new ArrayList();
            casas c = null;
            System.out.println(sql);
            consultarBase(sql);
            while (resultado.next()) {
                c = new casas();
                c.
                c.
                casa.add(c);
            }
            desconectarBase();
            return casa;

        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
