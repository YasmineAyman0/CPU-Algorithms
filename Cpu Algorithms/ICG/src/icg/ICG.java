package icg;
import java.util.Scanner;
        public class ICG {
   public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of RN \n");
        int numRN=sc.nextInt();
        double x[] = new double[numRN+1];
        System.out.print("Enter value of X0 \n"); 
         int i=0;
        x[i]=sc.nextInt();
        System.out.print("Enter value of a \n");
         int a = sc.nextInt();
         System.out.print("Enter value of m \n");
        double m = sc.nextInt();
       
        for (i=0; i <= numRN+1; i++) {
         
            x[i + 1] = (a/x[i]) % m;
          
            double result= x[i+1]/m;
          System.out.println(result);
           
            }
         x [i]= x[i + 1];

}}