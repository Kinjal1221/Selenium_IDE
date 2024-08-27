//W.a.junit program to handled Assert class with all method to check its pass or fail


package com.uni1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class Junit_AssertDemo
{
	@Test
	public void test()
	{
		int a=5,b=6;
		String s=null;
		String s1="Rahul", s2="Rahul";
		int[] x= {1,2,3,4,5};
		int[] y= {1,2,3,4,8};
//		assertTrue(a>b);
//		Assert.assertTrue(a<b);
//		assertFalse(a<b);
//		assertNotNull(s);
//		assertNull(s);
//		assertSame(s1,s2);
//		assertNotSame(s1,s2);
//		assertEquals(s1,s2);
//		Assert.assertNotEquals(s, s2);
//		Assert.assertArrayEquals(x, y);
		Assert.fail("Self Failed");
	}
}
