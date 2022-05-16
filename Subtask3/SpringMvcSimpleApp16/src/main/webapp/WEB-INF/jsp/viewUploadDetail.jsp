<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title> Multiple File Upload Page</title>

</head>

<body>

<div id="global">
     <h3>Following files are uploaded successfully</h3>
     
     <ol>
        <c:forEach items="${upload.images}" var="image">
        <li>${image.originalFilename}
        </li>
        </c:forEach>
     </ol>
</div>
</body>
</html>