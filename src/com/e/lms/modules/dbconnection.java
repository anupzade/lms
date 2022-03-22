package com.e.lms.modules;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.sun.jna.platform.win32.DBT;

public class dbconnection 

{

//	String DataBaseURL = "jdbc:sqlserver://DBSERVER03\\MSSQL2012;DatabaseName=LMSCoreNew";
//	String UserName = "sa";
////	String Password = "techadmin@123";

	public static void main (String [] args) throws Exception
	
	{

		//System.out.println("TestData :" +testdata);
		
//		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:sqlserver://DBSERVER03\\MSSQL2012;user=developer;password=developer@123;database=LMSCoreNew");
	//	DBTablePrinter.printTable(conn, "TRC_CountryMaster");
		//printTable(conn, "employees");
		java.sql.Statement sta = null;
		sta = conn.createStatement();
		String sql = "select u.userid, u.employeecode, u.FirstName + ' ' + u.LastName as employeename,o.OrganizationName, un.UnitName, d.DepartmentName, g.GradeName, ds.DesignationName, rm.RoleName, u.EmploymentType, u.LanguageID, lm.LanguageName, u1.EmployeeCode as ReportingManagerEmployeeCode,u1.FirstName + ' ' + u1.LastName as ReportingManagerName,cm.CountryName as WorkCountry, sm.StateName as WorkState, pm.CityName as WorkCity from TRC_UserMaster u left outer join BDR_OrganizationMaster o on o.OrganizationID = u.OrganizationID left outer join BDR_UnitMaster un on un.UnitID = u.UnitID left outer join BDR_DepartmentMaster D on d.DepartmentID = u.DepartmentID left outer join BDR_GradeMaster g on g.GradeID = u.GradeID left outer join BDR_DesignationMaster ds on ds.DesignationID = u.DesignationID left outer join TRC_RoleMaster rm on rm.RoleID = u.RoleID left outer join TRC_LanguageMaster lm on lm.LanguageID = u.LanguageID left outer join TRC_CountryMaster cm on cm.CountryID = un.CountryID left outer join TRC_StateMaster sm on sm.StateID = un.StateID left outer join TRC_CityMaster pm on pm.CityID = un.CityID left outer join TRC_UserMaster u1 on u1.UserID = u.ReportingManagerID where cm.CountryName like '%india%'";		
			
		ResultSet rs = null;
		rs = sta.executeQuery(sql);
		//System.out.println(rs);
		ResultSetMetaData rsmd = rs.getMetaData();
		int colcount = rsmd.getColumnCount();
		while (rs.next())
		{
			for (int cc=0; cc<colcount; cc++)
			{
				//System.out.println(rsmd.getColumnName(cc+1)+":"+rs.getString(cc+1));	
			}
		}
//		if(conn != null && sta != null) 
//		{
//			sta.close();
//			conn.close();
//		}
	}
	
	
//	 public static void main(String[] args)
//	 {
//         String Url = "jdbc:sqlserver://DBSERVER03\\MSSQL2012;DatabaseName=DBname;user=sa;Password=techadmin@123";
//         try
//         {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            System.out.println("Trying to connect");
//            Connection connection = DriverManager.getConnection(Url);
//
//             System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
//                     + connection.getMetaData().getDatabaseProductName());
//         } catch (Exception e) 
//         {
//System.out.println("Unable to make connection with DB");
//             e.printStackTrace();
//         }


}
	
	

