package com.e.lms.generic;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class XMLOperations {

	Document doc=null;
	XPath xPath=null;
	public XMLOperations(String XMLFile) throws ParserConfigurationException, SAXException, IOException
	{
		 DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
         doc = docBuilder.parse (new File(XMLFile));
         // normalize text representation
         doc.getDocumentElement().normalize ();
         xPath =  XPathFactory.newInstance().newXPath();
	}
	public int getTotalNumberOfTestCases() throws XPathExpressionException
	{
		 String expression = "/suite/test_case";	        
         NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		 return nodeList.getLength();
	}
	public int getTotalNumberOfSteps(int TestCaseIndex) throws XPathExpressionException
	{
		//----note: index in xpath always starts from 1
		 String expression = "/suite/test_case["+TestCaseIndex+"]/step";	        
         NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		return nodeList.getLength();
		
	}
	public String getTestCaseName(int TestCaseIndex) throws XPathExpressionException
	{
		String expression = "/suite/test_case["+TestCaseIndex+"]/@name";	        
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		return nodeList.item(0).getTextContent();

	}
	public String getTestCaseID(int TestCaseIndex) throws XPathExpressionException
	{
		String expression = "/suite/test_case["+TestCaseIndex+"]/@tcid";	        
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		return nodeList.item(0).getTextContent();
	}
	public boolean isTestCaseMarkedForExecution(int TestCaseIndex) throws XPathExpressionException
	{
		String expression = "/suite/test_case["+TestCaseIndex+"]/@execute";	        
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		int result = Integer.parseInt(nodeList.item(0).getTextContent());
		if(result == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String getParameterValue(int TestCaseIndex,int StepNumber) throws XPathExpressionException
	{
		String expression = "/suite/test_case["+TestCaseIndex+"]/step["+StepNumber+"]/parameter";	        
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
        return nodeList.item(0).getFirstChild().getNodeValue();
	}
	public String getStepName(int TestCaseIndex,int StepNumber) throws XPathExpressionException
	{
		String expression = "/suite/test_case["+TestCaseIndex+"]/step["+StepNumber+"]/name";	        
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
        return nodeList.item(0).getFirstChild().getNodeValue();
     }


/*public static void main (String[] args) throws IOException, Exception, SAXException
	
	{
	
	String filename = "F:\\SELENIUM\\WS_NewFinsys\\finsys\\testsuite\\Smoke.xml";
	XMLOperations xml = new XMLOperations(filename);
	System.out.println(xml.getTotalNumberOfTestCases());
	System.out.println(xml.getTestCaseID(1));
	System.out.println(xml.getTestCaseName(1));
	System.out.println(xml.getTotalNumberOfSteps(1));
	System.out.println(xml.isTestCaseMarkedForExecution(1));
	System.out.println(xml.getParameterValue(1, 1));
	System.out.println(xml.getStepName(1, 1));
	}
*/
	
}
