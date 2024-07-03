<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="./assets/html/head.jsp"></jsp:include>
<body class="container bg-black" >
    <div class="container bg-white">
        <h1>Resultado de la Operación</h1>
        <div class="text-center">
            <p>${resultado}</p>
        </div>
        <button onclick="location.href='index.jsp'">Volver</button>
    </div>
</body>
</html>
