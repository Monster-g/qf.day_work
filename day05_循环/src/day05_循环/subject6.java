package day05_ѭ��;

public class subject6 {

	public static void main(String[] args) {
//		6������ 1+2-3+4-5+6-7....+100�Ľ��
//		int sum = 0;
//		int f = -1;//�ı����
//		int m = 0;
//		int t = 0;
//		for(int n = 2; n <= 101; n++) {
//			m = n - 1;//��¼���ŵ���żλ
//			if(m == 1) {
//				sum = m;
//			}else if(m % 2 == 0){
//				t = m;//�ӵ�һ�����ſ�ʼ�ж���ż������λ�ķ���Ϊ��
//				
//			}else if(m % 2 != 0) {
//				t = m * f;//ż��λ�ķ���Ϊ��
//			}
//			sum += t;
//		}
//		System.out.println("1+2-3+4-5+����+100=" + sum);
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i == 1) {
				sum += i;
			}else if(i % 2 == 0) {
				sum += i;
			}else {
				sum -= i;
			}
		}
		System.out.println(sum);
		
	}

}
