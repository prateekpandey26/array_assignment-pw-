// Q3: Write a program to calculate the maximum element in the array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 65
import java.util.Scanner;
public class question3 {

    // method to calculaate max element in array

    public static int max(int arr[] , int size){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<size; i++){
          if(arr[i] > max){
            max = arr[i];
          }
          
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter the elements of the array");

        for(int i=0; i< size; i++){
            arr[i] =  sc.nextInt();
        }
           int result = max(arr, size);
           System.out.println(result);
        sc.close();
    }
}
