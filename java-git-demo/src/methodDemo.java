
public class methodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodDemo d=new methodDemo();
		d.getdata();
		getdata2();
		System.out.println(d.getdata3());
		methodDemo2 d1= new methodDemo2();
		d1.getdata();
	}
	public void getdata()
	{
		System.out.println("Hello");
	}
	public static void getdata2()
	{
		System.out.println("World");
	}
	public String getdata3()
	{
		return "ABC";
	}

}
