package xjhxjhxjhxjh.com.github.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xjhxjhxjhxjh.com.github.service.StationService;
import xjhxjhxjhxjh.com.github.service.impl.StationServiceImpl;

/**
 * Servlet implementation class ShowStartServlet
 */
@WebServlet("/showStart")
public class ShowStartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StationService stationService = new StationServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 传递参数并转发
        req.setAttribute("startStationList", stationService.selStartStation());
        req.getRequestDispatcher("showEnd").forward(req, resp);
    }
}
