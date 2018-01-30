package com.app.server.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

/**
 * Created by ltlxy on 2016/9/7.
 */
public class MD5Util {


    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
    
    //MD5加密查重复提交
    public static Boolean repeatMD5Valide(HttpSession session , String param){
		String repeatMD5Valide = String.valueOf(session.getAttribute("repeatMD5Valide"));
		String repeatMD5Valide_time = String.valueOf(session.getAttribute("repeatMD5Valide_time"));
		String md5 = MD5Util.md5(param);
		boolean result = false;
		if(repeatMD5Valide_time != null && !"".equals(repeatMD5Valide_time)&& !"null".equals(repeatMD5Valide_time) && repeatMD5Valide != null && !"".equals(repeatMD5Valide)&& !"null".equals(repeatMD5Valide) ){
			if(System.currentTimeMillis() - Long.valueOf(repeatMD5Valide_time) > 60000){
				result = true;	
			}else{
				if(!md5.equals(repeatMD5Valide)){
					result = true;
				}
			}
		}else{
			result = true;
		}
		//请求成功刷新session
		if(result){
			session.setAttribute("repeatMD5Valide", md5);
			session.setAttribute("repeatMD5Valide_time", System.currentTimeMillis());
		}
		return result;
    }
    
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    @SuppressWarnings("unused")
    private static String byteToNum(byte bByte) {
        int iRet = bByte;
        System.out.println("iRet1=" + iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String md5(String str) {
        String resultString = null;
        try {
            resultString = new String(str);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteToString(md.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }

    public static void main(String[] args){

        System.out.println(md5("admin"));



    }



}
