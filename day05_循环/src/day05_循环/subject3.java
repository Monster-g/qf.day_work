package day05_ѭ��;

public class subject3 {

	public static void main(String[] args) {
		/* 3��һ��ֽ�ĺ�ȴ�Լ��0.08mm��
		 * ���۶��ٴ�֮���ܴﵽ���������ĸ߶ȣ�8848.13�ף��� */
		int n = 0;
		int amount = 1;
		while(amount <= 884813000 / 8 - 1) {
			amount *= 2;
			n++;
		}
		System.out.println("Ҫ����" + n + "��");

	}

}
