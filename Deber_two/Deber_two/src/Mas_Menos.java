import java.util.Scanner;
public class Mas_Menos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int n = sc.nextInt();

        for ( int i  = 0 ; i < n ; i++){
            if (i % 2 == 0){
                System.out.print("+");
            } else {
                System.out.print("-");
        }
        sc.close();
    }
    }

}