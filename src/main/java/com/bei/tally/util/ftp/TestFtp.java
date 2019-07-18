//package com.bei.tally.util.ftp;
///** 
// * @Title: TestFtp.java 
// * @Package com.family.utils 
// * @Description: TODO(用一句话描述该文件做什么) 
// * @author 技术部--徐周环   -.- 
// * @date 2019年3月28日 上午9:37:15 
// * @version V1.0 
// */
//
//
//import java.io.ByteArrayInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.io.UnsupportedEncodingException;
//
//
///**
// * @ClassName: TestFtp
// * @Description: TODO(这里用一句话描述这个类的作用)
// * @author 技术部--徐周环 -.-
// * @date 2019年3月28日 上午9:37:15
// * 
// */
//public class TestFtp {
//
//	/** 
//	 * @Title: main 
//	 * @Description: TODO(这里用一句话描述这个方法的作用) 
//	 * @param @param args 设定文件 
//	 * @return void 返回类型 
//	 * @throws 
//	 */
//	public static void main(String[] args) {
////		image.ftp.server=192.168.0.217
////				image.ftp.port=21
////				image.ftp.username=ftp
////				image.ftp.password=123456
////				image.url.header=http://114.116.49.143:81/
////				image.local.url.header=http://114.116.49.143:81/
//		//String ftpHost = "192.168.0.217";
//		String ftpHost = "47.94.216.112";
//        String ftpUserName = "ftpp";
//        String ftpPassword = "511";
//        int ftpPort = 21;
//        String ftpPath = "/school/";
//        String localPath = "H:\\11";
//        String localPaths = "H:\\11\\11.txt";
//        String fileName = "11.txt";
//
//        //上传一个文件
//        try{
//            FileInputStream in=new FileInputStream(new File(localPaths));
//            //boolean test = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath,ftpPath, fileName,in);
//            String path = FtpUtil.uploadFile(ftpHost, ftpPort, ftpUserName, ftpPassword, ftpPath, "abc/", fileName, in);
//            System.out.println(path);
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println(e);
//        }
//
//        //在FTP服务器上生成一个文件，并将一个字符串写入到该文件中
////        try {
////            InputStream input = new ByteArrayInputStream("test ftp jyf".getBytes("GBK"));
////            boolean flag = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath, fileName,input);;
////            System.out.println(flag);
////        } catch (UnsupportedEncodingException e) {
////            e.printStackTrace();
////        }
//
//        //下载一个文件
//        //FtpUtil.downloadFtpFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath, localPath, fileName);
//       // FtpUtil.downloadFtpFile(ftpHost, ftpUserName, ftpPassword, ftpPort, "", localPath, "999.jpg");
//	}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
