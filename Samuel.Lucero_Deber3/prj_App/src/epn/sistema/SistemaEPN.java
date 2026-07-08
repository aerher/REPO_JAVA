package epn.sistema;

public class SistemaEPN implements IAccion {
    private String version;
    private String nombre;
    @Override
    public boolean on() {
        System.out.println("Encendiendo el sistemaEPN...");
        return true;
    }
    @Override
    public boolean off() {
        System.out.println("Apagando el sistemaEPN...");
        return true;
    }
}
