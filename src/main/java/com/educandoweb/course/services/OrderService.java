package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

//Registra a classe como componente do spring e ele vai poder ser injetado com a anotation @Autowired
@Service
public class OrderService {

	@Autowired
	private OrderRepository userRepository;
	
	public List<Order> findAll(){
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = userRepository.findById(id);
		
		return  obj.get();
	}
}
