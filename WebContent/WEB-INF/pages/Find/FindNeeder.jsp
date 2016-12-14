<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>需求商详情</title>
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
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="index.jsp">Brand</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">需求商详情页</a>
						</li>
						<li>
							 <a href="#">--></a>
						</li>
						
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						
					</ul>
				</div>
			</nav>
			
			<div class="row clearfix">
				<div class="col-md-6 column">
					<div class="list-group">
						 <a href="#" class="list-group-item active">企业名</a>
						<div class="list-group-item">
							${inputCompany}
						</div>
					</div>
					<div class="list-group">
						 <a href="#" class="list-group-item active">所在地</a>
						<div class="list-group-item">
							${location}
						</div>
					</div>
					<div class="list-group">
						 <a href="#" class="list-group-item active">联系人</a>
						<div class="list-group-item">
							${attention}
						</div>
					</div>
					<div class="list-group">
						 <a href="#" class="list-group-item active">联系电话</a>
						<div class="list-group-item">
							${number}
						</div>
					</div>
					<div class="list-group">
						  <a class="list-group-item active"> <span class="badge">${list.size()}</span> 项目历史纪录</a>
					</div>
				</div>
				
				<div class="col-md-6 column">
					<table class="table">
						<thead>
							<tr>
								  <th>项目ID</th>
							      <th>开发者</th>
							      <th>状态</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="list" id="pro"> 
						    	<tr>
							    	<td>${pro.project}</td>
									<td>${pro.developer}</a></td>
									<td>${pro.status}</td>
								</tr>
							</s:iterator>
							
						</tbody>
					</table>
					 <a class="btn btn-primary btn-large" href="#" onclick="history.back()">返回</a>
				</div>
			</div>
			
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