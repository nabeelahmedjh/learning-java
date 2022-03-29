package com.company;

public class Candidate {
    public int marks;
    protected String city, programStudied, programApplied;
    protected Boolean challanPaid;

    public Candidate() {
        city = "Sahiwal";
        programStudied = "Pre-Engineering";
        programApplied = "BSCS";
    }

    public void setChallanPaid(String decision) {

        if (decision.equals("y") || decision.equals("Y"))
            challanPaid = true;
        else
            challanPaid = false;

    }

    public void displayChallanInfo() {

        if (challanPaid)
            System.out.println("Challan is Paid");
        else
            System.out.println("Challan is not Paid");
    }

    public Boolean getChallan() {
        return challanPaid;
    }
}