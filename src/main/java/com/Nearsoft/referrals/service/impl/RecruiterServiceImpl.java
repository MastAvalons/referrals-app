package com.Nearsoft.referrals.service.impl;

import com.Nearsoft.referrals.model.Recruiter;
import com.Nearsoft.referrals.service.RecruiterService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RecruiterServiceImpl implements RecruiterService{
    
    @Override
    public List<Recruiter> getRecruiters() {
        List<Recruiter> recruitersList = new ArrayList<Recruiter>();
        Recruiter recruiter1 = new Recruiter();
        Recruiter recruiter2 = new Recruiter();

        recruiter1.setName("Recruiter1");
        recruiter1.setEmail("Recruiter1@nearsoft.com");
        recruiter2.setName("Recruiter2");
        recruiter2.setEmail("Recruiter2@nearsoft.com");

        recruitersList.add(recruiter1);
        recruitersList.add(recruiter2);

        return recruitersList;
    }
}