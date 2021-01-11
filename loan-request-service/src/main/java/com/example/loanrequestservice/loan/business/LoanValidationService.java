package com.example.loanrequestservice.loan.business;

import com.myorg.loan.domain.Application;
import com.myorg.loan.domain.ApprovalStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoanValidationService {
    public static ResponseEntity<ApprovalStatus> validate(Application application) {

        return null;
    }
}
