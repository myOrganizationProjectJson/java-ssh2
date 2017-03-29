package com.daniel.action;

import com.daniel.service.UpdateService;
import com.opensymphony.xwork2.Action;

public class UpdateAction implements Action{
	
	private String username;
	private String oldPassword;
	private String newPassword;
	private UpdateService us;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(us.update(username, getOldPassword(), getNewPassword())){
			return "success";
		}
		return "fail";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UpdateService getUs() {
		return us;
	}

	public void setUs(UpdateService us) {
		this.us = us;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
