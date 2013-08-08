<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>无标题文档</title>
		<link rel="stylesheet" type="text/css" href="layout.css">
			<script language="javascript">
	function register(n) {
		document.getElementById("guaiguai").src = n;
	}
</script>
	</head>

	<body>
		<div id="container">

			<div id="top">
				<table>
					<tr style="background: url(images/bar.jpg) no-repeat" height="78">
						<td width="1002" colspan="2">

						</td>
					</tr>
					<tr style="background: url(images/1a3.jpg)" height="30">
						<td width="600">
							<a href="#">News</a> |
							<a href="#">Events</a> |
							<a href="#">Publications</a> |
							<a href="#">Experts</a> |
							<a href="#">Comment Site</a>
						</td>
						<td align="right">
							Search Experts:
							<input type="text" size="10"/>
								<button name="button" value="go">
									go
								</button>
						</td>
					</tr>
				</table>
			</div>

			<div id="maincontainer">
				<div id="left" style="background: url(images/2a.gif) no-repeat">
					<form action="" method="post">
						<table bgcolor="#FF9900">

							<tr width="15">
								<td colspan="2" bgcolor="#000066">
									<font color="#FFFFFF">Login From </font>
								</td>
							</tr>

							<tr>
								<td>
									<font color="#FFFFFF">UserName:</font>
								</td>
								<td>
									<input type="text" size="13" />
								</td>

							</tr>
							<td>
								<font color="#FFFFFF">PassWord:</font>
							</td>
							</font>
							<td>
								<input type="text" size="13" />
							</td>
							<tr align="center">
								<td colspan="2">
									<input type="button" value="Login" />
									<a href="javascript:register('register.html')">Register</a>
								</td>
							</tr>
							<tr>
							</tr>
						</table>

					</form>
					<div>
						<table background="images/puhuo.PNG" height="752" width="182">
							<tr>
								<td>

								</td>
							</tr>
						</table>
					</div>

					<div>
						<table background="images/3a.jpg" height="52" width="182">
							<tr>
								<td>

								</td>
							</tr>
						</table>
					</div>

				</div>

				<div id="right">
					<div>
						<table>
							<tr style="background: url(images/tabbg.gif)" height="30">
								<td width="200">

								</td>
							</tr>
							<tr height="220">
								<td>
								</td>
							</tr>
						</table>
					</div>

					<div>
						<table>
							<tr style="background: url(images/tabbg.gif)" height="30">
								<td width="200">

								</td>
							</tr>
							<tr height="220">
								<td>
								</td>
							</tr>
						</table>
					</div>

					<div>
						<table>
							<tr style="background: url(images/tabbg.gif)" height="30">
								<td width="200">

								</td>
							</tr>
							<tr height="220">
								<td>
								</td>
							</tr>
						</table>
					</div>
					<div>
						<table>
							<tr style="background: url(images/tabbg.gif)" height="30">
								<td width="200">

								</td>
							</tr>
							<tr height="100">
								<td>
								</td>
							</tr>
						</table>
					</div>
				</div>
				<div id="content">
					<iframe id="guaiguai" width="570" height="800" scrolling="no"
						frameborder="0"></iframe>
				</div>

			</div>

			<div id="bottom">
				<table style="background: url(images/footer.jpg)" height="60">
					<tr>
						<td width="1002" align="center">
							Strategic Partnership Group (SPG) 战略合作与外包事业部
						</td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>
