package com.algodomain.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algodomain.task.entity.Charges;

public interface ChargeRepository extends JpaRepository<Charges, Integer>
{

}
