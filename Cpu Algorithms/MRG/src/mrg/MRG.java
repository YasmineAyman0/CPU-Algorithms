
package mrg;

import java.util.Scanner;

public class MRG {
       public static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        Scanner sdf=new Scanner(System.in);

        System.out.println("random you need");
        int numrand = sdf.nextInt();

        float[] arr = new float[numrand+1];

        System.out.println("a , b , c");
        float a = sdf.nextFloat();
        float b = sdf.nextFloat();
        float c = sdf.nextFloat();

        System.out.println("x0 , x1 , x2");
        float x0 = sdf.nextFloat();
        float x1 = sdf.nextFloat();
        float x2 = sdf.nextFloat();

        System.out.println("m");
        int m =sdf.nextInt();

        ggdsdds(a, b, c,x0,x1,x2,m, numrand, arr);
        for (int i = 0; i < numrand+1; i++) {
            System.out.println(arr[i]/m + " ");
        }
    }

    static void ggdsdds(float a , float b , float c , float x0 , float x1 , float x2 , int m , int numrand, float[]arr){
        arr[0]=x0; arr[1]=x1;arr[2]=x2;
        for (int i = 3; i < numrand+1; i++) {
            arr[i] = ((arr[i - 1]*c)+(arr[i - 2]*b)+(arr[i - 3]*a)) % m;
        }
    }

}