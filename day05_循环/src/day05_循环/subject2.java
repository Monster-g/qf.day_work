package day05_ѭ��;

import java.util.Scanner;

public class subject2 {

	public static void main(String[] args) {
		/*
		 * 2����дһ�����򣬸�������ĳ���༶ѧԱ�ĳɼ�������ð༶ѧԱ��ƽ���ɼ���
		 *  �༶������Ҫ���û����룬����������������ֱ�¼��ѧԱ�ĳɼ��������
		 * �༶ѧԱ��ƽ���ɼ�������ʾ������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������༶������");
		int num = input.nextInt();
		int avg = 0;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("������" + i + "�ųɼ���");
			int n1 = input1.nextInt();
			sum += n1;
			avg = sum / num;
//			System.out.println(sum);
		}
		System.out.println("Ŀǰƽ���ɼ�Ϊ��" + avg);
	}

}
