package comment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommeP
 */
@WebServlet("/CommeP")
public class CommeP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommeP() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 呼び出し元Jspからデータ受け取り
		request.setCharacterEncoding("UTF8");
		String jsp = request.getParameter("fromJsp");

		// 呼び出し先Jspに渡すデータセット
		request.setAttribute("fromServlet", jsp);

		// result.jsp にページ遷移
		RequestDispatcher dispatch = request.getRequestDispatcher("result1.jsp");
		dispatch.forward(request, response);
	}

}
