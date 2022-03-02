package com.gaurasis.cor;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class Request {

    private  RequestType requestType;
    private  String reqDesc;
    private boolean handled;

    public Request(RequestType type, String desc){
        requestType = Objects.requireNonNull(type);
        reqDesc = Objects.requireNonNull(desc);
    }
    public void markHandled(){
        handled  = true;
    }

    public boolean isHandled() {
        return handled;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getReqDesc() {
        return reqDesc;
    }

    public enum RequestType{
        COLLECT_TAX,TORTURE_PRISONERS,DEFEND_CASTLE
    }

    @Override
    public String toString() {
        return getReqDesc();
    }
}
