package com.shakeel.repository;

import com.shakeel.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shakeelosmani on 24/12/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
