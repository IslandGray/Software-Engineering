<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   
"http://www.w3.org/TR/html4/loose.dtd">  
<html>
  <head>
	<meta charset="utf-8"> 
    <title>Home</title>
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
				<nav class="navbar navbar-default">
				  	<div class="container-fluid">
					    <div class="navbar-header">
					      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					        <span class="sr-only">Toggle navigation</span>
					        <span class="icon-bar"></span>
					        <span class="icon-bar"></span>
					        <span class="icon-bar"></span>
					      </button>
					      <a class="navbar-brand" href="#">首页</a>
					    </div>
				
					    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					      <ul class="nav navbar-nav">
					        <li><a href="#">||</a></li>
					        <li><a href="#">发布需求</a></li>
					        <li><a href="#">||</a></li>
					        <li><a href="#">投标</a></li>
					        <li><a href="#">||</a></li>
					      </ul>
					      
					      <ul class="nav navbar-nav navbar-right">
					        <li><a href="LoginSwitch.action">登录</a></li>
					        <li><a href="RegSwitch.action">注册</a></li>
					      </ul>
				</div>
					</div>
				</nav>
				<div class="jumbotron">
					<h1>
						<font face="微软雅黑">众包市场</font>
					</h1>
					<p>
						这里是软件众包的合作平台，在这里你可以发布你的需求，也可以与其他开发者组成团队</br>
						
					</p>
					<p>
						 <a class="btn btn-primary btn-large" href="#">Learn more</a>
					</p>
				</div>
				
			
				
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-4 column">
				<h2>
					<font face="微软雅黑">作为开发者</font>
				</h2>
				<p>
					你是一位有开发能力的个体</br></br>你可以上传你的简历，寻找合适的项目并且投标</br>在这里你将与其他人组成一个临时的开发团队
				</p>
				<p>
					 <a class="btn" href="#">View details »</a>
				</p>
			</div>
			<div class="col-md-4 column">
				<h2>
					<font face="微软雅黑">作为需求商</font>
				</h2>
				<p>
					你是一家有开发需求的公司</br></br>你可以随时发出软件需求，等待开发者前来投标，也可以根据我们的推荐联系已注册的开发者。
				</p>
				<p>
					 <a class="btn" href="#">View details »</a>
				</p>
			</div>
			<div class="col-md-4 column">
				<h2>
					<font face="微软雅黑">友情链接</font>
				</h2>
				<p>
					<a href="https://github.com">
						<img border="0" height="135" width="200" src="http://img2.niushe.com/upload/201304/19/14-22-31-71-26144.jpg" />
					</a>
				</p>
				<p>
					 <a class="btn" href="#">View details »</a>
				</p>
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