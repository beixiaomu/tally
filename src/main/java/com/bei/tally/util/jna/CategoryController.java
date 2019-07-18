package com.bei.tally.util.jna;



import com.sun.jna.Native;

public class CategoryController {
  
    public static void main(String[] args) {
    	String dir = "D:\\dll\\zhcard";// dll文件的路径，可以省略后缀名，dll和so后缀都可以加载 

    	try {
    		System.out.println(666);
    		CallMTScaleLibrary scaleLibrary = (CallMTScaleLibrary) Native.loadLibrary(dir, CallMTScaleLibrary.class);
    		System.out.println(scaleLibrary);
      	  	int result = scaleLibrary.XRWD_Open();
      	  	System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
