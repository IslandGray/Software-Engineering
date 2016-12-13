<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录</title>
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
					 </button> <a class="navbar-brand" href="index.jsp">Brand</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							 <a href="LoginDev.action">开发者登陆</a>
						</li>
						<li>
							 <a href="LoginNeed.action">需求商登陆</a>
						</li>
						
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
				</div>
			</nav>
			<div class="row clearfix">
				<div class="col-md-6 column">
					<div class="jumbotron well" >
					</br>
					</br>
					</br>
					</br>
					</br>
						<center><h1 style="font-family:Microsoft YaHei">
							开发者
						</h1></center>
					</br>
					</br>
					</br>
						<center>
						<p style="font-family:Microsoft YaHei">
							以开发者的身份登陆，你将在这里查看正在招标的项目，与其他人组成团队以完成项目！
						</p></center>
						</br>
					</br>
					</br>
					</br>
					</br>
						<center>
						<p>
							 <a style="font-family:Microsoft YaHei" class="btn btn-primary btn-large" href="LoginDev.action">登录为开发者</a>
						</p><center>
					</div>
				</div>
				<div class="col-md-6 column">
					<div class="jumbotron well">
						</br>
					</br>
					</br>
					</br>
					</br>
						<center><h1 style="font-family:Microsoft YaHei">
							需求商
						</h1></center>
					</br>
					</br>
					</br>
						<center>
						<p style="font-family:Microsoft YaHei">
							以需求商的身份登陆，发布你的需求，等待或征召有能力的开发者！
						</p></center>
						</br>
					</br>
					</br>
					</br>
					</br>
						<center>
						<p>
							 <a style="font-family:Microsoft YaHei" class="btn btn-primary btn-large" href="LoginNeed.action">登录为需求商</a>
						</p><center>
					</div>
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