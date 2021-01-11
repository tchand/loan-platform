package com.example.kycservice;

import com.example.kycservice.domain.KycForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KycRepository extends CrudRepository<KycForm, Long> {

}

