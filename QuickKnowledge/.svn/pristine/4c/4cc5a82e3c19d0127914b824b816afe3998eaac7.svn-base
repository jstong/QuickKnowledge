package com.quick.common;


import java.io.IOException;
import java.io.Writer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class JspFilter implements Filter {

	public void init(FilterConfig config) throws ServletException {
	}

	/*public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException,
			IOException {
		HttpServletRequest req = (HttpServletRequest) request;
		String path = req.getServletPath();
		String igpath = path.substring(path.lastIndexOf("/") + 1);
		if (igpath.equalsIgnoreCase("login.jsp")) {
			chain.doFilter(request, response);
		} else {
			if (req.getSession().getAttribute(//Constant.UserName) != null||igpath.equalsIgnoreCase("register.jsp")) {
				chain.doFilter(request, response);
			} else {
				String url = "<script language='javascript'>window.top.location.href='"
						+ req.getContextPath() + "/login/login.jsp'</script>";
				Writer writer = response.getWriter();
				writer.write(url);
				writer.flush();
				writer.close();
			}
		}
	}
	*/

	public void destroy() {
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

}
