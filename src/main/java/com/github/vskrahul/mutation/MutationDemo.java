package com.github.vskrahul.mutation;

import java.util.List;

public class MutationDemo {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int test(List<String> list, int v) {
		if(list != null 
				&& list.size() != v) {
			return 1;
		} else {
			return 2;
		}
	}
}