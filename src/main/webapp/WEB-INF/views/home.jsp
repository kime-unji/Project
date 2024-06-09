<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>test야!!!!!
    <title>Web Page</title>
    <style>DDDDDD
        body {
            background-color: #bfd8ce;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        #content {
            text-align: center;
            margin-top: -800px; /* 조정할 여백의 크기를 조절합니다 */
             font-size: 30px; /* 원하는 폰트 크기로 조정합니다 */
        }
    </style>
</head>
<body>
    <div id="content">
        <h1>[ web6 ]</h1>
        <c:if test="${sessionScope.loginId != null}">
            <p>${sessionScope.loginName} (${sessionScope.loginId})님 로그인 중</p>
        </c:if>
        <ul>
            <c:if test="${sessionScope.loginId == null}">
                <li><a href="member/join">회원가입</a></li>
                <li><a href="member/login">로그인</a></li>
            </c:if>
            <c:if test="${sessionScope.loginId != null}">
                <li><a href="member/logout">로그아웃</a></li>
                <li><a href="member/update">개인정보 수정</a></li>
            </c:if>    
            <li><a href="board/list">게시판</a></li>
        </ul>
    </div>
</body>
</html>