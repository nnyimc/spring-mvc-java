<%--
  Created by IntelliJ IDEA.
  User: nnyimc
  Date: 23/03/2021
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up form</title>
    <meta charset="UTF-8"/>
</head>
<body>
    <form action="save" method="post" accept-charset="UTF-8">
        <div>
            <h3>Identity</h3>
            <label for="firstname">Firstname: </label>
            <input id="firstname" name="firstname" type="text" value="${user.firstname}"/>
        </div>

        <div>
            <label for="lastname">Lastname: </label>
            <input id="lastname" name="lastname" type="text" value="${user.lastname}"/>
        </div>

        <div>
            <h3>Address</h3>
            <div>
                <label for="street">Street: </label>
                <input id="street" name="address.street" type="text" value="${user.address.street}"/>
            </div>

            <div>
                <label for="zipCode">Zip code: </label>
                <input id="zipCode" name="address.zipCode" type="text" value="${user.address.zipCode}"/>
            </div>
        </div>

        <div>
            <input type="submit" value="signup"/>
        </div>
    </form>
</body>
</html>
