<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jstl-24</title>
</head>
<body>
<h1>Lets code with jstl tags</h1>

<form method="POST">
      <table>
        <tr>
            <td>Marks of Subject 1:</td>
            <td><input name="subject1" type="text" /></td>
        </tr>
        <tr>
            <td>Marks of Subject 2:</td>
            <td><input name="subject2" type="text" /></td>
        </tr>
        <tr>
            <td>Marks of Subject 3:</td>
            <td><input name="subject3" type="text" /></td>
        </tr>
        <tr>
            <td>Marks of Subject 4:</td>
            <td><input name="subject4" type="text" /></td>
        </tr>
        <tr>
            <td>Marks of Subject 5:</td>
            <td><input name="subject2" type="text" /></td>
        </tr>
        <tr>
            <td colspan="2">
              <input type="submit" value="Save Changes" />
            </td>
        </tr>
      </table>
  </form>
<c:set var="marks" scope="session" value="${((param.subject1+param.subject2+param.subject3+param.subject4+param.subject5)/500)*100}"/>
<c:if test="${marks > 70 }">
<p>My Marks is: <c:out value="${marks}"/><p>
</c:if>

<form action="test.jsp" method="post"> 
FirstName:<input type="text" name="firstName"/><br/> 
LastName:<input type="text" name="lastName"/><br/> 
City-pincode:<input type="number" name="city"/><br/> 
<input type="submit" value="Submit"/> 
</form> 

</body>
</html>