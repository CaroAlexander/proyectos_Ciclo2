public class Pedido { 

    // Atributos

    private double precioTotalHamburguesas;
    private double precioTotalHamburguesasNormal;
    private double precioTotalHamburguesasPatacon;
    private Hamburguesa listaHamburguesas[];


    // Constructores

    public Pedido () {
        precioTotalHamburguesas = 0;
        precioTotalHamburguesasNormal = 0;
        precioTotalHamburguesasPatacon = 0;
    }

    // Constructor sobrecardo

    public Pedido(Hamburguesa listaHamburguesas[]) {

        this.listaHamburguesas = listaHamburguesas;

    }

    // Métodos

    // Getters y Setters de ser necesarios


    // Métodos calcularTotales
    public void calcularTotales () {


        // Cálculos necesarios
        for (int i = 0; i<listaHamburguesas.length ; i++) {
            if (listaHamburguesas[i] instanceof Hamburguesa){
                precioTotalHamburguesas += listaHamburguesas[i].calcularPrecio();
            }
            if (listaHamburguesas[i] instanceof HamburguesaNormal){
                precioTotalHamburguesasNormal += listaHamburguesas[i].calcularPrecio();
            }
            if (listaHamburguesas[i] instanceof HamburguesaPatacon){
                precioTotalHamburguesasPatacon += listaHamburguesas[i].calcularPrecio();
            }

        }

    } 


    // Métodos mostrarTatoles 
    public String mostrarTotales () {

        calcularTotales ();
        String cadenaTotales = "El precio total de las hamburguesas es de "                       + precioTotalHamburguesas 
                                + "\nLa suma del precio de las hamburguesas normales es de " 
                                + precioTotalHamburguesasNormal
                                + "\nLa suma del precio de las hamburguesas patacón es de " 
                                + precioTotalHamburguesasPatacon;

        return cadenaTotales;

    }


}
