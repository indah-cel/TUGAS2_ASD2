package asd.modul2_tugas;
public class perkalian {
    public static void main(String[] args){
        int [][] A = {
            {3, 4, 5},
            {5, 6, 7},
        };
        int [][] B = {
            {5, 6},
            {4, 7},
            {6, 4},
        };
        if (A[0].length == B.length) {
            int[][] C = new int[A.length][B[0].length]; 
            
           for(int i=0; i<A.length; i++) {
              for(int j=0; j<B[0].length; j++){
                for(int k=0; k<A[0].length; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
              }
            }         
     
    for(int[] c: C) { 
      for(int i: c) {
          System.out.print(i+" ");
      }
      System.out.println();
    } 
}
 else {
   System.out.println("Ukuran kolom A tidak sama dengan baris B ");
   
    }
    System.out.println("INDAH YUNI SAPUTRI");
    }
}
       

 
 

        
        
    
    

