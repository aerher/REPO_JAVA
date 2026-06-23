package Zoologico;

public class Sistema implements IImprimir {

    @Override
    public void imprimir(String contenido) {
        System.out.println("Ticket Adquirido:" + contenido);
    }

    @Override
    public boolean encender() {
        System.out.println("Sistema Encendido");
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Sistema Apagado");
        return true;
    }
}
