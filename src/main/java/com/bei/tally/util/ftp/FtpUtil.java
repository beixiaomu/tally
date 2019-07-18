/** 
 * @Title: FtpUtil.java 
 * @Package com.family.utils 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年3月28日 上午9:36:09 
 * @version V1.0 
 */ 
package com.bei.tally.util.ftp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.web.multipart.MultipartFile;

//import org.apache.commons.net.ftp.FTP;
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPFile;
//import org.apache.commons.net.ftp.FTPReply;
//import org.json.JSONObject;

/** 
 * @ClassName: FtpUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年3月28日 上午9:36:09 
 *  
 */
public class FtpUtil {
    
    /** 
     * Description: 向FTP服务器上传文件 
     * @param host FTP服务器hostname 
     * @param port FTP服务器端口 
     * @param username FTP登录账号 
     * @param password FTP登录密码 
     * @param basePath FTP服务器基础目录
     * @param filePath FTP服务器文件存放路径。例如分日期存放：/2015/01/01。文件的路径为basePath+filePath
     * @param filename 上传到FTP服务器上的文件名 
     * @param input 输入流 
     * @return 成功返回true，否则返回false 
     */  
    public static String uploadFile(String host, int port, String username, String password, String basePath,
            String filePath, String filename, InputStream input) {
        String result = "false";
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(host, port);// 连接FTP服务器
            // 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
            ftp.login(username, password);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return result;
            }
            //切换到上传目录
            if (!ftp.changeWorkingDirectory(basePath+filePath)) {
                //如果目录不存在创建目录
                String[] dirs = filePath.split("/");
                String tempPath = basePath;
                for (String dir : dirs) {
                    if (null == dir || "".equals(dir)) continue;
                    tempPath += "/" + dir;
                    if (!ftp.changeWorkingDirectory(tempPath)) {
                        if (!ftp.makeDirectory(tempPath)) {
                            return result;
                        } else {
                            ftp.changeWorkingDirectory(tempPath);
                        }
                    }
                }
            }
            //设置上传文件的类型为二进制类型
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            //上传文件
            if (!ftp.storeFile(filename, input)) {
                return result;
            }
            input.close();
            ftp.logout();
            result = "http://"+host+":9090"+basePath+filePath+filename;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return result;
    }
    /** 
     * @param remotePath FTP服务器上的相对路径 
     * @param fileName 要下载的文件名 
     * @param localPath 下载后保存到本地的路径 
     * @return 
     */
    public static boolean download( String remotePath,
            String fileName, String localPath) {
    	 boolean result = false;
    	 
//    	 /**
//    	  * 截取第三个/与最后一个斜杠之前的数据
//    	  */
//    	 int start =remotePath.lastIndexOf('/',2);
//    	 int end =remotePath.lastIndexOf('/');
// 		String old = remotePath.substring(s);
// 		String ttype = typeName.substring(intold+1);
// 		http://47.94.216.112:9090/school/exe/2019-07-18/cWe6PWcWe6PW.exe
//    	 
    	 localPath="C:\\Users\\ASUS\\Desktop\\";
    		int start =remotePath.indexOf("/",10);
    	   	System.out.println("start:"+start);
    	   	int end =remotePath.lastIndexOf('/');
    	   	System.out.println("end:"+end);
			String old = remotePath.substring(start,end+1);
			System.out.println("old:"+old);
			String ttype = remotePath.substring(end+1);
			System.out.println("ttype:"+ttype);
			System.out.println("remotePath:"+remotePath);
    	 
    	 
    	 
    	 ReadFtpProperties rFtpProperties = new ReadFtpProperties();
 		String ftpIp = rFtpProperties.getFtpHost();
 		int ftpPort = Integer.parseInt(rFtpProperties.getFtpPort());
 		String ftpUser = rFtpProperties.getFtpUsername();
 		String ftpPwd = rFtpProperties.getFtpPassword();
 		//String basePath = rFtpProperties.getFtpBasePath();
 		result =FtpUtil.downloadFile(ftpIp, ftpPort,ftpUser, ftpPwd, old, ttype, localPath);
 		
    	 
    	 return result;
    }
    
    /** 
     * Description: 从FTP服务器下载文件 
     * @param host FTP服务器hostname 
     * @param port FTP服务器端口 
     * @param username FTP登录账号 
     * @param password FTP登录密码 
     * @param remotePath FTP服务器上的相对路径 
     * @param fileName 要下载的文件名 
     * @param localPath 下载后保存到本地的路径 
     * @return 
     */  
    public static boolean downloadFile(String host, int port, String username, String password, String remotePath,
            String fileName, String localPath) {
        boolean result = false;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(host, port);
            // 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
            ftp.login(username, password);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return result;
            }
            ftp.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
            FTPFile[] fs = ftp.listFiles();
            for (FTPFile ff : fs) {
                if (ff.getName().equals(fileName)) {
                    File localFile = new File(localPath + "/" + ff.getName());

                    OutputStream is = new FileOutputStream(localFile);
                    ftp.retrieveFile(ff.getName(), is);
                    is.close();
                }
            }

            ftp.logout();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return result;
    }
    
    public static String ftpUpload( String filePath, String filename, InputStream input) {
    	String path=null;
    	ReadFtpProperties rFtpProperties = new ReadFtpProperties();
		String ftpIp = rFtpProperties.getFtpHost();
		int ftpPort = Integer.parseInt(rFtpProperties.getFtpPort());
		String ftpUser = rFtpProperties.getFtpUsername();
		String ftpPwd = rFtpProperties.getFtpPassword();
		String basePath = rFtpProperties.getFtpBasePath();
		try {
			path = FtpUtil.uploadFile(ftpIp, ftpPort, ftpUser, ftpPwd, basePath, filePath, filename, input);
			System.out.println(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return path;
    }

	/**
	 * @throws IOException  
	 * @Title: ftpUp 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param file 设定文件 
	 * @return void 返回类型 
	 * @throws 
	 */ 
	public static String ftpUp(MultipartFile file) throws IOException {

		String name = file.getName();
		Long size = file.getSize();
		String type = file.getContentType();
		String typeName = file.getOriginalFilename();
		System.out.println("文件名：" + name + "文件大小：" + size + "mime类型：" + type + "文件类型:" + typeName);

		InputStream fis = (InputStream) file.getInputStream();

		System.out.println("******************fis*****************" + fis);

		System.out.println("******************file*****************");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String date = sdf.format(new Date());

		// 避免文件名重复使用uuid来避免,产生一个随机的uuid字符
		String realFileName = Uuidd.getStringRandom(6);
		int intold =typeName.lastIndexOf('.');
		String old = typeName.substring(intold);
		String ttype = typeName.substring(intold+1);
		String news = realFileName+realFileName + old;
		System.out.println("intold" + intold);
		System.out.println("date" + date);
		System.out.println("old" + old);
		System.out.println("news" + news);
		System.out.println("realFileName" + realFileName);
		String repaht = FtpUtil.ftpUpload(ttype+"/"+date+"/", news, fis);
		System.out.println("repaht" + repaht);
		return repaht;
	}
    
    
    
//    public static void main(String[] args) {
//    	
//    	
//    	
//    	Map<String, Object> maps=new LinkedHashMap<String, Object>();
//		Map<String, Object> map=new HashMap<String, Object>();
//		String fromObject = "";
//		String isError="false";
//		String flag="交易失败";
//		//payGoodsdesc = new String (payGoodsdesc.getBytes("UTF-8"),"UTF-8");
//		
//
//		//获取Tokenid
////		String resultJson1 = GetTokenId.getTokenId();	
////		JsonObject reJsonObject = (JsonObject) new JsonParser().parse(resultJson1);
////		tokenId = reJsonObject.get("data").getAsJsonObject().get("tokenId").getAsString();
//
//    	
//    	
//    	
//    	
//    	ReadFtpProperties rFtpProperties = new ReadFtpProperties();
//    	String ftpIp = rFtpProperties.getFtpHost();
//        int ftpPort = Integer.parseInt(rFtpProperties.getFtpPort());
//        String ftpUser = rFtpProperties.getFtpUsername();
//        String ftpPwd = rFtpProperties.getFtpPassword();
//        String basePath = rFtpProperties.getFtpBasePath();
//      try {  
//      FileInputStream in=new FileInputStream(new File("H:\\11\\999.jpg"));  
//      String path = uploadFile(ftpIp, ftpPort, ftpUser, ftpPwd, basePath,"abc/", "88.jpg", in);  
//      System.out.println(path);  
//	  } catch (FileNotFoundException e) {  
//	      e.printStackTrace();  
//	  } 
////        try {  
////            FileInputStream in=new FileInputStream(new File("H:\\11\\999.jpg"));  
////            String path = uploadFile("47.94.216.112", 21, "Administrator", "Xu978721072", "/school/","abc/", "88.jpg", in);  
////            System.out.println(path);  
////        } catch (FileNotFoundException e) {  
////            e.printStackTrace();  
////        }  
////        	boolean flag =downloadFile("47.94.216.112", 21, "Administrator", "Xu978721072", "/school/abc/","99989.jpg", "H:\\11\\");
////            System.out.println(flag);  
//    }
    public static void main(String[] args) {
    	boolean flag =downloadFile("47.94.216.112", 21, "Administrator", "Xu978721072", "/school/abc/","99989.jpg", "H:\\11\\");
    System.out.println(flag); 
	}
   
}
