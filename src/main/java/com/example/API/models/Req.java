package com.example.API.models;
import java.util.List;

public class Req {
    private String reqCode;
    private String taskTyp;
    private List<positionCodePath> positionCodePath;

    public Req() {
    }

    public Req(String reqCode, String taskTyp, List<positionCodePath> positionCodePath) {
        this.reqCode = reqCode;
        this.taskTyp = taskTyp;
        this.positionCodePath = positionCodePath;
    }

    public String getReqCode() {
        return reqCode;
    }

    public void setReqCode(String reqCode) {
        this.reqCode = reqCode;
    }

    public String getTaskTyp() {
        return taskTyp;
    }

    public void setTaskTyp(String taskTyp) {
        this.taskTyp = taskTyp;
    }

    public List<positionCodePath> getPositionCodePathList() {
        return positionCodePath;
    }

    public void setPositionCodePathList(List<positionCodePath> positionCodePath) {
        this.positionCodePath = positionCodePath;
    }
}
