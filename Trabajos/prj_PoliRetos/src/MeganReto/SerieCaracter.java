

public class SerieCaracter{
    

    public void PresentarSerieCaracterAlterno (int  cantidad) {
        for (int i = 0 ; i < cantidad ; i++){
            if ( i % 2 == 0 ){
                System.out.print("+");
            }
            else {
                System.out.println("-");
            }
        }
    }
}