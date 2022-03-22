package com.e.lms.generic;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendMail 
{
	 private static final String SMTP_HOST_NAME = "mail.ifivesoft.com";
	 private static final String SMTP_AUTH_USER = "anup@ifivesoft.com";
	 private static final String SMTP_AUTH_PWD  = "ifivesoft@123";
	 private static final String emailMsgTxt      = "Hi All, P.F.A. of SIS Test Execution Report.";
	 private static final String emailSubjectTxt  = "Automation Execution Report";
	 private static final String emailFromAddress = "anup@ifivesoft.com";
	 private final static String[] emailList = {"ramesh@ifivesoft.com, vitul@ifivesoft.com"};
	 private BodyPart messageBodyPart;
	
	 ExtentReportFile erf = new ExtentReportFile();
	
	 public static void execute(String testdata)  throws Exception
	 {
		variables.smtpMailSender = new SendMail();
		variables.smtpMailSender.postMail( emailList, emailSubjectTxt, emailMsgTxt, emailFromAddress);
	    	System.out.println("Sucessfully Sent Mail To All Users");
	 }

	 public void postMail( String recipients[ ], String subject, String message , String from) throws MessagingException
	 {
		variables.debug = false;

	     Properties props = new Properties();
	     
	     props.put("mail.smtp.host", SMTP_HOST_NAME);
	     props.put("mail.smtp.auth", "true");

	     variables.auth = new SMTPAuthenticator();
	     variables.session = Session.getDefaultInstance(props, variables.auth);
	     variables.session.setDebug(variables.debug);
	     variables.msg = new MimeMessage(variables.session);
	     variables.addressFrom = new InternetAddress(from);
	    
	     variables.msg.setFrom(variables.addressFrom);
	  
	     variables.multipart = new MimeMultipart();
	 
	     messageBodyPart = new MimeBodyPart();
	     variables.file = (System.getProperty("user.dir")+"\\TestReport\\lms_Execution_Report_"+erf.getDateTime()+".html");
	     variables.source = new FileDataSource(variables.file);
	     messageBodyPart.setDataHandler(new DataHandler(variables.source));
	    
	     messageBodyPart.setFileName("lms_Execution_Report_"+erf.getDateTime());
	     messageBodyPart.setDescription(message);
	     variables.multipart.addBodyPart(messageBodyPart);

	     variables.msg.setContent(variables.multipart);

	     variables.addressTo = new InternetAddress[recipients.length];
	    
	     for (variables.i = 0; variables.i < recipients.length; variables.i++)
	     {
	    	 variables.addressTo[variables.i] = new InternetAddress(recipients[variables.i]);
	     }
	   
	     variables.msg.setRecipients(Message.RecipientType.TO, variables.addressTo); 

	     variables.msg.setSubject(subject);
	     variables.msg.setContent(variables.multipart);
	     Transport.send(variables.msg);
	}

	private class SMTPAuthenticator extends javax.mail.Authenticator
	{
		public PasswordAuthentication getPasswordAuthentication()
	    {
	        variables.username = SMTP_AUTH_USER;
	        variables.password = SMTP_AUTH_PWD;
	        return new PasswordAuthentication(variables.username, variables.password);
	    }
	}
}	

