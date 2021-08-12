public class Hamburguesa {

    //Constantes
    protected static final String TAMANO = "Normal";
    protected static final boolean CEBOLLA = false;    
    protected static final double PRECIO_BASE = 5000;
        
    //Atributos
    protected String tamano;
    protected boolean cebolla;
    protected double precioBase;
    protected String adicional = "";
    
    //Construtores
    public Hamburguesa() {

    }


    //Costructor sobrecargado
    public Hamburguesa(String tamano, boolean cebolla) { 

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
    }


    // Métodos
    // Getters y setters de ser necesarios
    // Método agregar adicional
    public void agregarAdicional(String adicional) {

        this.adicional = adicional;

    }

    // Método calcularPrecio
    public double calcularPrecio () {

        double precioGeneral = 0;
        double pTamano = 0;
        double precioAdicional = 0;

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
         
        // Cálculos necesarios
        precioGeneral = (this.precioBase * pTamano) + precioAdicional;

        return precioGeneral;

    }
     



    
}
