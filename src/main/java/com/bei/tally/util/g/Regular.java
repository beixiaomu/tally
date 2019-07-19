/** 
 * @Title: Regular.java 
 * @Package com.bei.tally.util 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 年月日 下午:: 
 * @version V. 
 */
package com.bei.tally.util.g;

import java.util.regex.Pattern;

/**
 * @ClassName: Regular
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 年月日 下午::
 * 
 */
public class Regular {

	public static boolean testString(String regex, String str) {
		return Pattern.matches(regex, str);
	}

	/**
	 * 正则表达式：汉字
	 */
	public static final String REGEX_CHINESE = "^[\\u4e00-\\u9fa5]{0,}$";

	/**
	 * 正则表达式：验证邮箱
	 */
	public static final String REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

	/**
	 * 正则表达式：验证域名
	 */
	public static final String REGEX_DOMAINNAME = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.?";

	/**
	 * 正则表达式：验证固话
	 */
	public static final String REGEX_PHONE = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";

	/**
	 * 正则表达式：验证固话
	 */
	public static final String REGEX_MOBILE = "^(\\(\\d{3,4}-)|\\d{3.4}-)?\\d{7,8}$";

	/**
	 * 正则表达式：验证身份证
	 */
	public static final String REGEX_ID_CARD = "^\\d{15}|\\d{18}$";

	/**
	 * 正则表达式：验证密码 (以字母开头，长度在6~18之间，只能包含字母、数字和下划线)：^[a-zA-Z]\w{5,17}$
	 */
	public static final String REGEX_PASSWORD = "^[a-zA-Z]\\w{5,17}$";

	/**
	 * 正则表达式：强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在8-16之间)：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}$
	 */
	public static final String REGEX_QIANGPASSWORD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}$";

	/**
	 * 正则表达式：日期
	 */
	public static final String REGEX_DATE = "^\\d{4}-\\d{1,2}-\\d{1,2}";

	/**
	 * 正则表达式：xml文件：^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$
	 */
	public static final String REGEX_XML = "^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\\\.[x|X][m|M][l|L]$";

	/**
	 * 正则表达式：腾讯QQ号：[1-9][0-9]{4,} (腾讯QQ号从10000开始)
	 */
	public static final String REGEX_QQ = "[1-9][0-9]{4,}";

	/**
	 * 正则表达式：中国邮政编码：[1-9]\d{5}(?!\d) (中国邮政编码为6位数字)
	 */
	public static final String REGEX_POSTCODE = "[1-9]\\d{5}(?!\\d)";

	/**
	 * 正则表达式：IP地址：
	 */
	public static final String REGEX_IP = "((?:(?:25[0-5]|2[0-4]\\\\d|[01]?\\\\d?\\\\d)\\\\.){3}(?:25[0-5]|2[0-4]\\\\d|[01]?\\\\d?\\\\d)";

	/**
	 * 正则表达式：m-n位的数字：^\d{m,n}$
	 */
	public static final String REGEX_NUM_N_M = "^\\d{m,n}$";

	/**
	 * 正则表达式：数字：^[0-9]*$
	 */
	public static final String REGEX_NUM = "^[0-9]*$";

	/**
	 * 正则表达式： n位的数字：^\d{n}$
	 */
	public static final String REGEX_NUM_N = "^[0-9]*$";

	public static void main(String[] args) {
		// boolean b = Regular.isShen("010221199305115918");
		// System.out.println(b);
		boolean mobile = Regular.isIDCard("12735652352");
		System.out.println(mobile);
	}

	/**
	 * 校验汉字
	 *
	 * @param chinese
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isChinese(String chinese) {
		return Pattern.matches(REGEX_CHINESE, chinese);
	}

	/**
	 * 校验邮箱
	 *
	 * @param email
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isEmail(String email) {
		return Pattern.matches(REGEX_EMAIL, email);
	}

	/**
	 * 校验域名
	 *
	 * @param domainName
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isDomainName(String domainName) {
		return Pattern.matches(REGEX_DOMAINNAME, domainName);
	}

	/**
	 * 校验手机号
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean isPhone(String phone) {
		return Pattern.matches(REGEX_PHONE, phone);
	}

	/**
	 * 校验固话
	 *
	 * @param mobile
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isMobile(String mobile) {
		return Pattern.matches(REGEX_MOBILE, mobile);
	}

	/**
	 * 校验 身份证
	 *
	 * @param idCard
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isIDCard(String idCard) {
		return Pattern.matches(REGEX_ID_CARD, idCard);
	}

	/**
	 * 校验 密码
	 *
	 * @param password
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isPassword(String password) {
		return Pattern.matches(REGEX_PASSWORD, password);
	}

	/**
	 * 校验 强密码
	 *
	 * @param password
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isQiangPassword(String password) {
		return Pattern.matches(REGEX_QIANGPASSWORD, password);
	}

	/**
	 * 校验 日期 格式
	 *
	 * @param password
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isDate(String date) {
		return Pattern.matches(REGEX_DATE, date);
	}

	/**
	 * 校验 XML
	 *
	 * @param password
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isXML(String xml) {
		return Pattern.matches(REGEX_XML, xml);
	}

	/**
	 * 校验 qq
	 * 
	 * @param qq
	 * @return
	 */
	public static boolean isQQ(String qq) {
		return Pattern.matches(REGEX_QQ, qq);
	}

	/**
	 * 校验 中国邮编
	 * 
	 * @param postcode
	 * @return
	 */
	public static boolean isPostCode(String postcode) {
		return Pattern.matches(REGEX_POSTCODE, postcode);
	}

	/**
	 * 校验 ip地址
	 * 
	 * @param ip
	 * @return
	 */
	public static boolean isIP(String ip) {
		return Pattern.matches(REGEX_IP, ip);
	}

	/**
	 * 校验 数字
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isNum(String num) {
		return Pattern.matches(REGEX_NUM, num);
	}

	/**
	 * 校验 m-n位的数字
	 * 
	 * @param m
	 *            n
	 * @return
	 */
	// public static boolean isNUM_N_M(String m,String n) {
	// return Pattern.matches(REGEX_NUM_N_M, m,n);
	// }

}
