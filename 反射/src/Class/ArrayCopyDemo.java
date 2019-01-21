package Class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		int[] ar=new int[10];
		//获取数组元素
		Object o=Array.get(arr, 2);
		System.out.println(o);//3
		System.out.println("-----------------------");
		for(int i=2;i<arr.length-2;i++) {
			Object ob=Array.get(arr, i);
			System.out.println(ob);
			Array.set(ar, i, ob);
			i++;
			
		}System.out.println(Arrays.toString(ar));
	}
}
