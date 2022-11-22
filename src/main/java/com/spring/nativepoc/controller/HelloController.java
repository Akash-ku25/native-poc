package com.spring.nativepoc.controller;

import com.spring.nativepoc.dto.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class HelloController {
    @GetMapping("/add")
    public Integer getSum(){
        long startTime = System.currentTimeMillis();
        Random r=new Random();
        int sum=0;
        int maxLimit=999;
        final int MINIMUM=10;
        int randomInt[]=new int[maxLimit];
        for(int i=0; i<maxLimit; i++){
            randomInt[i]=r.nextInt(Integer.MAX_VALUE-MINIMUM)+MINIMUM;
        }
        for(int i:randomInt){
            sum+=i;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Difference in milli seconds: " + (endTime-startTime));
        return sum;
    }

    @GetMapping("/listCustomers")
    public List<CustomerDto> listCustomers(){
        long startTime = System.currentTimeMillis();
        List<CustomerDto> customerDtos = new ArrayList<>();
        for(int i=0; i<500; i++){
            customerDtos.add(mapCustomer("cust"+i, "testfName"+i, "testlName"+i, "internal"+i));
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Difference in milli seconds: " + (endTime - startTime));
        return customerDtos;
    }

    private CustomerDto mapCustomer(String custId, String fName, String lName, String type){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerId(custId);
        customerDto.setCustomerFirstName(fName);
        customerDto.setCustomerLastName(lName);
        customerDto.setCustomerType(type);

        return customerDto;
    }
}
