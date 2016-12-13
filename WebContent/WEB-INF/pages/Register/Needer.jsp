<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>需求商注册</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>需求商注册</title>
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
							 <a href="RegDev.action">开发者注册</a>
						</li>
						<li class="active">
							 <a href="RegNeed">需求商注册</a>
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
					<form class="form-horizontal" action="RegNeedSubmit.action" method="post" enctype="multipart/form-data">
					  <fieldset>
					    <legend>公司信息</legend>
					    <div class="form-group">
					      <label for="inputCompany" class="col-lg-2 control-label">企业全名</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputCompany" placeholder="Company">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputLocation" class="col-lg-2 control-label">所在地</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputLocation" placeholder="Location">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputAttention" class="col-lg-2 control-label">联系人</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputAttention" placeholder="Attention">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputNumber" class="col-lg-2 control-label">联系电话</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputNumber" placeholder="Number">
					      </div>
					    </div>
					    <legend>账户注册信息</legend>
					    <div class="form-group">
					      <label for="inputAccount" class="col-lg-2 control-label">登录名</label>
					      <div class="col-lg-10">
					        <input type="text" class="form-control" name="inputAccount" placeholder="Account">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputEmail" class="col-lg-2 control-label">邮箱</label>
					      <div class="col-lg-10">
					        <input type="email" class="form-control" name="inputEmail" placeholder="Email">
					      </div>
					    </div>
					    <div class="form-group">
					      <label for="inputPassword" class="col-lg-2 control-label">密码</label>
					      <div class="col-lg-10">
					        <input type="password" class="form-control" name="inputPassword" placeholder="Password">
					      </div>
					    </div>
					    
					    <!--  
					    <div class="form-group">
							 <label for="exampleInputFile" class="col-lg-2 control-label">身份验证</label>
							 <input type="file" id="exampleInputFile" />
							 <div class="col-lg-10">
								<p class="help-block">
									上传一份有效、清晰的身份证正面照片
								</p>
							</div>
						</div>
					    <div class="form-group">
					      <label for="textArea" class="col-lg-2 control-label">接受条款</label>
					      <div class="col-lg-10">
					        <div class="checkbox">
							 <label><input type="checkbox" />Check me out</label>
							</div>
					      </div>
					    </div>
					    -->
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