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

		<title>个人中心</title>

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
				<h3 class="panel-title">个人信息</h3>
			</div>
			<hr>
			<div class="panel-body">

				<form role="form">
					<div class="form-group">
						<label for="name">名称</label>
						<input type="text" class="form-control" id="name" placeholder="请输入名称">
					</div>

					<div class="form-group">
						<label for="inputfile">文件输入</label>
						<input type="file" id="inputfifle">
						<p class="help-block">这是块级帮助文本的实例</p>
					</div>

					<div class="checkbox">
						<label>
            <input type="checkbox">请打钩      
        </label>
    </div>

    <button type="submit" class="btn btn-default">提交</button>
</form>

<form role="form" class="form-horizontal">
    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label">名字</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="firstname" placeholder="请输入名字">
						</div>
					</div>

					<div class="form-group">
						<label for="lastname" class="col-sm-2 control-label">姓</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="lastname" placeholder="请输入姓">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label>
                    <input type="checkbox">请记住我
                </label>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">提交</button>
						</div>
					</div>
				</form>
				<form class="form-horizontal" role="form">
					<fieldset>
						<legend>配置数据源</legend>
						<div class="form-group">
							<label class="col-sm-2 control-label" for="ds_host">主机名</label>
							<div class="col-sm-4">
								<input class="form-control" id="ds_host" type="text" placeholder="192.168.1.161" />
							</div>
							<label class="col-sm-2 control-label" for="ds_name">数据库名</label>
							<div class="col-sm-4">
								<input class="form-control" id="ds_name" type="text" placeholder="msh" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label" for="ds_username">用户名</label>
							<div class="col-sm-4">
								<input class="form-control" id="ds_username" type="text" placeholder="root" />
							</div>
							<label class="col-sm-2 control-label" for="ds_password">密码</label>
							<div class="col-sm-4">
								<input class="form-control" id="ds_password" type="password" placeholder="123456" />
							</div>
						</div>
					</fieldset>
					<fieldset>
						<legend>选择相关表</legend>
						<div class="form-group">
							<label for="disabledSelect" class="col-sm-2 control-label">表名</label>
							<div class="col-sm-10">
								<select id="disabledSelect" class="form-control">
									<option>禁止选择</option>
									<option>禁止选择</option>
								</select>
							</div>
						</div>
					</fieldset>

					<fieldset>
						<legend>字段名</legend>
						<div class="form-group">
							<label for="disabledSelect" class="col-sm-2 control-label">表名</label>
							<div class="col-sm-10">
								<select id="disabledSelect" class="form-control">
									<option>禁止选择</option>
									<option>禁止选择</option>
								</select>
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>

		<script src="${ctxStatic}/js/admin/jquery-1.11.3.min.js"></script>
		<script src="${ctxStatic}/js/admin/bootstrap.min.js"></script>
	</body>

</html>