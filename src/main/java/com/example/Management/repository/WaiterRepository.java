package com.example.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Management.model.Waiter;

@Repository
public interface WaiterRepository extends JpaRepository<Waiter,Integer>{

}
