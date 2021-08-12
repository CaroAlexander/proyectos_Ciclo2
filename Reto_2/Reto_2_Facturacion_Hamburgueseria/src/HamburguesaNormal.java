public class HamburguesaNormal extends Hamburguesa {

    //Atributos

    private String tipoCarne;
    
    // Getters y setters de ser necesarios


    // Constructor sobrecargado

    public HamburguesaNormal (String tamano, boolean cebolla, String tipoCarne) {

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
        this.tipoCarne = tipoCarne;
        
    }

    // Métodos 

    // Método CalcularPrecio
    public double calcularPrecio () {

        double precioHamburguesa = 0;
        double precioGeneral = 0;
        int pTamano = 0;
        double precioAdicional = 0;
        double precioTipoCarne = 0;

        
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
        if (this.tipoCarne.equalsIgnoreCase("Res")){
            precioTipoCarne = 4000;
        }
        if (this.tipoCarne.equalsIgnoreCase("Res apanado")){
            precioTipoCarne = 6000;
        }
        if (this.tipoCarne.equalsIgnoreCase("Pollo apanado")){
            precioTipoCarne = 7000;
        }

        // Cálculos necesarios
        precioGeneral = (this.precioBase * pTamano) + precioAdicional;
        precioHamburguesa = (this.precioBase * pTamano) + precioAdicional + precioTipoCarne;

        return precioHamburguesa;
    }


    
}
