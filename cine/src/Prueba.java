import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    private ArrayList<Cliente> listaClientes;

    public Prueba() {
        listaClientes = new ArrayList<>();
    }

    public void generarLista() {
        ArrayList<Integer> listaNumero = new ArrayList<>();
        Scanner scan2 = new Scanner (System.in);
        int numero = 0;
        while (numero >= 0) {
            System.out.println(" Ingrese un número ( Numero negativo para salir ) : ");
            numero = scan2.nextInt();
            if (numero >= 0)
                listaNumero.add(numero);
        }

        // Ciclo for 

        for (int i = 0; i < listaNumero.size(); i++) {
            System.out.println(listaNumero.get(i));
        }
        System.out.println();

        //for each
        listaNumero.forEach((elemento) -> {
            System.out.println(elemento);
        });

    }

    public void agregarCliente(Cliente pCliente) {

        listaClientes.add(pCliente);

    }

    public void mostrarNombreClientes() {
        for (int i = 0; i < listaClientes.size(); i ++) {
            System.out.println(listaClientes.get(i).getNombre());
        }
    }


   
}
