// Q2: Write a program to traverse over the elements of the array using for each loop and print all even
// elements.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 34 54

public class Question2 {
    static int sum = 0;
      public static void print(int arr[] , int n){
          
          
              for(int i = 0; i< n; i ++){
                if (arr[i]%2 == 0){
                  System.out.println(arr[i]);
                }
              
           
         
      }
    }
              
          
        
      
      public static void main(String[] args) {
          int arr[] = {34,21,54,65,43};
          int n = arr.length;
         
               print(arr, n);
      }
}
