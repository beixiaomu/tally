/** 
 * @Title: Calc.java 
 * @Package com.bei.tally.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年6月11日 下午5:50:28 
 * @version V1.0 
 */
package com.bei.tally.controller;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: Calc
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月11日 下午5:50:28
 * 
 */
public class CalculateTest {

	@Test
	public void addTest() {
		assertEquals(6, new Calculate().add(3, 3));
	}

	@Test
	public void jianTest() {
		assertEquals(5, new Calculate().jian(8, 3));
	}

	@Test
	public void chengTest() {
		assertEquals(27, new Calculate().cheng(9, 3));
	}

	@Test(expected=ArithmeticException.class)
	public void chuTest() {
		assertEquals(5, new Calculate().chu(25, 0));
	}

	@Ignore("就是不想测试这个方法")//这个测试方法将被忽略
	@Test(timeout=2000)
	public void testWhile() {
		while(true) {
			System.out.println("run forever....");
		}
	}
	
	@Test(timeout=3000)
	public void testReadFIle() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
