package cn.yunhe.servlet;

import cn.yunhe.enity.PageUtils;
import cn.yunhe.service.AccountService;
import cn.yunhe.service.impl.AccountServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/account")
public class AccountServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        AccountService accountService = new AccountServiceImpl();
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        PageUtils list = accountService.selectLimit(currentPage,pageSize);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String string = mapper.writeValueAsString(list);
            resp.getWriter().println(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
