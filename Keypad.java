import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {
	
        public static void main (String[] args) {
	
	Scanner s  =new Scanner(System.in);
		
        int a = s.nextInt();
		
        for(int i=0;i<a;i++)
		
        {
		    
          String ss = s.next();
		   
          if(i != 0)
		  
          {
		        
            System.out.println();
		   
          }
		    
          for(int j=0;j<ss.length();j++)
		 
          {
		        
            if(ss.charAt(j)=='a'||ss.charAt(j)=='b'||ss.charAt(j)=='c')
		       
            {
		            
              System.out.print("2");
		     
            }
		         
            else if(ss.charAt(j)=='d'||ss.charAt(j)=='e'||ss.charAt(j)=='f')
	
	    {
		            
         	System.out.print("3");
		     
  	    }
		         
	    else if(ss.charAt(j)=='g'||ss.charAt(j)=='h'||ss.charAt(j)=='i')
		
            {
		       
                System.out.print("4");
		
            }
		       
  	    else if(ss.charAt(j)=='j'||ss.charAt(j)=='k'||ss.charAt(j)=='l')
		
            {
		          
    		System.out.print("5");
	
	    }
		     
    	    else if(ss.charAt(j)=='m'||ss.charAt(j)=='n'||ss.charAt(j)=='o')
		 
            {
		          
  	        System.out.print("6");
	
	    }
		       
  	    else if(ss.charAt(j)=='p'||ss.charAt(j)=='q'||ss.charAt(j)=='r'||ss.charAt(j)=='s')
		      
   	    {
		           
  		System.out.print("7");
		      
   	    }
		      
   	    else if(ss.charAt(j)=='t'||ss.charAt(j)=='u'||ss.charAt(j)=='v')
		     
    	    {
		            
 		System.out.print("8");
		       
  	    }
		      
   	    else if(ss.charAt(j)=='w'||ss.charAt(j)=='x'||ss.charAt(j)=='y'||ss.charAt(j)=='z')
		       
  	   {
		            
 		System.out.print("9");
		
           }
		  
   	}
		
     }
	
  }

}