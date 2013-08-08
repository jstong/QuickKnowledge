<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<style type="text/css">
tabel {
color:#333333;
height:50px;
width:94%;
border-collapse:collapse;	
}
#trj{
align:left;
color:#333333;
background-color:#F7F6F3;
}
#tro{
align:left;
style=color:#284775;
background-color:White;
}
#td{
align:left;
background-color:#E9F3F3;
font-weight:bold;
width:20%;
}
</style>
	</head>

	<body>
		<s:form>
			<div id="newsDetail">
				<table id="newsTabel" cellspacing="0" cellpadding="4" align="Center" rules="rows" border="1">
					<tbody>
						<tr id="trj">
							<td id="td">
								Title
							</td>
							<td><s:property value="newsList.title"/></td>
						</tr>
						<tr id="tro">
							<td id="td">
								KeyWords
							</td>
							<td><s:property value="newsList.keywords"/></td>
						</tr>
						<tr id="trj">
							<td id="td">
								Details
							</td>
							<td><s:property value="newsList.details"/></td>
						</tr>
						<tr id="tro">
							<td id="td">
								Poster
							</td>
							<td><s:property value="newsList.poster"/></td>
						</tr>
						<tr id="trj">
							<td id="td">
								Posed
							</td>
							<td><s:property value="newsList.posted"/></td>
						</tr>
					</tbody>
				</table>
			</div>
		</s:form>
	</body>
</html>
