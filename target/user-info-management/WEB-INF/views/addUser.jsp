<%--
  Created by IntelliJ IDEA.
  User: ashishshrestha
  Date: 3/31/21
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>User Registration form</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="resources/styling.css">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8 jumbotron">
            <form action="saveUser" method="POST">
                <fieldset>
                    <legend>User Registration Form</legend>
                    <div class="form-group">
                        <label class="label">Username:</label>
                        <input type="text" name="username" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="label">Password:</label>
                        <input type="password" name="password" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="label">Mobile:</label>
                        <input type="number" name="mobile" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="label">Email:</label>
                        <input type="email" name="email" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="label">DOB:</label>
                        <input type="date" name="dob" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="label">Gender:</label>
                        <input type="radio" name="gender" value="Male" class="form-check-inline">Male
                        <input type="radio" name="gender" value="Female" class="form-check-inline">Female
                    </div>

                    <div class="form-group">
                        <label class="label">Hobbies:</label>
                        <input type="checkbox" name="hobbies" value="Reading" class="form-check-inline">Reading
                        <input type="checkbox" name="hobbies" value="Writing" class="form-check-inline">Writing
                        <input type="checkbox" name="hobbies" value="Listening" class="form-check-inline">Listening
                        <input type="checkbox" name="hobbies" value="Speaking" class="form-check-inline">Speaking
                    </div>

                    <div class="form-group">
                        <label class="label">Nationality:</label>
                        <select name="nationality" class="form-control">
                            <option value="Nepalese">Nepalese</option>
                            <option value="Indian">Indian</option>
                            <option value="American">American</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label class="label">Comment:</label>
                        <textarea rows="5" cols="10" name="comment" class="form-control"></textarea>
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
