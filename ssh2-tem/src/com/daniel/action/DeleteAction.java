package com.daniel.action;

import com.daniel.service.impl.DeleteServiceImpl;
import com.opensymphony.xwork2.Action;

public class DeleteAction implements Action{
	private String username;
	private DeleteServiceImpl dsi;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(dsi.delete(username)){
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
	public DeleteServiceImpl getDsi() {
		return dsi;
	}
	public void setDsi(DeleteServiceImpl dsi) {
		this.dsi = dsi;
	}

}
