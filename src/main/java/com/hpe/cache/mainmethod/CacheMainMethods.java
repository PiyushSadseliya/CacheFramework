/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hpe.cache.mainmethod;
import com.hpe.cache.dymaniccache.DynamicCache;
import com.hpe.cache.fifo.FifoCache;
import com.hpe.cache.lrucache.LRUCache;
import com.hpe.cache.staticcache.StaticCache;
import java.util.Scanner;

public class CacheMainMethods {
public static DynamicCache dc= new DynamicCache(2);
 public static StaticCache s= new StaticCache(5);
 public static FifoCache fc= new FifoCache(6);
 public static LRUCache lc=new LRUCache(6);
 static int key,ch;
	static	String value;
	static	boolean flag;
		@SuppressWarnings("resource")
	static	Scanner sc=new Scanner(System.in); 
   
    
    public static void main(String[] args)
	{
	
          System.out.println("Production one Saju sir ");

           do{
              
            System.out.println("1. Static Cache... \n2. Dynamic Cache... \n3. FIFO Cache... \n4. LRU Cache... \n5. Exit. \n\n Please enter your choice:- ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:{
                    
                    s.addCache(key, value);
            do
		{
		 System.out.println("\n 1. Get Cache\n2. Exit\n");
		 System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 
		 case 1:System.out.println("Enter the key");
				key=sc.nextInt();
				value=s.getCache(key);
				System.out.println(value);
				break;
		 
		 case 2: System.exit(1);
		         break;
		  default: System.out.println("Invalid choice");
		 
				
		 }
		
		}while(true);
            }
                
                case 2:{
                             
            do
		{
                 
		 System.out.println("1.Add Cache\n2.Get Cache\n3.Delete Cache\n4.Update Cache\n5.Exit\n");
		 System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:System.out.println("Enter key");
			     key=sc.nextInt();
			     System.out.println("Enter value");
			     value=sc.next();
			     dc.addCache(key, value);
			     break;
		 case 2:System.out.println("Enter the key");
				key=sc.nextInt();
				value=dc.getCache(key);
				System.out.println(value);
				break;
		 case 3:System.out.println("Enter the key");
			key=sc.nextInt();
			flag=dc.delCache(key);
			if(flag == true)
			    System.out.println("Deleted");
			else
				System.out.println("Key not Found");
			break;
		 case 4:System.out.println("Enter key");
	     key=sc.nextInt();
	     System.out.println("Enter value");
	     value=sc.next();
	     flag = dc.update(key, value);
	     if(flag == true)
			    System.out.println("Updated");
			else
				System.out.println("Key not Found");
			break;
				
				
		 case 5: System.exit(1);
		         break;
		  default: System.out.println("Invalid choice");
		 
				
		 }
		
		}while(true);
		
		
	}   
                case 3:{
            do
		{
                 
		 System.out.println("1.Add Cache\n2.Get Cache\n3. Delete Cache\n4.Update Cache\n5.Exit\n");
		 System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:System.out.println("Enter key");
			     key=sc.nextInt();
			     System.out.println("Enter value");
			     value=sc.next();
			     fc.addCache(key, value);
			     break;
		 case 2:System.out.println("Enter the key");
				key=sc.nextInt();
				value=fc.getCache(key);
				System.out.println(value);
				break;
		 case 3:System.out.println("Enter the key");
			key=sc.nextInt();
			flag=fc.delCache(key);
			if(flag == true)
			    System.out.println("Deleted");
			else
				System.out.println("Key not Found");
			break;
		 case 4:System.out.println("Enter key");
	     key=sc.nextInt();
	     System.out.println("Enter value");
	     value=sc.next();
	     flag = fc.update(key, value);
	     if(flag == true)
			    System.out.println("Updated");
			else
				System.out.println("Key not Found");
			break;
				
				
		 case 5: System.exit(1);
		         break;
		  default: System.out.println("Invalid choice");
		 
				
		 }
		
		}while(true);
			
	}
                case 4:
                {
            do
		{
		 System.out.println("1.Add Cache\n2.Get Cache\n3. Delete Cache\n4.Update Cache\n5.Exit\n");
		 System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:System.out.println("Enter key");
			     key=sc.nextInt();
			     System.out.println("Enter value");
			     value=sc.next();
			     lc.addCache(key, value);
			     break;
		 case 2:System.out.println("Enter the key");
				key=sc.nextInt();
				value=lc.getCache(key);
				System.out.println(value);
				break;
		 case 3:System.out.println("Enter the key");
			key=sc.nextInt();
			flag=lc.delCache(key);
			if(flag == true)
			    System.out.println("Deleted");
			else
				System.out.println("Key not Found");
			break;
		 case 4:System.out.println("Enter key");
	     key=sc.nextInt();
	     System.out.println("Enter value");
	     value=sc.next();
	     flag = lc.update(key, value);
	     if(flag == true)
			    System.out.println("Updated");
			else
				System.out.println("Key not Found");
			break;
				
				
		 case 5: System.exit(1);
		         break;
		  default: System.out.println("Invalid choice");
		 
				
		 }
		
		}while(true);    
                }
                case 5: System.exit(1);
            }
         }while(true);	
    }
}
