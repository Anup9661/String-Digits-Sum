import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		 String n=sc.nextLine();
	//	String n=new String("Anu12rag123");
		char ch;
		int Sum=0; 
		for(int i=0;i<n.length();i++)
		{
			ch=n.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				Sum=Sum+(ch-48);
			}	
		}
	System.out.println("The sum of digit in the string ="+Sum);
	}	
	}

