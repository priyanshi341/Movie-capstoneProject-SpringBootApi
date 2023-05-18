package com.simplilearn.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ordertable")
public class OrderTable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long orderid;
	private long userid;
	private String moviename;
	private long ticketprice;
	private LocalDate date;
	private long bookedseats;
	private long totalprice;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public long getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(long ticketprice) {
		this.ticketprice = ticketprice;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public long getBookedseats() {
		return bookedseats;
	}
	public void setBookedseats(long bookedseats) {
		this.bookedseats = bookedseats;
	}
	public long getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(long totalprice) {
		this.totalprice = totalprice;
	}
	public OrderTable(long orderid, long userid, String moviename, long ticketprice, LocalDate date, long bookedseats,
			long totalprice) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.moviename = moviename;
		this.ticketprice = ticketprice;
		this.date = date;
		this.bookedseats = bookedseats;
		this.totalprice = totalprice;
	}
	public OrderTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
