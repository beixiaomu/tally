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
			<h3 class="panel-title">入库</h3>
		</div>
		<hr>
		<div class="panel-body">
			<!--父元素添加form-horizontal类-->
			<form class="form-horizontal" role="form" action="${ctx}/store/save"
				method="POST">
				<div class="form-group">
					<label for="productId" class="col-sm-2 control-label">名称：</label>
					<div class="col-sm-3">
						<select id="productId" class="form-control">
							<c:forEach items="${proList }" var="c">
									<option value="${c.id }">${c.productName }</option>
								</c:forEach>
						</select>
					</div>
				</div>
				<div class="form-group">

					<!--向标签添加 class .control-label。-->
					<label for="storePhone" class="col-sm-2 control-label">手机号：</label>

					<!--控制表单的宽度-->
					<div class="col-sm-3">

						<input type="text" class="form-control" id="storePhone"
							value="${ store.storePhone}" placeholder="请输入手机号">
					</div>
				</div>

				<div class="form-group">

					<!--向标签添加 class .control-label。-->
					<label for="storeName" class="col-sm-2 control-label">姓名：</label>

					<!--控制表单的宽度-->
					<div class="col-sm-3">

						<input type="text" class="form-control" id="storeName"
							value="${ store.storeName}" placeholder="请输入姓名">
					</div>
				</div>
				<div class="form-group">

					<!--向标签添加 class .control-label。-->
					<label for="storeNumber" class="col-sm-2 control-label">数量：</label>

					<!--控制表单的宽度-->
					<div class="col-sm-3">

						<input type="text" class="form-control" id="storeNumber"
							value="${ store.storeNumber}" placeholder="请输入数量">
					</div>
				</div>

				<div class="form-group">
					<label for="storeQulity" class="col-sm-2 control-label">大类：</label>
					<div class="col-sm-3">
						<select id="storeQulity" class="form-control">
							<option value="1">大混级</option>
							<option value="2">中混级</option>
							<option value="3">一般混级</option>
							<option value="4">蒜米料</option>
						</select>
						<!-- <input type="text" class="form-control" id="productType" placeholder="请输入产品类别"> -->
					</div>
				</div>

				<div class="form-group">

					<!--向标签添加 class .control-label。-->
					<label for="storePrice" class="col-sm-2 control-label">单价：</label>

					<!--控制表单的宽度-->
					<div class="col-sm-3">

						<input type="text" class="form-control" id="storePrice"
							value="${ store.storePrice}" placeholder="请输入单价">
					</div>
				</div>
				<div class="form-group">

					<!--向标签添加 class .control-label。-->
					<label for="storeCount" class="col-sm-2 control-label">总计：</label>

					<!--控制表单的宽度-->
					<div class="col-sm-3">

						<input type="text" class="form-control" id="storeCount"
							value="${ store.storeCount}" placeholder="请输入总计">
					</div>
				</div>
				<div class="form-group">

					<!--向标签添加 class .control-label。-->
					<label for="storeFrorto" class="col-sm-2 control-label">供货方：</label>

					<!--控制表单的宽度-->
					<div class="col-sm-3">

						<input type="text" class="form-control" id="storeFrorto"
							value="${ store.storeFrorto}" placeholder="请输入供货方">
					</div>
				</div>
				<!-- <div class="form-group">
					<label for="createDate" class="col-sm-2 control-label">入库时间：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="createDate" onclick="WdatePicker({skin:'whyGreen'})"
							placeholder="请选择时间">
					</div>
				</div> -->

				<div class="form-group">
					<label for="remark" class="col-sm-2 control-label">备注：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="remark"
							value="${ store.remark}" placeholder="请输入备注"> <input
							type="hidden" value="${ store.id}" class="form-control" id="id">
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
	<script src="${ctxStatic}/js/datepicker/WdatePicker.js"></script>
	<script>
		function save() {
			var url = "${pageContext.request.contextPath}/store/save";

			$.ajax({
				url : url,
				type : "POST",
				dataType : "json",
				data : {
					productId : $("#productId").val(),
					storePhone : $("#storePhone").val(),
					storeName : $("#storeName").val(),
					storeNumber : $("#storeNumber").val(),
					storeQulity : $("#storeQulity").val(),
					storePrice : $("#storePrice").val(),
					storeCount : $("#storeCount").val(),
					storeFrorto : $("#storeFrorto").val(),
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