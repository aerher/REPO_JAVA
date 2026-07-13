
public class Controlador{
    public void ShowSerie (int cantidad){
        SerieCaracter serie = new SerieCaracter();
        System.out.println("Serie de caracteres alternos:");
        serie.PresentarSerieCaracterAlterno(8);


        System.out.println("Serie de numeros:");
        SerieNumerica serieNumerica = new SerieNumerica();
        serieNumerica.generarSerie(8);

        System.out.println("Serie de Fibonacci:");
        serieNumerica.generarSeriesFibonacci(8);
    }

}
