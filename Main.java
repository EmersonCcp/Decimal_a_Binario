package decimalbinario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 0;
        int copia;
        int dim = 0;
        int aux = 0;
        int c_dim = 0;
        int opcion = 0;

        while (opcion != 2) {
            System.out.println("Desea realizar esta operacion? 1.Si  2.No");
            opcion = in.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el numero a convertir a Binario: ");
                num = in.nextInt();
                copia = num;

                while (copia > 1) {

                    copia = copia / 2;
                    dim++;
                }

                System.out.println(dim);
                c_dim = dim + 1;
                int Vec[] = new int[c_dim];

                copia = num;
                i = dim;
                while (i >= 0) {
                    aux = copia / 2;
                    //System.out.println(aux);
                    aux = aux * 2;
                    if ((copia - aux) == 1) {
                        Vec[i] = 1;
                    } else if ((copia - aux) == 0) {
                        Vec[i] = 0;
                    }
                    i--;

                    copia = copia / 2;
                }
                System.out.println("\n");

                System.out.println("El numero " + num + " en binario es: ");
                for (i = 0; i <= dim; i++) {
                    System.out.print(" " + Vec[i]);

                }
                System.out.println("\n");
            }else if(opcion==2){
                opcion=2;
            }else if(opcion!=1 && opcion!=0){
                opcion=0;
            }
        }

        
    }

}
