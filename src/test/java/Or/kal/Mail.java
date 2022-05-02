package Or.kal;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.hc.core5.http.Message;
import org.testng.annotations.Test;

public class Mail {

	@Test
	public void mail()
	{
		
//		
//		String to= "heerap@dckap.com";
//		//String bcc="aswinis@dckap.com";
//	
//		/*
//		 * String to[]=new String[3]; to[0]="";
//		 * to[1]=""; to[2]="";
//		 */
//		String from="heerawinslet@gmail.com";
//		System.out.println("Starting..............");
//		//Create object of property file
//		Properties pro=new Properties();
//		//set the authentication to true.
//		pro.put("mail.smtp.auth","true");
//		//set the socket factory
//		pro.put("mail.smtp.starttls.enable","true");
//		//set the host of server
//		pro.put("mail.smtp.host","smtp.gmail.com");
//		//set the port of SMTP server
//		pro.put("mail.smtp.port",587);
//		//this will handle the complete authentication
//		//session class is a connection factory.
//		Session session=Session.getDefaultInstance(pro,new javax.mail.Authenticator()
//				{
//			
//			protected PasswordAuthentication getPasswordAuthentication()
//			{
//				return new PasswordAuthentication ("heerap@dckap.com","dckap@123");
//			}
//				});
//		
//		try
//		{   //create object of MimeMessage class
//			MimeMessage mes=new MimeMessage(session);
//			//set from address
//			mes.setFrom(new InternetAddress(from));
//			//set the receiver address.
//			mes.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
//			//mes.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			//mes.addRecipient(Message.RecipientType.CC,new InternetAddress(cc));
//			//mes.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc));
//			//add the subject
//			mes.setSubject("MSI Automation Report");
//			// Create object to add multimedia type content
//			BodyPart bodypart=new MimeBodyPart();
//			// Set the body of email
//			bodypart.setText("This is MSI Automation Report");
//			// Create object of MimeMultipart class
//			Multipart multipart=new MimeMultipart();
//		     multipart.addBodyPart(bodypart);
//			// Mention the file which you want to send
//			String filename="C:\\Users\\DCKAP\\eclipse-workspace\\SRSproject_Pool\\build\\SRS-TestExecutionReport.html";
//			// Create data source and pass the filename
//			DataSource source=new FileDataSource(filename);
//			// set the handler
//			bodypart.setDataHandler(new DataHandler(source));
//			// set the file
//			bodypart.setFileName(filename);
//			// add body part 
//			multipart.addBodyPart(bodypart);
//			// set the content
//			mes.setContent(multipart);
//			// finally send the email
//			Transport.send(mes);
//			System.out.println("Mail sent successfully");	
//		}	
//		
//		catch(MessagingException mx)
//		{
//			mx.printStackTrace();
//		}
//	}
}}


