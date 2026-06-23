import epn.sistema.ControlerSystem;

public class AppEPN {
    public static void main(String[] args) throws Exception {
        ControlerSystem controlerSystem = new ControlerSystem();
        controlerSystem.encender();
        controlerSystem.apagar();
    }
}
