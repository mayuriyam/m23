import java.io.*;
import java.util.*;
class primenumber
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in); 
        int num, i, count=0;
        num = sc.nextInt();
	    for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("Prime Number");
        }
        else
        {
            System.out.print("not a Prime Number");
        }
 }
}   
               
        
       
	    
	  
        
 

