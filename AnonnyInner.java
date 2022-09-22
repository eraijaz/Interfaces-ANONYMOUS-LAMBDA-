@FunctionalInterface
interface Alpha1
{
	void beta();
}

public class AnonnyInner {

	public static void main(String[] args) {
			
		
		Alpha1 a=new Alpha1() {
			
			@Override
			public void beta() {
					System.out.println("anony inner class approch");
			}
		};
		a.beta();
	}

}
