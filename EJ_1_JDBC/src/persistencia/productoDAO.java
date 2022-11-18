package persistencia;

import entidades.producto;
import java.util.ArrayList;
import java.util.Collection;

public final class productoDAO extends DAO {

    public Collection<producto> query(String sql) throws Exception {

        try {
            Collection<producto> productos = new ArrayList();
            producto p = null;
            System.out.println(sql);
            consultarBase(sql);
            while (resultado.next()) {
                p = new producto();
                p.setNombre(resultado.getString("nombre"));
                p.setPrecio(resultado.getDouble("precio"));
                productos.add(p);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
            desconectarBase();
            throw e;
        }
    }

//Lista el nombre de todos los productos que hay en la tabla producto.
    public Collection<producto> query1() throws Exception {

        String sql = "SELECT nombre,precio FROM producto";
        return query(sql);
    }

    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public Collection<producto> query2() throws Exception {

        String sql = "SELECT nombre, precio FROM producto";
        return query(sql);
    }

    //Listar aquellos productos que su precio esté entre 120 y 202.
    public Collection<producto> query3() throws Exception {

        String sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN 120 AND 202";
        return query(sql);
    }
    //Buscar y listar todos los Portátiles de la tabla producto.

    public Collection<producto> query4() throws Exception {

        String sql = "SELECT nombre, precio FROM producto WHERE nombre LIKE '%Portatil%'";
        return query(sql);
    }

    //Listar el nombre y el precio del producto más barato.
    public Collection<producto> query5() throws Exception {

        String sql = "SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1'";
        return query(sql);
    }
    //Ingresar un producto a la base de datos.

    public void query6(producto p) throws Exception {

        try {
            if (p == null) {
                throw new Exception("Ingrese un producto");
            }
            String sql = " INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + p.getCodigo() + "','" + p.getNombre() + "','" + p.getPrecio() + "','" + p.getCodigo_fabricante() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    //Editar un producto con datos a elección.

    public void query7(producto p) throws Exception {

        try {
            if (p == null) {
                throw new Exception("ingrese un producto");
            }
            String sql = "UPDATE producto SET precio = '" + p.getPrecio() + "' WHERE codigo = '" + p.getCodigo() + "';";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
