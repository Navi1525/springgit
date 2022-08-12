<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register">
Enter Student Name<input type="text" name="name" ><br>
Enter Student Id <input type="text" name="studentId" ><br>
Enter City<input type="text" name="city" ><br>
Choose Language <select name ="language"> 
<option value ="select">---Select---</option>
<option value="Java" >Java </option>
<option value="Jsp" >JSp </option>
<option value="Hibernate" >Java Scripy </option>
<option value="Springs" >Springs </option>
</select><br>
Enter Hobby :<br>
<input type="checkbox" value="music" name="hobby">Music<br>
<input type="checkbox" value="dance" name="hobby">Dance<br>
<input type="checkbox" value="Sports" name="hobby">sports<br>
<input type="checkbox" value="reading" name="hobby">Reading<br>
<input type="submit" value="Add"><br>
</form>

</body>
</html>