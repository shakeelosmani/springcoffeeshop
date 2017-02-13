package com.shakeel.repository;

import com.shakeel.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shakeelosmani on 01/01/17.
 */
public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
