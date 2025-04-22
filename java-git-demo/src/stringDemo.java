
public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc pqr xyz";
		String[] SplitStr=s.split(" ");
		
		for(int i=0;i<SplitStr.length;i++)
		{
			System.out.println(SplitStr[i]);
		}
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}
