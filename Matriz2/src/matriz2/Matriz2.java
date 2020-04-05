package matriz2;

import java.util.*;

public class Matriz2 {

    public static void main(String[] args) {
        int i, j;
        int n, m, x;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.print("Digita el numero de filas: ");
        n=Teclado.nextInt();
        x=n-1;
        System.out.print("Digita el numero de columnas: ");
        m=Teclado.nextInt();
        
        String matriz [][] = new String [n][m];
        
        for (i=0; i<n; i++)
        {
            for (j=0; j<m; j++)
            {
                if (i==j)
                {
                    matriz [i][j]=" ";
                }
                else
                {
                    matriz [i][j]= "x";
                }
            }
        }
        for (j=0; j<m; j++)
        {
            matriz [x][j]=" ";
            x--;
        }
        for (i=0; i<n; i++)
        {
            for (j=0; j<m; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
}
