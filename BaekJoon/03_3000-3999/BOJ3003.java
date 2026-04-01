
import java.util.Scanner;

public class BOJ3003 {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	int k = sc.nextInt();
	int q = sc.nextInt();
	int l = sc.nextInt();
	int b = sc.nextInt();
	int n = sc.nextInt();
	int p = sc.nextInt();
	
	
	int [] arr0 = {1, 1, 2, 2, 2, 8};
	
	int [] arr1 = {k, q, l, b, n, p};
	
	int [] arr2 = new int[arr0.length];
	
	for (int i=0; i<6; i++) {
		
		if (arr0[i]>arr1[i]) {
			arr2[i] = Math.abs(arr0[i]-arr1[i]);
		}
		else if (arr0[i]<arr1[i]) {
			arr2[i] = (-1) * Math.abs(arr0[i]-arr1[i]);
		}
		
	}
	
	// System.out.print(arr2);
	// 배열을 위처럼 출력하면 그냥 주소값이 나옴. 반복문 사용하자.
	
	for (int i=0; i<arr2.length; i++) {
		System.out.print(arr2[i]);
		if (i<arr2.length-1)System.out.print(" ");
	}
		
	}

}
