package qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("un");
		String ph = req.getParameter("ph");
		String em = req.getParameter("em");
		PrintWriter p = resp.getWriter();
		p.print("<h1>name: "+name+"</h1>");
		p.print("<h1>Phone: "+ph+"</h1>");
		p.print("<h1>Email: "+em+"</h1>");
	}
}
