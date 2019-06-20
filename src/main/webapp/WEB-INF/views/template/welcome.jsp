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
		<div class="page-header">
			<h3 class="page-title">
				<span class="page-title-icon bg-gradient-primary text-white mr-2">
					<i class="mdi mdi-home"></i>
				</span> 汇总
			</h3>
			<nav aria-label="breadcrumb">
			<ul class="breadcrumb">
				<li class="breadcrumb-item active" aria-current="page"><span></span>概况
					<i
					class="mdi mdi-alert-circle-outline icon-sm text-primary align-middle"></i>
				</li>
			</ul>
			</nav>
		</div>
		<div class="row">
			<div class="col-md-4 stretch-card grid-margin">
				<div class="card bg-gradient-danger card-img-holder text-white">
					<div class="card-body">
						<img
							src="${pageContext.request.contextPath}/static/template/images/dashboard/circle.svg"
							class="card-img-absolute" alt="circle-image" />
						<h4 class="font-weight-normal mb-3">
							Weekly Sales <i class="mdi mdi-chart-line mdi-24px float-right"></i>
						</h4>
						<h2 class="mb-5">$ 15,0000</h2>
						<h6 class="card-text">Increased by 60%</h6>
					</div>
				</div>
			</div>
			<div class="col-md-4 stretch-card grid-margin">
				<div class="card bg-gradient-info card-img-holder text-white">
					<div class="card-body">
						<img
							src="${pageContext.request.contextPath}/static/template/images/dashboard/circle.svg"
							class="card-img-absolute" alt="circle-image" />
						<h4 class="font-weight-normal mb-3">
							Weekly Orders <i
								class="mdi mdi-bookmark-outline mdi-24px float-right"></i>
						</h4>
						<h2 class="mb-5">45,6334</h2>
						<h6 class="card-text">Decreased by 10%</h6>
					</div>
				</div>
			</div>
			<div class="col-md-4 stretch-card grid-margin">
				<div class="card bg-gradient-success card-img-holder text-white">
					<div class="card-body">
						<img
							src="${pageContext.request.contextPath}/static/template/images/dashboard/circle.svg"
							class="card-img-absolute" alt="circle-image" />
						<h4 class="font-weight-normal mb-3">
							Visitors Online <i class="mdi mdi-diamond mdi-24px float-right"></i>
						</h4>
						<h2 class="mb-5">95,5741</h2>
						<h6 class="card-text">Increased by 5%</h6>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-12 grid-margin">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">最近消费</h4>
						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr style="text-align:center;">
										<th>消费人</th>
										<th>卡号</th>
										
										<th>刷卡地点</th>
										<th>消费金额</th>
										<th>流水号</th>
										<th>刷卡时间</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${sList }" var="s">
										<tr style="text-align:center;">
											<td><img
												src="${pageContext.request.contextPath}/static/template/images/faces/face2.jpg"
												class="mr-2" alt="image">${s.studentInfo.name }</td>
											<td>${s.cardNo }</td>
											<td>${s.remark }</td>
											<td>${s.amount }</td>
											<td>${s.id }</td>
											<td><fmt:formatDate value="${s.createDate}"
													pattern="yyyy-MM-dd HH:mm:ss" /></td>
										</tr>
									</c:forEach>
									<c:if test="${sList }==null">
										<tr>
											<td><img
												src="${pageContext.request.contextPath}/static/template/images/faces/face1.jpg"
												class="mr-2" alt="image"> David Grey</td>
											<td>Fund is not recieved</td>
											<td><label class="badge badge-gradient-success">DONE</label>
											</td>
											<td>Dec 5, 2017</td>
											<td>WD-12345</td>
										</tr>
										<tr>
											<td><img
												src="${pageContext.request.contextPath}/static/template/images/faces/face2.jpg"
												class="mr-2" alt="image"> Stella Johnson</td>
											<td>High loading time</td>
											<td><label class="badge badge-gradient-warning">PROGRESS</label>
											</td>
											<td>Dec 12, 2017</td>
											<td>WD-12346</td>
										</tr>
										<tr>
											<td><img
												src="${pageContext.request.contextPath}/static/template/images/faces/face3.jpg"
												class="mr-2" alt="image"> Marina Michel</td>
											<td>Website down for one week</td>
											<td><label class="badge badge-gradient-info">ON
													HOLD</label></td>
											<td>Dec 16, 2017</td>
											<td>WD-12347</td>
										</tr>
										<tr>
											<td><img
												src="${pageContext.request.contextPath}/static/template/images/faces/face4.jpg"
												class="mr-2" alt="image"> John Doe</td>
											<td>Loosing control on server</td>
											<td><label class="badge badge-gradient-danger">REJECTED</label>
											</td>
											<td>Dec 3, 2017</td>
											<td>WD-12348</td>
										</tr>
									</c:if>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>