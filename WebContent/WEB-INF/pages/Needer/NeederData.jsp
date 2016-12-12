<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>需求商企业主页</title>
	<!-- 包含头部信息用于适应不同设备 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 包含 bootstrap 样式表 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> 
					 <span class="sr-only">Toggle navigation</span>
					 <span class="icon-bar"></span>
					 <span class="icon-bar"></span>
					 <span class="icon-bar"></span>
					 </button> <a class="navbar-brand" href="#">Brand</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="neederEditPre.action?inputEmail=${inputEmail}">企业主页</a>
						</li>
						<li>
							 <a href="creatProject.action?inputEmail=${inputEmail}">发布项目</a>
						</li>
						<li>
							 <a href="neederTendering.action?inputEmail=${inputEmail}">正在招标</a>
						</li>
						<li>
							 <a href="neederDoing.action?inputEmail=${inputEmail}#">正在进行</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">${inputEmail}<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">个人主页</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="index.jsp">注销</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
			</nav>
			<div class="page-header">
				<h1>
					企业主页 <small>Index</small>
				</h1>
			</div> 
		</div>
	</div>
	
	<div class="row clearfix">
		<div class="col-md-3 column">
			<ul class="nav nav-pills nav-stacked">
				<li class="active"><a href="neederEditPre.action?inputEmail=${inputEmail}">企业资料</a></li>
				<li><a href="#">账号信息</a></li>
				<li><a href="#">历史项目</a></li>
			</ul>
		</div>
		<div class="col-md-9 column">
			<form class="form-horizontal" action="neederEditSave.action?inputEmail=${inputEmail}&inputCompany=${inputCompany}" method="post" enctype="multipart/form-data">
					  <fieldset>
					    <legend>注册信息</legend>
					    <div class="form-group">
					      <label for="inputEmail" class="col-lg-2 control-label">注册账号</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputEmail" value="${inputEmail}" disabled="">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputCompany" class="col-lg-2 control-label">企业名</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputCompany" value="${inputCompany}" disabled="">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputAccount" class="col-lg-2 control-label">用户名</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputAccount" value="${inputAccount}" disabled="">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputLocation" class="col-lg-2 control-label">所在地</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputLocation" value="${inputLocation}">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputAttention" class="col-lg-2 control-label">联系人</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputAttention" value="${inputAttention}">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputNumber" class="col-lg-2 control-label">联系电话</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputNumber" value="${inputNumber}">
					      </div>
					    </div>
					    
					    <div class="form-group">
					      <div class="col-lg-10 col-lg-offset-2">
					        <button type="reset" class="btn btn-danger">清空</button>
					        <button type="submit" class="btn btn-primary">提交</button>
					      </div>
					    </div>
					    
					  </fieldset>
					</form>
		</div>
	</div>
</div>
	
	
	<!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
    <!-- 可选: 包含 jQuery 库 -->
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <!-- 可选: 合并了 Bootstrap JavaScript 插件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>