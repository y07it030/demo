package CoreJavaProgramsPractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

public class featuresForLamdaExpressions {

static	Runnable r= () ->{
		for(int i=0;i<5;i++)
		{
			System.out.println("Runnable task is executing");
		}
	};
	
	static	Callable c= () ->{
		for(int i=0;i<5;i++)
		{
			System.out.println("Callable task is executing");
		}
		return "void";
	};
	
	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		
		ScheduledThreadPoolExecutor se=new ScheduledThreadPoolExecutor(2);
	    Future<String> result=	(Future)se.scheduleAtFixedRate(r,2000,2000,TimeUnit.MILLISECONDS);
	    Future<String> result2=	(Future)se.scheduleAtFixedRate(r,2000,2000,TimeUnit.MILLISECONDS);
	    try {
			c.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(result.get());
	}
}
