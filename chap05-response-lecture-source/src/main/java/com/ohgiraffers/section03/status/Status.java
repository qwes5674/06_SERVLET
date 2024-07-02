package com.ohgiraffers.section03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

import static jdk.internal.org.jline.utils.Colors.s;

@WebServlet("/status")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //400,401,404,500
        response.sendError(400,"잘못된 문법으로 인해 서버가 요청을 이해할 수 없습니다. 다시 확인해주세요!!");
        response.sendError(401,"클라이언트는 요청할 응답을 반드시 스스로 인증해야 합니다.");
        response.sendError(404,"없는 페이지 입니다. 경로를 확인해주세요.");
        response.sendError(505,"서버 내부 오류입니다. 서버 오류는 개발자의 잘못이고, 개발자는 여러분입니다 !@");
    }


}
