<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">                                   
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Spring Bootstrap 3</a>
        </div>
        <div class="navbar-collapse collapse">  
          <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/tutorial/" />">Home</a></li>
            <li><a href="<c:url value="/tutorial/getstarted" />">Get started</a></li>
            <li><a href="<c:url value="/tutorial/errors-validations" />">Errors &amp; Validations</a></li>
            <li><a href="<c:url value="/tutorial/form" />">Forms</a></li>
            <li><a href="<c:url value="/tutorial/fileupload" />">File Upload</a></li>
            <li><a href="<c:url value="/tutorial/misc" />">Misc</a></li>
          </ul>
        </div>   			      		 
  </div>
</div>