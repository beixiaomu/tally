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

<title>库存列表</title>

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
			<h3 class="panel-title">库存列表</h3>
		</div>
		<hr>
		<div class="panel-body">
			<table class="table table-bordered">
				<caption>
					<!-- <button type="button" class="btn btn-default" onclick="add()">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
				</button> -->
				<a type="button" class="btn btn-default" href="${ctx}/store/addStoreUI" target="right">添加</a>
					<!-- <button type="button" class="btn btn-default" onclick="editOne()"
						disabled>
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>添加
					</button> -->
					<button type="button" class="btn btn-default" onclick="delOne()">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
					</button>
					<!-- <button type="button" class="btn btn-default">
					<span class="glyphicon glyphicon-export" aria-hidden="true"></span>导入
				</button> -->
					<!-- <button type="button" class="btn btn-default">
					<span class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
				</button> -->
					<%-- <a id="export" class="btn btn-default"
						href="${pageContext.request.contextPath}/fillinfo/export"> <span
						class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
					</a> --%>
				</caption>
				<thead class="th">
					<tr>
						<th><input type="checkbox" lay-skin="primary"
							lay-filter="allChoose" name="" title=""></th>
						<th>手机号</th>
						<th>姓名</th>
						<th>数量</th>
						<th>质量等级</th>
						<th>单价</th>
						<th>总计</th>
						<th>供货方</th>
						<th>备注</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${storeList }" var="c">
						<tr>
							<td><input type="checkbox" lay-skin="primary"
								lay-filter="itemChoose" name="" title=""></td>
							
							<td>${c.storePhone }</td>
							<td>${c.storeName }</td>
							<td>${c.storeNumber }</td>
							<td>${c.storeQulity }<c:if test="${c.storeQulity == 1}">大混级</c:if>
								<c:if test="${c.storeQulity == 2}">中混级</c:if> <c:if
									test="${c.storeQulity == 3}">一般混级</c:if>
								<c:if test="${c.storeQulity == 4}">蒜米料</c:if></td>
							<td>${c.storePrice }</td>
							<td>${c.storeCount }</td>
							<td>${c.storeFrorto }</td>
							<td>${c.remark }</td>
							<%-- <td>${c.createDate }</td> --%>


							<td>
							<a type="button" class="btn bg-primary" href="${ctx}/store/addStoreUI?id=${c.id }" target="right">编辑</a>
								
								<button class="btn btn-danger" onclick="del(${c.id })" >删除</button>
								<a type="button" class="btn bg-primary" href="${ctx}/cost/addCostUI?id=${c.id }&&productId=${c.productId}" target="right">添加费用</a>
								<a type="button" class="btn bg-primary" href="${ctx}/store/analyseUI?id=${c.id }&&productId=${c.productId}" target="right">添加费用</a>
							</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>

	<script src="${ctxStatic}/js/admin/jquery-1.11.3.min.js"></script>
	<script src="${ctxStatic}/js/admin/bootstrap.min.js"></script>
	<script>

		/**
		 * 删除
		 * @param id
		 */
		function del(id) {
			$
					.ajax({
						url : "${pageContext.request.contextPath}/store/delete?id="
								+ id,
						type : "GET",
						dataType : "json",
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
							alert("删除失败");
						}
					})
		}

		/**
		 * 删除一条
		 */
		function delOne() {
			var tdIds = $("[name='btSelectItem']:checked").parent().next();
			if (tdIds.length > 1 || tdIds.length == 0) {
				alert("只能选择一条数据进行删除");
				return;
			}
			del(tdIds[0].innerText);
		}
	</script>
</body>

</html>