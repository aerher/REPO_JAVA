package Gym;

public class Datafast implements IPagar, IAccion{
    private boolean conexion;

    @Override
    public boolean Encender() {
        System.out.println("Datafast Encendido");
        return true;
    }

    @Override
    public boolean Apagar() {
        System.out.println("Datafast Apagado");
        return true;
    }

    @Override
    public boolean ProcesarTransaccion(double monto) {
        System.out.println("Transaccion Procesada por Datafast: " + monto);
        return true;
    }
    
}
