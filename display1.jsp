<%@page import="Model.DTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>


<style type="text/css">
body {
    padding: 50px;
    margin: 0;
    font-family: var(--bs-body-font-family);
    font-size: var(--bs-body-font-size);
    font-weight: var(--bs-body-font-weight);
    line-height: var(--bs-body-line-height);
    color: var(--bs-body-color);
    text-align: var(--bs-body-text-align);
    background-color: var(--bs-body-bg);
    -webkit-text-size-adjust: 100%;
    -webkit-tap-highlight-color: transparent;
}

</style>


</head>
<body>

<%

ArrayList<DTO> clientList=(ArrayList) request.getAttribute("clientlist");

%>

<%HttpSession ses=request.getSession(false); %>

 <% if (ses!=null) { %>
 
<table class="table table-info table-striped ">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Profession</th>
      <th scope="col">E-mail</th>
      <th scope="col">City</th>
      <th scope="col">State</th>
      <th scope="col">Contact</th>
      <th scope="col">Licence</th>
    </tr>
  </thead>
  <tbody >
  
  <%for (DTO p1:clientList){
	  int id=p1.getId();
	  String name=p1.getName();
		String prof=p1.getProfession();
		String email=p1.getEmail();
		String city=p1.getCity();
		String state=p1.getState();
		String contact=p1.getContact();
		String file=p1.getFile();
		
		%>
		<tr>
		<td><%=id %></td>
		 <td><%=name %></td>
		  <td><%=prof %></td>
		   <td><%=email %></td>
		    <td><%=city %></td>
		     <td><%=state %></td>
		      <td><%=contact %></td>
		      <td><%=file %></td>
		</tr>
		
 <% } %>
  
	  
	 
	  </tbody>
</table>

<% } else { %>
        <h2>No clients found</h2>
    <% } %>


</body>
</html>