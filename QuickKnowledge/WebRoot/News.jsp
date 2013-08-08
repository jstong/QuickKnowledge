<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>News.jsp</title>

		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">

		<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
		<style type="text/css">
table {
	background-color: #B0CCCE;
	border:solid;
	border-color: black;
}

span {
	font-size: 12px;
}

.top {
	background-color: blue;
	width: 503px;
	height: 30px;
	text-align: left;
	padding-top: 2px;
	font-size: 17px;
	color: white;
}

td {
	width: 150px;
}

.button {
	margin-left: 441px;
	width: 70px;
}

input {
	width: 180px;
}
</style>
	</head>

	<body>
		<s:form action="addNews!AddNews.action" method="post" name="f">
			<table border="1" width="685" height="272">
				<tr>
					<td class="top" colspan="3">
						News Information
					</td>
				</tr>
				<tr>
					<td>
						<span>Title:</span>
					</td>
					<td>
						<input type="text" name="news.title" />
					</td>
				</tr>
				<tr>
					<td>
						<span>Keywords:</span>
					</td>
					<td>
						<input type="text" name="news.keywords" />
					</td>
				</tr>
				<tr>
					<td>
						<span>Details:</span>
					</td>
					<td colspan="2">
						<textarea name="news.details"
							style="height: 160px; width: 380px;"></textarea>
					</td>
				</tr>
			</table>

			<s:submit value="Submit" name="submit"></s:submit>
			<input type="button" style="width: 51px;" value="Back">
		</s:form>
	</body>

</html>
