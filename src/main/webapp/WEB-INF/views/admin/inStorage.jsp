<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html lang="zh-CN">
<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="${ctxStatic}/img/admin/11.jpg">

		<title>入库</title>

		<!-- Bootstrap core CSS -->
		<link href="${ctxStatic}/css/admin/bootstrap.min.css" rel="stylesheet">
		<link href="${ctxStatic}/css/admin/dashboard.css" rel="stylesheet">
		<style>
			body {}
			
			.index {
				text-align: center;
				font-size: 64px;
				align: center;
			}
			
			.panel-success {
				margin-top: -50px;
				border-bottom: 0px;
				background: #FFF;
			}
		</style>
	</head>

	<body>

		<div class="panel panel-success">
			<div class="panel-heading">
				<h3 class="panel-title">入库</h3>
			</div>
			<hr>
			<div class="panel-body">
				<!--父元素添加form-horizontal类-->
				<form class="form-horizontal" role="form">

					<!--标签和控件放在一个带有 class .form-group 的 <div> 中-->
					<div class="form-group">

						<!--向标签添加 class .control-label。-->
						<label for="username" class="col-sm-2 control-label">名称：</label>

						<!--控制表单的宽度-->
						<div class="col-sm-3">
							<input type="text" class="form-control" id="username" placeholder="请输入用户名">
						</div>
					</div>

					<div class="form-group">
						<label for="password" class="col-sm-2 control-label">数量：</label>
						<div class="col-sm-3">
							<input type="password" class="form-control" id="password" placeholder="请输入密码">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">录入</button>
						</div>
					</div>
				</form>

			</div>
		</div>

		<script src="${ctxStatic}/js/admin/jquery-1.11.3.min.js"></script>
		<script src="${ctxStatic}/js/admin/bootstrap.min.js"></script>
	</body>

</html>