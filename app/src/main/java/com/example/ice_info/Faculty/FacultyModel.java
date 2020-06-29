package com.example.ice_info.Faculty;

import java.io.Serializable;

public class FacultyModel implements Serializable {
    String name, email, designation, degree, phone;
    int icon;

    public FacultyModel(String name, String designation, int icon) {
        this.name = name;
        this.designation = designation;
        this.icon = icon;
    }

    public FacultyModel(String name, String email, String designation, String degree, String phone) {
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.degree = degree;
        this.phone = phone;

    }

    public FacultyModel(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }


    public FacultyModel() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
