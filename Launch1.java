@FunctionalInterface
	interface demo
	{
		void disp();
		//void disp1();   cant add more method coz functional interface  has only 1 method 
		
	}
	class Alpha implements demo
	{
		public void disp() {
			System.out.println("I have given body");
			
		}
	}
	public class Launch1 {
	
		public static void main(String[] args)
		{
			demo d=new Alpha();
			d.disp();
	
		}
	
	}
