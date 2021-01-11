package com.example.loanrequestservice.loan.db;

import com.myorg.loan.domain.KycForm;
import org.springframework.data.repository.CrudRepository;

public interface KycRepo extends CrudRepository<KycForm, Long> {
}
