<%
session.removeAttribute("user_session");
session.setAttribute("login_message", "Sesi�n cerrada");
%>
<script type="text/javascript">
window.location.href="http://localhost:8070/login/index.jsp";
</script>