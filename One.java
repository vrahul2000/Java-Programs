import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class One{  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);
	
        int l=in.nextInt();
        int h=in.nextInt(); 
        for(int i =1;i<=h;i++){
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
  
