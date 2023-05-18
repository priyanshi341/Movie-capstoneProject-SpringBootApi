package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.OrderTable;

public interface OrderTableRepository extends JpaRepository<OrderTable,Long>{

}
