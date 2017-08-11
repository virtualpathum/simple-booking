package com.lk.meeting.room.resource;

public class UserResource extends AbstractResource<Long> {

	public UserResource(Long resourceId) {
		super(resourceId);
	}
	
	public UserResource(){
		super(null);
	}
	
	private String userName;

	private Integer role;
	
	private String department;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	} 
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getResourceId())
				.append(", userName = " + this.getUserName()).toString();
				
	}
	

}
