package froehlicheZahl;

import java.util.ArrayList;

public class FroehlicheZahl 
{
	public static void main(String[]args)
	{
		System.out.println(froehlicheZahl(42));
	}
	public static boolean froehlicheZahl(int n)
	{
		ArrayList<Integer> seen =new ArrayList<Integer>();
		while(n!=1)
		{
			int sum=0;
			int current=n;
			int counter=0;
			while(current!=0)
			{
				sum+=(current%10)*(current%10);
				counter++;
				current/=10;
			}
			
			if(seen.contains(sum)||counter>2000)
			{
				return false;
			}
			seen.add(sum);
			n=sum;
		}
		return true;
	}
}
