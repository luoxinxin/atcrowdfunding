package com.luoxinxin.crowd.util;

import javax.servlet.http.HttpServletRequest;

public class CrowdUtil {

    public static boolean judgeRequestType(HttpServletRequest request){
        String acceptInformation = request.getHeader("Accept");
        String xRequestInformation = request.getHeader("X-Requested-With");
        return (acceptInformation != null && acceptInformation.length()>0 && acceptInformation.contains("application/json")) ||
                (xRequestInformation != null && xRequestInformation.length()>0 && xRequestInformation.contains("XMLHttpRequest"));
    }
}
