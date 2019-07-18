/** 
 * @Title: ReadFtpProperties.java 
 * @Package com.family.utils 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年3月28日 下午4:16:35 
 * @version V1.0 
 */
package com.bei.tally.util.ftp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName: ReadFtpProperties
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年3月28日 下午4:16:35
 * 
 */
public class ReadFtpProperties {

	private InputStream is;
	private Properties properties;

	public ReadFtpProperties() {
		is = this.getClass().getResourceAsStream("/config/ftpconfig.properties");// 将配置文件读入输入流中
		properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			System.out.println("配置文件不存在..");
			e.printStackTrace();
		} finally {

			if (null != is) {

				try {
					is.close();
				} catch (IOException e) {
					System.out.println("关闭流失败..");
					e.printStackTrace();
				}
			}

		}

	}

	public String getFtpHost() {// 获取ftp服务器的ip地址
		return properties.getProperty("ftpHost");

	}

	public String getFtpPort() {// 获取ftp服务器的端口
		return properties.getProperty("ftpPort");

	}

	public String getFtpUsername() {// 获取ftp登录用户名
		return properties.getProperty("ftpUsername");

	}

	public String getFtpPassword() {// 获取ftp服务器的登录密码
		return properties.getProperty("ftpPassword");

	}

	public String getFtpBasePath() {// 获取ftp服务器的存放文件的目录
		return properties.getProperty("ftpBasePath");

	}
}
