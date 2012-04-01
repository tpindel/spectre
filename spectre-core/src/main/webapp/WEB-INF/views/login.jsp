<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<link href="<c:url value='/resources/css/bootstrap.min.css' />"
	rel="stylesheet">
<link
	href="<c:url value='/resources/css/bootstrap-responsive.min.css' />"
	rel="stylesheet">
<link
	href="<c:url value='/resources/css/smoothness/jquery-ui-1.8.18.custom.css' />"
	rel="stylesheet" />
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<form class="form-horizontal" name='loginform'
			action="<c:url value='/j_spring_security_check' />" method='POST'>
			<fieldset>
				<div>
					<label for="input-username">User name:</label>
					<div class="controls">
						<input id="input-username" type="text" name='j_username' value=''
							placeholder="Please enter your username" />
					</div>
				</div>

				<c:choose>
					<c:when test="${not empty error}">
						<div class="control-group error">
							<label class="control-label" for="input-password">Password:</label>
							<div class="controls">
								<input id="input-password" type="password" name='j_password'
									placeholder="Please enter your password" /> <span
									class="help-inline">Your login attempt was not
									successful try again:
									${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
							</div>
						</div>
					</c:when>
					<c:otherwise>
						<div>
							<label for="input-password">Password:</label>
							<div class="controls">
								<input id="input-password" type="password" name='j_password'
									placeholder="Please enter your password" />
							</div>
						</div>
					</c:otherwise>
				</c:choose>

				<div class="form-actions">
					<button name="submit" type="submit">Submit</button>
					<button name="reset" type="reset">Clear</button>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>