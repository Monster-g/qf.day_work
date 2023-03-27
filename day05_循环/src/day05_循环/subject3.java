package day05_循环;

public class subject3 {

	public static void main(String[] args) {
		/* 3、一张纸的厚度大约是0.08mm，
		 * 对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）？ */
		int n = 0;
		int amount = 1;
		while(amount <= 884813000 / 8 - 1) {
			amount *= 2;
			n++;
		}
		System.out.println("要对折" + n + "次");

	}

}
