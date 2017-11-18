
public class TestingClass {
	public int[] array;
	
	public TestingClass(int size) {
		array=new int[size];
	}
	
	public int min() {
		int min=array[0];
		int occ=1;
		int sumOcc=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
				sumOcc=min;
				occ=1;
			}
			else if(array[i]==min) {
				sumOcc+=min;
				occ++;
			}
		}
		
		if(occ>1) {
			return sumOcc/occ;
		}
		return min;
	}
	
	public int max() {
		
		int max=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
}
