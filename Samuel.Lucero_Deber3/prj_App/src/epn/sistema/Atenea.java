package epn.sistema;

public class Atenea extends SistemaEPN implements IAccion {
    private String TipoDeCertificado;
    public Atenea() {
    }
    @Override
    public boolean on() {
        System.out.println("Atenea encendida");
        return true;
    }
    @Override
    public boolean off() {
        System.out.println("Atenea apagada");
        return true;
    }

}
