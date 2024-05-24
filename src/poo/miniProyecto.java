package poo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class miniProyecto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos para la venta " + (i + 1) + ":");
            realizarVenta(entrada);
            
            System.out.println("¿Desea realizar otra venta? (s/n)");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static void realizarVenta(Scanner entrada) {
       
        System.out.println("Ingrese el nombre:");
        String nombre = entrada.nextLine();

       
        System.out.println("Ingrese la dirección:");
        String direccion = entrada.nextLine();


        System.out.println("Ingrese el teléfono:");
        int telefono = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer

        
        System.out.println("Ingrese el horario (HH:mm):");
        String horarioStr = entrada.nextLine();

        List<String> productosSeleccionados = new ArrayList<>();
        String producto = "";
        double precio = 0.0;

        System.out.println("Seleccione su orden (ingrese el número del producto, o 'q' para terminar):");
        System.out.println("1: Licuadora");
        System.out.println("2: Batido");
        System.out.println("3: Exprimidor de jugos");
        System.out.println("4: Chocomilera");
        System.out.println("5: Vaporera China");

        while (true) {
            producto = entrada.nextLine();
            if (producto.equalsIgnoreCase("q")) {
                break;
            }
            switch (producto) {
                case "1":
                    precio += 750;
                    productosSeleccionados.add("Licuadora - $750");
                    break;
                case "2":
                    precio += 200;
                    productosSeleccionados.add("Batido - $200");
                    break;
                case "3":
                    precio += 180;
                    productosSeleccionados.add("Exprimidor de jugos - $180");
                    break;
                case "4":
                    precio += 820;
                    productosSeleccionados.add("Chocomilera - $820");
                    break;
                case "5":
                    precio += 320;
                    productosSeleccionados.add("Vaporera China - $320");
                    break;
                default:
                    System.out.println("Selección no válida. Intente de nuevo.");
                    break;
            }
        }

        System.out.println("Productos seleccionados:");
        for (String prod : productosSeleccionados) {
            System.out.println("- " + prod);
        }

        System.out.println("Total es: $" + precio);
        double anticipo = precio * 0.50;
        System.out.println("************************************************");
        System.out.println("DATOS DE LA ORDEN");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("DIRECCION: " + direccion);
        System.out.println("TELEFONO: " + telefono);
        System.out.println("HORA: " + horarioStr);
        System.out.println("PAGO TOTAL ES: $" + precio);
        System.out.println("PAGO ANTICIPO DEL 50% ES: $" + anticipo);
        System.out.println("Debe depositar a la cuenta 2563569878522 del banco Banamex a nombre de Amelia Rodriguez.");
        System.out.println("NOTA:");
        System.out.println("EL SEGUNDO VIERNES DESPUES DE REALIZAR SU PEDIDO, AL RECIBIR EL PRODUCTO SE DEBERA PAGAR EL RESTO EN EFECTIVO O NUEVA TRANSFERENCIA.");
    }
}
