
//SQL> create table dmart (pid number(10),pname varchar2(10));
//commit;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
class Db{
public static void main(String a[])throws SQLException,IOException{
DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//class.forName(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
System.out.println(con);
Statement st=con.createStatement();
st.executeQuery("insert into dmart values(110,'book')");
}
}


//DriverManager.registerDriver  Class.forName