<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

</head>
<body>
<h1>Edit user</h1>
<form class="form-signin" name='editForm' action="/admin/edit" method='POST' modelAttribute="user">
    <table>

            <tr><td> <input class="form-control" value="<c:out value='${user.id}'/>" type="hidden" name="id"/>   </tr></td>

            <tr><td> username: <input class="form-control" value="<c:out value='${user.login}'/>" type="text" name="username"/>   </tr></td>

            <tr><td> password: <input class="form-control" value="<c:out value='${user.password}'/>" type="text" name="password"/>  </tr></td>

            <tr>
                <td>
                    <c:forEach var="roles" items="${user.roles}" >
        <tr><td>  role: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input class="form-control" value="<c:out value='${roles.name}'/>" type="text" name="role"/> <tr><td>
                    </c:forEach>
                </td>
            </tr>

    </table>
</form>
</body>

</html>