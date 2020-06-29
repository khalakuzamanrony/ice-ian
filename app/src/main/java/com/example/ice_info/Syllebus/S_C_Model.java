package com.example.ice_info.Syllebus;

public class S_C_Model {
    String c_name, c_code, c_credit, c_marks;

    public S_C_Model(String c_name, String c_code, String c_credit, String c_marks) {
        this.c_name = c_name;
        this.c_code = c_code;
        this.c_credit = c_credit;
        this.c_marks = c_marks;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_code() {
        return c_code;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public String getC_credit() {
        return c_credit;
    }

    public void setC_credit(String c_credit) {
        this.c_credit = c_credit;
    }

    public String getC_marks() {
        return c_marks;
    }

    public void setC_marks(String c_marks) {
        this.c_marks = c_marks;
    }
}
