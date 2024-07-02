package com.ohgiraffers.section01.forward;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {

    /*
    * forward할 떄 전달한 request와 response의 모든 정보를 이용해 새로운 request와 response를
    * 만들고, 그 정보를 이용해 다시 htttp 메소드에 맞는 서블릿의 doGet 혹은 doPost를 요청하는 방식
    * 깊은 복사를 이용해 값을 그대로 복사했기 때문에 내부에 존재하는 헤더나 인스턴스는 그대로 유지하고 있다.
    * */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * forward 받은 서블릿에서도 요청 방식이 get이면 doget메소드를,
         * 요청 방식이 Post이면 doPost 메소드를 호출한다.
         * 보내준 서블릿에서 request에 전달 정보를 담았으므로, 해당 서블릿에서 사용하기 위해
         * request에서 다시 꺼낸다.
         * */
        String userId = (String) request.getAttribute("userId");

        // 응답에 필요한 데이터가 준비되면 동적인 웹페이지를 생성한다.
        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(userId)
                .append("님 환영합니다.</h3>\n")
                .append("</body>\n")
                .append("</html>\n");

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println(responseText.toString());

        out.flush();
        out.close();
    }
}
