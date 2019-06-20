package com.bei.tally.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitText {

	//private static Properties properties = null;

	/**
	 * 1.@BeforeClass修饰的方法会在所有方法被调用前被执行， 而且该方法是静态的，所以当测试类被加载后接着就会运行它，
	 * 而且在内存中它只会存在一份实例，它比较适合加载配置文件 2.@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库连接
	 * 3.@Before和@After会在每个测试方法的前后各执行一次
	 */
	/**
	 * @Test:将一个普通的方法修饰成为一个测试方法
	 * @Test(expected=XX.class) @Test(timeout=毫秒) @BeforeClass:它会在所有的方法运行前被执行，static修饰
	 * @AfterClass：它会在所有方法运行结束后被执行，static修饰
	 * @Before：它会在每个测试方法运行钱执行一次
	 * @After：会在每个测试方法运行后执行一次
	 * @Ignore：所修饰的测试方法会被测试运行器忽略
	 * @RunWith:可以更改测试运行器ort.junit.runner.Runner
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// properties = new ClassPathXmlApplicationContext("jdbc.properties");
		System.out.println("this is BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is @AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is @Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is @After");
	}

	@Test
	public void test1() {
		System.out.println("this is test1-----------");
	}

}
