/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.hpe.cache.dymaniccache.DynamicCache;
import com.hpe.cache.fifo.FifoCache;
import com.hpe.cache.lrucache.LRUCache;
import static com.hpe.cache.mainmethod.CacheMainMethods.dc;
import static com.hpe.cache.mainmethod.CacheMainMethods.fc;
import static com.hpe.cache.mainmethod.CacheMainMethods.lc;
import static com.hpe.cache.mainmethod.CacheMainMethods.s;
import com.hpe.cache.staticcache.StaticCache;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;//TRIAL

/**
 *
 * @author purvesh
 */
public class CacheMainMethods extends HttpServlet {
public static DynamicCache dc= new DynamicCache(2);
 public static StaticCache s= new StaticCache(5);
 public static FifoCache fc= new FifoCache(6);
 public static LRUCache lc=new LRUCache(6);
 static int key,ch;
	static	String value;
	static	boolean flag;
		@SuppressWarnings("resource")
	static	Scanner sc=new Scanner(System.in); 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         System.out.println("Production one Saju sir ");

           do{
              
            System.out.println("1. Static Cache... \n2. Dynamic Cache... \n3. FIFO Cache... \n4. LRU Cache... \n5. Exit. \n\n Enter your choice:- ");
            ch=Integer.parseInt(request.getParameter("choice"));
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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
