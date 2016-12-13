<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>需求商登录</title>
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
						<li>
							 <a href="LoginDev.action">开发者登陆</a>
						</li>
						<li class="active">
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
				<div class="col-md-8 column">
					<form class="form-horizontal" action="LoginNeedSubmit.action" method="post" enctype="multipart/form-data">
					  <fieldset>
					    <legend>需求商登陆</legend>
					    <div class="form-group">
					      <label for="inputAccount" class="col-lg-2 control-label">邮箱账号</label>
					      <div class="col-lg-10">
					        <input type="email" class="form-control" name="inputEmail" placeholder="邮箱">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputPassword" class="col-lg-2 control-label">密码</label>
					      <div class="col-lg-10">
					        <input type="password" class="form-control" name="inputPassword" placeholder="Password">
					      </div>
					    </div>
					    
					    <div class="form-group">
					      <div class="col-lg-10 col-lg-offset-2">
					        <button type="reset" class="btn btn-default">Reset</button>
					        <button type="submit" class="btn btn-primary">Submit</button>
					      </div>
					    </div>
					    
					  </fieldset>
					</form>
				</div>
				<div class="col-md-4 column">
					<dl>
						<dt>
							Description lists
						</dt>
						<dd>
							A description list is perfect for defining terms.
						</dd>
						<dt>
							Euismod
						</dt>
						<dd>
							Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
						</dd>
						<dd>
							Donec id elit non mi porta gravida at eget metus.
						</dd>
						<dt>
							Malesuada porta
						</dt>
						<dd>
							Etiam porta sem malesuada magna mollis euismod.
						</dd>
						<dt>
							Felis euismod semper eget lacinia
						</dt>
						<dd>
							Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
						</dd>
					</dl>
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