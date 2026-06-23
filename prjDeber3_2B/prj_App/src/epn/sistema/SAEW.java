package epn.sistema;

public class SAEW extends SistemaEPN implements IAccion {
    
    public SAEW() {
    }

    @Override
    public boolean on() {
        System.out.println("SAEW encendido");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("SAEW apagado");
        return true;
    }

}
