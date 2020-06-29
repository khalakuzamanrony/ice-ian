package com.example.ice_info.pastChair;

public class PCModel {
    String name, to, from;
    int icon;
    private boolean isExpended;


    public PCModel(String name, String to, String from, int icon) {
        this.name = name;
        this.to = to;
        this.from = from;
        this.icon = icon;
        this.isExpended = false;
    }

    public PCModel() {
    }

    public boolean isExpended() {
        return isExpended;
    }

    public void setExpended(boolean expended) {
        isExpended = expended;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }


    public void setFrom(String from) {
        this.from = from;
    }
}
