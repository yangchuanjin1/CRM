package com.ycj.Util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5 {
	public static String MD5jia(String inStr) {
		String pwd2="";
		try {
			MessageDigest md5=MessageDigest.getInstance("MD5");
			/*inStr=new BigInteger(1,md5.digest(inStr.getBytes())).toString(30);
			inStr=new String(inStr.getBytes());*/
		        byte b1[] = inStr.getBytes();
		        byte[] b2 = md5.digest( b1 );
			BASE64Encoder en = new BASE64Encoder();
			pwd2 = en.encode(b2);
		} catch (NoSuchAlgorithmException e) {
			
			e.printStackTrace();
		}
		
		return pwd2;
	}
}
