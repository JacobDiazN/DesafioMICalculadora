<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="./assets/html/head.jsp"></jsp:include>
<body class="container bg-black" >
    <section class="container bg-white">
        <h1>Calculadora, Ordenamiento, Par o Impar</h1>
        <form action="CalculadoraServlet" method="post">
            <div class="form-group">
                <label for="numero1">Primer Número:</label>
                <input type="text" id="numero1" name="numero1" required pattern="\d*">
            </div>
            <div class="form-group">
                <label for="numero2">Segundo Número:</label>
                <input type="text" id="numero2" name="numero2" required pattern="\d*">
            </div>
            <div class="form-group">
                <label for="operacion">Operación:</label>
                <select id="operacion" name="operacion" required>
                    <option value="sumar">Sumar</option>
                    <option value="restar">Restar</option>
                    <option value="multiplicar">Multiplicar</option>
                    <option value="dividir">Dividir</option>
                    <option value="ordenarAsc">Ordenar de Menor a Mayor</option>
                    <option value="ordenarDesc">Ordenar de Mayor a Menor</option>
                    <option value="paresImpares">Par o Impar</option>
                </select>
            </div>
            <button type="submit">Calcular</button>
        </form>
    </section>
</body>
</html>