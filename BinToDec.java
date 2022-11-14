Binary to Decimal Conversion:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String num=in.nextLine();
        int base=2;
        binaryToDecimal(num,base);
    }
    
    public static void binaryToDecimal(String num, int base){
        int ans=Integer.parseInt(num,base);
        System.out.println(ans);
    }
}


StandIn:
1011

StandOut:
11