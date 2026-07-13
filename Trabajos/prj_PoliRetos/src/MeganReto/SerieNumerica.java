
public class SerieNumerica {
    /**
     *  Generar una serie numerica hasta un numero de terminos dada
     * @param nroTerminos - numero de terminos a generar la serie numerica
     */

    public void generarSerie(int nroTerminos){
        for (int i = 0 ; i < nroTerminos; i++) {
            System.out.println(i + "");
            System.out.println("");
        }
    }

    /***
     * Generar la serie de fibonacci hasta un numero de terminos dada
     * @param nroTerminos
     */
    public void generarSeriesFibonacci(int nroTerminos){
        int a = 0 , b = 1 , c ;
        for ( int i = 0 ; i <= nroTerminos; i++) {
            System.out.println(a + "");
            c = a + b ;
            a = b ;
            b = c ;
            System.out.println("");
        }
        System.out.println("");
    }


}

