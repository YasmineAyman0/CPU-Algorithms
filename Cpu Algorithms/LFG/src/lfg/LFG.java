
package lfg;
import java.util.*;
 class LFG {
	    public static float [] LFG(int j, int k,char operation,float m,float[] arrand,int gRandom) {
	        float x[] = new float[gRandom + 1];
	        
	        for (int i = 0; i < arrand.length; i++) {
	            x[i]=arrand[i];
	        }

	        switch (operation) {
	            case '+':
	                for (int i = arrand.length; i < gRandom + 1; i++) {
	                    x[i] = x[i - j] + x[i - k] % m;
	                    if (x[i]>m){
	                    x[i]-=m;
	                    }
	                }
	                break;
	            case '-':
	                for (int i = 2; i < gRandom + 1; i++) {
	                    x[i] = (x[i - j] - x[i - k]) % m;
	                    if (x[i]>m){
	                    x[i]-=m;
	                    
	                }}
	                break;
	            case '*':
	                for (int i = 2; i < gRandom + 1; i++) {
	                    x[i] = (x[i - j] * x[i - k]) % m;
	                if (x[i]>m){
	                    x[i]-=m;
	                }
	                }
	                break;
	            case '/':
	                for (int i = 2; i < gRandom + 1; i++) {
	                    x[i] = (x[i - j] / x[i - k]) % m;
	                    if (x[i]>m){
	                    x[i]-=m;
	                    }
	                }
	                break;
	        }
	    return x;
	    }
	    public static void main(String[] args) {

	        
	        int j, k, size;
	        float m;
	        int max;
	        char operation;
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Please Enter Variables");
	         size = scan.nextInt();
	        System.out.println("Enter j :");
	        j = scan.nextInt();
	        System.out.println("Enter k");
	        k = scan.nextInt();
	        System.out.println("Enter operation(+,-,*,/)");
	        operation = scan.next().charAt(0);
	        System.out.println("Enter M");
	        m = scan.nextFloat();
	        
	        if(j>k){
	        max=j;
	        }
	        else{ max=k;}
	        float array[]=new float[max];
	        for (int i = 0; i < max; i++) {
	            System.out.println("please enter x"+i+" : ");
	            array[i]= scan.nextFloat();
	        }
	        
	        
	        float result[]=LFG(j, k, operation, m, array, size);
	        for (int i = 0; i < result.length; i++) {
	            double rn= result[i]/m ;
	            System.out.println("x"+i+" = "+result[i] +"  "+"Rn = "+rn);
	        }
	    }
	    
	}