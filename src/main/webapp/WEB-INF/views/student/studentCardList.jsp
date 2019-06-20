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

	<%-- <div class="content-wrapper">
		<table class="table table-bordered">
			<caption>
				<!-- <button type="button" class="btn btn-default" onclick="add()">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
				</button> -->
				<button type="button" class="btn btn-default" onclick="editOne()"
					disabled>
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
				</button>
				<button type="button" class="btn btn-default" onclick="delOne()"
					disabled>
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
					<th>设备</th>
					<th>卡号</th>
					<th>金额</th>
					<th>时间</th>
					<th>地点</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cList }" var="c">
					<tr>
						<td><input type="checkbox" lay-skin="primary"
							lay-filter="itemChoose" name="" title=""></td>
						<td>${c.slotno }</td>
						<td><c:if test="${c.facilityno == 1}">餐厅</c:if> <c:if
								test="${c.facilityno == 2}">水控</c:if> <c:if
								test="${c.facilityno == 3}">门禁</c:if></td>

						<td>${c.cardno }</td>
						<td>${c.slotmoney }</td>

						<td><fmt:formatDate value="${c.slottime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td>${c.slotaddr }</td>
						<td><c:if test="${c.state == 1}">成功</c:if> <c:if
								test="${c.state == 2}">没到账</c:if> <c:if test="${c.state == 3}">失败</c:if></td>

						<td>
							<button class="btn bg-primary" onclick="edit(${c.slotno })"
								data-toggle="modal" data-target="#studentModal"
								data-whatever="编辑" disabled>编辑</button>
							<button class="btn btn-danger" onclick="del(${c.slotno })" disabled>删除</button>
						</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<table id="table"></table>
	</div>
	模态框
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
    function edit(slotno) {
        isUpdate = true;
        $.ajax({
            url: "${pageContext.request.contextPath}/fillinfo/select/" + slotno,
            type: "GET",
            dataType: "json",
            success: function (r) {
                if (r.status == 200) {
                    $("#slotno").val(r.data.slotno);
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
    function del(slotno) {
        $.ajax({
            url: "${pageContext.request.contextPath}/fillinfo/delete/" + slotno,
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
</body> --%>

<div class="content-wrapper">
		<div id="toolbar" class="btn-group">
        <button id="btn_add" type="button" class="btn btn-default" onclick="add()" data-toggle="modal"
                data-target="#studentModal" data-whatever="增加">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
        </button>
        <button id="btn_edit" type="button" class="btn btn-default" onclick="editOne()">
            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
        </button>
        <button id="btn_delete" type="button" class="btn btn-default" onclick="delOne()">
            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
        </button>
        <button id="import" class="btn btn-default" class="btn btn-default" data-toggle="modal"
                data-target="#importModal" data-whatever="导入">
            <span class="glyphicon glyphicon-export" aria-hidden="true"></span>导入
        </button>
        <a id="export" class="btn btn-default" href="${pageContext.request.contextPath}/slotcard/export">
            <span class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
        </a>
    </div>
    <table id="table">
    </table>
</div>

<%--模态框--%>
<div class="modal fade" id="studentModal" tabindex="-1" role="dialog" aria-labelledby="titeLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="titeLabel">学生信息</h4>
            </div>
            <div class="modal-body">
                <form>
                    <input type="hidden" class="form-control" id="hideenId">
                    <div class="form-group">
                        <label class="control-label" for="name">名字：</label>
                        <input type="text" class="form-control" id="name">
                    </div>
                    <div class="form-group">
                        <label for="age-text" class="control-label">年龄:</label>
                        <input class="form-control" id="age-text"></input>
                    </div>
                    <div class="form-group">
                        <label for="major-text" class="control-label">学科:</label>
                        <input class="form-control" id="major-text"></input>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="saveOrUpdate()">确定</button>
            </div>
        </div>
    </div>
</div>

<%--导入模态框--%>
<div class="modal fade" id="importModal" tabindex="-1" role="dialog" aria-labelledby="titeLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">导入</h4>
            </div>
            <div class="modal-body">
                <form action="/slotcard/import" method="post" id="importForm" enctype="multipart/form-data">
                    <input type="file" name="file">
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="importStudent()">确定</button>
            </div>
        </div>
    </div>
</div>
</body>
<script src="${pageContext.request.contextPath}/static/js/jquery/jquery-2.1.4.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap-table-zh-CN.min.js"></script>
<script>
    var isUpdate = true;
    $(function () {
        initTable();//初始化table

        function initTable() {
            $('#table').bootstrapTable({
                url: '${pageContext.request.contextPath}/info/student/studentCart/loadListData',
                dataType: "json",
                method: 'get',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器//设置左边按钮
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber: 1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                strictSearch: true,
                showColumns: true,                  //是否显示所有的列
                showRefresh: true,                  //是否显示刷新按钮
                minimumCountColumns: 2,             //最少允许的列数
                clickToSelect: true,                //是否启用点击选中行
                uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
                showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [
                    {
                        field: "checked",
                        checkbox: true,
                        title: "选择",
                        align: "center",
                        valign: "middle",
                    },
                    {
                        title: '学号',
                        field: 'studentId',
                        align: 'center',
                        valign: 'middle'
                    },
                    {
                        title: '卡号',
                        field: 'cardNo',
                        align: 'center',
                        valign: 'middle',
                    },
                    {
                        title: '余额',
                        field: 'balance',
                        align: 'center',
                        valign: 'middle',
                    },
                    {
                        title: '创建人',
                        field: 'createBy',
                        align: 'center',
                        valign: 'middle',
                    },
                    {
                        title: '创建时间',
                        field: 'createDate',
                        align: 'center'
                    },
                    {
                        title: '二维码内容',
                        field: 'qrcode',
                        align: 'center',
                        valign: 'middle',
                    },
                    {
                        title: '状态',
                        field: 'status',
                        align: 'center'
                    },{
                        title: '更新人',
                        field: 'updateBy',
                        align: 'center',
                        valign: 'middle',
                    },
                    {
                        title: '更新时间',
                        field: 'updateDate',
                        align: 'center'
                    },
                    {
                        title: '操作',
                        field: 'id',
                        align: 'center',
                        formatter: function (value, row, index) {
                            var e = '<button class="btn bg-primary" onclick="edit(' + row.id + ')" data-toggle="modal" data-target="#studentModal" data-whatever="编辑">编辑</button> ';
                            var d = '<button class="btn btn-danger" onclick="del(' + row.id + ')">删除</button> ';
                            return e + d;
                        }
                    }
                ]
            });
        }
    });

    /**
     * 编辑的事件处理
     * @param id
     */
    function edit(id) {
        isUpdate = true;
        $.ajax({
            url: "${pageContext.request.contextPath}/info/student/studentCard/select/" + id,
            type: "GET",
            dataType: "json",
            success: function (r) {
                if (r.status == 200) {
                    $("#name").val(r.data.sname);
                    $("#hideenId").val(r.data.sid);
                    $("#age-text").val(r.data.sage);
                    $("#major-text").val(r.data.ssex);
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
        var url = "${pageContext.request.contextPath}/slotcard/add";
        if (isUpdate) {
            url = "${pageContext.request.contextPath}/slotcard/update/" + $("#hideenId").val();
        }
        $.ajax({
            url: url,
            type: "POST",
            dataType: "json",
            data: {
                sname: $("#name").val(),
                sage: $("#age-text").val(),
                sdept: $("#major-text").val(),
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
    function del(id) {
        $.ajax({
            url: "${pageContext.request.contextPath}/info/student/studentCard/delete/" + id,
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
</html>