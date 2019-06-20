<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
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
	<div class="content-wrapper">
		<div class="page-header">
			<h3 class="page-title">挂失</h3>
			<nav aria-label="breadcrumb">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#"></a></li>
				<li class="breadcrumb-item active" aria-current="page"></li>
			</ol>
			</nav>
		</div>
		<div class="row">

			<div class="col-12 grid-margin stretch-card">
				<div class="card">
					<div class="card-body">

						<p class="card-description">
							通过
							<code>挂失</code>
							让校园卡占时无法使用，可根据情况挂失...
						</p>
						<form class="form-inline">
							<label class="sr-only" for="inlineFormInputName2">学号</label> <input
								type="text" class="form-control mb-2 mr-sm-2" id="sno"
								name="sno" placeholder="请输入要挂失的学号"> <label
								class="sr-only" for="inlineFormInputGroupUsername2">user</label>
							<div class="input-group mb-2 mr-sm-2">
								<div class="input-group-prepend">
									<div class="input-group-text">@</div>
								</div>
								<input type="text" class="form-control"
									id="inlineFormInputGroupUsername2" placeholder="user">
							</div>
							<div>请核对信息</div>
							<button type="button" class="loss btn btn-gradient-primary mb-2">挂失</button>
						</form>
					</div>
				</div>
			</div>


		</div>
	</div>
	<!-- content-wrapper ends -->

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
	<!-- Custom js for this page-->
	<script
		src="${pageContext.request.contextPath}/static/template/js/file-upload.js"></script>
	<!-- End custom js for this page-->
	<script>
		$(".loss")
				.click(
						function() {
							var sno = document.getElementById("sno").value;
							console.log('sno' + sno);
							//var name1 = $("#name").val();
							$
									.ajax({
										url : "${pageContext.request.contextPath}/card/lossCards",//请求的url地址    			   
										dataType : "json", //返回的格式为
										data : {
											"sno" : sno,
										},
										timeout : 7000,
										type : "GET",//请求的方式
										success : function(req) {
											if (req.code == 0) {
												alert(req.msg);
												window.location.href = "${pageContext.request.contextPath}/card/loss";
											}
											if (req.code == 1) {
												alert(req.msg);
												//window.location.href = "${pageContext.request.contextPath}/card/loss";
											}
											if (req.code == 3) {
												alert(req.msg);
												//window.location.href = "${pageContext.request.contextPath}/card/loss";
											}
										},//请求成功的处理
										error : function() {
											alert("服务器超时!");
										}//请求出错的处理
									});
						})
	</script>
</body>

</html>