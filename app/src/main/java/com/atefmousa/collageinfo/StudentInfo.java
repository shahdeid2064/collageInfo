package com.atefmousa.collageinfo;

import androidx.annotation.NonNull;

public class StudentInfo {

    private String name ;
    private String email ;
    private String phone_number ;

    public StudentInfo(String name, String email, String phone_number) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
    }

    @NonNull
    @Override
    public String toString() {
        return "name "+ name + "\n email " + email + "\n phone number " + phone_number;
    }
}
