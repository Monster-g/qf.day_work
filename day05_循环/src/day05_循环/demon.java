package day05_ѭ��;

import java.util.Scanner;

public class demon {

	public static void main(String[] args) {
		//��1����100�ĺ�
		//forѭ��,ִ���ж�֮�����ѭ�������㣬������Ϻ���ִ��i++
//		int n = 0;
//		int m = 0;
//		for(int i = 0; i <= 100; i++) {
//			 n += i;
//			 m ++;
////			 System.out.println(m + "," + n);
//		 }
//		System.out.println(n + "ѭ������" + m);
		//whileѭ��
//		int i = 0;
//		int n = 0;
//		while(i < 100) {
//			i++;
//			n += i;
//			System.out.println(i + "," + n);
//		}
//		System.out.println(n + "ѭ������" + i);
		//do^whileѭ��
//		int i = 0;
//		int n = 0;
//		do {
//			i++;
//			n += i;
//			
//		}while(i < 100);
//		System.out.println(n + "ѭ������" + i);
		
		//��100�����ż����
//		int n = 0;
//		int sum = 0;
//		for(int i = 0; i <= 100; i++) {
//			if(i % 2 == 0) {
//				n += i;
//			}
//		}
//		System.out.println("100�е�����ż����Ϊ��" + n);
//		int i = 0;
//		while(i < 100) {
//			if(i % 2 == 0) {
//				n += i;
//				i++;
//			}
//		}
//		System.out.println(n);
		
		//��1~100֮������5�ı���֮��
//		int n = 1;
//		int sum = 0;
//		while(n <= 100) {
//			if(n % 5 ==0) {
//				sum += n;
//			}
//			n++;
//		}
//		System.out.println(sum);
		//���1~100֮��������7�йص�����
//		int n = 0;
//		int m = 0;
//		while(n <= 100) {
//			n ++;
//			if(n / 10 == 7 || n % 10 == 7 || n % 7 == 0) {
//				System.out.println(n);
//			}
//		}
		//ѧ��дһ����ҵ����ʦ�������Ľ����yΪͨ����nΪ��ͨ��������дһ����ҵ
//		Scanner input = new Scanner(System.in);
//		String msg;
//		do {
//			System.out.println("�ύһ����ҵ");
//			System.out.println("����ʦ�����Ƿ�ͨ����");
//			msg = input.next();
//		}while(msg.equals("n"));
//		input.close();
//		System.out.println("�ɹ�ͨ���������ύ��ҵ");
		
		//���100�λ�ӭ
//		for(int n = 1; n <= 10; n++) {
//			System.out.println("��" + n + "�λ�ӭ");
//		}
//		System.out.println("���������");
		
		//�������������Լ��
//		Scanner input = new Scanner(System.in);
//		System.out.println("�������һ��������");
//		int n1 = input.nextInt();
//		System.out.println("������ڶ���������");
//		int n2 = input.nextInt();
//		if(n1 > n2) {
//			for(int i = n1; i > 0; i--) {
//				if(n1 % i == 0 && n2 % i == 0) {
//					System.out.println(n1 + "��" + n2 + "���Լ��Ϊ" + i);
//					break;
//				}
//			}
//		}else if(n1 < n2) {
//			
//		}
		
		
		int i = 1;
		while(i <= 1000) {
			int sum = 0;
			for(int j = 1; j < i; j++) 	{
				if(i % j == 0 && i != j) {
					sum += j;
//				System.out.println(j);
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
			i++;
		}
		
		
//		for(int i = 1; i <= 1000; i++) {
//			for(int j = 1; j < i; j++) {
//				if(i % j == 0 && i != j) {
//					sum += j;
////				System.out.println(j);
//				}
//			}
//			if(sum == i) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		
		
//		for(int j = 1; j < 28; j++) {
//			if(28 % j == 0 && 28 != j) {
//				sum += j;
//			System.out.println(j);
//			}
//		}
//		if(sum == 28) {
////			System.out.println(i);
//		}
		
	}

}
