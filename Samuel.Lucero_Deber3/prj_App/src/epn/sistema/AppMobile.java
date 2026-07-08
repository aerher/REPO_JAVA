package epn.sistema;

public class AppMobile extends SistemaEPN implements IAccion {
    public AppMobile() {
    }
    @Override
    public boolean on() {
        System.out.println("AppMobile encendida");
        return true;
    }
    @Override
    public boolean off() {
        System.out.println("AppMobile apagada");
        return true;
    }

}
