package com.tsola2002.jspsandbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int k = 0;
		
		
		// accept the cookies
		// we use an array to retrieve the cookies
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("The square of the result is: " + k);
		
		
		//System.out.println("sq servlet called");
		
	}
}
