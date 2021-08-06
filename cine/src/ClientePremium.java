public class ClientePremium extends Persona implements Tiquete{

    private int numeroTarjeta;

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;    
    }

    public int getNumeroTarjeta() {
        return this.numeroTarjeta; // this.numeroTarjeta hace referencia al la variable de la linea #3
    }

    @Override
    public float calcularPrecio(float precioBase) {
        //float precioFinal = (float)(precioBase - (precioBase * 0.5)); 
        float precioFinal = (float)(precioBase * 0.5); // (float) : ajusta el formato de la operacion, al formato de la variable en donde se va a almacenar este resultado
        return precioFinal;
    }



}
