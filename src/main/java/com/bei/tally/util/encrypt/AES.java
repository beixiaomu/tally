/** 
 * @Title: AES.java 
 * @Package com.bei.tally.util 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年6月26日 下午4:48:26 
 * @version V1.0 
 */
package com.bei.tally.util.encrypt;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.crypto.codec.Base64;

/**
 * @ClassName: AES
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年6月26日 下午4:48:26
 * 
 */
public class AES {

	private static String src = "woxihanifdl";

	public static void main(String[] args) {
		jdkAES() ;
	}

	public static void jdkAES() {
		try {
			// 生成key
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
			keyGenerator.init(128);
			SecretKey secretKey = keyGenerator.generateKey();
			byte[] keyBytes = secretKey.getEncoded();

			// key转换
			Key key = new SecretKeySpec(keyBytes, "AES");

			// 加密
			Cipher cipher;

			cipher = Cipher.getInstance("AES/ECB/PKCSSPadding");

			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("jdk aes encrypt:" + Base64.encode(result));
			
			cipher.init(Cipher.DECRYPT_MODE, key);
			result = cipher.doFinal(result);
			System.out.println("jdk aes decrypt:" + new String(result));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
