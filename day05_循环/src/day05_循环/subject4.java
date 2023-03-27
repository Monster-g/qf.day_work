package day05_循环;

public class subject4 {

	public static void main(String[] args) {
		/*
		 * 4、我国古代数学家张邱建在《算经》中出了一道“百钱买百鸡”的问题，
		 * 题意是这样的：
		 * 5文钱可以买一只公鸡，3文钱可以买一只母鸡，
		 * 1文钱可以买3只雏鸡。现在用100文钱买100只鸡，
		 * 那么各有公 鸡、母鸡、雏鸡多少只？请编写程序实现。
		 */
		int g = 0, m = 0, c = 0;
//		while(g + m + c != 100 || 5 * g + 3 * m + c != 100) {
			for(g = 0; g <= 20; g++) {
				for(m = 0; m < 34 / 3; m++) {
					for(c = 0; c < 100; c++) {
						if((g + m + c) != 100 && (5 * g + 3 * m + c / 3) != 100 && c % 3 == 0) {
							System.out.println(g + "," + m + "," + c);
						}
					}
				}
			}
//		}
//		System.out.println(g);
	}

}
