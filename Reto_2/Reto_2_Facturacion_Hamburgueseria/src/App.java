public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Prueba Hamburguesa!");


        Hamburguesa listaHamburguesas[] = new Hamburguesa[4];
        listaHamburguesas[0] = new Hamburguesa("", true);
        listaHamburguesas[1] = new HamburguesaNormal("Normal", false, "Pollo apanado");
        listaHamburguesas[1].agregarAdicional("Tocineta");
        listaHamburguesas[2] = new HamburguesaPatacon("Normal", true, "Maduro");
        listaHamburguesas[3] = new HamburguesaNormal("Double", true, "Res");
        Pedido nuevoPedido = new Pedido (listaHamburguesas);
        System.out.println(nuevoPedido.mostrarTotales());

    }
}
