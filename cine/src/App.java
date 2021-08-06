public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos al cine");

         //Cliente Uno

        Cliente clienteUno = new Cliente();

        clienteUno.setCedula("23652900");
        clienteUno.setNombre("Maria Caro ");
        clienteUno.setId(1); 
        float precioUno = clienteUno.calcularPrecio(8000);
        System.out.println("Cédula: " + clienteUno.getCedula() 
                            + "\nNombre: " + clienteUno.getNombre()
                            + "\nID: " + clienteUno.getId()
                            + "\nPrecio entrada: " + precioUno);


        //Cliente Dos

        ClientePremium clienteDos = new ClientePremium();

        clienteDos.setCedula("1014275660");
        clienteDos.setNombre("Alex Tobar");
        clienteDos.setNumeroTarjeta(100); 
        float precioDos = clienteDos.calcularPrecio(8000);

        System.out.println();

        System.out.println("Cédula: " + clienteDos.getCedula() 
                            + "\nNombre: " + clienteDos.getNombre()
                            + "\nID: " + clienteDos.getNumeroTarjeta()
                            + "\nPrecio entrada: " + precioDos);
    }
}
