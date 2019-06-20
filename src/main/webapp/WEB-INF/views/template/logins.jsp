<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>登录</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/template/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/template/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- inject:css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/template/css/style.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/static/template/images/favicon.png" />
</head>
<body>
	<div class="container-scroller">
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="content-wrapper d-flex align-items-center auth">
				<div class="row w-100">
					<div class="col-lg-4 mx-auto">
						<div class="auth-form-light text-left p-5">
							<div class="brand-logo">
								<img
									src="${pageContext.request.contextPath}/static/template/images/logo.svg">
							</div>
							<h4>Hello! let's get started</h4>
							<h6 class="font-weight-light"></h6>
							<form class="pt-3" method="post"
								action="${pageContext.request.contextPath}/index/loginIN">
								<div class="form-group">
									<input type="text" class="form-control form-control-lg"
										id="name" name="name" placeholder="用户名" value="123">
								</div>
								<div class="form-group">
									<input type="password" class="form-control form-control-lg"
										id="password" name="password" placeholder="密码" value="1">
								</div>
								<div class="form-group">
									<select class="form-control form-control-lg" name="type"
										id="type">
										<option value="1">管理员</option>
										<option value="2">家长</option>
										<option value="3">老师</option>
									</select>
								</div>
								<div class="mt-3">
									<input
										class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn"
										onclick="login()" value="登录" />
								</div>
								<div
									class="my-2 d-flex justify-content-between align-items-center">
									<div class="form-check">
										<label class="form-check-label text-muted"> <input
											type="checkbox" class="form-check-input"> 记住密码
										</label>
									</div>
									<a href="#" class="auth-link text-black">忘记密码?</a>
								</div>
								<div class="mb-2">
									<button type="button"
										class="btn btn-block btn-facebook auth-form-btn">
										<i class="mdi mdi-facebook mr-2"></i>使用QQ登录
									</button>
								</div>
								<div class="text-center mt-4 font-weight-light">
									没有账号? <a href="register.html" class="text-primary"
										href="${pageContext.request.contextPath}/index/regist">注册</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script
		src="${pageContext.request.contextPath}/static/template/vendors/js/vendor.bundle.base.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/template/vendors/js/vendor.bundle.addons.js"></script>
	<!-- endinject -->
	<!-- inject:js -->
	<script
		src="${pageContext.request.contextPath}/static/template/js/off-canvas.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/template/js/misc.js"></script>
	<!-- endinject -->
	<script>
		function login() {
			var name = document.getElementById("name").value;
			var password = document.getElementById("password").value;
			var type = document.getElementById("type").value;
			var name1 = $("#name").val();
			var password1 = $("#password").val();
			var type1 = $("#type").val();
			console.log('name1' + name1 + "password" + password1 + "type1:"
					+ type1)
			$
					.ajax({
						url : "${pageContext.request.contextPath}/index/loginIN",//请求的url地址    			   
						dataType : "json", //返回的格式为
						data : {
							"name" : name,
							"password" : password,
							"type" : type,
						},
						timeout : 7000,
						type : "POST",//请求的方式
						success : function(req) {
							console.log(req)
							console.log(req.code)
							console.log(req.msg)
							if(type==1){
								if (req.code == 0) {
									alert(req.msg);
									window.location.href = "${pageContext.request.contextPath}/index/indexs";
								}
								if (req.code == 3) {
									alert("参数不全");
									window.location.href = "${pageContext.request.contextPath}/index/login";
								}
								if (req.code == 103) {
									alert("用户名或者密码错误!");
									window.location.href = "${pageContext.request.contextPath}/index/login";
								}
							}
							if(type==2){
								if (req.code == 0) {
									alert(req.msg);
									window.location.href = "${pageContext.request.contextPath}/index/index";
								}
								if (req.code == 3) {
									alert("参数不全");
									window.location.href = "${pageContext.request.contextPath}/index/login";
								}
								if (req.code == 103) {
									alert("用户名或者密码错误!");
									window.location.href = "${pageContext.request.contextPath}/index/login";
								}
							}
							

						},//请求成功的处理

						error : function() {
							alert("服务器超时!");
						}//请求出错的处理
					});
		}
	</script>
</body>
</html>