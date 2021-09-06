<%
session.removeAttribute("user_session");
session.setAttribute("login_message", "Sesión cerrada");
%>
<script type="text/javascript">
window.location.href="http://localhost:8070/login/index.jsp";
</script>