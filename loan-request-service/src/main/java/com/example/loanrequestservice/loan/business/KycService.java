package com.example.loanrequestservice.loan.business;

import com.myorg.loan.domain.KycForm;
import org.springframework.stereotype.Service;

@Service
public class KycService {
    public boolean performKycCheck(KycForm kycForm) {
        return Boolean.TRUE;
    }
}
