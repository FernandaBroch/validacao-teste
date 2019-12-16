package main.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HotelServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HotelApplication app = new HotelApplication();
		
		String hotelInput = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";
		Hotel cheapestHotel = app.cheapestHotel(hotelInput );
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
        out.println("<head>");
        out.println("<title>Hotel mais barato</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Procurando hotel mais barato para: " + hotelInput + "</h2>");
        out.println("<h2>Resultado: " + cheapestHotel.getName() + "</h2>");
        out.println("</body>");
        out.println("</html>");
		
	}
	
}
