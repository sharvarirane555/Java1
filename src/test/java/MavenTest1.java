package com.combo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class MavenTest1 {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in); 
		int count=sc.nextInt();
		assertTrue(count==3);
	}
}
