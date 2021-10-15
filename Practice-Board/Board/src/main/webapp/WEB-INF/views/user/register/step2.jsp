<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step2 | LCHY</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/index.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/style-signup.css">
</head>
<body>
	<div class="panel-body">
		<div class="row">
			<div class="col-lg-6">
				<form:form role="form" commandName="registerRequest"
					action="/register/step3" method="post">
					<div class="form-group input-group">
						<span class="input-group-addon"><i class="fa fa-check"></i></span>
						<form:input type="text" class="form-control" placeholder="ID"
							path="id" />
						<form:errors path="id" />
					</div>
					<div class="form-group input-group">
						<span class="input-group-addon"><i class="fa fa-envelope"></i></span>
						<form:input type="email" class="form-control" placeholder="Email"
							path="email" />

					</div>
					<div class="form-group input-group">
						<span class="input-group-addon"><i class="fa fa-user"></i></span>
						<form:input type="text" class="form-control" placeholder="Name"
							path="name" />
						<form:errors path="name" />
					</div>
					<div class="form-group input-group">
						<span class="input-group-addon"><i class="fa fa-lock"></i></span>
						<form:password class="form-control" placeholder="Password"
							path="pw" />
						<form:errors path="pw" />
					</div>
					<div class="form-group input-group">
						<span class="input-group-addon"><i class="fa fa-lock"></i></span>
						<form:password class="form-control" placeholder="Password Check"
							path="checkPw" />
						<form:errors path="checkPw" />
					</div>
					<button type="submit" class="btn btn-default">가입하기</button>
					<button type="reset" class="btn btn-default">취소하기</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>