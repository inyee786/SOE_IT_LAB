import java.sql.*;
class Test
{
	public static void main(String args[])
	{
	try{
	Class.forName("sun.jdbc.odbc.jdbcOdbcDriver");
	String serverName = "localhost:8080";
    String mydatabase = "filerepository";
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase; 

    //String username = "username";
    //String password = "password";
	Connection con = DriverManager.getConnection(url,"root","");
	Statement s = con.createStatement();
	ResultSet rs = s.executeQuery("select * from users");
	while(rs.next())
	{
	System.out.println(rs.getString(2));

	}
	con.close();
		}
	catch(Exception e)
	{
	System.out.println("Error");//e.printstackTrace();}
	}
}
}