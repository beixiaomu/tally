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

<title>商品种类</title>

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
			<h3 class="panel-title">种类添加</h3>
		</div>
		<hr>
		<div class="panel-body">
			<!--父元素添加form-horizontal类-->
			<form class="form-horizontal" role="form"
				action="${ctx}/produce/save" method="POST">

				<!--标签和控件放在一个带有 class .form-group 的 <div> 中-->
				<div class="form-group">

					<!--向标签添加 class .control-label。-->
					<label for="productName" class="col-sm-2 control-label">产品名称：</label>

					<!--控制表单的宽度-->
					<div class="col-sm-3">

						<input type="text" class="form-control" id="productName"
							value="${ produce.productName}" placeholder="请输入产品名称">
					</div>
				</div>

				<div class="form-group">
					<label for="productType" class="col-sm-2 control-label">类别：</label>
					<div class="col-sm-3">
						<select id="productType" class="form-control">
							<option value="1001">蔬菜</option>
							<option value="1002">水果</option>
							<option value="1003">肉制品</option>
						</select>
						<!-- <input type="text" class="form-control" id="productType" placeholder="请输入产品类别"> -->
					</div>
				</div>

				<div class="form-group">
					<label for="productCost" class="col-sm-2 control-label">成本：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="productCost"
							value="${ produce.productCost}" placeholder="请输入成本">
					</div>
				</div>

				<div class="form-group">
					<label for="remark" class="col-sm-2 control-label">备注：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="remark"
							value="${ produce.remark}" placeholder="请输入备注"> <input
							type="hidden" class="form-control" id="id" value="${ produce.id}">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="button" class="btn btn-default" onclick="save()">添加</button>
						<button type="button" class="btn btn-default" onclick="back()">返回上一页</button>
					</div>
				</div>
			</form>

		</div>
	</div>

	<script src="${ctxStatic}/js/admin/jquery-1.11.3.min.js"></script>
	<script src="${ctxStatic}/js/admin/bootstrap.min.js"></script>
	<script>
		/**
		 * 编辑的事件处理
		 * @param id
		 */
		function save() {
			var url = "${pageContext.request.contextPath}/produce/save";

			$.ajax({
				url : url,
				type : "POST",
				dataType : "json",
				data : {
					productName : $("#productName").val(),
					productType : $("#productType").val(),
					productCost : $("#productCost").val(),
					remark : $("#remark").val(),
					id : $("#id").val(),
				},
				success : function(r) {
					if (r.code == 200) {
						alert(r.msg);
						location.reload();
					}
					if (r.code == 400) {
						alert(r.msg);
						location.reload();
					}
				}
			});
		}
		function back() {
			window.history.back(-1);
		}
	</script>
</body>

</html>