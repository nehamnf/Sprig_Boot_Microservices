package com.myspringboot.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="customer_id")
    private Long customerId;

    @Column(name="name")
    private String name;

    @Column(name ="email")
    private String email;

    @Column(name ="mobile_number")
    private String mobileNumber;
}
