<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bucket list</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Resources/css/stylesheet.css">
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/Resources/js/activity-update.js"></script>
</head>
<body>
	<header>
		<h1>What to do before you kick the bucket&#63;</h1>
		<nav>
			<ul>
				<li><a href="/BucketList">Bucket list</a></li>
				<li><a href="/BucketList/add">Add a new item</a></li>
			</ul>
		</nav>
	</header>