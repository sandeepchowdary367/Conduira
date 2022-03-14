public class Thread  
{  
public static void main(String args[])  
{  
Thread t= new Thread("Thread Class");    
t.start();
String str = t.getName();  
System.out.println(str);
t.stop(); 
System.out.println("End of the Thread");
}  
} 