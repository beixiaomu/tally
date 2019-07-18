/** 
 * @Title: Test.java 
 * @Package com.bei.tally.util.ftp 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年7月18日 上午9:53:18 
 * @version V1.0 
 */
package com.bei.tally.util.ftp;

/**
 * @ClassName: Test
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年7月18日 上午9:53:18
 * 
 */
public class Test {
	/*
	 * 查看jdk是多少位的
	 * 
	 */
	public static void main(String[] args) {
		String arch = System.getProperty("sun.arch.data.model");
		System.out.println(arch);
	}
//	public static void main(String[] args) {
//		 /**
//   	  * 截取第三个/与最后一个斜杠之前的数据
//   	  */
//		String remotePath ="http://47.94.216.112:9090/school/exe/2019-07-18/cWe6PWcWe6PW.exe";
//   	int start =remotePath.indexOf("/",10);
//   	System.out.println("start:"+start);
//   	 int end =remotePath.lastIndexOf('/');
//   	System.out.println("end:"+end);
//		String old = remotePath.substring(start,end+1);
//		System.out.println("old:"+old);
//		String ttype = remotePath.substring(end+1);
//		System.out.println("ttype:"+ttype);
//		System.out.println("remotePath:"+remotePath);
//			
//	}
}
