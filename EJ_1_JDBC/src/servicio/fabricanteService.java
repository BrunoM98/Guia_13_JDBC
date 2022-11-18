package servicio;

import entidades.fabricante;
import java.util.Scanner;
import persistencia.fabricanteDAO;

/**
 *
 * @author Bruno
 */
public class fabricanteService {

    fabricanteDAO fDAO = new fabricanteDAO();
    Scanner leer = new Scanner(System.in);

//Carga un producto a la base de datos
    public void createManufacture() throws Exception {

        String salir = "S";
        do {
            System.out.println("ingrese el codigo del fabricante");

            int codigo = leer.nextInt();

            System.out.println("ingrese el nombre del fabricante");

            String nombre = leer.next();

            fabricante f = new fabricante(codigo, nombre);

            System.out.println("Desea ingresar otro fabricante? S/N");

            salir = leer.next();

            fDAO.modificarFabricante(f);

        } while (salir.equalsIgnoreCase("S"));
    }
}
