Stack Syntax Learning:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        
        int t=in.nextInt();
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=1;i<=t;i++){
            int c=in.nextInt();
            
            if(c==1){
                System.out.println(st.size());
            }
            else if(c==2){
                if(st.size()==0){
                    System.out.println(-1);
                }
                else{
                    st.pop();
                }
                
            }
            else if(c==3){
                int x=in.nextInt();
                st.push(x);
            }
            else if(c==4){
                if(st.size()==0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(st.peek());
                }
            }
        }
    }
}

Input/StandIn:

10
3 1
3 2
4
4
2
4
3 4
2
4
1
Output/StandOut:
2
2
1
1
1