<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<!--<meta http-equiv='refresh' 
content='1;url=addNews!queryNews.action'>
-->
		<STYLE type="text/css">
#newList {
	color: black;
	background-color: white;
}

#centerNewsPage {
	background-color: white;
	border-color: #0071BC;
	border-width: 1px;
	border-style: Ridge;
	width: 94%;
}

#choosePage {
	color: black;
	background-color: E9F3F3;
}
</STYLE>
	</head>

	<body>
		<s:form>
			<div style="width: 600px;">
				<br>
				<br>
				<div align="center">
					<table id="centerNewsPage" cellspacing="0" cellpadding="2"
						border="1" align="center" rules="all">
						<tbody>
							<tr align="center"
								style="color: white; background-color: #0071BC; font-weigh; bold; height: 30px">
								<th scope="col">
									Title
								</th>
								<th style="width: 100px" scope="col">
									Poster
								</th>
								<th style="width: 70px" scope="col">
									Posted
								</th>
							</tr>
							<s:iterator value="newsList">
								<tr id="newList">
									<td>
										<A href="addNews!newsDetails.action"><s:property value="title" /></A>
									</td>
									<td>
										<s:property value="expert.firstname"/>
									</td>
									<td>
										<s:property value="posted"/>
									</td>
								</tr>
							</s:iterator>
							<tr align="center" id="choosePage">
								<td colspan="3">
									12
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</s:form>
	</body>
</html>
