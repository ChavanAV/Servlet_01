package qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/qp")
public class GetDataFromQueryParameter extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		PrintWriter p = resp.getWriter();
		p.print("<h1>Name: "+name+"</h1>");
		p.print("<h1>Id: "+id+"</h1>");
	}

}
