package day04_分支结构;

import java.util.Scanner;

public class subject8 {

	public static void main(String[] args) {
//		8、五位数中，对称的数为回文数，例如12321，输出所有的五位数回文数。
		int g, s, b, q, w;
		int times = 0;
		for(int n = 10000; n <99999; n++) {
			w = n / 10000;
			q = n / 1000 % 10;
			b = n / 100 % 10;
			s = n / 10 % 10;
			g = n % 10;
			if(w == g && q == s) {
				System.out.println(n + "是回文数");
				times++;
			}
		}
		System.out.println("一共有" + times + "个五位数回文数");
	}

}
