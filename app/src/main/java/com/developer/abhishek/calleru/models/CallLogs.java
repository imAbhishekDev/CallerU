package com.developer.abhishek.calleru.models;

import java.util.Date;

public class CallLogs {

    private String callType;
    private String callNumber;
    private String callDuration;
    private String callDate;

    public CallLogs(String callType, String callNumber, String callDuration, String callDate) {
        this.callType = callType;
        this.callNumber = callNumber;
        this.callDuration = callDuration;
        this.callDate = callDate;
    }

    public String getCallType() {
        return callType;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public String getCallDuration() {
        return callDuration;
    }

    public String getCallDate() {
        return callDate;
    }
}
