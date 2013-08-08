<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>ExpertInformationEdit.html</title>

		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">

		<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
		<style type="text/css">
table {
	background-color: #B0CCCE;
	border-color: black;
}

.top {
	background-color: blue;
	width: 503px;
	height: 30px;
	text-align: left;
	padding-top: 2px;
	font-size: 17px;
	font-weight: bold;;
	color: white;
}

.button {
	margin-left: 245px;
}
</style>
	</head>

	<body>
		<s:form action="expertInfoEditAction" method="post">
			<table border="1">
				<tr>
					<td colspan="2" class="top">
						Expert Profile
					</td>
				</tr>
				<tr>
					<td>
						<span>First name:</span>
					</td>
					<td>
						<input type="text" name="expert.firstname" />
					</td>
				</tr>
				<tr>
					<td>
						<span>Last name:</span>
					</td>
					<td>
						<input type="text" name="expert.lastname" />
					</td>
				</tr>
				<tr>
					<td>
						<span>Phone:</span>
					</td>
					<td>
						<input type="text" name="expert.phone" />
					</td>
				</tr>
				<tr>
					<td>
						<span>Address:</span>
					</td>
					<td>
						<input type="text" name="expert.adress" />
					</td>
				</tr>
				<tr>
					<td>
						<span>City:</span>
					</td>
					<td>
						<input type="text" name="expert.city" />
					</td>
				</tr>
				<tr>
					<td>
						<span>State /Province:</span>
					</td>
					<td>
					<s:select
							list="#{0:'California',1:'Colorado',2:'Hawaii',3:'Louisiana',4:'Massachusetts',5:'Nevada',6:'New Jersey',7:'Virginia',8:'Washington'}"
							listValue="value" name="expert.proince" style="width:180px;" />

					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Postal Code:</span>
					</td>
					<td>
						<input type="text" name="expert.postcode" />
					</td>
				</tr>
				<tr>
					<td>
						<span>Expert Type:</span>
					</td>
					<td>
						<s:select
							list="#{0:'Advertising Industry',1:'Building Industry',2:'Clothing Industry'}"
							name="expert.experttype" listValue="value" headerKey="0"
							style="width:180px;" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Introduce:</span>
					</td>
					<td colspan="2">
						<textarea name="expert.introduce" style="height: 170px; width: 290px;"></textarea>
					</td>
				</tr>
				<tr></tr>
			</table>
			<s:submit value="submit"></s:submit>
		</s:form>

	</body>
</html>

