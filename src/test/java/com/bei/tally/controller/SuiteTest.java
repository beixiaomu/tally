package com.bei.tally.controller;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class SuiteTest {

	/**
	 * 1.测试套件就是组织测试类一起运行的
	 * 
	 * 2.写一个座位测试套件的入口类，这个类里面不能包含其他方法
	 * 3.更改测试运行器 Suite.class
	 * 4.将要测试的类座位数组传入到Suite.SuiteClasses({..,..,..,..,})
	 */

}
