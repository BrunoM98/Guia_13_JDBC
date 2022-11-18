package persistencia;

import entidades.fabricante;

public final class fabricanteDAO extends DAO {

    //Ingresar un fabricante a la base de datos
    public void ingresarFabricante(fabricante f) {

        try {
            if (f == null) {
                throw new Exception("Debe ingresar un usuario");
            }
            String sql = "INSERT INTO fabricante(codigo , nombre)"
                    + "VALUES ( ' " + f.getCodigo() + " ' , ' " + f.getNombre() + " ' ); ";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
        }
    }

    public void modificarFabricante(fabricante f) {

        try {
            if (f == null) {
                throw new Exception("Debe iindicar el usuario que desea modificar");
            }
            String sql = "UPDATE fabricante SET "
                    + "clave =  ' " + f.getCodigo() + " ' WHERE nombre ' " + f.getNombre() + " ' ); ";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
        }
    }

    public void eliminarFabricante(String nombre) throws Exception {

        try {
            String sql = "DELETE FROM fabricante WHERE nombre = ' " + nombre + " ' ";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
