//import java.io.IOException;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
        
        // *** Imprime la cantidad de bytes leidos a partir de un texto ingresado por consola
        
        // int numBytes = 0;
        // char caracter;
        // System.out.println("\nEscribe el texto: ");
        // try {
        //     do {
        //         caracter = (char)System.in.read();
        //         System.out.print(caracter);
        //         numBytes++;
        //         } while (caracter != '\n');
        //             System.err.printf("%d bytes leidos %n", numBytes);
        // } catch (IOException e) {
        // System.err.println(e);
        // }

        int[][] numeros = { { 1, 2, 3, 4, 5},
                            { 6, 7, 8, 9, 10},
                            {11, 12, 13, 14, 15},
                            {16, 17, 18, 19, 20},
                            {21, 22, 23, 24, 25}};
        var archivo = "Numerosos.txt";
        var salida = new PrintWriter(archivo);
        for (int i=0; i< numeros.length; i++) {
            for (int j=0; j< numeros[i].length; j++)
            {
            salida.print(numeros[i][j] + ",");
            }
            salida.println("");
        }
        salida.close();
        }
}
