<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guru Login Form</title>
</head>
<body>
<form id="guru_login" action="guru_login" method="post">
		<table style="with: 50%">
 
			<tr>
				<td>UserName</td>
				userName<td><input type="text" id ="username" name="username" placeholder="please enter name " /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" id ="password" name="password" placeholder="please enter password " /></td>
			</tr>
			
       <p id="demo"></p>
			
		</table>
		<input type="button" value="Login" onclick="javascript:loginFormSubmit();"/></form>
</body>
<script type="text/javascript">
  function loginFormSubmit(){
	  if(document.getElementById("username").value==""){
		 // alert("Please enter user name");
		  document.getElementById("demo").innerHTML =" Please enter user name";
		  document.getElementById("username").focus();
		  return false;
	  }
	  if(document.getElementById("password").value==""){
		  document.getElementById("demo").innerHTML =" Please enter user password";
		  document.getElementById("password").focus();
		  return false;
	  }
	  document.getElementById("guru_login").submit();
  }
  
  </script>
</html>