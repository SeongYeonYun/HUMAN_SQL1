package proj3_dbcp;
//INSERT INTO pizza_orders (order_id, pizza_type, pizza_size, toppings, special_requests)
//VALUES (seq_pizza_orders.NEXTVAL, 'Pepperoni', 'Large', 'Extra Cheese, Olives', 'Please cut into 8 slices');
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 * Servlet implementation class pizzaServlet
 */
@WebServlet("/pizza")
public class pizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
	String user = "scott4_12";
	String pw = "tiger";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("pizza servlet do get");
		
		//한글 출력시 꺠지지 않게
		response.setContentType("text/html;charset=UTF-8");
		
		String pizza_var = request.getParameter("pizza_var");			
		String pizza_size = request.getParameter("pizza_size");
		String relist = request.getParameter("relist");
		String[] topping = request.getParameterValues("topping");
		String top = "";
		for(int x = 0; x<topping.length;x++) {
			top = top + "," + topping[x];
		}
	
		
		try {
			PrintWriter out = response.getWriter();
			out.println("<h1>"+pizza_var + "피자</h1>");
			out.println("<h1>만원입니다.</h1>");
			out.println("<h1> 요청사항 : " + relist + "</h1>");
			out.println("<h1> 토핑 : " +top + "</h1>");
			out.println("<h1> 사이즈 : " +pizza_size + "</h1>");
			
		
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = null;
	        Statement stmt = null;

	        
	     // 2. JDBC 드라이버 로드 및 DB 연결
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, pw);
            System.out.println("로그인 DB 연결 성공");

            // 3. 쿼리 실행
            stmt = conn.createStatement();
            String order = String.format(
            	    "INSERT INTO pizza_orders (order_id, pizza_type, pizza_size, toppings, special_requests) " +
            	    "VALUES (seq_pizza_orders.NEXTVAL, '%s', '%s', '%s', '%s')",
            	    pizza_var, pizza_size, top, relist
            	);

            	// INSERT 실행 → executeUpdate()
            	int result = stmt.executeUpdate(order);
            	System.out.println(result + "건 입력됨");
            	
            	stmt.close();
            	conn.close();
		
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
