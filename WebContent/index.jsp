<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>High-speed rail line</title>
</head>
<body>
<form action="showStart" method="post">
    始发站
    <select name="start">
        <option value="0">请选择</option>
        <c:forEach items="${startStationList}" var="list">
            <option value="${list.sid }">${list.sname}</option>
        </c:forEach>
    </select>
    终点站
    <select name="end">
        <option value="0">请选择</option>
        <c:forEach items="${endStationList}" var="list">
            <option value="${list.sid }">${list.sname}</option>
        </c:forEach>
    </select>
    <input type="submit" value="查询"> 
</form>
<table border="1px">
    <tr>
        <th>高铁编号</th>
        <th>始发站</th>
        <th>始发城市</th>
        <th>终点站</th>
        <th>终点城市</th>
        <th>时间</th>
        <th>票价(元)</th>
    </tr>
    <c:forEach items="${lineList}" var="list">
        <tr>
            <td>${list.number}</td>
            <td>${list.startStation.sname}</td>
            <td>${list.startStation.cityName}</td>
            <td>${list.endStation.sname}</td>
            <td>${list.endStation.cityName}</td>
            <td>
                <c:if test="${list.time/60>0}">
                    <fmt:formatNumber value="${list.time/60 }" pattern="0"></fmt:formatNumber>小时
                </c:if>
                <c:if test="${ list.time%60>0}">
                    ${ list.time%60}分钟
                </c:if>
            <td>${list.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>