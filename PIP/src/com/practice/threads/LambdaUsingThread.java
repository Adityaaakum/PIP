package com.practice.threads;

 class LambdaExpressionExample9{  
    public static void main(String[] args) {  
      
        //Thread Example without lambda  
      
           
                  
             
         
       
      
        //Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    }  

}
