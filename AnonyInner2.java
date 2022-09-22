
interface Cls
{
	int getLength(String s);
}
public class AnonyInner2 {

	public static void main(String[] args) {
		Cls c =new Cls() {
			
			@Override
			public int getLength(String s) 
			{
				int length=s.length();
				return length;
			}
		};
		System.out.println(c.getLength("human"));
		
	}

}
