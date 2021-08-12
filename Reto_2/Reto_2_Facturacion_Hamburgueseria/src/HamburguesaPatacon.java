public class HamburguesaPatacon extends Hamburguesa {

    // Atributos
    private String tipoPatacon;

    // Getters y Setters de ser necesarios

    // Constructor sobrecargado

    public HamburguesaPatacon(String tamano, boolean cebolla, String tipoPatacon) {

        if (tamano != "") {
            this.tamano = tamano;
        } else {
            this.tamano = TAMANO;
        }
        if (cebolla == true){
            this.cebolla = cebolla;
        } else {
            this.cebolla = CEBOLLA;
        }   
        this.precioBase = PRECIO_BASE;
        this.tipoPatacon = tipoPatacon;

    }

    // Métodos
    
    // Método calcularPrecio

    public double calcularPrecio () {

        double precioHamburguesa = 0;
        double precioGeneral = 0;
        int pTamano = 0;
        double precioAdicional = 0;
        double precioTipoPatacon = 0;

        if(this.tamano.equalsIgnoreCase("Normal")) { 
            pTamano = 1;
        }
        if(this.tamano.equalsIgnoreCase("Doble")) {
            pTamano = 2;
        }
        if(this.adicional.equalsIgnoreCase("Jalapeños")) {
            precioAdicional = 2000;
        }
        if(this.adicional.equalsIgnoreCase("Tocineta")) {
            precioAdicional = 3000;
        }
        if (this.tipoPatacon.equalsIgnoreCase("Maduro")){
            precioTipoPatacon = 4000;
        }
        if (this.tipoPatacon.equalsIgnoreCase("Verde")){
            precioTipoPatacon = 3000;
        }

        // Cálculos necesarios
        precioGeneral = (this.precioBase * pTamano) + precioAdicional;
        precioHamburguesa = precioGeneral + precioTipoPatacon;
        
        return precioHamburguesa;

    }
}
