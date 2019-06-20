<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/static/css/bootstrap/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="content-wrapper">
		<table class="table table-bordered">
			<caption>
				<!-- <button type="button" class="btn btn-default" onclick="add()">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
				</button> -->
				<button type="button" class="btn btn-default" onclick="editOne()" disabled>
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
				</button>
				<button type="button" class="btn btn-default" onclick="delOne()" disabled>
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
			<thead>
				<tr>
					<th><input type="checkbox" lay-skin="primary"
						lay-filter="allChoose" name="" title=""></th>
					<th>流水号</th>
					<th>卡号</th>
					<th>学号</th>
					<th>姓名</th>
					<th>充值金额</th>
					<th>充值时间</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cList }" var="c">
					<tr>
						<td><input type="checkbox" lay-skin="primary"
							lay-filter="itemChoose" name="" title=""></td>
						<td>${c.fno }</td>
						<td>${c.cardno }</td>
						<td>${c.sno }</td>
						<td>${c.student.sname }</td>
						<td>${c.fmoney }</td>
						<td><fmt:formatDate value="${c.fdate}" pattern="yyyy-MM-dd HH:mm:ss" />
						</td>
						<td><c:if test="${c.state == 1}">成功</c:if> <c:if
								test="${c.state == 2}">没到账</c:if> <c:if
								test="${c.state == 3}">失败</c:if></td>
						
						<td>
							<button class="btn bg-primary" onclick="edit(${c.fno })"
								data-toggle="modal" data-target="#studentModal"
								data-whatever="编辑" disabled>编辑</button>
							<button class="btn btn-danger" onclick="del(${c.fno })" disabled>删除</button>
						</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<table id="table"></table>
	</div>
	<%--模态框--%>
	<div class="modal fade" id="studentModal" tabindex="-1" role="dialog"
		aria-labelledby="titeLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="titeLabel">卡片信息</h4>
				</div>
				<div class="modal-body">
					<form>
						<input type="hidden" class="form-control" id="hideenId">
						<div class="form-group">
							<label class="control-label" for="name">卡号：</label> <input
								type="text" class="form-control" id="cardno">
						</div>
						<div class="form-group">
							<label for="age-text" class="control-label">状态:</label> <input
								class="form-control" id="cardstate"></input>
						</div>
						<div class="form-group">
							<label for="major-text" class="control-label">余额:</label> <input
								class="form-control" id="cardmoney"></input>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="saveOrUpdate()">确定</button>
				</div>
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/static/js/jquery/jquery-2.1.4.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap-table.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap-table-zh-CN.min.js"></script>
	<script>
	/**
     * 编辑的事件处理
     * @param id
     */
    function edit(fillinfono) {
        isUpdate = true;
        $.ajax({
            url: "${pageContext.request.contextPath}/fillinfo/select/" + fillinfono,
            type: "GET",
            dataType: "json",
            success: function (r) {
                if (r.status == 200) {
                    $("#fillinfono").val(r.data.fillinfono);
                    $("#hideenId").val(r.data.cardno);
                    $("#fillinfostate").val(r.data.fillinfostate);
                    $("#fillinfomoney").val(r.data.fillinfomoney);
                } else {
                    alert("加载数据错误");
                }
            },
            error: function (data) {
                alert(data.msg);
            }
        });
    }

    function saveOrUpdate() {
        var url = "${pageContext.request.contextPath}/fillinfo/add";
        if (isUpdate) {
            url = "${pageContext.request.contextPath}/fillinfo/update/" + $("#hideenId").val();
        }
        $.ajax({
            url: url,
            type: "POST",
            dataType: "json",
            data: {
            	cardno: $("#cardno").val(),
                fillinfostate: $("#fillinfostate").val(),
                fillinfomoney: $("#fillinfomoney").val(),
            },
            success: function (r) {
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
    function del(fillinfono) {
        $.ajax({
            url: "${pageContext.request.contextPath}/fillinfo/delete/" + fillinfono,
            type: "GET",
            dataType: "json",
            success: function (data) {
                if (data.status == 200) {
                    location.reload()
                } else {
                    alert(data.msg);
                }
            },
            error: function (data) {
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