package com.son;

class Scounter{
	int i=0;
	public synchronized void increment() {
		i++;
	}
}

public class printValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scounter so=new Scounter();
		 
		Thread t1=new Thread()
				{
					public void run() {
						for(int i=1;i<1000;i++)
							so.increment();
					}
				};
				
		Thread t2=new Thread()
				{
			public void run() {
				for(int i=1;i<1000;i++)
					so.increment();
			}
				};
						
				t1.start();
				t2.start();
				t1.join();
				t2.join();
				
				System.out.println(so.i);
	}

}