package day04_��֧�ṹ;

import java.util.Scanner;

public class subject2 {

	public static void main(String[] args) {
//		2�� �����·ݺ���ݣ���������ж����죨��������2����29�죬����28�죩
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int years = input.nextInt();
		System.out.println("�������·ݣ�");
		int months = input.nextInt();
		//����һ
//		if(years % 400 == 0 || years % 4 ==0 && years % 100 != 0) {
//			System.out.println(months + "�����������");
//			if(months == 1 || months == 3 || months == 5 || months == 7 || months ==8 || months ==10 || months ==12) {
//				System.out.println(months + "����31��");
//			}else if(months == 4 || months == 6 || months == 9 || months == 11) {
//				System.out.println(months + "����30��");
//			}else if(months == 2) {
//				System.out.println(months + "��������28��");
//			}else {
//				System.out.println("�·����������˶ԣ�");
//			}
//		}else {
//			System.out.println(months + "����ݲ�������");
//			if(months == 1 || months == 3 || months == 5 || months == 7 || months ==8 || months ==10 || months ==12) {
//				System.out.println(months + "����31��");
//			}else if(months == 4 || months == 6 || months == 9 || months == 11) {
//				System.out.println(months + "����30��");
//			}else if(months == 2) {
//				System.out.println(months + "����������29��");
//			}else {
//				System.out.println("�·����������˶ԣ�");
//			}
//		}
		//������
		if(months == 1 || months == 3 || months == 5 || months == 7 || months ==8 || months ==10 || months ==12) {
			System.out.println(years + "��" + months + "����31��");
		}else if(months == 4 || months == 6 || months == 9 || months == 11) {
			System.out.println(years + "��" + months + "����30��");
		}else if(months == 2) {
			if(years % 400 == 0 || years % 4 ==0 && years % 100 != 0) {
				System.out.println(years + "��������" + months + "����28��");
				}else {
					System.out.println(years + "�겻������" + months + "����29��");
				}
			
		}
	}

}
