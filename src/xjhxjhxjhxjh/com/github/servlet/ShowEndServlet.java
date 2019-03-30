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
 * Servlet implementation class ShowEndServlet
 */
@WebServlet("/showEnd")
public class ShowEndServlet extends HttpServlet {
    private StationService stationService = new StationServiceImpl();
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 传递参数并转发
        req.setAttribute("endStationList", stationService.selEndStation());
        req.getRequestDispatcher("showHighSpeedRailServlet").forward(req, resp);
    }

}
