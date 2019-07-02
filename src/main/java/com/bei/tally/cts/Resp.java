package com.bei.tally.cts;

import java.io.Serializable;

public class Resp<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private int code;		//状态码
	private String msg;		//具体信息
	private T data;			//数据

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Resp(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public Resp(int code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Resp() {
		super();
	}

	@Override
	public String toString() {
		return "Resp [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}
