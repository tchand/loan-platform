package com.example.loanrequestservice.loan.business;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public Person getPersonById(long id) {
        Person p = new Person();
        p.setId(1l);
        p.setFirstName("Trilok");
        p.setLastName("Chand");
        return p;
    }
}
