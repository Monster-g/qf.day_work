package day05_ѭ��;

import java.util.Random;
import java.util.Scanner;

public class subject8 {

	public static void main(String[] args) {
//		8����������Ϸ��
		Scanner input = new Scanner(System.in);
		int num;
		Random rand = new Random();
		int number = rand.nextInt(100);
		do {
			System.out.println("������һ��0~100�����֣�");
			num = input.nextInt();
			if(num < number) {
				System.out.println("С��");
			}else if(num > number) {
				System.out.println("����");
			}
		}while(num != number);
		System.out.println("��ϲ��¶��ˣ��������" + num);
	}

}
