package day04_��֧�ṹ;

import java.util.Random;
import java.util.Scanner;

public class subject5 {

	public static void main(String[] args) {
		/*
		 * 5��ʵ�ּ򵥵ĳ齱����
		 * ����һ��0��9֮����������
		 * ����һ�����ֺ���������бȽϣ�
		 * ����Ƿ��н���
		 * ʹ��������ķ�����
		 * 1 �ڶ���class��ǰ�����
		 * import java.util.Random;
		 * 2 �����������룺
		 * Random rand = new Random();
		 * int number = rand.nextInt(10); //���0~9֮����������
		 * 
		 */	
		Random rand = new Random();
		int number = rand.nextInt(10);
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��0~9֮������֣�");
		int num = input.nextInt();
		if(num == number) {
			System.out.println("�н������ǣ�" + number + "�н�����");
		}else {
			System.out.println("�н������ǣ�" + number + "���ź�����ӭ�´λݹˣ�");
		}
		

	}
}
