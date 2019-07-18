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
body {
	
}

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
			<h3 class="panel-title">文件上传</h3>
		</div>
		<hr>
		<form class="form-horizontal uploadForm" id="uploadForm"
			enctype="multipart/form-data">
			<fieldset>
				<!--<div id="legend" class="">
							<legend class="">文件上传</legend>
						</div>-->

				<div class="control-group">
					<label class="control-label">选择需要的文件</label>

					<!-- File Upload -->
					<div class="controls">
						<input class="input-file" name="file" id="fileInput" type="file">
					</div>
				</div>
				<br>
				<div class="control-group">
					<!--<label class="control-label">Button</label>-->

					<!-- Button -->
					<div class="controls">
						<button class="btn btn-success" onclick="doUpload()">上传</button>
					</div>
				</div>

			</fieldset>
		</form>

	</div>


	<script src="${ctxStatic}/js/admin/jquery-1.11.3.min.js"></script>
	<script src="${ctxStatic}/js/admin/bootstrap.min.js"></script>
	<script type="text/javascript">
		function doUpload() {
			var formData = new FormData($("#uploadForm")[0]);
			formData.append("CODE", "123456"); //自定义参数传递
			$.ajax({
				url : "${pageContext.request.contextPath}/index/upload",
				type : 'POST',
				data : formData,
				async : false,
				cache : false,
				contentType : false,
				processData : false,
				success : function(data) {
					if (data.code == 200) {
						alert(data.msg);
						location.reload();
					} else {
						alert(data.msg);
						location.reload();
					}
				},
				error : function(data) {
					alert(data);
				}
			});
		}
	</script>
</body>

</html>