package day05_循环;

public class subject7 {

	public static void main(String[] args) {
		/*
		 * 7、如果一个数等于其所有因子之和,
		 * 我们就称这个数为"完数",
		 * 例如 6的因子为1,2,3 6=1+2+3 6就是一个完数.
		 * 请编程打印出1000以内所有的完数
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
