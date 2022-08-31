package twentyfive2022;
/*
 * Create a program to show synchronization.
 */
class Power
{  
synchronized void printPower(int n) //Synchronized printPower Method
{
	int temp = 1;
   for(int i=1;i<=5;i++){ 
        System.out.println(Thread.currentThread().getName() + ":- " +n + "^"+ i + " value: " + n*temp);
     temp = n*temp;
     try{  
      Thread.sleep(500);  
     }catch(Exception e){
    	 System.out.println(e);
    }  
   }  
 }  
}  
class Thread1 extends Thread
{  
	Power p;  
	Thread1(Power p){  
		this.p=p;  
	}  
	public void run(){  
		p.printPower(5);  
	}  
}  
class Thread2 extends Thread{  
	Power p;  
	Thread2(Power p){  
	this.p=p;  
	}  
	public void run(){  
	p.printPower(8);  
	}  
} 
class Thread3 extends Thread{  
	Power p;  
	Thread3(Power p){  
	this.p=p;  
	}  
	public void run(){  
	p.printPower(9);  
	}  
}  
public class SynchronizationDemo{  
	public static void main(String args[]){  
	Power obj = new Power();   //create an object of Power class
	//create 3 threads and passing the same object
	Thread1 p1=new Thread1(obj);  
	Thread2 p2=new Thread2(obj); 
	Thread3 p3=new Thread3(obj);	
	
	// start the threads
	p1.start();  
	p2.start();
	p3.start();
}  
}
