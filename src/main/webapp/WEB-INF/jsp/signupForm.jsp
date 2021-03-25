<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Sign Up form</title>
    <meta charset="UTF-8"/>
</head>
<body>
    <form:form action="save" method="post" accept-charset="UTF-8" modelAttribute="user">
        <div>
            <h3>Identity</h3>
            <label for="firstname">Firstname: </label>
            <form:input id="firstname" path="firstname" type="text" value="${user.firstname}"/>
        </div>

        <div>
            <label for="lastname">Lastname: </label>
            <form:input id="lastname" path="lastname" type="text" value="${user.lastname}"/>
        </div>

        <div>
            <h3>Contact</h3>
            <div>
                <label for="street">Street: </label>
                <form:input id="street" path="address.street" type="text" value="${user.address.street}"/>
            </div>

            <div>
                <label for="zipCode">Zip code: </label>
                <form:input id="zipCode" path="address.zipCode" type="text" value="${user.address.zipCode}"/>
            </div>
            
            <div>
                <label for="phone">Phone: </label>
                <form:input id="phone" path="phone" type="text" 
                value="${user.phone.countryCode}${user.phone.areaCode}${user.phone.number}"/>
            </div>
            
            <div>
                <h4>Select your country</h4>
                <form:select path="country.name">
                	<form:option value="----">Select your country</form:option>
                	<form:options items="${countryList}"></form:options>
                </form:select>
            </div>
            
        </div>

        <div>
            <input type="submit" value="signup"/>
        </div>
    </form:form>
</body>
</html>
