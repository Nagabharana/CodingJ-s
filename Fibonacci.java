class Fibonacci{  
public static void main(String args[])  
{    
 int k1=0,k2=1,k3,i,count=10;    
 System.out.print(k1+" "+k2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  k3=k1+k2;    
  System.out.print(" "+k3);    
  k1=k2;    
  k2=k3;    
 }    
  
}}  