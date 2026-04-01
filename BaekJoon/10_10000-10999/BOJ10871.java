

import java.util.Scanner;
public class BOJ10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nextInt(): 공백 줄바꿈 무시하고 숫자만 읽음
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int [] arr = new int [n];
		
		boolean first = true;
		for (int i=0; i<arr.length; i++ ) {
			arr[i] = sc.nextInt();
			if (arr[i] < x) {
				// 공백을 앞에 붙여서 맨 뒤 공백 제거
				if (!first) System.out.print(" ");
				System.out.print(arr[i]);
				first = false;
			}
		}
		
		

	}

}
