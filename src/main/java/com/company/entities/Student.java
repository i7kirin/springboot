package com.company.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student {

    @NotNull
    @Size(min = 1, message = "The size must be longer than 3")
    private String firstName;
    private String lastName;
    private String country;
    private String language;

    private HashMap<String,String > countryOptions;

    private String[] operatingSystems;

    public Student() {
        countryOptions = new LinkedHashMap<String, String>();
        countryOptions.put("RU","Russia");
        countryOptions.put("KZ","Kazakhstan");
        countryOptions.put("usa","USA");
    }

    public HashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
