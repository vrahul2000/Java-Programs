import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static void main(String[] args) throws Exception {  
        Scanner in = new Scanner(System.in);
        int l=in.nextInt();
        int h=in.nextInt(); 
        for(int k=l;k<=h;k++){
            int c=0;
        for(int j=2;j<=Math.sqrt(k);j++){
            if(k%j==0){
                 c++;
                 break;
            }
        }
        if(c==0 && k>1){System.out.print(k+" ");}
        }
        System.out.println();
        for(int i =l;i<=h;i++){
            int rem =0, sum = i, sum2=0;
            while(sum > 0){
            rem = sum%10;  
            sum2 = sum2 + (rem*rem);  
            sum = sum/10;
            if(sum==0 && sum2>9){sum=sum2; sum2=0;}  
            }
        if(sum2 == 1 ){
            System.out.print(i+" "); 
        }
          
            }
    
  

    }
}