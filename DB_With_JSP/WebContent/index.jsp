<%@ page import="java.sql.*" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<HTML>
    <HEAD>
        <TITLE>The Customers Database Table </TITLE>
    </HEAD>

    <BODY>
        <H1>The Publishers Database Table </H1>

        <% 
            Connection connection = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/jspdb", "root", "toor");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = statement.executeQuery("select * from customers") ; 
        %>


        <TABLE BORDER="1" align="center">
            <TR bgcolor="lightgreen">
                <TH>ID</TH>
                <TH>Name</TH>
                <TH>Address</TH>
                <TH>City</TH>
                <TH>State</TH>
                
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getString(5) %></TD>
            </TR>
            <% } %>
        </TABLE>
    </BODY>
</HTML>