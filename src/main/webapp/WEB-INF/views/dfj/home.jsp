<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">

<body>
<ul class="nav nav-list">
 
   <li><a id="getUser" class="textLink" href="<c:url value="/dfj/user/selectUserById?userId=11" />">GET User</a></li>
   <li><a id="getUsers" class="textLink" href="<c:url value="/dfj/user/selectUsers" />">GET Users</a></li>
</ul>

</html>
</body>