class Main implements Runnable{  
public void run(){  
System.out.println("Runnable thread");  
}  
  
public static void main(String args[]){  
Main s1=new Main();  
Thread t1 =new Thread(s1);
t1.start();  
 }  
}  
