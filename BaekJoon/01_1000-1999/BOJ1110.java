
import java.util.Scanner;

public class BOJ1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int origin = n;
		int count = 0;
		
		
		//그냥 while을 쓰면 초기값과 비교가 안됨
		//do while 반드시 필요!
		do {
			n = (n%10)*10 + ((n/10)+(n%10))%10;
			count++;
		}
		while (n!=origin);
		
		System.out.println(count);
		

	}

}
