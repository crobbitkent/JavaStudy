<%--
  Created by IntelliJ IDEA.
  User: crobbitkent
  Date: 21. 1. 20.
  Time: 오후 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="image/jpeg" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.io.*" %>

<%
    FileInputStream fin = new FileInputStream("/home/crobbitkent/Pictures/aaa.jpg");
    OutputStream os = response.getOutputStream();

    byte[] buffer = new byte[1024 * 8]; // 8kb

    while(true){
        int count = fin.read(buffer);

        if(-1 == count){
            break;
        }
        os.write(buffer, 0, count);
    }

    os.close();
    fin.close();
%>
