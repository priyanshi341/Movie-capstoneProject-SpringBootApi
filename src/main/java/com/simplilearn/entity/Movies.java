package com.simplilearn.entity;


import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long  id;
private String moviename;
private long price;
private String image;
private long seats;
private LocalTime time1;
private LocalTime time2;
private LocalTime time3;
private LocalTime time4;
private boolean enabled;
@ManyToOne
private Category category;

public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public long getSeats() {
	return seats;
}
public void setSeats(long seats) {
	this.seats = seats;
}
public LocalTime getTime1() {
	return time1;
}
public void setTime1(LocalTime time1) {
	this.time1 = time1;
}
public LocalTime getTime2() {
	return time2;
}
public void setTime2(LocalTime time2) {
	this.time2 = time2;
}
public LocalTime getTime3() {
	return time3;
}
public void setTime3(LocalTime time3) {
	this.time3 = time3;
}
public LocalTime getTime4() {
	return time4;
}
public void setTime4(LocalTime time4) {
	this.time4 = time4;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

public Movies(String moviename, long price, String image, long seats, LocalTime time1, LocalTime time2, LocalTime time3,
		LocalTime time4, boolean enabled, Category category) {
	super();
	this.moviename = moviename;
	this.price = price;
	this.image = image;
	this.seats = seats;
	this.time1 = time1;
	this.time2 = time2;
	this.time3 = time3;
	this.time4 = time4;
	this.enabled = enabled;
	this.category = category;
}
public Movies() {
	
}

}
