package com.example.demo.entity;


public class SysMenus {

  private long id;
  private String name;
  private String url;
  private long type;
  private long sort;
  private String note;
  private long parentId;
  private String permission;
  private java.sql.Timestamp createdTime;
  private java.sql.Timestamp modifiedTime;
  private String createdUser;
  private String modifiedUser;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  public java.sql.Timestamp getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(java.sql.Timestamp createdTime) {
    this.createdTime = createdTime;
  }


  public java.sql.Timestamp getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.sql.Timestamp modifiedTime) {
    this.modifiedTime = modifiedTime;
  }


  public String getCreatedUser() {
    return createdUser;
  }

  public void setCreatedUser(String createdUser) {
    this.createdUser = createdUser;
  }


  public String getModifiedUser() {
    return modifiedUser;
  }

  public void setModifiedUser(String modifiedUser) {
    this.modifiedUser = modifiedUser;
  }

}
