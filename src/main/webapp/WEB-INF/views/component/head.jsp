<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 导航栏  start-->
  <nav class="navbar navbar-default float_nav clear-margin">
    	<div class="container">
    		<div class="navbar-header">
        		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-navbar" aria-expanded="false">
		            <span class="sr-only">Toggle nav</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
        		</button>
        <a class="navbar-brand" href="#">
                <img alt="Brand" src="${ctxStatic}/projectfile/img/logo.jpg" id="logo_img">
        </a>
    </div>
      <div class="collapse navbar-collapse" id="bs-navbar" >
            <ul class="nav navbar-nav">
              <li><a href="${ctx}/">首页</a></li>
              <li><a href="#">招标信息订阅</a></li>
              <li><a href="${ctx}/seniorSearch">高级检索</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="#">登陆</a></li>
              <li><a href="#">注册</a></li>
            </ul>
      </div>
    </div>
  </nav>
  <!-- 导航栏  end-->
</body>
</html>