package twentyfive2022;
/*
 * Create 3 thread and run according to priority.
 */

//create a class ThreadPriority which extend Thread class
class Thread11 extends Thread
{
	public void run()
	{
		System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
		try {
			Thread.sleep(400);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}



class ThreadDemo {

	public static void main(String[] args)
	{
		
		//create three threads
		Thread11 t1 = new Thread11();
		Thread11 t2 = new Thread11();
		Thread11 t3 = new Thread11();

		//Print the initial priority of threads
		System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
		
		//set priority of three threads
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("\nAfter Set priority....\n");
		
		//Print the priority of threads after setting priority
		System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
		System.out.println();
		
		// start the threads
		t1.start();
		t2.start();
		t3.start();

	}
}
