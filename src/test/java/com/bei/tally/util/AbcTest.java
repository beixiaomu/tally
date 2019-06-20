/** 
 * @Title: AbcTest.java 
 * @Package com.bei.tally.util 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年6月13日 下午2:18:04 
 * @version V1.0 
 */
package com.bei.tally.util;

import java.math.BigDecimal;

/**
 * @ClassName: AbcTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月13日 下午2:18:04
 * 
 */
@SuppressWarnings("unused")
public class AbcTest {  //你知道吗，这里有问题
	private final static String FUWU1 = "10.0";
	private final static String YIJI1 = "10.0";
	private final static String ERJI1 = "6.0";
	private final static String YUANGONG1 = "8.0";
	private final static String GUKE1 = "3.8";
	
	private final static BigDecimal FUWU = new BigDecimal(FUWU1);
	private final static BigDecimal YIJI = new BigDecimal(YIJI1);
	private final static BigDecimal ERJI = new BigDecimal(ERJI1);
	
	private final static BigDecimal YUANGONG = new BigDecimal(YUANGONG1);
	private final static BigDecimal GUKE = new BigDecimal(GUKE1);
	public static void main(String[] args) {
		
		System.out.println(FUWU);
		System.out.println(FUWU1);
		System.out.println(GUKE);
		System.out.println(GUKE1);
		
		String path = System.getProperty("user.dir");
		System.out.print(path);
		int aString = 10;
		String bString = "8.5";
		BigDecimal er = new BigDecimal(aString);
		
		BigDecimal yi = new BigDecimal(bString);
		BigDecimal sss = yi.add(er);
		
		
		System.out.println();
		System.out.println(er);
		System.out.println( yi);
		System.out.println(sss);
		System.out.println(FUWU.subtract(GUKE));
		
		
		
		
		
		
		
		
		//subtract
		
		
		
		
	}
}
