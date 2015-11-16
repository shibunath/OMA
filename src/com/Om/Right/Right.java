package com.Om.Right;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.ws.rs.*;
import java.util.*;
import com.Om.Left.*;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.*;
import java.lang.Object;

public class Right {
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
int choice,choice1;
int obid,obinid,rid;
Client client = Client.create();


do
{
	System.out.println("\n1.Device Management\n2.Information reporting");
	System.out.println("Enter choice:");
	
	Scanner in=new Scanner(System.in);
	choice=in.nextInt();	
	switch(choice)
	{
	case 1:
	{
		System.out.println("There are seven different operations in Device Management!!\n1)Read\n2)Discover\n3)Write\n4)Write Attributes\n5)Create\n6)Execute\n7)Delete\n");
		choice1=in.nextInt();
		switch(choice1)
		{
		case 1:
		{
			System.out.println("Enter the ObjectID to read: ");	
			obid=in.nextInt();	
			System.out.println("Enter the ObjectInstanceID to read: ");
			obinid=in.nextInt();
			System.out.println("Enter the ResourceID to discover:\n1.ACL\n2.AccessControl Owner");
			rid=in.nextInt();
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/read"+"/"+obid+"/"+obinid+"/"+rid);
			ClientResponse  response = webResource.type("application/json").get(ClientResponse.class);
			String output=response.getEntity(String.class);
			System.out.println(output);
		}break;
		case 2:
		{	
			ArrayList<String> k=new ArrayList<String>();
			String output;
			System.out.println("Enter the ObjectID to discover: ");	
			obid=in.nextInt();	
			System.out.println("Enter the ObjectInstanceID to discover: ");
			obinid=in.nextInt();
			System.out.println("Enter the resource to discover: ");
			rid=in.nextInt();
			WebResource webResource = client
		.resource("http://localhost:8080/Om/rest/bson/client/discover"+"/"+obid+"/"+obinid+"/"+rid);
			ClientResponse  response = webResource.type("application/json").get(ClientResponse.class);
			output=response.getEntity(String.class);
			System.out.println(output);
		
		}break;
		case 3:	
		{
			int n;
			System.out.println("Enter the ObjectID to update: ");
			obid=in.nextInt();	
			System.out.println("Enter the ObjectInstanceID to update: ");
			obinid=in.nextInt();
			System.out.println("Enter the ResourceID to update: \nResource ID 2:ACL\nResource ID 3: AccessControl Owner");
			rid=in.nextInt();
			System.out.println("Enter the New Value to update: ");
			n=in.nextInt();
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/write/"+obid+"/"+obinid+"/"+rid+"/"+n);
	
			String input="";
			ClientResponse  response = webResource.type("application/json").post(ClientResponse.class,input);
		
			String output=response.getEntity(String.class);
			System.out.println(output);	
		}break;
		case 4:
		{
			int min,max,great,less,step,cancel;
			System.out.println("Enter the ObjectID to insert attributes: ");
			obid=in.nextInt();	
			System.out.println("Enter the ObjectInstanceID to insert attributes: ");
			obinid=in.nextInt();
			System.out.println("Enter the ResourceID to insert attributes: ");
			rid=in.nextInt();
			
			System.out.println("Enter the Minimum Period to insert attributes: ");
			min=in.nextInt();
			
			System.out.println("Enter the Maximum Period to insert attributes: ");
			max=in.nextInt();
			
			System.out.println("Enter the Greater than attribute: ");
			great=in.nextInt();

			System.out.println("Enter the Lesser than attribute: ");
			less=in.nextInt();

			System.out.println("Enter the Step attribute: ");
			step=in.nextInt();

			System.out.println("Enter the Cancel attribute: ");
			cancel=in.nextInt();
		
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/writeattributes/"+obid+"/"+obinid+"/"+rid+"/"+min+"/"+max+"/"+great+"/"+less+"/"+step+"/"+cancel);
	
			String input="";
			ClientResponse  response = webResource.type("application/json").post(ClientResponse.class,input);
		
			String output=response.getEntity(String.class);
			System.out.println(output);
		}break;
		case 5:
		{
			
			int acl,aclowner;
		
			System.out.println("Enter the Object ID to create: ");
			obid=in.nextInt();

			System.out.println("Enter the Object Instance ID to create: ");
			obinid=in.nextInt();

			System.out.println("Enter the ACL: ");
			acl=in.nextInt();
			System.out.println("Enter the ACL Owner: ");
			aclowner=in.nextInt();
		//	AccessControl d=new AccessControl(obid,obinid,acl,aclowner);
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/create/"+obid+"/"+obinid+"/"+acl+"/"+aclowner);

	        String input="{\"ObjectID\":\""+obid+"\",\"ObjectInstanceID\":\""+obinid+"\",\"ACL\":\""+acl+"\",\"AccessControlOwner\":\""+aclowner+"\"}";
			ClientResponse  response = webResource.type("application/json").post(ClientResponse.class,input);
			
			String output=response.getEntity(String.class);
			System.out.println(output);
			
		}break;
		
		case 6:
		{
			System.out.println("Enter the Object ID to create: ");
			obid=in.nextInt();
			
			System.out.println("Enter the Object Instance ID to create: ");
			obinid=in.nextInt();
			
			System.out.println("Enter resource ID to execute on ");
			rid=in.nextInt();
			
			
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/execute/"+obid+"/"+obinid+"/"+rid);

	        String input="";
			ClientResponse  response = webResource.type("application/json").post(ClientResponse.class,input);
			
			String output=response.getEntity(String.class);
			System.out.println(output);
	
			
		}break;
		
		case 7:
		{
			int x,y;
			String input="";
			System.out.println("Enter the ObjectID to delete: ");
			x=in.nextInt();
			System.out.println("Enter the ObjectInstanceID to delete: ");
			y=in.nextInt();
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/delete/"+x+"/"+y);
			ClientResponse  response = webResource.type("application/json").delete(ClientResponse.class);
			String output=response.getEntity(String.class);
			System.out.println(output);
		}break;
		}
	}
		break;
	case 2:
	{
		System.out.println("There are three operations in Information reporting:\n1)Observe\n2.)Cancel Observation");
		choice1=in.nextInt();
		switch(choice1)
		{
		case 1:
		{
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/observe");
			ClientResponse  response = webResource.type("application/json").get(ClientResponse.class);
			String output=response.getEntity(String.class);
			System.out.println(output);
		}break;
		case 2:
		{
			WebResource webResource = client
					.resource("http://localhost:8080/Om/rest/bson/client/cancel");
			ClientResponse  response = webResource.type("application/json").get(ClientResponse.class);
			String output=response.getEntity(String.class);
			System.out.println(output);
		}break;
		}
	}break;
		default:
			System.out.println("Enter a number between 1 and 2");
	}

}while(choice<3);
}

static void read(int obid,int iid,String r) throws SQLException, ClassNotFoundException
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/DeviceManagement","root","");
	Statement stmt=conn.createStatement();
	ResultSet rt=stmt.executeQuery("select * from AccessControl");
while(rt.next())
{
	System.out.println("ObjectID "+rt.getInt("ObjectID"));
	System.out.println("ObjectInstanceID "+rt.getInt("ObjectInstanceID"));
	System.out.println("ACL "+rt.getInt("ACL"));
	System.out.println("AccessControlOwner "+rt.getInt("AccessControlOwner"));
}
}

}
