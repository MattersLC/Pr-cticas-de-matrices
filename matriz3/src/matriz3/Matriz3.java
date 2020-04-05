package matriz3;

import java.util.*;

public class Matriz3 {

    public static void main(String[] args) {
        int i, j;
        int n, m, x;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.print("Digite el numero de filas: ");
        n=Teclado.nextInt();
        x=n-1;
        System.out.print("Digite el numero de columnas: ");
        m=Teclado.nextInt();
        
        String matriz [][] = new String [n][m];
        
        /*for (i=0; i<n; i++)
        {
            for (j=0; j<m; j++)
            {
                matriz [i][j] = "a";
            }
        }*/
        //1
        for(i=0; i<n; i++)
        {
            for (j=0; j<m; j++)
            {
                if((i==0)&&(j>0)&&(j<(m-1)))
                {
                    matriz [i][j] = "1";
                }
                else if ((i==1)&&(j>1)&&(j<(m-2)))
                {
                    matriz [i][j] = "1";
                }
                else if ((i==2)&&(j>2)&&(j<(m-3)))
                {
                    matriz [i][j] = "1";
                }
            }
        }
        //3
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if((i==6) && (j>0) && (j<(m-1)))
                {
                    matriz[i][j]="3"; 
                }
                if((i==5) && (j>1) && (j<(m-2)))
                {
                    matriz[i][j]="3"; 
                }
                if((i==4) && (j>2) && (j<(m-3)))
                {
                    matriz[i][j]="3"; 
                }
            }
        }
        //2
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if((j==6) && (i>0) && (i<(m-1)))
                {
                    matriz[i][j]="2"; 
                }
                if((j==5) && (i>1) && (i<(m-2)))
                {
                    matriz[i][j]="2"; 
                }
                if((j==4) && (i>2) && (i<(m-3)))
                {
                    matriz[i][j]="2"; 
                }
            }
        }
        //4
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if((j==0) && (i>0) && (i<(n-1)))
                {
                    matriz[i][j]="4"; 
                }
                if((j==1) && (i>1) && (i<(n-2)))
                {
                    matriz[i][j]="4"; 
                }
                if((j==2) && (i>2) && (i<(n-3)))
                {
                    matriz[i][j]="4"; 
                }
            }
        }
        //x
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j)
                {
                    matriz[i][j]="0";
                }
                if((i+j)==(n-1))
                {
                    matriz[i][j]="0";
                }
            }
        }
        //print
        for(i=0; i<n;i++)
        {
        for(j=0;j<m;j++)
        {
          System.out.print(matriz[i][j]);
        }
        System.out.println();
        }
    }
}
