import java.util.*;

public class Demo
{
	//数组升序另一种方法
	public static void main(String[] args) {
		int[] arr = {11,21,5,66,18};
		System.out.println("Array before sorting:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array:"+Arrays.toString(arr));
	}
}