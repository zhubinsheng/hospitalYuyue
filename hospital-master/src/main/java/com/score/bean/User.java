package com.score.bean;

import org.springframework.stereotype.Component;

/**
 * 用户实体类
 * @author hmg
 *
 */
@Component
public class User {
	/*用户名称*/
	private int userId;

	/* 用户登录密码 */
	private String password;

	private String studentNo; //账号  手机号 非登录账号

	/*用户登录名称*/
	private String userName;
    private String studentSex;
	private String type;   //安卓设备登录为2

	private String address;//地址

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}
}
