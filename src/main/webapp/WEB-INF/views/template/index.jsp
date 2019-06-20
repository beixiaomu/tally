<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>校园一卡通管理平台</title>
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
		<!-- partial:partials/_navbar.html -->
		<nav
			class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
		<div
			class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
			<a class="navbar-brand brand-logo"
				href="${pageContext.request.contextPath }/index/index"><img
				src="${pageContext.request.contextPath}/static/template/images/logo.svg"
				alt="logo" /></a> <a class="navbar-brand brand-logo-mini"
				href="${pageContext.request.contextPath }/index/index"><img
				src="${pageContext.request.contextPath}/static/template/images/logo-mini.svg"
				alt="logo" /></a>
		</div>
		<div class="navbar-menu-wrapper d-flex align-items-stretch">
			<div class="search-field d-none d-md-block">
				<form class="d-flex align-items-center h-100" action="#">
					<div class="input-group">
						<div class="input-group-prepend bg-transparent">
							<i class="input-group-text border-0 mdi mdi-magnify"></i>
						</div>
						<input type="text" class="form-control bg-transparent border-0"
							placeholder="搜索...">
					</div>
				</form>
			</div>
			<ul class="navbar-nav navbar-nav-right">
				<li class="nav-item nav-profile dropdown"><a
					class="nav-link dropdown-toggle" id="profileDropdown"
					href="${pageContext.request.contextPath}/static/template/#"
					data-toggle="dropdown" aria-expanded="false">
						<div class="nav-profile-img">
							<img
								src="${pageContext.request.contextPath}/static/template/images/faces/face1.jpg"
								alt="image"> <span class="availability-status online"></span>
						</div>
						<div class="nav-profile-text">
							<p class="mb-1 text-black">${user.name }</p>
						</div>
				</a>
					<div class="dropdown-menu navbar-dropdown"
						aria-labelledby="profileDropdown">
						<a class="dropdown-item"
							href="${pageContext.request.contextPath}/static/template/#">
							<i class="mdi mdi-cached mr-2 text-success"></i> 活动日志
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" id="exit"> <i clas
							s="mdi mdi-logout mr-2 text-primary"></i> 退出
						</a>
					</div></li>
				<li class="nav-item d-none d-lg-block full-screen-link"><a
					class="nav-link"> <i class="mdi mdi-fullscreen"
						id="fullscreen-button"></i>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link count-indicator dropdown-toggle"
					id="messageDropdown"
					href="${pageContext.request.contextPath}/static/template/#"
					data-toggle="dropdown" aria-expanded="false"> <i
						class="mdi mdi-email-outline"></i> <span
						class="count-symbol bg-warning"></span>
				</a>
					<div
						class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list"
						aria-labelledby="messageDropdown">
						<h6 class="p-3 mb-0">消息</h6>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item preview-item">
							<div class="preview-thumbnail">
								<img
									src="${pageContext.request.contextPath}/static/template/images/faces/face4.jpg"
									alt="image" class="profile-pic">
							</div>
							<div
								class="preview-item-content d-flex align-items-start flex-column justify-content-center">
								<h6 class="preview-subject ellipsis mb-1 font-weight-normal">马克给你发来了一条消息</h6>
								<p class="text-gray mb-0">一分钟前</p>
							</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item preview-item">
							<div class="preview-thumbnail">
								<img
									src="${pageContext.request.contextPath}/static/template/images/faces/face2.jpg"
									alt="image" class="profile-pic">
							</div>
							<div
								class="preview-item-content d-flex align-items-start flex-column justify-content-center">
								<h6 class="preview-subject ellipsis mb-1 font-weight-normal">Cregh
									send you a message</h6>
								<p class="text-gray mb-0">15 Minutes ago</p>
							</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item preview-item">
							<div class="preview-thumbnail">
								<img
									src="${pageContext.request.contextPath}/static/template/images/faces/face3.jpg"
									alt="image" class="profile-pic">
							</div>
							<div
								class="preview-item-content d-flex align-items-start flex-column justify-content-center">
								<h6 class="preview-subject ellipsis mb-1 font-weight-normal">Profile
									picture updated</h6>
								<p class="text-gray mb-0">18 Minutes ago</p>
							</div>
						</a>
						<div class="dropdown-divider"></div>
						<h6 class="p-3 mb-0 text-center">4 条新消息</h6>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link count-indicator dropdown-toggle"
					id="notificationDropdown"
					href="${pageContext.request.contextPath}/static/template/#"
					data-toggle="dropdown"> <i class="mdi mdi-bell-outline"></i> <span
						class="count-symbol bg-danger"></span>
				</a>
					<div
						class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list"
						aria-labelledby="notificationDropdown">
						<h6 class="p-3 mb-0">Notifications</h6>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item preview-item">
							<div class="preview-thumbnail">
								<div class="preview-icon bg-success">
									<i class="mdi mdi-calendar"></i>
								</div>
							</div>
							<div
								class="preview-item-content d-flex align-items-start flex-column justify-content-center">
								<h6 class="preview-subject font-weight-normal mb-1">Event
									today</h6>
								<p class="text-gray ellipsis mb-0">Just a reminder that you
									have an event today</p>
							</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item preview-item">
							<div class="preview-thumbnail">
								<div class="preview-icon bg-warning">
									<i class="mdi mdi-settings"></i>
								</div>
							</div>
							<div
								class="preview-item-content d-flex align-items-start flex-column justify-content-center">
								<h6 class="preview-subject font-weight-normal mb-1">Settings</h6>
								<p class="text-gray ellipsis mb-0">Update dashboard</p>
							</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item preview-item">
							<div class="preview-thumbnail">
								<div class="preview-icon bg-info">
									<i class="mdi mdi-link-variant"></i>
								</div>
							</div>
							<div
								class="preview-item-content d-flex align-items-start flex-column justify-content-center">
								<h6 class="preview-subject font-weight-normal mb-1">Launch
									Admin</h6>
								<p class="text-gray ellipsis mb-0">New admin wow!</p>
							</div>
						</a>
						<div class="dropdown-divider"></div>
						<h6 class="p-3 mb-0 text-center">See all notifications</h6>
					</div></li>
				<li class="nav-item nav-logout d-none d-lg-block"><a
					style="cursor: pointer" class="nav-link" id="exit"
					onclick="exit();"> <i class="mdi mdi-power"></i>
				</a></li>
				<li class="nav-item nav-settings d-none d-lg-block"><a
					class="nav-link"
					href="${pageContext.request.contextPath}/static/template/#"> <i
						class="mdi mdi-format-line-spacing"></i>
				</a></li>
			</ul>
			<button
				class="navbar-toggler navbar-toggler-right d-lg-none align-self-center"
				type="button" data-toggle="offcanvas">
				<span class="mdi mdi-menu"></span>
			</button>
		</div>
		</nav>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->
			<nav class="sidebar sidebar-offcanvas" id="sidebar">
			<ul class="nav">
				<li class="nav-item nav-profile"><a
					href="${pageContext.request.contextPath}/index/index"
					class="nav-link">
						<div class="nav-profile-image">
							<img
								src="${pageContext.request.contextPath}/static/template/images/faces/face1.jpg"
								alt="profile"> <span class="login-status online"></span>
							<!--change to offline or busy as needed-->
						</div>
						<div class="nav-profile-text d-flex flex-column">
							<span class="font-weight-bold mb-2">${user.name }</span> <span
								class="text-secondary text-small">${user.job }</span>
						</div> <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i>
				</a></li>
				<!-- 导航栏menu -->
				<li class="nav-item"><a class="nav-link" target="right"
					href="${pageContext.request.contextPath }/index/welcome"> <span
						class="menu-title">主页</span> <i class="mdi mdi-home menu-icon"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link" target="right"
					href="${pageContext.request.contextPath}/info/student/expenseList">
						<span class="menu-title">消费记录</span> <i
						class="mdi mdi-crosshairs-gps menu-icon"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link" target="right"
					href="${pageContext.request.contextPath}/info/student/rechargeList">
						<span class="menu-title">充值记录</span><i
						class="mdi mdi-contacts menu-icon"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/card/cardList"
					target="right"> <span class="menu-title">门禁记录</span> <i
						class="mdi mdi-chart-bar menu-icon"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link" target="right"
					href="${pageContext.request.contextPath}/info/student/status">
						<span class="menu-title">卡状态</span> <i
						class="mdi mdi-medical-bag menu-icon"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link" target="right"
					href="${pageContext.request.contextPath}/index/centerPatriarch">
						<span class="menu-title">个人详情</span> <i
						class="mdi mdi-format-list-bulleted menu-icon"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link" target="right"
					href="${pageContext.request.contextPath}/index/charts"> <span
						class="menu-title">统计</span> <i
						class="mdi mdi-table-large menu-icon"></i>
				</a></li>
				<li class="nav-item sidebar-actions"><span class="nav-link">
						<div class="border-bottom">
							<h6 class="font-weight-normal mb-3">项目</h6>
						</div>
				</span></li>
			</ul>
			</nav>

			<!-- partial -->
			<div class="main-panel">
				<!--内容主体区域 -->
				<iframe name="right"
					src="${pageContext.request.contextPath }/index/welcome"
					width='100%' height='100%' frameborder='0'></iframe>

				<!-- partial:partials/_footer.html -->
				<footer class="footer">
				<div
					class="d-sm-flex justify-content-center justify-content-sm-between">
					<span
						class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright
						© 2017 <a
						href="${pageContext.request.contextPath}/static/template/"
						target="_blank">BootstrapDash</a>. All rights reserved.
					</span> <span
						class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted
						& made with <i class="mdi mdi-heart text-danger"></i> - More
						Details <a
						href="${pageContext.request.contextPath}/static/template/http://www.cssmoban.com/"
						target="_blank" title="众慧物联">众慧物联</a> - Collect from <a
						href="${pageContext.request.contextPath}/static/template/http://www.cssmoban.com/"
						title="众慧物联" target="_blank">众慧物联</a>
					</span>
				</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
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
	<!-- Plugin js for this page-->
	<!-- End plugin js for this page-->
	<!-- inject:js -->
	<script
		src="${pageContext.request.contextPath}/static/template/js/off-canvas.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/template/js/misc.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script
		src="${pageContext.request.contextPath}/static/template/js/dashboard.js"></script>
	<!-- End custom js for this page-->
	<script>
		function up1() {
			$(".up1").toggle();
		}
		function up2() {
			$(".up2").toggle();
		}
		function up3() {
			$(".up3").toggle();
		}
		function exit() {
			$
					.ajax({
						url : "${pageContext.request.contextPath}/index/exit",//请求的url地址    			   
						dataType : "json", //返回的格式为
						data : {},
						timeout : 7000,
						type : "GET",//请求的方式
						success : function(req) {
							if (req.code == 0) {
								alert(req.msg);
								window.location.href = "${pageContext.request.contextPath}/index/login";
							}
						},//请求成功的处理
						error : function() {
							alert("服务器超时!");
						}//请求出错的处理
					});
		}
		$("#exit")
				.click(
						function() {
							$
									.ajax({
										url : "${pageContext.request.contextPath}/index/exit",//请求的url地址    			   
										dataType : "json", //返回的格式为
										data : {},
										timeout : 7000,
										type : "GET",//请求的方式
										success : function(req) {
											if (req.code == 0) {
												alert(req.msg);
												window.location.href = "${pageContext.request.contextPath}/index/login";
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