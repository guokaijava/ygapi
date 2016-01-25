package org.pro.ygapi.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	   private static Properties props; 
	   private static String fileName = "/application.properties"; 
	    
	    static { 
	        try { 
	            props = new Properties(); 
	            InputStream fis =PropertiesUtil.class.getResourceAsStream(fileName); 
	            props.load(fis); 
	        } catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
	    } 
	    /**
	     * 获取某个属性
	     */ 
	    public static String getProperty(String key){ 
	    	System.out.println(props);
	        return props.getProperty(key); 
	    } 
	    
}
