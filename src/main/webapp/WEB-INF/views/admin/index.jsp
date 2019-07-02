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
<meta name="renderer" content="webkit">
<link rel="icon" href="${ctxStatic}/img/admin/11.jpg">
<title>蒜网天下</title>
<!-- Bootstrap core CSS -->
<link href="${ctxStatic}/css/admin/bootstrap.min.css" rel="stylesheet">
<link href="${ctxStatic}/css/admin/dashboard.css" rel="stylesheet">

<style>
.left {
	padding-top: 10px;
	background: #FFFAF0;
}

.content {
	height: 870px;
}


</style>
</head>

<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<!-- The mobile navbar-toggle button can be safely removed since you do not need it in a non-responsive implementation -->
				<a class="navbar-brand" href="#">贝小木</a>
			</div>
			<!-- Note that the .navbar-collapse and .collapse classes have been removed from the #navbar -->
			<div id="navbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">首页</a></li>
					<li><a href="#about">关于</a></li>
					<li><a href="#contact">Contact</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">下拉 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">活动</a></li>
							<li><a href="#">另一个活动</a></li>
							<li><a href="#">其他的</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">头</li>
							<li><a href="#">换线</a></li>
							<li><a href="#">另外一条线</a></li>
						</ul></li>
				</ul>
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="搜索">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">最新消息</a></li>
					<li><a href="#">个人中心</a></li>
					<li><a href="#">退出</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
	<div class="container left">

		<div class="row">
			<div class="col-md-3">
				<div class="panel-group">

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="#one" data-toggle="collapse" data-parent="#accordion">个人中心</a>
							</h4>
						</div>
						<div id="one" class="panel-collapse collapse">
							<div class="panel-body">
								<a href="${ctx}/index/fileUpload" target="right">详细信息</a>
							</div>
							<div class="panel-body">

								<a href="${ctx}/index/center" target="right">个人资料</a>
							</div>
							<div class="panel-body">
								<a href="${ctx}/index/personalCenter" target="right">修改密码</a>
							</div>

						</div>

					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title"></h4>
							<a href="#two" data-toggle="collapse" data-parent="#accordion">问题管理</a>
						</div>
						<div id="two" class="panel-collapse collapse">
							<div class="panel-body">添加问题</div>
							<div class="panel-body">问题列表</div>
							<div class="panel-body">问题树</div>
							<div class="panel-body">报告</div>
						</div>

					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title"></h4>
							<a href="#three" data-toggle="collapse" data-parent="#accordion">文件管理</a>
						</div>
						<div id="three" class="panel-collapse collapse">
							<div class="panel-body">文件上传</div>
							<div class="panel-body">文件下载</div>
							<div class="panel-body">内容类别</div>
						</div>

					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title"></h4>
							<a href="#four" data-toggle="collapse" data-parent="#accordion">入库管理</a>
						</div>
						<div id="four" class="panel-collapse collapse">
							<div class="panel-body">库存清单</div>
							<div class="panel-body">
								<a href="${ctx}/index/inStorage" target="right">入库</a>
							</div>
							<div class="panel-body">统计分析</div>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title"></h4>
							<a href="#five" data-toggle="collapse" data-parent="#accordion">出库管理</a>
						</div>
						<div id="five" class="panel-collapse collapse">
							<div class="panel-body">货物出库</div>
							<div class="panel-body">文件下载</div>
							<div class="panel-body">内容类别</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title"></h4>
							<a href="#six" data-toggle="collapse" data-parent="#accordion">价格预算</a>
						</div>
						<div id="six" class="panel-collapse collapse">
							<div class="panel-body">预估价格</div>
							<div class="panel-body">文件下载</div>
							<div class="panel-body">内容类别</div>
						</div>


					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title"></h4>
							<a href="#seven" data-toggle="collapse" data-parent="#accordion">产品管理</a>
						</div>
						<div id="seven" class="panel-collapse collapse">
							<div class="panel-body">
							<a href="${ctx}/produce/findList" target="right">产品列表</a>
							</div>
							<div class="panel-body">
							<a href="${ctx}/produce/addProduceUI" target="right">添加产品</a>
							</div>
							<div class="panel-body">类别列表</div>
							<div class="panel-body">添加类别</div>
						</div>


					</div>
				</div>
			</div>
			<div class="col-md-9 content">
				<iframe name="right" src="${ctx}/index/welcome" width='100%'
					height='100%' frameborder='0'>
				</iframe>

			</div>
		</div>
	</div>
	<footer class="footer"> </footer>
	<!-- Bootstrap core JavaScript================================================== -->
	<script src="${ctxStatic}/js/admin/jquery-1.11.3.min.js"></script>
	<script src="${ctxStatic}/js/admin/bootstrap.min.js"></script>

	<!--<script src="../../assets/js/vendor/holder.min.js"></script>-->
	<!-- <script src="../js/ie10-viewport-bug-workaround.js"></script>-->
</body>
</html>