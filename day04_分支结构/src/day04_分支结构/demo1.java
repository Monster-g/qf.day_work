package day04_��֧�ṹ;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("���������������Ϸģʽ��");
		 * int pattern = input.nextInt();
		 */
		
		
		  Scanner input = new Scanner(System.in); 
		  System.out.println("�������·ݣ�"); 
		  int month = input.nextInt();
		 
		/*
		 * if(score > 90){
		 * System.out.println("excellent��");
		 * }
		 */
		/*
		 * if(score >= 60) { System.out.println("pass!");
		 * 
		 * }else { System.out.println("fail!continu to study hard��"); } input.close();
		 */
		/*
		 * if(weather < 10) { System.out.println("���촩�ް���"); }else if(weather >= 10 &&
		 * weather <20){ System.out.println("���촩���£�"); }else if(weather >=20 && weather
		 * <30) { System.out.println("�����ˣ������䣡");
		 * 
		 * }else { System.out.println("������������"); }
		 */
		/*
		 * if(pattern == 1) { System.out.println("�ɹ�������λ����Ϸģʽ��");
		 * System.out.println("��ѡ���������λ�ã�"); pattern = input.nextInt(); if(pattern == 1)
		 * { System.out.println("��ʦλ�������ѡ�����Ӣ�ۣ�"); pattern = input.nextInt(); if(pattern
		 * == 1) { System.out.println("��ʩ����Ѿ�λ��"); }else if(pattern == 2){
		 * System.out.println("�����Ѿ�λ��"); }else { System.out.println("ը��è����Ѿ�λ��"); }
		 * System.out.println("ȫ��������"); }else if(pattern == 2) {
		 * System.out.println("��Ұλ�������ѡ�����Ӣ�ۣ�"); pattern = input.nextInt(); if(pattern
		 * == 1) { System.out.println("��������Ѿ�λ��"); }else if(pattern == 2){
		 * System.out.println("�������Ѿ�λ��"); }else { System.out.println("��������Ѿ�λ��"); }
		 * System.out.println("ȫ��������"); } }else { System.out.println("�ɹ�����ƥ������Ϸģʽ��"); }
		 */
		
		
		  switch(month) { 
		  case 1: 
			  System.out.println(month + "����31��"); 
			  break; 
		  case 2: 
			  System.out.println(month + "����28��"); 
			  break; 
		  case 3: 
			  System.out.println(month + "����31��"); 
			  break; 
		  case 4: 
			  System.out.println(month + "����30��"); 
			  break;
		  default : 
			  System.out.println("�·��������"); 
			  break; 
		  }
		 
	}
	

}
