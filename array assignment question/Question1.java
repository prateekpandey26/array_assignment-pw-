//Q1: Write a program to print the sum of all the elements present on even indices in the given array.
// Input 1: arr[] = {3,20,4,6,9}
//  Output 1: 16

public class Question1 {
    static int sum = 0;
      public static int count(int arr[] , int n){
          //int sum = 0;
          if (n%2 != 0){
              for(int i = 2; i< n; i += 2){
                  sum += arr[i];
                  
              }
          } 
          else{
            for(int i= 2; i<n-1; i += 2)
            sum += arr[i];
          }
          return sum;
      }
              
          
        
      
      public static void main(String[] args) {
          int arr[] = {4,3,6,7,1};
          int n = arr.length;
         
               int result = count(arr, n);
               System.out.println(result);
      }
  }