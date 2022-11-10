
package msm;

import java.util.Scanner;

public class MsM {
        static void ThanosSnap(int FirstAvenger, float MOde, int[] MajorX, int MajorXParty) {

        MajorX[0] = FirstAvenger; String strCarrier, NewCarrier;
        int CarrierCapacity,IntCarrier;
        
        int Powered[] = new int[MajorXParty+1]; 
         
        for ( int i= 1; i < MajorXParty+1; i++) {
         
            Powered[i] = MajorX[i - 1] * MajorX[i - 1];
            strCarrier = Integer.toString(Powered[i]);  
            CarrierCapacity = strCarrier.length();

            if (CarrierCapacity == 8) {
                NewCarrier = strCarrier.substring(2, 6);IntCarrier = Integer.parseInt(NewCarrier); 
                MajorX[i] = IntCarrier;} 
            
            else {NewCarrier = strCarrier.substring(1, 5);IntCarrier = Integer.parseInt(NewCarrier);   
                MajorX[i] = IntCarrier;}}
    }


    public static void main(String[] args) {
        Scanner ace = new Scanner(System.in);

        System.out.println("Insert ur var.. ");int x0 = ace.nextInt();  

        System.out.println("Declare ur Mode value ");float m = ace.nextFloat();

        System.out.println("How many times  ..? ");int size = ace.nextInt();  

        int [] Sergent= new int[size+1]; 

        ThanosSnap(x0,m,Sergent,size);  

        for(int i = 0 ;i<size+1;i++){double EndGame=Sergent[i]/m; System.out.println(EndGame);}   
               

    }
    
      // propotype=MajorX[i - 1];   propotype2=(int) Math.pow(propotype, 2);

}
