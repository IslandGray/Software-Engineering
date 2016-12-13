<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>开发者主页</title>
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
							 <a href="returnDevIndex.action?inputAccount=${inputAccount}">个人主页</a>
						</li>
						<li>
							 <a href="devtoMarket.action?inputAccount=${inputAccount}">需求市场</a>
						</li>
						<li>
							 <a href="returnDevDoing.action?inputAccount=${inputAccount}">当前工作</a>
						</li>
						
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">${inputAccount}<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="devMyTender.action?inputAccount=${inputAccount}">我的投标</a>
								</li>
								<li>
									 <a href="devExPre.action?inputAccount=${inputAccount}">资料修改</a>
								</li>
								<li>
									 <a href="devHistory.action?inputAccount=${inputAccount}">工作记录</a>
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
					个人主页 <small>Index</small>
				</h1>
			</div> 
		</div>
	</div>
	
	<div class="row clearfix">
		<div class="col-md-3 column">
			<ul class="nav nav-pills nav-stacked">
			<li><a href="devRecommand.action?inputAccount=${inputAccount}">系统推荐</a></li>
			<li><a href="devEditPre.action?inputAccount=${inputAccount}">个人资料</a></li>
			<li><a href="devMyTender.action?inputAccount=${inputAccount}">我的投标<span class="badge"></span></a></li>
			<li class="active"><a href="devAccountPre.action?inputAccount=${inputAccount}">账户管理</a></li>
			<li><a href="devReceiveInvite.action?inputAccount=${inputAccount}">项目邀请</a></li>
			<li><a href="devExPre.action?inputAccount=${inputAccount}">资料管理 </a></li>
			<li><a href="devHistory.action?inputAccount=${inputAccount}">工作记录</a></li>
			</ul>
		</div>
		<div class="col-md-9 column">
			<form class="form-horizontal" action="devAccount.action?inputAccount=${inputAccount}" method="post" enctype="multipart/form-data">
					  <fieldset>
					    <legend>修改密码</legend>
					    <div class="form-group">
					      <label for="input" class="col-lg-2 control-label">原密码</label>
					      <div class="col-lg-10">
					        <input type="password" class="form-control" name="inputOldPassword">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="input" class="col-lg-2 control-label">新密码</label>
					      <div class="col-lg-10">
					        <input type="password" class="form-control" name="inputNewPassword">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="input" class="col-lg-2 control-label">确认新密码</label>
					      <div class="col-lg-10">
					        <input type="password" class="form-control" name="inputNew2">
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
	</div>
</div>
	
	
	<!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
    <!-- 可选: 包含 jQuery 库 -->
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <!-- 可选: 合并了 Bootstrap JavaScript 插件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>