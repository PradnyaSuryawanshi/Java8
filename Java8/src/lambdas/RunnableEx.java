package lambdas;

public class RunnableEx {

	public static void main(String[] args) {
			
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
					System.out.println("Inside Runnable 1");
			}
			
		};
		new Thread(runnable).start();
		
		//java 8
		 
		Runnable runnableLambadas=()->{
			System.out.println("Inside Runnable 2");
			

		};
		Runnable runnableLambadas1=()->	{
			System.out.println("Inside Runnable 3");
			System.out.println("Inside Runnable 3.1");
		};

			new Thread(runnableLambadas).start();
			
			new Thread(runnableLambadas1).start();
			
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("Inside Runnable 5");
				}
			});
			
			new Thread(()-> System.out.println("Inside Runnable 4")).start();
	}
}


