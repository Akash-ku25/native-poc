package com.spring.nativepoc.dto;

public class CustomerDto {
    private String customerId;

    private String customerFirstName;

    private String customerLastName;

    private String customerType;

    public String getCustomerId(){
        return customerId;
    }

    public void setCustomerId(String customerId){
        this.customerId=customerId;
    }

    public String getCustomerFirstName(){
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName){
        this.customerFirstName=customerFirstName;
    }

    public String getCustomerLastName(){
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName){
        this.customerLastName=customerLastName;
    }

    public String getCustomerType(){
        return customerType;
    }

    public void setCustomerType(String customerType){
        this.customerType=customerType;
    }
}
