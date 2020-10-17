class hollowfullpyramid
{
   public static void main(String[] args){
     int n=6;
     for(int i=1;i<=n;i++){
       for(int k=1;k<=n-i;k++){
          System.out.print(" ");      
       }
       for(int j=1;j<=i;j++){
           if(i==1 || i==n){
            System.out.print("* ");
           }
           else{
               if(j==1 || j==i){
                 System.out.print("* "); 
               }
               else{
                System.out.print("  ");
               }
           }
       }
       System.out.println();      
     }
   }  
}