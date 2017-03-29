package com.daniel.action;

import com.daniel.service.impl.RegisterServiceImpl;
import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action {

	private String username;
	private String password;
	private RegisterServiceImpl rsi;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(rsi.vaild(username, password)){
			System.out.println("success");
			return "registerSuccess";
		}
		return "registerFail";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegisterServiceImpl getRsi() {
		return rsi;
	}

	public void setRsi(RegisterServiceImpl rsi) {
		this.rsi = rsi;
	}

}
