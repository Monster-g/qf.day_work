package day05_ѭ��;

public class subject7 {

	public static void main(String[] args) {
		/*
		 * 7�����һ������������������֮��,
		 * ���Ǿͳ������Ϊ"����",
		 * ���� 6������Ϊ1,2,3 6=1+2+3 6����һ������.
		 * ���̴�ӡ��1000�������е�����
		 */
		
//		int i = 1;
//		while(i <= 1000) {
//			int sum = 0;
//			for(int j = 1; j < i; j++) 	{
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
		
		for(int i = 1; i <= 1000; i++) {
			int sum = 0;
			for(int j = 1; j < i; j++) {
//				System.out.println(j);
				if(i % j == 0) {
					sum += j;
				}
			}
			if(sum == i) {
				System.out.println(sum);
			}
		}
	}

}
