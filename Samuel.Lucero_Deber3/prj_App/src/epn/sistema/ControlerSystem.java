package epn.sistema;

import java.util.ArrayList;

public class ControlerSystem {

    private final ArrayList<SistemaEPN> lista;

    public ControlerSystem() {
        lista = new ArrayList<>();
    }

    public boolean encender() {
        Atenea                atenea    = new Atenea();
        SAEW                  saew      = new SAEW();
        AppMobile             appMobile = new AppMobile();

        lista.add(atenea);
        lista.add(saew);
        lista.add(appMobile);
        //lista.add(new Persona());


        System.out.println("Iniciando el sistema...");
        
        // atenea.on();
        // saew.on();
        // appMobile.on();

        for (SistemaEPN sistema : lista)
            sistema.on();


        return true;
    }

    public boolean apagar() {

        System.out.println("Apagando el sistema...");

        for (SistemaEPN sistema : lista)
            sistema.off();
        return true;
    }
}
