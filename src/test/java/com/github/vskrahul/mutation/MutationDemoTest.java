package com.github.vskrahul.mutation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MutationDemoTest {

	private MutationDemo mutationDemo = new MutationDemo();
	
	@Test
	public void addTest() {
		int v = mutationDemo.add(5, 2);
		assertEquals(7, v);
	}
	
	@Test
	public void multiplyTest() {
		int v = mutationDemo.multiply(5, 2);
		assertEquals(10, v);
	}
	
	@Test
	public void testTest() {
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		
		int i = this.mutationDemo.test(list, 2);
		assertEquals(2, i);
	}
	
	@Test
	public void testTest1() {
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		
		int i = this.mutationDemo.test(list, 3);
		assertEquals(1, i);
	}
	
	@Test
	public void testTestNull() {
		int i = this.mutationDemo.test(null, 3);
		assertEquals(2, i);
	}
	
	//@Test
	public void testTestEmpty() {
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		
		this.mutationDemo.test(list, 2);
		assertTrue(true);
	}
}
