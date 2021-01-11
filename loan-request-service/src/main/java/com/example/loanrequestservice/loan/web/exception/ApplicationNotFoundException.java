package com.example.loanrequestservice.loan.web.exception;

public class ApplicationNotFoundException extends RuntimeException {
    public ApplicationNotFoundException(String no_application_found_with_id) {
        super(no_application_found_with_id);
    }
}
