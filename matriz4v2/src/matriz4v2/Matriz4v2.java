package matriz4v2;

import java.util.*;

public class Matriz4v2 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        
        System.out.print("Digite el tamaño del cuadro: ");
        int n=Teclado.nextInt();
        
        if (n>=0 && n<=n)
        {
            //parte de arriba
            for (int i=0; i<n; i++)
            {
                System.out.print("x");
            }
            System.out.println();
            //centro
            for (int i=0; i<n-2; i++)
            {
                System.out.print("x");
                for (int j=0; j<n-2; j++)
                {
                    System.out.print(" ");
                }
                System.out.println("x");
            }
            //parte de abajo
            for (int i=0; i<n; i++)
            {
                System.out.print("x");
            }
        }
    }
    
}
