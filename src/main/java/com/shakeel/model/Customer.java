package com.shakeel.model;


import javax.persistence.*;

/**
 * Created by shakeelosmani on 24/12/16.
 */

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long customerId;

    private String firstName;

    private String lastName;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
