package com.example.loginbasic2.models;

public class AndroidVersion {
    private String vName;
    private double vNumber;

    public AndroidVersion(String vName, double vNumber) {
        this.vName = vName;
        this.vNumber = vNumber;
    }

    public String getName() {
        return vName;
    }

    public void setName(String vName) {
        this.vName = vName;
    }

//    public int getImage() {
//        return vImage;
//    }
//
//    public void setImage(int vImage) {
//        this.vImage = vImage;
//    }

    public Double getVersion() {
        return vNumber;
    }

    public void setVersion(Double vNumber) {
        this.vNumber = vNumber;
    }
}
