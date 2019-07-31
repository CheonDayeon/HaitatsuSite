package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MenuDAOImpl;
import model.City;
import model.Restaurant;
import model.Town;

@WebServlet(name = "MainController", urlPatterns = { "/login_link", "/sign_link", "/qa_board_link", "/event_board_link", 
		"/home_link","/search_link" })

public class MainController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);

	}
	
	private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		MenuDAOImpl Mimpl = null;
		
		String uri = req.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex + 1);

		if (action.equals("login_link")) {

			RequestDispatcher rd = req.getRequestDispatcher("test.jsp");
			rd.forward(req, resp);

		}
		else if (action.equals("sign_link")) {

			RequestDispatcher rd = req.getRequestDispatcher("test.jsp");
			rd.forward(req, resp);

		}
		else if (action.equals("qa_board_link")) {

			RequestDispatcher rd = req.getRequestDispatcher("board/qaboard.jsp");
			rd.forward(req, resp);

		}
		else if (action.equals("event_board_link")) {

			RequestDispatcher rd = req.getRequestDispatcher("board/eventboard.jsp");
			rd.forward(req, resp);

		}
		else if (action.equals("home_link")) {

			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);

		}
		else if (action.equals("search_link")) {
			Mimpl = new MenuDAOImpl();
			
			int category = Integer.parseInt(req.getParameter("category"));
			List<Restaurant> lists = Mimpl.selectByCategory(category);
			req.setAttribute("lists", lists);
			
			List<City> citylists = Mimpl.selectAllCity();
			req.setAttribute("citylist", citylists);
			
			List<Town> townlists = Mimpl.selectAllTown();
			req.setAttribute("townlist", townlists);
			
			RequestDispatcher rd = req.getRequestDispatcher("main/search.jsp");
			rd.forward(req, resp);

		}
	}
}