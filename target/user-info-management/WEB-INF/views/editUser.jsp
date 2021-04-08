<%--
  Created by IntelliJ IDEA.
  User: ashishshrestha
  Date: 3/31/21
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Edit user info</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="resources/styling.css">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8 jumbotron">
        <form action="updateUser" method="POST">
            <fieldset>
                <legend>User Registration Form</legend>
            <div>
                <input type="hidden" name="id" value="${userList.id}">
            </div>
            <div class="form-group">
                <label class="label">Username:</label>
                <input type="text" name="username" class="form-control" value="${userList.username}">
            </div>
            <div class="form-group">
                <label class="label">Password:</label>
                <input type="password" name="password" class="form-control" value="${userList.password}">
            </div>
            <div class="form-group">
                <label class="label">Mobile:</label>
                <input type="number" name="mobile" class="form-control" value="${userList.mobile}">
            </div>
            <div class="form-group">
                <label class="label">Email:</label>
                <input type="email" name="email" class="form-control" value="${userList.email}">
            </div>
            <div class="form-group">
                <label class="label">DOB:</label>
                <input type="date" name="dob" class="form-control" value="${userList.dob}">
            </div>
            <div class="form-group">
                <label class="label">Gender:</label>
                <input type="radio" name="gender" class="form-check-inline" value="Male"${userList.gender=='Male'?'checked':''}>Male
                <input type="radio" name="gender" class="form-check-inline" value="Female"${userList.gender=='Female'?'checked':''}>Female
            </div>

            <div class="form-group">
                <label class="label">Hobbies:</label>
                <input type="checkbox" name="hobbies" class="form-check-inline" value="Reading"
                       <c:if test="${fn:contains(userList.hobbies,'Reading')}">checked</c:if>>Reading
                <input type="checkbox" name="hobbies" class="form-check-inline" value="Writing"
                       <c:if test="${fn:contains(userList.hobbies,'Writing')}">checked</c:if>>Writing
                <input type="checkbox" name="hobbies" class="form-check-inline" value="Listening"
                       <c:if test="${fn:contains(userList.hobbies,'Listening')}">checked</c:if>>Listening
                <input type="checkbox" name="hobbies" class="form-check-inline" value="Speaking"
                       <c:if test="${fn:contains(userList.hobbies,'Speaking')}">checked</c:if>>Speaking
            </div>

            <div class="form-group">
                <label class="label">Nationality:</label>
                <select name="nationality" class="form-control">
                    <option value="Nepalese"${userList.nationality=='Nepalese'?'selected':''}>Nepalese</option>
                    <option value="Indian"${userList.nationality=='Indian'?'selected':''}>Indian</option>
                    <option value="American"${userList.nationality=='American'?'selected':''}>American</option>
                </select>
            </div>

            <div class="form-group">
                <label class="label">Comment:</label>
                <textarea rows="5" cols="10" name="comment" class="form-control"> ${userList.comment}</textarea>
            </div>

            <div class="form-group">
                <input type="submit" value="Submit" class="btn btn-success">
            </div>
            </fieldset>
        </form>
        </div>
        <div class="col-md-2"></div>
    </div>
</div>

</body>
</html>
