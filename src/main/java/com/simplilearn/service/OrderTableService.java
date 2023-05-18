package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.OrderTable;
import com.simplilearn.repository.OrderTableRepository;


@Service
public class OrderTableService {
	@Autowired
	private OrderTableRepository orderitemrepository;
	
	public OrderTable saveorderitem(OrderTable order)
	{
		return orderitemrepository.save(order);
	}
	
	public OrderTable getsingleorderitem(long id)
	{
		return orderitemrepository.findById(id).get();
	}
	
	public List<OrderTable> getalloredritems()
	{
		return orderitemrepository.findAll();
	}
}
