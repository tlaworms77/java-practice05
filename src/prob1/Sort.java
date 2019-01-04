package prob1;

public class Sort {

	public static void main(String[] arg) {

		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count = array.length;

		System.out.println("Before sort.");

		print(array, count);
		System.out.println();

		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//

		sort(array);

		System.out.println("After Sort.");
		print(array, count);

	}

	private static void sort(int[] array) {
		// TODO Auto-generated method stub
		int count = array.length;
		for (int i = 0; i < count - 1; i++) {
			//System.out.println((i + 1) + "회");
			for (int j = 0; j < count-i-1; j++) {
				if (array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					/*
					System.out.print("[");
					print(array, count);
					System.out.print("]\n");
					*/
				}
			}
		}
	}

	private static void print(int[] array, int count) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}