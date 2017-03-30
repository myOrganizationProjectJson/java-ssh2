package com.daniel.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.daniel.model.User;
import com.daniel.service.impl.DeleteServiceImpl;
import com.opensymphony.xwork2.Action;

public class DeleteAction implements Action{
	private String username;
	private DeleteServiceImpl dsi;
	private String tip;
	private List<User> userList;
	
	private List orderList;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(dsi.delete(username)){
			return "success";
		}
		
		
		String a="testa";
		
		this.setTip(a);;
		System.out.println(this.getTip());
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


	public List getOrderList() {
		return orderList;
	}
	public void setOrderList(List orderList) {
		this.orderList = orderList;
	}
	
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public void setUserList(List<User> userList){
		this.userList=userList;
		
	}
	
	public List<User> getUserList() {
		return userList;
	}
	
	
	public String deleteList(){
		List<User> userList=dsi.getUser();
		this.userList=userList;
		return "success";
	}
	
	
	public String login() {
		System.out.println(""+"logining");
		
		return "fail";
	}
}
