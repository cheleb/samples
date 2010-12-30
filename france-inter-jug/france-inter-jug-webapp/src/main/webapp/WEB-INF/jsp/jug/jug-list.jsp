<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>JUG List</title>
</head>
<body>
  <h1>JUG List</h1>
  
  <table>
  <c:forEach items="${list}" var="jug">
  <tr>
   <s:url value="/spring/jug/edit/{id}" var="url" >
     <s:param name="id" value="${jug.id }"></s:param>
   </s:url>   
   <td>${jug.name} </td><td><a href="${url }">edit</a></td>
   
  </tr>
  </c:forEach>
  </table>
  
  <a href="..">Back</a>
  
</body>
</html>