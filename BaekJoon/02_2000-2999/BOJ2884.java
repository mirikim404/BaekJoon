
import java.util.Scanner; 
public class BOJ2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 45분 일찍 알람 설정하기
		// 불필요한 0 사용금지
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		// 엣지케이스: 00시
		
		if (M<45) {
			M += 15; 
			H -= 1;
		}
		else {
			M -= 45;
		}
		
		if (H==-1) H=23;
		
		System.out.print(H);
		System.out.print(" ");
		System.out.print(M);
		

	}

}
