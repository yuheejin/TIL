package Education.Java.days13;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 1, 6};
		System.out.println( Arrays.toString( solution(num_list) ));
		
		
	} //main
	
	public static int[] solution(int num_list[]) {
	    int [] result = new int [num_list.length+1];
	    Arrays.copy
	    for (int i=0; i<num_list.length; i++) {
	        result[i] = num_list[i]; 
	    }
	    result[num_list.length] = ( num_list[num_list.length-2] > num_list[num_list.length-1]?  num_list[num_list.length-1]*2 : num_list[num_list.length-1]-num_list[num_list.length-2]);
	    return result;
	}
	
} //class
