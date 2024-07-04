package com.ohgiraffers.section03.request;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {
    /*
    * 3. request
    * 3-1 ServletRequestListener
    * - ServletRequest의 생성과 소멸에 대한 이벤트 리스너
    * 3-2 ServletRequestAttributeListener
    * - ServletRequest에 attribute를 추가, 제거, 수정하는 것에 대한 이벤트리스너
    * */

    public RequestListenerTest(){
        System.out.println("request listener 인스턴스 생성");
    }


    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // request가 생성될 때 호출된다
        System.out.println("request init");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // request가 소멸될 때 호출된다
        System.out.println("request destroy!!!");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // request에 attribute가 추가될 떄 호출된다
        System.out.println("request attribute Add!!");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // request에 attribute가 수정될 때 호출된다.
        System.out.println("request attribute replaced");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
       // request에 attribute가 삭제될 때 호출된다
        System.out.println("request attribute remove");
    }

}