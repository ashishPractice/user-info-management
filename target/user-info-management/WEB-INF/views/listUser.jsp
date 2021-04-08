<%--
  Created by IntelliJ IDEA.
  User: ashishshrestha
  Date: 4/1/21
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <title>All User Details</title>
    <%@ include file="header.jsp"%>

<%--    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>--%>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">--%>
<%--    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>--%>
<%--    <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>--%>
<%--    <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>--%>



</head>
<body>

<!--  For table sorting and sorting-->
<script type="text/javascript">
    $(document).ready(function() {
        $('#studentList').DataTable();
    });
</script>



<%--    <c:if test="${message ne null}">--%>
<%--        <div class="text-center">--%>
<%--            <div class="alert alert-info alert-dismissible fade show">--%>
<%--                <button type="button" class="close" data-dismiss="alert">&times;</button>--%>
<%--                <strong>${message}</strong>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </c:if>--%>

    <div class="text-center">
        <H1>All User Details</H1>
    </div>

    <br />

    <table id="studentList" class="table table-hover">
        <thead class="thead justify-content-center thead-dark">
        <tr>
            <th>Id</th>
            <th>Username</th>
            <th>Password</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Mobile</th>
            <th>Hobbies</th>
            <th>Nationality</th>
            <th>DOB</th>
            <th>Comment</th>
            <sec:authorize access="hasRole('ROLE_ADMIN') and isAuthenticated()">
            <th>Action</th>
            </sec:authorize>

        </tr>
        </thead>
        <tbody>

        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
                <td>${user.gender}</td>
                <td>${user.mobile}</td>
                <td>${user.hobbies}</td>
                <td>${user.nationality}</td>
                <td>${user.dob}</td>
                <td>${user.comment}</td>
                <sec:authorize access="hasRole('ROLE_ADMIN') and isAuthenticated()">
                <td>
                    <a href="editUser?id=${user.id}" class="btn btn-primary">Edit</a>
                    <a href="deleteUser?id=${user.id}" class="btn btn-danger">Delete</a>
                </td>
                </sec:authorize>

            </tr>
        </c:forEach>

        </tbody>
    </table>

    <br />






</body>
</html>
