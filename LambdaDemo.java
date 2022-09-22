interface Computer1// interfaces 1marker(no methods),functional(one method)
{					//normal(more than 1)
	int add(int num1,int num2);
}
/*class laptop1 implements Computer1
{
	public void show()
	{
		System.out.println("laptops");
	}
}*/

public class LambdaDemo {

	public static void main(String[] args) {
		/*
		 * Computer1 com=(num1,num2)-> System.out.println(+num1+","+num2);
		 * 
		 * com.show(10,12);
		 */
		Computer1 com =(num1,num2) ->
		{
		int result= num1+num2;
		return result;
		};
		System.out.println(com.add(8, 5));
		
	}

}
