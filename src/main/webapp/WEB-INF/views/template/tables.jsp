<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<!-- plugins:css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/template/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/template/vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- inject:css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/template/css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/template/images/favicon.png" />
</head>
<body>
<div class="container-fluid page-body-wrapper">
      <!-- partial:../../partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item nav-profile">
            <a href="#" class="nav-link">
              <div class="nav-profile-image">
                <img href="${pageContext.request.contextPath}/static/template/images/faces/face1.jpg" alt="profile">
                <span class="login-status online"></span> <!--change to offline or busy as needed-->              
              </div>
              <div class="nav-profile-text d-flex flex-column">
                <span class="font-weight-bold mb-2">David Grey. H</span>
                <span class="text-secondary text-small">Project Manager</span>
              </div>
              <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/static/template/index.html">
              <span class="menu-title">Dashboard</span>
              <i class="mdi mdi-home menu-icon"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <span class="menu-title">UI Elements</span>
              <i class="menu-arrow"></i>
              <i class="mdi mdi-crosshairs-gps menu-icon"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/ui-features/buttons.html">Buttons</a></li>
                <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/ui-features/typography.html">Typography</a></li>
              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/icons/mdi.html">
              <span class="menu-title">Icons</span>
              <i class="mdi mdi-contacts menu-icon"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/forms/basic_elements.html">
              <span class="menu-title">Forms</span>
              <i class="mdi mdi-format-list-bulleted menu-icon"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/charts/chartjs.html">
              <span class="menu-title">Charts</span>
              <i class="mdi mdi-chart-bar menu-icon"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/tables/basic-table.html">
              <span class="menu-title">Tables</span>
              <i class="mdi mdi-table-large menu-icon"></i>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#general-pages" aria-expanded="false" aria-controls="general-pages">
              <span class="menu-title">Sample Pages</span>
              <i class="menu-arrow"></i>
              <i class="mdi mdi-medical-bag menu-icon"></i>
            </a>
            <div class="collapse" id="general-pages">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/samples/blank-page.html"> Blank Page </a></li>
                <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/samples/login.html"> Login </a></li>
                <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/samples/register.html"> Register </a></li>
                <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/samples/error-404.html"> 404 </a></li>
                <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/static/template/pages/samples/error-500.html"> 500 </a></li>
              </ul>
              </div>
          </li>
          <li class="nav-item sidebar-actions">
            <span class="nav-link">
              <div class="border-bottom">
                <h6 class="font-weight-normal mb-3">Projects</h6>                
              </div>
              <button class="btn btn-block btn-lg btn-gradient-primary mt-4">+ Add a project</button>
              <div class="mt-4">
                <div class="border-bottom">
                  <p class="text-secondary">Categories</p>                  
                </div>
                <ul class="gradient-bullet-list mt-4">
                  <li>Free</li>
                  <li>Pro</li>
                </ul>
              </div>
            </span>
          </li>
        </ul>
      </nav>
      <!-- partial -->
      <div class="main-panel">
        <div class="content-wrapper">
          <div class="page-header">
            <h3 class="page-title">
              Basic Tables
            </h3>
            <nav aria-label="breadcrumb">
              <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="#">Tables</a></li>
                <li class="breadcrumb-item active" aria-current="page">Basic tables</li>
              </ol>
            </nav>
          </div>
          <div class="row">
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Basic Table</h4>
                  <p class="card-description">
                    Add class <code>.table</code>
                  </p>
                  <table class="table">
                    <thead>
                      <tr>
                        <th>Profile</th>
                        <th>VatNo.</th>
                        <th>Created</th>
                        <th>Status</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>Jacob</td>
                        <td>53275531</td>
                        <td>12 May 2017</td>
                        <td><label class="badge badge-danger">Pending</label></td>
                      </tr>
                      <tr>
                        <td>Messsy</td>
                        <td>53275532</td>
                        <td>15 May 2017</td>
                        <td><label class="badge badge-warning">In progress</label></td>
                      </tr>
                      <tr>
                        <td>John</td>
                        <td>53275533</td>
                        <td>14 May 2017</td>
                        <td><label class="badge badge-info">Fixed</label></td>
                      </tr>
                      <tr>
                        <td>Peter</td>
                        <td>53275534</td>
                        <td>16 May 2017</td>
                        <td><label class="badge badge-success">Completed</label></td>
                      </tr>
                      <tr>
                        <td>Dave</td>
                        <td>53275535</td>
                        <td>20 May 2017</td>
                        <td><label class="badge badge-warning">In progress</label></td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Hoverable Table</h4>
                  <p class="card-description">
                    Add class <code>.table-hover</code>
                  </p>
                  <table class="table table-hover">
                    <thead>
                      <tr>
                        <th>User</th>
                        <th>Product</th>
                        <th>Sale</th>
                        <th>Status</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>Jacob</td>
                        <td>Photoshop</td>
                        <td class="text-danger"> 28.76% <i class="mdi mdi-arrow-down"></i></td>
                        <td><label class="badge badge-danger">Pending</label></td>
                      </tr>
                      <tr>
                        <td>Messsy</td>
                        <td>Flash</td>
                        <td class="text-danger"> 21.06% <i class="mdi mdi-arrow-down"></i></td>
                        <td><label class="badge badge-warning">In progress</label></td>
                      </tr>
                      <tr>
                        <td>John</td>
                        <td>Premier</td>
                        <td class="text-danger"> 35.00% <i class="mdi mdi-arrow-down"></i></td>
                        <td><label class="badge badge-info">Fixed</label></td>
                      </tr>
                      <tr>
                        <td>Peter</td>
                        <td>After effects</td>
                        <td class="text-success"> 82.00% <i class="mdi mdi-arrow-up"></i></td>
                        <td><label class="badge badge-success">Completed</label></td>
                      </tr>
                      <tr>
                        <td>Dave</td>
                        <td>53275535</td>
                        <td class="text-success"> 98.05% <i class="mdi mdi-arrow-up"></i></td>
                        <td><label class="badge badge-warning">In progress</label></td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            <div class="col-lg-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Striped Table</h4>
                  <p class="card-description">
                    Add class <code>.table-striped</code>
                  </p>
                  <table class="table table-striped">
                    <thead>
                      <tr>
                        <th>
                          User
                        </th>
                        <th>
                          First name
                        </th>
                        <th>
                          Progress
                        </th>
                        <th>
                          Amount
                        </th>
                        <th>
                          Deadline
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td class="py-1">
                          <img href="${pageContext.request.contextPath}/static/template/images/faces-clipart/pic-1.png" alt="image"/>
                        </td>
                        <td>
                          Herman Beck
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-success" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr>
                        <td class="py-1">
                          <img href="${pageContext.request.contextPath}/static/template/images/faces-clipart/pic-2.png" alt="image"/>
                        </td>
                        <td>
                          Messsy Adam
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-danger" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $245.30
                        </td>
                        <td>
                          July 1, 2015
                        </td>
                      </tr>
                      <tr>
                        <td class="py-1">
                          <img href="${pageContext.request.contextPath}/static/template/images/faces-clipart/pic-3.png" alt="image"/>
                        </td>
                        <td>
                          John Richards
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-warning" role="progressbar" style="width: 90%" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $138.00
                        </td>
                        <td>
                          Apr 12, 2015
                        </td>
                      </tr>
                      <tr>
                        <td class="py-1">
                          <img href="${pageContext.request.contextPath}/static/template/images/faces-clipart/pic-4.png" alt="image"/>
                        </td>
                        <td>
                          Peter Meggik
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-primary" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr>
                        <td class="py-1">
                          <img href="${pageContext.request.contextPath}/static/template/images/faces-clipart/pic-1.png" alt="image"/>
                        </td>
                        <td>
                          Edward
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-danger" role="progressbar" style="width: 35%" aria-valuenow="35" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 160.25
                        </td>
                        <td>
                          May 03, 2015
                        </td>
                      </tr>
                      <tr>
                        <td class="py-1">
                          <img href="${pageContext.request.contextPath}/static/template/images/faces-clipart/pic-2.png" alt="image"/>
                        </td>
                        <td>
                          John Doe
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-info" role="progressbar" style="width: 65%" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 123.21
                        </td>
                        <td>
                          April 05, 2015
                        </td>
                      </tr>
                      <tr>
                        <td class="py-1">
                          <img href="${pageContext.request.contextPath}/static/template/images/faces-clipart/pic-3.png" alt="image"/>
                        </td>
                        <td>
                          Henry Tom
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-warning" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 150.00
                        </td>
                        <td>
                          June 16, 2015
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            <div class="col-lg-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Bordered table</h4>
                  <p class="card-description">
                    Add class <code>.table-bordered</code>
                  </p>
                  <table class="table table-bordered">
                    <thead>
                      <tr>
                        <th>
                          #
                        </th>
                        <th>
                          First name
                        </th>
                        <th>
                          Progress
                        </th>
                        <th>
                          Amount
                        </th>
                        <th>
                          Deadline
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>
                          1
                        </td>
                        <td>
                          Herman Beck
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-success" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          2
                        </td>
                        <td>
                          Messsy Adam
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-danger" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $245.30
                        </td>
                        <td>
                          July 1, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          3
                        </td>
                        <td>
                          John Richards
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-warning" role="progressbar" style="width: 90%" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $138.00
                        </td>
                        <td>
                          Apr 12, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          4
                        </td>
                        <td>
                          Peter Meggik
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-primary" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          5
                        </td>
                        <td>
                          Edward
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-danger" role="progressbar" style="width: 35%" aria-valuenow="35" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 160.25
                        </td>
                        <td>
                          May 03, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          6
                        </td>
                        <td>
                          John Doe
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-info" role="progressbar" style="width: 65%" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 123.21
                        </td>
                        <td>
                          April 05, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          7
                        </td>
                        <td>
                          Henry Tom
                        </td>
                        <td>
                          <div class="progress">
                            <div class="progress-bar bg-warning" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
                          </div>
                        </td>
                        <td>
                          $ 150.00
                        </td>
                        <td>
                          June 16, 2015
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            <div class="col-lg-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Inverse table</h4>
                  <p class="card-description">
                    Add class <code>.table-dark</code>
                  </p>
                  <table class="table table-dark">
                    <thead>
                      <tr>
                        <th>
                          #
                        </th>
                        <th>
                          First name
                        </th>
                        <th>
                          Amount
                        </th>
                        <th>
                          Deadline
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>
                          1
                        </td>
                        <td>
                          Herman Beck
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          2
                        </td>
                        <td>
                          Messsy Adam
                        </td>
                        <td>
                          $245.30
                        </td>
                        <td>
                          July 1, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          3
                        </td>
                        <td>
                          John Richards
                        </td>
                        <td>
                          $138.00
                        </td>
                        <td>
                          Apr 12, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          4
                        </td>
                        <td>
                          Peter Meggik
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          5
                        </td>
                        <td>
                          Edward
                        </td>
                        <td>
                          $ 160.25
                        </td>
                        <td>
                          May 03, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          6
                        </td>
                        <td>
                          John Doe
                        </td>
                        <td>
                          $ 123.21
                        </td>
                        <td>
                          April 05, 2015
                        </td>
                      </tr>
                      <tr>
                        <td>
                          7
                        </td>
                        <td>
                          Henry Tom
                        </td>
                        <td>
                          $ 150.00
                        </td>
                        <td>
                          June 16, 2015
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            <div class="col-lg-12 stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Table with contextual classes</h4>
                  <p class="card-description">
                    Add class <code>.table-{color}</code>
                  </p>
                  <table class="table table-bordered">
                    <thead>
                      <tr>
                        <th>
                          #
                        </th>
                        <th>
                          First name
                        </th>
                        <th>
                          Product
                        </th>
                        <th>
                          Amount
                        </th>
                        <th>
                          Deadline
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr class="table-info">
                        <td>
                          1
                        </td>
                        <td>
                          Herman Beck
                        </td>
                        <td>
                          Photoshop
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr class="table-warning">
                        <td>
                          2
                        </td>
                        <td>
                          Messsy Adam
                        </td>
                        <td>
                          Flash
                        </td>
                        <td>
                          $245.30
                        </td>
                        <td>
                          July 1, 2015
                        </td>
                      </tr>
                      <tr class="table-danger">
                        <td>
                          3
                        </td>
                        <td>
                          John Richards
                        </td>
                        <td>
                          Premeire
                        </td>
                        <td>
                          $138.00
                        </td>
                        <td>
                          Apr 12, 2015
                        </td>
                      </tr>
                      <tr class="table-success">
                        <td>
                          4
                        </td>
                        <td>
                          Peter Meggik
                        </td>
                        <td>
                          After effects
                        </td>
                        <td>
                          $ 77.99
                        </td>
                        <td>
                          May 15, 2015
                        </td>
                      </tr>
                      <tr class="table-primary">
                        <td>
                          5
                        </td>
                        <td>
                          Edward
                        </td>
                        <td>
                          Illustrator
                        </td>
                        <td>
                          $ 160.25
                        </td>
                        <td>
                          May 03, 2015
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:../../partials/_footer.html -->
        <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2017 <a href="#" target="_blank">Bootstrap Dash</a>. All rights reserved.</span>
            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with
              <i class="mdi mdi-heart text-danger"></i> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></span>
          </div>
        </footer>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  <script href="${pageContext.request.contextPath}/static/template/vendors/js/vendor.bundle.base.js"></script>
  <script href="${pageContext.request.contextPath}/static/template/vendors/js/vendor.bundle.addons.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page-->
  <!-- End plugin js for this page-->
  <!-- inject:js -->
  <script href="${pageContext.request.contextPath}/static/template/js/off-canvas.js"></script>
  <script href="${pageContext.request.contextPath}/static/template/js/misc.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <!-- End custom js for this page-->
</body>
</html>