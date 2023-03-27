package day05_循环;

public class subject5 {

	public static void main(String[] args) {
//		5、求整数1~100的累加值，但要求跳过所有个位为3的数。
//		int g = 0;
//		int sum = 0;
//		for(int n = 1; n <= 100; n++) {
//			g = n % 10;
//			if(g != 3) {
//				sum += n;
//			}
//		}
//		System.out.println(sum);
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 3) {
				continue;
			}else {
				sum += i;
			}
		}
	}

}
