package no.hvl.dat100.javel.oppgave3;

public class Customer {
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;
    // TODO - object variables (attributes)

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;





        // TODO
    }




    // TODO - getter/setter methods for all objectvariables
    public void setName(String nyttnamn){
        name = nyttnamn;

    }
    public String getName() {
        return name;
    }


    public void setEmail(String nyemail){
        email = nyemail;
    }
    public String getEmail() {
        return email;
    }



    public void setAgreement(PowerAgreementType nyagreement) {
        agreement = nyagreement;
    }
    public PowerAgreementType getAgreemet() {
        return agreement;
    }

    public void setCustomer_id(int nykunde){
        customer_id = nykunde;
    }
    public int getCustomer_id(){
        return customer_id;
    }

    // TODO - toString method
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", customer_id=" + customer_id +
                ", agreement=" + agreement +
                '}'; }

}
