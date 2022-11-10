
package lcg;
import java.util.Scanner;

        public class LCG {
   public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of RN \n");
        int numRN=sc.nextInt();
        double x[] = new double[numRN+1];
        System.out.print("Enter value of X0 \n"); 
         int i=0;
        x[i]=sc.nextInt();
        System.out.print("Enter value of c \n");
        int c = sc.nextInt();
        System.out.print("Enter value of a \n");
         int a = sc.nextInt();
         System.out.print("Enter value of m \n");
        double m = sc.nextInt();
       
        for (i=0; i <= numRN+1; i++) {
         
            x[i + 1] = (a * x[i]+c ) % m;
          
            double result= x[i+1]/m;
          System.out.println(result);
           
            }
         x [i]= x[i + 1];

}}
