package com.uni2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ParameterizedDemo 
{
	Addition a1=null;
	int fno,sno,eno;
	public ParameterizedDemo(int fno,int sno,int eno)
	{
		this.fno=fno;
		this.sno=sno;
		this.eno=eno;
	}
	@Parameterized.Parameters
	public static Collection inputs()
	{
		return Arrays.asList(new Object[][] {{1,2,3},{4,5,10},{5,6,11}});
	}
	@Before
	public void before()
	{
		a1=new Addition();
	}
	@Test
	public void test()
	{
		System.out.println("Eno is.. "+eno);
		Assert.assertEquals(eno, a1.sum(fno, sno));
	}
}
