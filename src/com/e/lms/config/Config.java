package com.e.lms.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config 
{
	public  String getPropertyValue(String _propertyName) throws IOException
	{
//		Properties prop = new Properties();
//		String filename = "config.properties";
//		InputStream input = getClass().getClassLoader().getResourceAsStream(filename);
//		// load a properties file
//		prop.load(input);
//		String pn=prop.getProperty(_propertyName);
//		return pn;
		
		Properties prp = new Properties();
		String fileName = "config.properties";
		InputStream in = getClass().getClassLoader().getResourceAsStream(fileName);
		prp.load(in);
		String PV = prp.getProperty(_propertyName);
		return PV;
	}
	
//	public static void main(String[] args) throws Exception
//	{
//		Config cfg = new Config();
//		cfg.getPropertyValue("suitename");
//	}

}
