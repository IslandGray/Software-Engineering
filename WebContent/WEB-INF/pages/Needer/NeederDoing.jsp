<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>正在进行</title>
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
						<li>
							 <a href="neederEditPre.action?inputEmail=${inputEmail}">企业主页</a>
						</li>
						<li>
							 <a href="creatProject.action?inputEmail=${inputEmail}">发布项目</a>
						</li>
						<li>
							 <a href="neederTendering.action?inputEmail=${inputEmail}">正在招标</a>
						</li>
						<li class="active">
							 <a href="neederDoing.action?inputEmail=${inputEmail}">正在进行</a>
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
					正在进行 <small>Doing</small>
				</h1>
			</div> 
		</div>
	</div>
	
	<div class="row">
		<div class="col-lg-10 col-lg-offset-1">
			<div class="well bs-component"> 
			<table class="table table-striped table-hover ">
			  <thead>
			    <tr>
			          <th>任务ID</th>
				      <th>项目名</th>
				      <th>编程语言</th>
				      <th>平台</th>
				      <th>学历要求</th>
				      <th>经验要求</th>
				      <th>工期</th>
				      <th>报酬</th>
				      <th>人数</th>
			    </tr>
			  </thead>
			  <tbody>
			    <s:iterator value="list" id="pro"> 
			    	<tr>
				    	<td>${pro.id}</td>
						<td>${pro.name}</a></td>
						<td>${pro.language}</td>
						<td>${pro.platform}</td>
						<td>${pro.education}</td>
						<td>${pro.experience}</td>
						<td>${pro.time}</td>
						<td>${pro.price}</td>
						<td>${pro.num}</td>
						<td><a href="#?inputEmail=${inputEmail}&projectID=${pro.id}&name=${pro.name}&platform=${pro.platform}&education=${pro.education}&price=${pro.price}&experience=${pro.experience}&time=${pro.time}&num=${pro.num}&tendernum=${tenderNum}&language=${pro.language}">确认结束</a></td>
					</tr>
				</s:iterator>
			   </tbody>
			</table> 
	</div></div></div>
	
</div>
	
	
	<!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
    <!-- 可选: 包含 jQuery 库 -->
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <!-- 可选: 合并了 Bootstrap JavaScript 插件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>