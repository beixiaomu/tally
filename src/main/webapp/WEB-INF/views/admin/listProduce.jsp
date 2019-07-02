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
			<h3 class="panel-title">产品种类列表</h3>
		</div>
		<hr>
		<div class="panel-body">
			<table class="table table-bordered">
				<caption>
					<!-- <button type="button" class="btn btn-default" onclick="add()">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
				</button> -->
					<button type="button" class="btn btn-default" onclick="editOne()"
						disabled>
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>添加
					</button>
					<button type="button" class="btn btn-default" onclick="delOne()"
						>
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
					</button>
					<!-- <button type="button" class="btn btn-default">
					<span class="glyphicon glyphicon-export" aria-hidden="true"></span>导入
				</button> -->
					<!-- <button type="button" class="btn btn-default">
					<span class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
				</button> -->
					<a id="export" class="btn btn-default"
						href="${pageContext.request.contextPath}/fillinfo/export"> <span
						class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
					</a>
				</caption>
				<thead  class="th">
					<tr>
						<th><input type="checkbox" lay-skin="primary"
							lay-filter="allChoose" name="" title=""></th>
						<th>名称</th>
						<th>产品大类</th>
						<th>成本</th>
						<th>备注</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pList }" var="c">
						<tr>
							<td><input type="checkbox" lay-skin="primary"
								lay-filter="itemChoose" name="" title=""></td>
							<td>${c.productName }</td>
							<%-- <td><c:if test="${c.facilityno == 1}">餐厅</c:if> <c:if
									test="${c.facilityno == 2}">水控</c:if> <c:if
									test="${c.facilityno == 3}">门禁</c:if></td> --%>

							<td>${c.productType }</td>
							<td>${c.productCost }</td>
							<td>${c.remark }</td>

							
							<td>
								<button class="btn bg-primary" onclick="edit(${c.id })"
									data-toggle="modal" data-target="#studentModal"
									data-whatever="编辑" disabled>编辑</button>
								<button class="btn btn-danger" onclick="del(${c.id })"
									disabled>删除</button>
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
		 * 编辑的事件处理
		 * @param id
		 */
		function edit(id) {
			isUpdate = true;
			$
					.ajax({
						url : "${pageContext.request.contextPath}/info/student/expense/select/"
								+ id,
						type : "GET",
						dataType : "json",
						success : function(r) {
							if (r.status == 200) {
								$("#name").val(r.data.sname);
								$("#hideenId").val(r.data.sid);
								$("#age-text").val(r.data.sage);
								$("#major-text").val(r.data.ssex);
							} else {
								alert("加载数据错误");
							}
						},
						error : function(data) {
							alert(data.msg);
						}
					});
		}

		function saveOrUpdate() {
			var url = "${pageContext.request.contextPath}/slotcard/add";
			if (isUpdate) {
				url = "${pageContext.request.contextPath}/slotcard/update/"
						+ $("#hideenId").val();
			}
			$.ajax({
				url : url,
				type : "POST",
				dataType : "json",
				data : {
					sname : $("#name").val(),
					sage : $("#age-text").val(),
					sdept : $("#major-text").val(),
				},
				success : function(r) {
					if (r.status == 200) {
						location.reload()
					}
					if (r.status == 500) {
						alert("新增成功");
					}
				}
			});
		}

		/**
		 * 删除
		 * @param id
		 */
		function del(id) {
			$
					.ajax({
						url : "${pageContext.request.contextPath}/info/student/expense/delete/"
								+ id,
						type : "GET",
						dataType : "json",
						success : function(data) {
							if (data.status == 200) {
								location.reload()
							} else {
								alert(data.msg);
							}
						},
						error : function(data) {
							alert("删除失败");
						}
					})
		}

		/**
		 * 添加
		 **/
		function add() {
			isUpdate = false;
		}

		/**
		 * 编辑一个
		 */
		function editOne() {
			var tdIds = $("[name='btSelectItem']:checked").parent().next();
			if (tdIds.length > 1 || tdIds.length == 0) {
				alert("只能选择一条数据进行修改");
				return;
			}
			edit(tdIds[0].innerText);
			$("#studentModal").modal();

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
		function importStudent() {
			$("#importForm").submit();
		}
	</script>
</body>

</html>