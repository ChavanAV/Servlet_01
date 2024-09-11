package qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpExm extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p = resp.getWriter();
		p.write("<h1> Hello http</h1>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello http");
	}
}