package com.example.API.models;

public class positionCodePath{
    private String positionCode;

    private String type;

    public positionCodePath() {
    }

    public positionCodePath(String positionCode, String type) {
        this.positionCode = positionCode;
        this.type = type;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
