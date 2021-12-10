<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Hopper's Receipt</title>
</head>
<body>
    <p>
        <c:out value="${name}"/>
    </p>
    <p>
        <c:out value="${itemName}"/>
    </p>
    <p>
        <c:out value="${price}"/>
    </p>
    <p>
        <c:out value="${description}"/>
    </p>
    <p>
        <c:out value="${vendor}"/>
    </p>
</body>
</html>