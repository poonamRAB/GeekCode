import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        int n=in.nextInt();
        
       for(int i=0;i<n;i++){
           arr.add(in.nextInt());
       }
        
        printArrayList(arr,n);
        
    }
    
    public static void printArrayList(ArrayList<Integer> arr,int n){
        
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        
        System.out.println();
        
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}