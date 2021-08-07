public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Bienvenido a tu asistente de Inversión!");

        Inversion clienteUno = new Inversion(); 
        System.out.println(clienteUno.compararInversion(12, 2000000.0, 3.0));

    }
}
