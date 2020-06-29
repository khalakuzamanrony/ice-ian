package com.example.ice_info.Syllebus;

import java.util.ArrayList;

public class S_Model {
    private String course_name;
    private ArrayList<S_C_Model> child_items;
    private boolean isEx;

    public S_Model(String course_name, ArrayList<S_C_Model> child_items) {
        this.course_name = course_name;
        this.child_items = child_items;
        this.isEx = false;
    }

    public boolean isEx() {
        return isEx;
    }

    public void setEx(boolean ex) {
        isEx = ex;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public ArrayList<S_C_Model> getChild_items() {
        return child_items;
    }

    public void setChild_items(ArrayList<S_C_Model> child_items) {
        this.child_items = child_items;
    }


}
