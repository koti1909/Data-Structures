import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//int r = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d;
		if(a>b)
		{
			d = b;
			while(a%d != 0 || b%d != 0)
			{
				d = d-1;	
			}
			
			System.out.printf("GCD is:" + d);
		}
		else
		{
			d = a;
			while(a%d != 0 || b%d != 0)
			{
				d = d-1;
			}
			System.out.printf("GCD is :" + d);
		}
	}
}