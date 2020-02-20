
public class Ex0220_08 {

	public static void main(String[] args) {
		int[] ran = new int[100];
		int[] num = new int[10];

		input(ran);
		shuffle(ran);
		inArr(ran, num);
		range(num);
		print(num);

	}// main

	static void input(int[] ran) {
		for (int i = 0; i < ran.length; i++) {
			ran[i] = i + 1;
		}
	}

	static void shuffle(int[] ran) {
		for (int i = 0; i < 300; i++) {
			int random = (int) (Math.random() * 100);
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

	static void range(int[] num) {
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
	}

	static void print(int[] num) {
		System.out.print("정렬된 값:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
	}

}// class
