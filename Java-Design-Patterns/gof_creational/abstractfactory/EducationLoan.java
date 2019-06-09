package gof_design_patterns.creational.abstractfactory;

public class EducationLoan extends Loan {

    @Override
    void setInterestRate(double rate){
        this.rate = rate;
    }
}