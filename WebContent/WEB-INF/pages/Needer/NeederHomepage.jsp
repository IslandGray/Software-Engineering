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
							 <a href="neederDoing.action?inputEmail=${inputEmail}">正在进行</a>
						</li>
						
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">${inputEmail}<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="neederEditPre.action?inputEmail=${inputEmail}">企业资料</a>
								</li>
								<li>
									 <a href="neederAccountPre.action?inputEmail=${inputEmail}">账号信息</a>
								</li>
								<li>
									 <a href="neederHistory.action?inputEmail=${inputEmail}">历史项目</a>
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
				<li><a href="neederAccountPre.action?inputEmail=${inputEmail}">账号信息</a></li>
				<li><a href="neederHistory.action?inputEmail=${inputEmail}">历史项目</a></li>
			</ul>
		</div>
		<div class="col-md-4 column">
			<table class="table table-hover">
				<thead><tr><th>账号</th></tr></thead>
				<tbody><tr><td>${inputEmail}</td></tr></tbody>
				<thead><tr><th>企业名</th></tr></thead>
				<tbody><tr><td>${inputCompany}</td></tr></tbody>
				<thead><tr><th>用户名</th></tr></thead>
				<tbody><tr><td>${inputAccount}</td></tr></tbody>				
			</table>
			</div>
		<div class="col-md-4 column">
			<table class="table table-hover">
				<thead><tr><th>所在地</th></tr></thead>
				<tbody><tr><td>${inputLocation}</td></tr></tbody>
				<thead><tr><th>联系人</th></tr></thead>
				<tbody><tr><td>${inputAttention}</td>
				<thead><tr><th>联系电话</th></tr></thead>
				<tbody><tr><td>${inputNumber}</td></tr></tbody>
			</table>
			<a href="neederEdit.action?inputEmail=${inputEmail}&inputCompany=${inputCompany}&inputAccount=${inputAccount}&inputLocation=${inputLocation}&inputAttention=${inputAttention}&inputNumber=${inputNumber}" class="btn btn-info btn-lg btn-block">修改信息</a>
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