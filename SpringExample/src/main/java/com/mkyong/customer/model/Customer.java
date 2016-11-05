package com.mkyong.customer.model;

import java.sql.Timestamp;

public class Customer
{
	private int custId;
	private String name;
	private int age;
	public Customer(int custId,String name,int age){
    this.custId = custId;
    this.name   = name;
    this.age    = age;
  }
  public int getCustId(){
    return custId;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

}
