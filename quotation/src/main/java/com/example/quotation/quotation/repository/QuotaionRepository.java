package com.example.quotation.quotation.repository;

import com.example.quotation.quotation.entity.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotaionRepository extends JpaRepository<Quotation, Integer> {
}
