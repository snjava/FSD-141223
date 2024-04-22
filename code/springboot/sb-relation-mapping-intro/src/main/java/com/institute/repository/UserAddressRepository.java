package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer>  {

}
