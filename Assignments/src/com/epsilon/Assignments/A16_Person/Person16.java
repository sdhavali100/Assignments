package com.epsilon.javaTraining.Assignments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person16 {

    private String nameString;
    private String addressString;

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }


}

