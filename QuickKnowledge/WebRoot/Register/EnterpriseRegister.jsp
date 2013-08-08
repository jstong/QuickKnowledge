<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>EnterpriseRegister.jsp</title>

		<style type="text/css">
table {
	background-color: #B0CCCE;
	border-color: black;
}

span {
	font-size: 12px;
}

.top {
	background-color: blue;
	width: 503px;
	height: 30px;
	text-align: center;
	padding-top: 2px;
	font-size: 17px;
	color: white;
}

td {
	width: 180px;
}

.middle {
	background-color: blue;
	width: 503px;
	height: 30px;
	text-align: center;
	padding-top: 2px;
	font-size: 15px;
	color: white;
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
		<s:form action="EnterpriseRegister" method="post" name="f">
			<table border="1">
				<tr>
					<td class="top" colspan="3">
						Sign Up for Your New Account
					</td>
				</tr>
				<tr>
					<td>
						<span>User Name:</span>
					</td>
					<td>
						<input type="text" name="user.username" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>PassWord:</span>
					</td>
					<td>
						<input type="text" name="user.password" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Confirm:</span>
					</td>
					<td>
						<input type="text" name="" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>E-mail:</span>
					</td>
					<td>
						<input type="text" name="enterprise.email" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Security Question:</span>
					</td>
					<td>
						<input type="text" name="enterprise.securityque" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Security Answer:</span>
					</td>
					<td>
						<input type="text" name="enterprise.securityans" />
					</td>
					<td></td>
				</tr>
				<tr></tr>
			</table>
			<table border="1">
				<tr>
					<td class="middle" colspan="3">
						Edit Your Information
					</td>
				</tr>
				<tr>
					<td>
						<span>EnterpriseName:</span>
					</td>
					<td>
						<input type="text" name="enterprise.enterprisename" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Phone:</span>
					</td>
					<td>
						<input type="text" name="enterprise.phone" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Address:</span>
					</td>
					<td>
						<input type="text" name="enterprise.adress" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>City:</span>
					</td>
					<td>
						<input type="text" name="enterprise.city" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>State /Province:</span>
					</td>
					<td>
						<s:select
							list="#{0:'California',1:'Colorado',2:'Hawaii',3:'Louisiana',4:'Massachusetts',5:'Nevada',6:'New Jersey',7:'Virginia',8:'Washington'}"
							listValue="value" name="enterprise.proince" style="width:180px;" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Postal Code:</span>
					</td>
					<td>
						<input type="text" name="enterprise.postcode" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Enterprise Type:</span>
					</td>
					<td>
						<s:select
							list="#{0:'Advertising Industry',1:'Building Industry',2:'Clothing Industry'}"
							name="enterprise.enterprisetype" listValue="value" headerKey="0"
							style="width:180px;" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<span>Introduce:</span>
					</td>
					<td colspan="2">
						<textarea name="enterprise.introduce"
							style="height: 170px; width: 290px;"></textarea>
					</td>
				</tr>
				<tr></tr>
			</table>
			<s:submit value="Previous" name="submit"></s:submit>
			<input type="button" style="width: 51px;" value="Next">
		</s:form>
	</body>
</html>
