//Class that finds armstrong numbers in a range of 100 to 999
import java.util.*;
class Ques3ArmRange
{
	public static void main(String args [])
	{
		//initialization
		int i,d,sum,copy;
		System.out.println("Armstrong numbers in 100 to 999 are");
		
		//checking and displaying if an armstrong number is found
		for(copy=100;copy<1000;copy++)
		{
			i = copy;
			sum = 0;
			while(i > 0)
			{
				d = i%10;
				i=i/10;
				d = d*d*d;
				sum+=d;
			}
			if(copy == sum)
			System.out.println(sum);
		}
	}
}