package xjhxjhxjhxjh.com.github.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xjhxjhxjhxjh.com.github.service.HighSpeedRailService;
import xjhxjhxjhxjh.com.github.service.impl.HighSpeedRailServiceImpl;

@WebServlet("/showHighSpeedRailServlet")
public class ShowHighSpeedRailServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private  HighSpeedRailService highSpeedRailService = new HighSpeedRailServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理乱码
        req.setCharacterEncoding("utf-8");
        // 获取参数
        int start = 0;
        String startStr = (String)req.getParameter("start");
        if (startStr != null && startStr.trim() != "") {
            start = Integer.parseInt(startStr);
        }
        int end = 0;
        String endStr = (String)req.getParameter("end");
        if (endStr != null && endStr.trim() != "") {
            end = Integer.parseInt(endStr);
        }
        // 传递参数
        req.setAttribute("lineList", highSpeedRailService.selByStartStationAndEndStation(start, end));
        // 请求转发
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
