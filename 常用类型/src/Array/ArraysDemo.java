package Array;

import java.util.Arrays;
import java.util.Date;
public class ArraysDemo {
	public static void main(String[] args){
		int arr[] ={2,5,4,3,9,6};
		Arrays.sort(arr);
		for(int i:arr){
			System.out.print(i+"\t");
		}
		System.out.println("----------");
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(new Date().toLocaleString());
		System.out.println(System.currentTimeMillis());
	}
}
