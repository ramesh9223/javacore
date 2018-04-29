package cg.hsbc.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{

	String name;
	
	PrintJob(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println(name+"--->Job started by---->"+ Thread.currentThread().getName() );
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(name+"--->Job completed by---->"+ Thread.currentThread().getName() );
	}
	
}

public class ExecutorDemo {

	public static void main(String[] args) {
		
		PrintJob[] jobs= {
				new PrintJob("Raja"),
				new PrintJob("Rani"),
				new PrintJob("Ram"),
				new PrintJob("Sita"),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		ExecutorService service1 = Executors.newFixedThreadPool(2);
		for(PrintJob job:jobs) {
			//service.submit(job);
			service.execute(job);
			service1.execute(job);
		}
		service.shutdown();
	}

}
