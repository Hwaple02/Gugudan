import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//2단
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		
		//3단
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
		
		//4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
		//5단
//		System.out.println("구구단 중 출력한 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		System.out.println(1 * n);
//		System.out.println(2 * n);
//		System.out.println(3 * n);
//		System.out.println(4 * n);
//		System.out.println(5 * n);
//		System.out.println(6 * n);
//		System.out.println(7 * n);
//		System.out.println(8 * n);
//		System.out.println(9 * n);
		
		//반복문
		
		//while
//		int i=1;
//		System.out.println("구구단 중 출력할 단은?");
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		while ( i < 10 )
//		{
//			System.out.println(n * i);
//			i++;
//		}
		
		//for
//		System.out.println("구구단 중 출력할 단은?");
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		for( int i=1; i<10; i++ )
//		{
//			System.out.println(n * i);
//		}
		
		//조건문
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("number : " + n);
		
		//조건에 따라 출력
		if ( n < 2 )
		{
			System.out.println("2단부터 출력 가능합니다.");
		}
		else if ( n > 9 )
		{
			System.out.println("9단까지만 출력 가능합니다.");
		}
		else
		{
			for( int i=1; i<10; i++)
			{
				System.out.println(n * i);
			}
		}
}	
}
