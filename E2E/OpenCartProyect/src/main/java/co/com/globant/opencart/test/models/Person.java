package co.com.globant.opencart.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String company;
    private String addres1;
    private String addres2;
    private String city;
    private String postCode;
    private String country;
    private String state;
    private String comments;
}
