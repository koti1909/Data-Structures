import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		if(r<=100)
		{
			
			System.out.printf("Bill is:" + r*5);
		}
		else if(r<=200)
		{
			int b = 500+((r-100)*7);
			System.out.printf("Bill is :" + b);
		}
		else if(r<=300)
		{
			int b = 1200+((r-200)*10);
			System.out.printf("Bill is :" + b);
		}
		else
		{
			int b = 2200+((r-300)*12);
			System.out.printf("Bill is :" + b);
		}
	}
}