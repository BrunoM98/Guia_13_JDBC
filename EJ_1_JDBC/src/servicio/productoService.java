package servicio;

import entidades.producto;
import java.util.Scanner;
import persistencia.productoDAO;

/**
 *
 * @author Bruno
 */
public class productoService {

    productoDAO pDAO = new productoDAO();
    Scanner leer = new Scanner(System.in);

    // query 1
    public void mostrarQuery1() throws Exception {

        System.out.println("\n /////////////////////// nombre de los productos //////////////////////// \n");
        for (producto aux : pDAO.query1()) {
            System.out.println(aux.getNombre());
        }
    }

    // query 2
    public void mostrarQuery2() throws Exception {

        System.out.println("\n /////////////////////// nombre y precios de los productos //////////////////////// \n");
        for (producto aux : pDAO.query2()) {
            System.out.println(aux.getNombre() + "//////////////////" + aux.getPrecio());
        }

    }
    // query 3

    public void mostrarQuery3() throws Exception {

        System.out.println("\n /////////////////////// nombre y precios de los productos que valen entre 120 y 202 //////////////////////// \n");
        for (producto aux : pDAO.query3()) {
            System.out.println(aux.getNombre() + "//////////////////" + aux.getPrecio());
        }

    }
    //query 4

    public void mostrarQuery4() throws Exception {

        System.out.println("\n /////////////////////// nombre y precios de los productos que son protatiles //////////////////////// \n");
        for (producto aux : pDAO.query4()) {
            System.out.println(aux.getNombre() + "//////////////////" + aux.getPrecio());
        }
    }
    // query 5

    public void mostrarQuery5() throws Exception {

        System.out.println("\n /////////////////////// nombre y precio del producto mas barato //////////////////////// \n");
        for (producto aux : pDAO.query5()) {
            System.out.println(aux.getNombre() + "//////////////////" + aux.getPrecio());
        }

    }
    //query 6

    public void createProduct() throws Exception {

        String salir = "S";
        do {
            System.out.println("ingrese el codigo del producto");
            int codigo = leer.nextInt();
            System.out.println("ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println("ingrese el precio del producto");
            double precio = leer.nextDouble();
            System.out.println("ingrese el codigo del fabricante del producto");
            int codigo_fabricante = leer.nextInt();

            producto p = new producto(codigo, nombre, precio, codigo_fabricante);

            System.out.println("Desea ingresar otro fabricante? S/N");
            salir = leer.next();

            pDAO.query6(p);

        } while (salir.equalsIgnoreCase("S"));
    }
    //query 7

    public void modificarProducto() throws Exception {

        System.out.println("Ingrese el codigodel producto");
        
        int codigo = leer.nextInt();
        
        System.out.println("Ingrese el precio del producto");
        
        double precio = leer.nextDouble();

        producto p = new producto();
        p.setCodigo(codigo);
        p.setPrecio(precio);

        pDAO.query7(p);

    }
}
