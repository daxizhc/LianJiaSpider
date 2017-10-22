package com.spider.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogUtil {
	private static Logger logger = Logger.getLogger(LogUtil.class);
	
	/**
	 * 记录错误日志
	 * @param e
	 * @param info
	 */
	public static void logError(Exception e,String info) {
		StringWriter sw = new StringWriter(); 
        e.printStackTrace(new PrintWriter(sw, true));  
        String str = sw.toString();  
        logger.log(Level.ERROR,"\n\r"+info+"：\n\r"+str+"\n\r");
        e.printStackTrace();
	}
	
	/**
	 * 记录info级日志
	 * @param info
	 */
	public static void logInfo(String info){
//		System.out.println(info);
		logger.info(info);
	}
}
