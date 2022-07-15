package com.test;
public class SingleTon{

   private static SingleTon s=null;
   
   private SingleTon(){
   
   }
  
  public static synchronized SingleTon getObject(){
  
     if(s==null){
	     s= new SingleTon();
	 }
     return s;
  }
  
}

