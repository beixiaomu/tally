<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link
	href="${pageContext.request.contextPath}/static/css/bootstrap/layoutit.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/css/bootstrap/bootstrap-combined.min.css"
	rel="stylesheet">

<link
	href="${pageContext.request.contextPath}/static/css/bootstrap/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/css/bootstrap/bootstrap.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/css/bootstrap/bootstrap-table.css"
	rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<div class="navbar">
					<div class="navbar-inner">
						<div class="container-fluid">
							<a data-target=".navbar-responsive-collapse"
								data-toggle="collapse" class="btn btn-navbar"><span
								class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span></a> <a href="#" class="brand">网站名</a>
							<div class="nav-collapse collapse navbar-responsive-collapse">
								<ul class="nav">
									<li class="active"><a href="#">主页</a></li>
									<li><a href="#">链接</a></li>
									<li><a href="#">链接</a></li>
									<li class="dropdown"><a data-toggle="dropdown"
										class="dropdown-toggle" href="#">下拉菜单<strong class="caret"></strong></a>
										<ul class="dropdown-menu">
											<li><a href="#">下拉导航1</a></li>
											<li><a href="#">下拉导航2</a></li>
											<li><a href="#">其他</a></li>
											<li class="divider"></li>
											<li class="nav-header">标签</li>
											<li><a href="#">链接1</a></li>
											<li><a href="#">链接2</a></li>
										</ul></li>
								</ul>
								<ul class="nav pull-right">
									<li><a href="#">右边链接</a></li>
									<li class="divider-vertical"></li>
									<li class="dropdown"><a data-toggle="dropdown"
										class="dropdown-toggle" href="#">下拉菜单<strong class="caret"></strong></a>
										<ul class="dropdown-menu">
											<li><a href="#">下拉导航1</a></li>
											<li><a href="#">下拉导航2</a></li>
											<li><a href="#">其他</a></li>
											<li class="divider"></li>
											<li><a href="#">链接3</a></li>
										</ul></li>
								</ul>
							</div>

						</div>
					</div>

				</div>
				<div class="carousel slide" id="carousel-951441">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0"
							data-target="#carousel-951441"></li>
						<li data-slide-to="1" data-target="#carousel-951441"></li>
						<li data-slide-to="2" data-target="#carousel-951441"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt=""
								src="${pageContext.request.contextPath}/static/img/shouye/5.jpg" />
							<div class="carousel-caption">
								<h4>棒球</h4>
								<p>棒球运动是一种以棒打球为主要特点，集体性、对抗性很强的球类运动项目，在美国、日本尤为盛行。</p>
							</div>
						</div>
						<div class="item">
							<img alt=""
								src="${pageContext.request.contextPath}/static/img/shouye/6.jpg" />
							<div class="carousel-caption">
								<h4>冲浪</h4>
								<p>
									冲浪是以海浪为动力，利用自身的高超技巧和平衡能力，搏击海浪的一项运动。运动员站立在冲浪板上，或利用腹板、跪板、充气的橡皮垫、划艇、皮艇等驾驭海浪的一项水上运动。
								</p>
							</div>
						</div>
						<div class="item">
							<img alt=""
								src="${pageContext.request.contextPath}/static/img/shouye/7.jpg" />
							<div class="carousel-caption">
								<h4>自行车</h4>
								<p>
									以自行车为工具比赛骑行速度的体育运动。1896年第一届奥林匹克运动会上被列为正式比赛项目。环法赛为最著名的世界自行车锦标赛。
								</p>
							</div>
						</div>
					</div>
					<a data-slide="prev" href="#carousel-951441"
						class="left carousel-control">‹</a> <a data-slide="next"
						href="#carousel-951441" class="right carousel-control">›</a>
				</div>
				<div>
				<ul class="nav nav-list">
					<li class="nav-header">列表标题</li>
					<li class="active"><a href="#">首页</a></li>
					<li><a href="#">库</a></li>
					<li><a href="#">应用</a></li>
					<li class="nav-header">功能列表</li>
					<li><a href="#">资料</a></li>
					<li><a href="#">设置</a></li>
					<li class="divider"></li>
					<li><a href="#">帮助</a></li>
				</ul>
				</div>
				<div class="btn-group">
					<button class="btn">Action</button>
					<button data-toggle="dropdown" class="btn dropdown-toggle">
						<span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="#">操作</a></li>
						<li><a href="#">设置栏目</a></li>
						<li><a href="#">更多设置</a></li>
						<li class="divider"></li>
						<li class="dropdown-submenu"><a tabindex="-1" href="#">更多选项</a>
							<ul class="dropdown-menu">
								<li><a href="#">操作</a></li>
								<li><a href="#">设置栏目</a></li>
								<li><a href="#">更多设置</a></li>
							</ul></li>
					</ul>
				</div>
				<div class="tabbable" id="tabs-371879">
					<ul class="nav nav-tabs">
						<li class="active"><a href="#panel-16843" data-toggle="tab">第一部分</a>
						</li>
						<li><a href="#panel-548345" data-toggle="tab">第二部分</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="panel-16843">
							<p>第一部分内容.</p>
						</div>
						<div class="tab-pane" id="panel-548345">
							<p>第二部分内容.</p>
						</div>
					</div>
				</div>
				<div class="row-fluid">
					<div class="span4">
						<h2>标题</h2>
						<p>本可视化布局程序在HTML5浏览器上运行更加完美, 能实现自动本地化保存, 即使关闭了网页,
							下一次打开仍然能恢复上一次的操作.</p>
						<p>
							<a class="btn" href="#">查看更多 »</a>
						</p>
					</div>
					<div class="span4">
						<div class="tabbable" id="tabs-859501">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#panel-936000"
									data-toggle="tab">第一部分</a></li>
								<li><a href="#panel-452704" data-toggle="tab">第二部分</a></li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="panel-936000">
									<p>第一部分内容.</p>
								</div>
								<div class="tab-pane" id="panel-452704">
									<p>第二部分内容.</p>
								</div>
							</div>
						</div>
					</div>
					<div class="span4">
						<table class="table">
							<thead>
								<tr>
									<th>编号</th>
									<th>产品</th>
									<th>交付时间</th>
									<th>状态</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>TB - Monthly</td>
									<td>01/04/2012</td>
									<td>Default</td>
								</tr>
								<tr class="success">
									<td>1</td>
									<td>TB - Monthly</td>
									<td>01/04/2012</td>
									<td>Approved</td>
								</tr>
								<tr class="error">
									<td>2</td>
									<td>TB - Monthly</td>
									<td>02/04/2012</td>
									<td>Declined</td>
								</tr>
								<tr class="warning">
									<td>3</td>
									<td>TB - Monthly</td>
									<td>03/04/2012</td>
									<td>Pending</td>
								</tr>
								<tr class="info">
									<td>4</td>
									<td>TB - Monthly</td>
									<td>04/04/2012</td>
									<td>Call in to confirm</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<table class="table">
					<thead>
						<tr>
							<th>编号</th>
							<th>产品</th>
							<th>交付时间</th>
							<th>状态</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>TB - Monthly</td>
							<td>01/04/2012</td>
							<td>Default</td>
						</tr>
						<tr class="success">
							<td>1</td>
							<td>TB - Monthly</td>
							<td>01/04/2012</td>
							<td>Approved</td>
						</tr>
						<tr class="error">
							<td>2</td>
							<td>TB - Monthly</td>
							<td>02/04/2012</td>
							<td>Declined</td>
						</tr>
						<tr class="warning">
							<td>3</td>
							<td>TB - Monthly</td>
							<td>03/04/2012</td>
							<td>Pending</td>
						</tr>
						<tr class="info">
							<td>4</td>
							<td>TB - Monthly</td>
							<td>04/04/2012</td>
							<td>Call in to confirm</td>
						</tr>
					</tbody>
				</table>
				<form>
					<fieldset>
						<legend>表单项</legend>
						<label>表签名</label><input type="text" /> <span class="help-block">这里填写帮助信息.</span>
						<label class="checkbox"><input type="checkbox" /> 勾选同意</label>
						<button type="submit" class="btn">提交</button>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/static/js/jquery/jquery-2.1.4.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap.min.js"></script>
	<%-- <script src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap-table.min.js"></script> --%>
	<script
		src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap-table-zh-CN.min.js"></script>
</body>
</html>