
public class Ex0220_07 {

	public static void main(String[] args) {
		// 1~25 랜덤으로 5개숫자를 배열에 넣고 그중 최대값구하기

		int[] ran = new int[25];
		int[] num = new int[5];
		input(ran);
		shuffle(ran);
		inArr(ran, num);
		print(num);

		max(num);

	}

	static void input(int[] ran) {
		for (int i = 0; i < ran.length; i++) {
			ran[i] = i + 1;
		}
	}

	static void shuffle(int[] ran) {
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 25);
			int temp = ran[0];
			ran[0] = ran[random];
			ran[random] = temp;
		}
	}

	static void inArr(int[] ran, int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = ran[i];
		}
	}

	static void max(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			boolean check = false;
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					check = true;
					if (!(check == true)) {
						break;
					}
				}

			}
		}
		System.out.println("최대값:" + num[num.length - 1]);

	}

	static void print(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		System.out.println();
	}

}
