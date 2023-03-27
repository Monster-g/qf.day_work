package day05_循环;

public class subject6 {

	public static void main(String[] args) {
//		6、计算 1+2-3+4-5+6-7....+100的结果
//		int sum = 0;
//		int f = -1;//改变符号
//		int m = 0;
//		int t = 0;
//		for(int n = 2; n <= 101; n++) {
//			m = n - 1;//记录符号的奇偶位
//			if(m == 1) {
//				sum = m;
//			}else if(m % 2 == 0){
//				t = m;//从第一个符号开始判断奇偶，奇数位的符号为正
//				
//			}else if(m % 2 != 0) {
//				t = m * f;//偶数位的符号为负
//			}
//			sum += t;
//		}
//		System.out.println("1+2-3+4-5+……+100=" + sum);
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
