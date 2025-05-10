import java.util.*;

class Arrays1{
    public static void reverseArray(int [] arr){
        System.out.println("Reversing the Array");
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
            i++;
            j--;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
    }
}