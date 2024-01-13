import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		int i,j;
		for (i=1; i<=N; i++)
		{
			System.out.print("\n");
			for (j=1; j<=N; j++)
			{
				System.out.print("* ");
			}
		}
	}
}