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
<!-- plugins:css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/template/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/template/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- inject:css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/template/css/style.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/static/template/images/favicon.png" />
</head>
<body>
	<div class="content-wrapper">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">Details</h4>
				<p class="card-description">
					${cardInfo.cardNo }
					<code>&lt;卡号&gt;</code>
					${cardInfo.cardNo }
				</p>
				<div class="row">
					<div class="col-md-6">
						<address>
							<p class="font-weight-bold">状态</p>
							<c:if test="${cardInfo.status==0 }" ><p>未使用</p></c:if>
							<c:if test="${cardInfo.status==1 }" ><p>已使用</p></c:if>
							<hr/>
							<p class="font-weight-bold">标记</p>
							<c:if test="${cardInfo.delFlag==0 }" ><p>正常</p></c:if>
							<c:if test="${cardInfo.delFlag==1 }" ><p>删除</p></c:if>
						</address>
					</div>
				</div>
			</div>
			<div class="card-body">
				<h4 class="card-title">Lead</h4>
				<p class="card-description">
					Use class
					<code>.lead</code>
				</p>
				<p class="lead">Vivamus sagittis lacus vel augue laoreet rutrum
					faucibus dolor auctor.</p>
			</div>
		</div>

	</div>
</body>
</html>