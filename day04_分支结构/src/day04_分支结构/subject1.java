package day04_��֧�ṹ;

import java.util.Scanner;

public class subject1 {

	public static void main(String[] args) {
		/*
		 * 1��ģ�����е绰����
		 * ����1����ʾ�����п�ҵ�񡰣�
		 * ����2����ʾ�����ÿ�ҵ�񡰣�
		 * ����3����ʾ��ҵ����ѯ����
		 * ����4����ʾ���˹����񡰣�
		 * �������֣���ʾ���һ���
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ��绰ҵ��");
		int num = input.nextInt();
		//����һ����if����else
		/*if(num == 1) {
			System.out.println("���п�ҵ��");
		}else if(num == 2) {
			System.out.println("���ÿ�ҵ��");
		}else if(num == 3) {
			System.out.println("ҵ����ѯ");
		}else if(num == 4) {
			System.out.println("�˹�����");
		}else {
			System.out.println("�һ�");
		}*/
		//����������switch
		switch(num) {
		case 1 : 
			System.out.println("���п�ҵ��");
			break;
		case 2 :
			System.out.println("���ÿ�ҵ��");
			break;
		case 3 :
			System.out.println("ҵ����ѯ");
			break;
		case 4 :
			System.out.println("�˹�����");
			break;
		default :
			System.out.println("�һ�");
			break;
		
		}
	}

}
