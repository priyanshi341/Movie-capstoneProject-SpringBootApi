package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.OrderTable;
import com.simplilearn.service.OrderTableService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderTableController {

	@Autowired
	private OrderTableService orderservice;
	
	@PostMapping("/ordertable")
	public Long saveitemintable(@RequestBody OrderTable order)
	{
		OrderTable orderref=orderservice.saveorderitem(order);
		return orderref.getId();
	}
	
	@GetMapping("/ordertable")
	public List<OrderTable> getallorderitems()
	{
		return orderservice.getalloredritems();
	}
	
	@GetMapping("/ordertable/{id}")
	public OrderTable getsingleorderitem(@PathVariable Long id)
	{
		return orderservice.getsingleorderitem(id);
	}
	
}
