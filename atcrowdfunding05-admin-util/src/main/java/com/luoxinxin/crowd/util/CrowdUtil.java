package com.luoxinxin.crowd.util;

import com.luoxinxin.crowd.constant.CrowdConstant;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrowdUtil {

    public static boolean judgeRequestType(HttpServletRequest request){
        String acceptInformation = request.getHeader("Accept");
        String xRequestInformation = request.getHeader("X-Requested-With");
        return (acceptInformation != null && acceptInformation.length()>0 && acceptInformation.contains("application/json")) ||
                (xRequestInformation != null && xRequestInformation.length()>0 && xRequestInformation.contains("XMLHttpRequest"));
    }

    public static String md5(String source){
        if(source == null || source.length() == 0){
            throw new RuntimeException(CrowdConstant.MESSAGE_LOCAL_FAILED);
        }

        try{
            String algorithm = "md5";
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            byte[] input = source.getBytes();
            byte[] output = messageDigest.digest(input);
            int signum = 1;
            BigInteger bigInteger = new BigInteger(signum,output);
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();
            return encoded;


        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }


        return null;
    }
}
