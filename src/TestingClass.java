
public class TestingClass {
	public int[] array;

	public TestingClass(int size) {
		array = new int[size];
	}

	public int min() {
		int min = array[0];
		int sumOcc = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				sumOcc = min;
			} else if (array[i] == min) {
				sumOcc += min;
			}
		}

		if (sumOcc != min) {
			return sumOcc;
		}
		return min;
	}

	public int max() {

		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public int min_zav() {
		int min = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] < min)
				min = array[i];
		return min;
	}

	public int max_zav() {
		int max = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		return max;
	}
}
