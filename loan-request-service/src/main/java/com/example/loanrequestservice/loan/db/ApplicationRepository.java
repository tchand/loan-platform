package com.example.loanrequestservice.loan.db;

import com.myorg.loan.LoanApplication;
import com.myorg.loan.domain.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
