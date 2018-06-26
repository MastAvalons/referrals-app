package com.Nearsoft.referrals.model;
import java.util.List;
public class JobDescription{
    private List<String> requirements;
    private List<String> responsibilities;
    private List<String> skills;
    private List<String> generals;

    public List<String> getRequirements(){
        return requirements;
    }

    public List<String> getResponsibilities(){
        return responsibilities;
    }

    public List<String> getGenerals(){
        return generals;
    }

    public List<String> getSkills(){
        return skills;
    }


    public void setRequirements(List<String> requirements){
        this.requirements = requirements;
    }

    public void setResponsibilities(List<String> responsibilities){
        this.responsibilities = responsibilities;
    }

    public void setGenerals(List<String> generals){
        if(this.generals == null)
            this.generals=generals;
        else
            this.generals.addAll(generals);
    }

    public void setSkills(List<String> skills){
        this.skills = skills;
    }


}