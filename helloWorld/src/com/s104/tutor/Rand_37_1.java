package com.s104.tutor;

public class Rand_37_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = new int[7];
		for (int i = 0; i < result.length; i++) {
			one_num: while (true) {
				result[i] = (int) (Math.random() * 36) + 1;
				for (int j = 1; j < i; j++) {
					if (result[i] == result[j]) {
						continue one_num;
					}
				}
				break;
			}
		}
		for (int num : result)
			System.out.print(num + "  ");
		System.out.println();
	}

}
