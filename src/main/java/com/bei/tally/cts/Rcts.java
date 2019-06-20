package com.bei.tally.cts;

/**
 * 
 * @ClassName: Rcts 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 技术部--徐周环   -.- 
 * @date 2018年11月29日 下午3:36:31 
 *
 */
public enum Rcts {

    SUCCESS(200, "success"), ERROR(500, "error");


    private int value;

    private String msg;

    Rcts(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
