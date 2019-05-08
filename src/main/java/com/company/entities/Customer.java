package com.company.entities;


import com.company.annotation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required!")
    @Size(min = 1, message = "is required!")
    private String lastName;

    @Min(value = 0, message = "must be greater or equals to 0")
    @Max(value = 10, message = "must be less or equals to 10")
    @NotNull(message = "can not be null!")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    @NotNull(message = "Can't be null")
    private String postalCode;

    @CourseCode(value = "TOP", message = "Must start with TOP")
    private String courseCode;

    public Customer() {}

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
