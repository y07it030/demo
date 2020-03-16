package CoreJavaProgramsPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.*;

public class Threads {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService es=Executors.newFixedThreadPool(20);
	ExecutorService es1=Executors.newCachedThreadPool();
	ExecutorService es2=Executors.newScheduledThreadPool(10);
	ExecutorService es3=new ThreadPoolExecutor(2,4,10L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
	
	ScheduledThreadPoolExecutor st=(ScheduledThreadPoolExecutor)es2;

	
	Runnable r =()->{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	};
//	st.scheduleWithFixedDelay(r,1,1,TimeUnit.MILLISECONDS);
	Callable c=()->
	{
		int k=0;
		for(int j=0;j<20;j++)
		{
			k=j;
		}
		return k;
		};
		
		es3.execute(r);
		Future<Integer> f=es3.submit(c);
		es3.submit(r);
		//System.out.println(f1.get());
	
}

}
