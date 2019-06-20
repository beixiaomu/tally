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
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">开卡</h4>
				<!-- <p class="card-description">Horizontal form layout</p> -->
				<form class="forms-sample">
					<div class="form-group row">
						<label for="exampleInputUsername2" class="col-sm-3 col-form-label">学号</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="studentId"
								name="studentId" placeholder="请输入学号">
						</div>
					</div>
					<div class="form-group row">
						<label for="exampleInputEmail2" class="col-sm-3 col-form-label">卡片类型</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="cardNo" name="cardNo"
								placeholder="卡片类型">
						</div>
					</div>
					<div class="form-group row">
						<label for="exampleInputMobile" class="col-sm-3 col-form-label">手机号</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="phone" name="phone"
								placeholder="Mobile number">
						</div>
					</div>
					<div class="form-group row">
						<label for="exampleInputPassword2" class="col-sm-3 col-form-label">密码</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="cardPwd"
								name="cardPwd" placeholder="请输入密码">
						</div>
					</div>
					<div class="form-group row">
						<label for="exampleInputConfirmPassword2"
							class="col-sm-3 col-form-label">确认密码</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="rcardPwd"
								name="rcardPwd" placeholder="确认密码">
						</div>
					</div>
					<button type="button" class="openCard"
						class="btn btn-gradient-primary mr-2">提交</button>
					<button class="btn btn-light">取消</button>


				</form>
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
		src="${pageContext.request.contextPath}/static/template/js/chart.js"></script>
	<!-- End custom js for this page-->

	<script>
		$(".openCard")
				.click(
						function() {
							var studentId = document
									.getElementById("studentId").value;
							var cardNo = document.getElementById("cardNo").value;
							var phone = document.getElementById("phone").value;
							var cardPwd = document.getElementById("cardPwd").value;
							var rcardPwd = document.getElementById("rcardPwd").value;
							console.log('studentId' + studentId + "cardNo"
									+ cardNo + "phone:" + phone + "cardPwd"
									+ cardPwd);
							//var name1 = $("#name").val();
							if (rcardPwd != cardPwd) {
								alert("两次密码输入不一致");
							} else {
								$
										.ajax({
											url : "${pageContext.request.contextPath}/card/openCards",//请求的url地址    			   
											dataType : "json", //返回的格式为
											data : {
												"studentId" : studentId,
												"cardNo" : cardNo,
												"phone" : phone,
												"cardPwd" : cardPwd,
											},
											timeout : 7000,
											type : "POST",//请求的方式
											success : function(req) {
												if (req.code == 0) {
													alert(req.msg);
													window.location.href = "${pageContext.request.contextPath}/card/openCard";
												}
												if (req.code == 1) {
													alert(req.msg);
													window.location.href = "${pageContext.request.contextPath}/card/openCard";
												}
												if (req.code == 3) {
													alert(req.msg);
													window.location.href = "${pageContext.request.contextPath}/card/openCard";
												}
											},//请求成功的处理
											error : function() {
												alert("服务器超时!");
											}//请求出错的处理
										});
							}
						})
	</script>

</body>
</html>