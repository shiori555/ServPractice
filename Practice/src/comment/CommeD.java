package comment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommeD
 */
@WebServlet("/CommeD")
public class CommeD extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommeD() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/csv;charset=UTF8");
		String fileName = new String("member.csv".getBytes("Shift_JIS"), "ISO-8859-1");

		response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
		PrintWriter writer = response.getWriter();
		writer.write("abc,def,123\r\n");
		writer.write("あいう,感じ,0.123\r\n");
		writer.close();
	}

}
