package com.tsola2002.jspsandbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		Cookie cookie = new Cookie("k", k + "");
		
		// this will send the response to the clinet
		res.addCookie(cookie);
		//Cookie
		
		res.sendRedirect("sq");
		
		//PrintWriter out = res.getWriter();
		
		//out.println("result is :" + k);
		
	}
}
