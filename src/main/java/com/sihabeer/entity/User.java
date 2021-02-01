package com.sihabeer.entity;


public class User {

  private String userId;
  private String userName;
  private String pwd;
  private String permission;
  private String departmentName;
  private String phone;
  private String status;
  private String gender;

  public User() {
  }

  public User(String userId, String userName, String pwd, String permission, String departmentName, String phone, String status, String gender) {
    this.userId = userId;
    this.userName = userName;
    this.pwd = pwd;
    this.permission = permission;
    this.departmentName = departmentName;
    this.phone = phone;
    this.status = status;
    this.gender = gender;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
