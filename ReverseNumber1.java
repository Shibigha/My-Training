import java.util.*;
public class ReverseNumber1
{
     int inputNum = 0;//reversed number(same name)
	public ReverseNumber1(int inputNum)
	{
		this();
		while(inputNum>0)
		{
			int remainder=inputNum%10;
			this.inputNum=(this.inputNum*10)+remainder;
			inputNum=inputNum/10;
		}
		System.out.println("Reverse of given number is : "+this.inputNum);
	}
	
	public ReverseNumber1()
	{
		System.out.println("Finding reverse...");
	}
	
	public static void main(String args[])
	{
		Scanner objname=new Scanner(System.in);
		System.out.println("Enter Number to be reversed");
		int number=objname.nextInt();
		ReverseNumber1 myobj = new ReverseNumber1(number);
	}
}
	////DOUBTDOUBTDOUBTDOUBTDOUBTDOUBTDOUBTDOUBT	////DOUBTDOUBTDOUBTDOUBTDOUBTDOUBTDOUBTDOUBT	////DOUBTDOUBTDOUBTDOUBTDOUBTDOUBTDOUBTDOUBT