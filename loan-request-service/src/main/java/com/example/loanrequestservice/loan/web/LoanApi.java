package com.example.loanrequestservice.loan.web;

import com.myorg.loan.business.KycService;
import com.myorg.loan.business.LoanValidationService;
import com.myorg.loan.db.ApplicationRepository;
import com.myorg.loan.db.KycRepo;
import com.myorg.loan.domain.Application;
import com.myorg.loan.domain.ApprovalStatus;
import com.myorg.loan.domain.KycForm;
import com.myorg.loan.web.exception.ApplicationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class LoanApi {

    private final ApplicationRepository applicationRepo;

    private final LoanValidationService loanValidationService;

    private final KycRepo kycRepo;

    @Autowired
    public LoanApi(ApplicationRepository applicationRepo, LoanValidationService loanValidationService, KycRepo kycRepo) {
        this.applicationRepo = applicationRepo;
        this.loanValidationService = loanValidationService;
        this.kycRepo = kycRepo;
    }

    @PostMapping("/kyc")
    @ResponseStatus(HttpStatus.CREATED)
    public void kyc(@Validated KycForm kycForm) {
        kycRepo.save(kycForm);
    }

    @PostMapping
    public void applyForLoan(@RequestBody @Validated Application application) {
        applicationRepo.save(application);
    }

    @GetMapping("/validate/{id}")
    public ApprovalStatus validate(@PathVariable("id") long id) {
        Application application = applicationRepo.findById(id).orElseThrow(() -> new ApplicationNotFoundException("No application found with id"));
        ResponseEntity<ApprovalStatus> response = LoanValidationService.validate(application);//POST

        return response.getBody();
    }
}
