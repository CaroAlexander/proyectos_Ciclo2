/**
 * Universidad Tecnologica de Pereira
 * Misión Tic 2022
 * Reto 1 Ciclo 2 Grupo 56
 * Yair Alexander Tobar Caro
 */

public class Inversion {

    //Atributos
    public int pTiempo; 
    public double pCapital, pTasaInteres;
    //Metodos

/** Método para comparar la diferencia en el total de intereses generados para la inversión.
 * @return diferenciaInversion: Respuesta al Reto_1.
 */

    public String compararInversion (int pTiempo, double pCapital, double pTasaInteres) {
        double diferenciaInversion = 0.0;

        /*Cálculo de la diferencia entre tipos de tasas */
        diferenciaInversion = this.intCompuesto(pTiempo, pCapital, pTasaInteres) - this.intSimple(pTiempo, pCapital, pTasaInteres);
            
    return "La diferencia en dinero entre los intereses ganados con la inversión A" +
            " y la inversión B es de $" + Math.round(diferenciaInversion);
    }
    
    public double intSimple  (int pTiempo, double pCapital, double pTasaInteres) {

        double interesSimple  = 0.0;
        interesSimple = pCapital * ( pTasaInteres / 100 ) * pTiempo ;

        return interesSimple;
    }

    public double intCompuesto  (int pTiempo, double pCapital, double pTasaInteres) {


        double interesCompuesto  = 0.0;
        interesCompuesto = pCapital * Math.abs(Math.pow( 1 + ( pTasaInteres / 100 ), pTiempo) -1) ;
        
        return interesCompuesto;
    }

}
