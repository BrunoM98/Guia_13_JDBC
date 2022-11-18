package Main;

import java.util.Scanner;
import servicio.fabricanteService;
import servicio.productoService;

public class MainClass {

    public static void main(String[] args) throws Exception {

        productoService ps = new productoService();
        fabricanteService fs = new fabricanteService();
        Scanner leer = new Scanner(System.in);

        
        int salir;

        do {
            System.out.println("opc de tienda");
            System.out.println("");
            System.out.println("1) Lista el nombre de todos los productos que hay en la tabla producto");
            System.out.println("2) Lista los nombres y los precios de todos los productos de la tabla producto");
            System.out.println("3) Listar aquellos productos que su precio esté entre 120 y 202");
            System.out.println("4) Buscar y listar todos los Portátiles de la tabla producto");
            System.out.println("5) Listar el nombre y el precio del producto más barato");
            System.out.println("6) Ingresar un producto a la base de datos");
            System.out.println("7) Ingresar un fabricante a la base de datos");
            System.out.println("8) Editar un producto con datos a elección");
            System.out.println("9) Salir");
            salir = leer.nextInt();

            switch (salir) {

                case 1:
                    ps.mostrarQuery1();
                    break;
                case 2:
                    ps.mostrarQuery2();
                    break;
                case 3:
                    ps.mostrarQuery3();
                    break;
                case 4:
                    ps.mostrarQuery4();
                    break;
                case 5:
                    ps.mostrarQuery5();
                    break;
                case 6:
                    ps.createProduct();
                    break;
                case 7:
                    fs.createManufacture();
                    break;
                case 8:
                    ps.modificarProducto();
                    break;
                case 9:
                    break;
            }
        } while (salir != 9);
    }
}
