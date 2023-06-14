package Controller;

import java.io.IOException;
import java.sql.Blob;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DAO;
import Model.DTO;



@WebServlet(urlPatterns = {"/addlink","/displaylink"})
public class pcontroller extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String url=req.getServletPath();
	
	switch(url) {
		case "/addlink":
			add(req,resp);
			break;
		case "/displaylink":
			display(req,resp);
			break;
			
	}
}

private void display(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession ses=req.getSession(true);
	String prof=req.getParameter("profession");
	req.setAttribute("profession", prof);
	String city=req.getParameter("city");
	req.setAttribute("city", city);
	String state=req.getParameter("state");
	req.setAttribute("state", state);
		    
	   
	    DTO dt=new DTO();
	    dt.setProfession(prof);
	    dt.setCity(city);
	    dt.setState(state);
	    
	    
	    DAO da=new DAO();
	    ArrayList<DTO> clientList=da.display(dt);
	    System.out.println(clientList.size());
	    if(clientList.size()==0) {
			resp.sendRedirect("client1.html");
	    }
	    else {
			req.setAttribute("clientlist", clientList);
			RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
			rd.forward(req, resp);
	    }
	
}

private void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String prof=req.getParameter("profession");
	String email=req.getParameter("email");
	String city=req.getParameter("city");
	String state=req.getParameter("state");
	String contact=req.getParameter("contact");	
	String file=req.getParameter("file");
		
	
	DTO p1=new DTO();
	p1.setName(name);
	p1.setProfession(prof);
	p1.setEmail(email);
	p1.setCity(city);
	p1.setState(state);
	p1.setContact(contact);
	p1.setFile(file);
	
	
	DAO d1=new DAO();
	int count=d1.product(p1);
	
	req.setAttribute("finalcount", count);
	RequestDispatcher rd=req.getRequestDispatcher("add.jsp");
	rd.forward(req, resp);
	
	
}
}
