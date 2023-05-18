package com.simplilearn.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
@OneToMany(mappedBy="category")
private List<Movies> m=new ArrayList<Movies>();
public Long getId() {
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
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(String name) {
	super();
	this.name = name;
}

}
