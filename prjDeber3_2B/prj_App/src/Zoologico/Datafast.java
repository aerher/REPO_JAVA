package Zoologico;

public class Datafast implements IPagar {
    public Datafast(){}
    private Integer cantidadPapel;
    private String Datos;
    private Boolean lector;

    @Override
    public boolean VerificarPago() {
        System.out.println("Pago Verificado");
        return true;
    }
    @Override
    public boolean ProcesarPago(double monto) {
        System.out.println("Pago Procesado");
        return true;
    }


}
