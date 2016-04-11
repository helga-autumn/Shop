package com.repository;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public interface CrudRepository<T, ID extends Serializable>
extends Repository<T, Id> {

<S extends T> S save(S entity); 

T findOne(ID primaryKey);       

Iterable<T> findAll();          

Long count();                   

void delete(T entity);          

boolean exists(ID primaryKey);  


}
	


