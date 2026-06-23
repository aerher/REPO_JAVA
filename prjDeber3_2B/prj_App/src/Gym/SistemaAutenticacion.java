package Gym;

public class SistemaAutenticacion implements IAutenticar, IAccion{
    private boolean lectorActivo;

    @Override
    public boolean Encender() {
        System.out.println("Sistema de Autenticación Encendido");
        lectorActivo = true;
        return true;
    }

    @Override
    public boolean Apagar() {
        System.out.println("Sistema de Autenticación Apagado");
        lectorActivo = false;
        return true;
    }

    @Override
    public boolean VerificarCredenciales(String membresia) {
        System.out.println("Verificando credenciales del cliente con membresia: " + membresia);
        return true;
    }


}
