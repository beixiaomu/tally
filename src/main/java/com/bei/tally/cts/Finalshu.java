package com.bei.tally.cts;

public class Finalshu {
	// 注册用的密匙
	public static final String KEY = "123";
	/**
	 * 200
	 * 成功
	 */
	public static final int CODE_200 = 200;// 成功
	/**
	 * 404
	 * 没有找到
	 */
	public static final int CODE_404 = 404;// 没有找到
	/**
	 * 500
	 * 服务器内部异常
	 */
	public static final int CODE_500 = 500;// 服务器内部异常
	/**
	 * 000
	 * 操作成功 统一定义的操作成功提示
	 */
	public static final int CODE_000 = 000;// 操作成功 统一定义的操作成功提示
	/**
	 * 001
	 * 操作失败 系统或网络原因
	 */
	public static final int CODE_001 = 001;// 操作失败 系统或网络原因
	/**
	 * 002
	 * 参数格式错误 服务端解析输入参数不符合json格式
	 */
	public static final int CODE_002 = 002;// 参数格式错误 服务端解析输入参数不符合json格式
	/**
	 * 003
	 * 缺少参数 缺乏必填字段
	 */
	public static final int CODE_003 = 003;// 缺少参数 缺乏必填字段
	/**
	 * 004
	 * 用户session失效 用户session失效，客户端需重新发起登录请求
	 */
	public static final int CODE_004 = 004;// 用户session失效 用户session失效，客户端需重新发起登录请求
	/**
	 * 005
	 * 不支持的接口
	 */
	public static final int CODE_005 = 005;// 不支持的接口
	/**
	 * 006
	 * 其他消息 服务端将给出具体错误提示
	 */
	public static final int CODE_006 = 006;// 其他消息 服务端将给出具体错误提示
	/**
	 * 101
	 * 注册用户失败 注册用户数据格式校验错误，服务端给出具体的错误提示
	 */
	public static final int CODE_101 = 101;// 注册用户失败 注册用户数据格式校验错误，服务端给出具体的错误提示
	/**
	 * 102
	 * 注册用户失败 已存在的用户名
	 */
	public static final int CODE_102 = 102;// 注册用户失败 已存在的用户名
	/**
	 * 103
	 * 用户登录失败 用户名不存在
	 */
	public static final int CODE_103 = 103;// 用户登录失败 用户名不存在
	/**
	 * 104
	 * 用户登录失败 密码错误
	 */
	public static final int CODE_104 = 104;// 用户登录失败 密码错误
	/**
	 * 105
	 * sign签名不正确
	 */
	public static final int CODE_105 = 105;// sign签名不正确 sign签名不正确
	/**
	 * 106
	 * 需要强制升级版本 强制升级
	 */
	public static final int CODE_106 = 106;// 需要强制升级版本 强制升级

}
