package com.example.Management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Management.model.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders,Integer> {

}
