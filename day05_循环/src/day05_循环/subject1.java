package day05_ѭ��;

import java.util.Scanner;

public class subject1 {

	public static void main(String[] args) {
//		1������һ�����֣�Ȼ��ֽ������������磺����20�������20=2x2x5
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int num = input.nextInt();
		int n =num;
		int m = 2;
		int consult = 0;
		while(n >= m) {
			if(num >= m && num % m == 0) {
				consult = num / m;
				num = consult;
				System.out.println(m);
			}else
			 m++;
		}
		
	}

}
