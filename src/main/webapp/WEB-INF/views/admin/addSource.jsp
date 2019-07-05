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

<title>来源地添加</title>

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
			<h3 class="panel-title">费用添加</h3>
		</div>
		<hr>
		<div class="panel-body">
			<!--父元素添加form-horizontal类-->
			<form class="form-horizontal" role="form" action="${ctx}/source/save"
				method="POST">
				<input type="hidden" class="form-control" id="id"
					value="${ source.id}">
				<%-- <div class="form-group">
					<label for="sourceId" class="col-sm-2 control-label">类别：</label>
					<div class="col-sm-3">
						<select id="sourceId" class="form-control">
							<c:forEach items="${tcList }" var="c">
								<option value="${c.id }">${c.typeName }</option>
							</c:forEach>
						</select>
					</div>
				</div> --%>

				<div class="form-group">
					<label for="sourceTest" class="col-sm-2 control-label">入库编号：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="sourceTest"
							value="${ source.sourceTest}" placeholder="请输入编号">
					</div>
				</div>

				<div class="form-group">
					<label for="sourceName" class="col-sm-2 control-label">姓名：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="sourceName"
							value="${ source.sourceName}" placeholder="请输入单价">
					</div>
				</div>

				<div class="form-group">
					<label for="sourcePhone" class="col-sm-2 control-label">手机号：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="sourcePhone"
							value="${ source.sourcePhone}" placeholder="请输入联系方式">
					</div>
				</div>
				<div class="form-group">
					<label for="sourceAddress" class="col-sm-2 control-label">货源地址：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="sourceAddress"
							value="${ source.sourceAddress}" placeholder="请输入货源地址">
					</div>
				</div>
				<div class="form-group">
					<label for="sourceNum" class="col-sm-2 control-label">数量：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="sourceNum"
							value="${ source.sourceNum}" placeholder="请输入数量">
					</div>
				</div>
				<div class="form-group">
					<label for="sourcePrice" class="col-sm-2 control-label">单价：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="sourcePrice"
							value="${ source.sourcePrice}" placeholder="请输入单价">
					</div>
				</div>
				<div class="form-group">
					<label for="sourceMoney" class="col-sm-2 control-label">总计：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="sourceMoney"
							value="${ source.sourceMoney}" placeholder="请输入总费用">
					</div>
				</div>
				<div class="form-group">
					<label for="remark" class="col-sm-2 control-label">备注：</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="remark"
							value="${ source.remark}" placeholder="请输入备注">
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
			var url = "${pageContext.request.contextPath}/source/save";

			$.ajax({
				url : url,
				type : "POST",
				dataType : "json",
				data : {
					sourceTest : $("#sourceTest").val(),
					sourceName : $("#sourceName").val(),
					sourcePhone : $("#sourcePhone").val(),
					sourceAddress : $("#sourceAddress").val(),
					sourceNum : $("#sourceNum").val(),
					sourceMoney : $("#sourceMoney").val(),
					sourcePrice : $("#sourcePrice").val(),
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