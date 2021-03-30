package asd.modul2_tugas;
public class pengurangan {
    public static void main(String[] args){
        int [][] A = {
            {21, 22},
            {20, 19},
            {17, 16},
            };
        int [][] B = {
            {2,2},
            {3,5},
            };
        if((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int [A.length][A[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++) {
               C [i][j] = A[i][j] - B[i][j];
               System.out.print(C[i][j]+ " ");
            }
           
            System.out.println();
            }
            }
            else {
             
            System.out.println("Ukuran matrik tidak sama");
            System.out.println("INDAH YUNI SAPUTRI");
            }
           
             
                    }
            
        }

    

