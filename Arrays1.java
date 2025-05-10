import java.util.*;

class Arrays1{

    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //REVERSING THE ARRAY
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

        printArray(arr);
    }

    //MAXIMUM AND MINIMUM ELEMENT IN ARRAY
    public static void maxminElement(int [] arr){
        System.out.println("Finding Min and Max element in array");
        int min = arr[0], max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min = arr[i];
            else if(arr[i]>max) max = arr[i];
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+ max);
    }



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        maxminElement(arr);
    }
}