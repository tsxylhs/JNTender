<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>招标投标 - 高级搜索</title>
	<link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css"
          rel="stylesheet">
	<!--省市级三栏联动-->
    <script src="https://cdn.bootcss.com/distpicker/2.0.2/distpicker.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.js"></script>
    <!--日期选择-->
    <script src="https://cdn.bootcss.com/moment.js/2.20.1/moment-with-locales.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
	
</head>
<body>
	<!-- 引用公共头部文件  -->
	<%@ include file="/WEB-INF/views/component/head.jsp"%>
	 
	<!-- 高级搜索的页面 -->
	<div class="container margin-top-bottom-30">
		<div class="row">
			<div class="col-md-10">
			
				<!--关键词 start  -->
				<div class="row">
					<div class="col-md-4">
						<p class="text-right lead">关键词</p>
					</div>
					<div class="col-md-8">
				
					
		   
					      <input type="text" class="form-control" aria-label="...">
					  
					
					</div>
				</div>
				<!--关键词 end  -->
				
				<!-- 时间选择 start-->
				<div class="row">
					<div class="col-md-4">
						<p class="text-right lead">日期</p>
					</div>
					<div class="col-md-8">
						<div class="form-inline">
							<div class="form-group">
								<!--指定 date标记-->
			                    <div class='input-group date' id='datetimepicker1'>
			                        <input type='text' class="form-control"/>
			                        <span class="input-group-addon">
				                    <span class="glyphicon glyphicon-calendar"></span>
				                	</span>
			                    </div>
			                    
			                    <label>到</label>
								<!--指定 date标记-->
			                    <div class='input-group date' id='datetimepicker2'>
			                        <input type='text' class="form-control"/>
			                        <span class="input-group-addon">
				                    <span class="glyphicon glyphicon-calendar"></span>
				                	</span>
			                    </div>
			                    
							</div>
						</div>
					</div>
				</div>
				<!-- 时间选择  end-->
				
				<!-- 地点选择行 -->
				<div class="row">
					<div class="col-md-4">
						<p class="text-right lead">地点</p>
					</div>
					<div class="col-md-8">
						<div data-toggle="distpicker" data-placeholder="false">
			                <div class="form-inline">
			                    <div class="form-group">
			                        <select class="form-control"></select>
			                        <select class="form-control"></select>
			                        <select class="form-control"></select>
			                    </div>
			                </div>
			            </div>
					</div>
					
				</div>
			
				
				
				<!-- 类别标签  start-->
				<div class="row">
					<div class="col-md-4">
						<p class="text-right lead">类别</p>
					</div>
					<div class="col-md-8">
						<a  href="#" class="label label-default light-label" >IT</a>
						<a  href="#" class="label label-default light-label">建筑</a>
						<a  href="#" class="label label-default light-label">互联网</a>
						<a  href="#" class="label label-default light-label">资源</a>
					</div>
				</div>
				<!-- 类别标签 end -->
				
				<!-- 状态 start -->
				<div class="row">
					<div class="col-md-4">
						<p class="text-right lead">状态</p>
					</div>
					<div class="col-md-8">
						<a class="label label-default light-label">正在招标</a>
						<a class="label label-default light-label">中标</a>
						<a class="label label-default light-label">完结</a>
					</div>
				</div>
				<!-- 状态 end -->
				

			</div>
		</div>
		
	</div>
	
	<!-- 高级搜索分割 -->
	<hr>
	
	<!-- 内容样式 start -->
	<div class="container">
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
		
		          <div class="row">
		              <div class="col-md-10">
		                  <p class="lead">
		                      <a href="#" class="clear-all">总投资约4000万元停车库及游园项目总投总投资=车库及游园项目项目</a> 
		                  </p>
		              </div>
		              <div class="col-md-2">
		                <small class="text-success">[正在招标]</small>
		              </div> 
		            </div>
		        <p>移除了默认的 list-style 样式和左侧外边距的一组元素（只针对直接子元素）。这是针对直接子元素的，也就是说，你需要对所有嵌套的列表都添加这个类才能具有同样的样式。移除了默认的 list-style</p>
		        <p>   样式和左侧外边距的一组元素（只针对直接子元素）。这是针对直接子元素的，也就是说，你需要对所有嵌套的列表都添加这个类才能具有同样的样式。</p>
		
		        <div class="row">
		          <div class="col-md-6">
		         
		              <span class="text-nowrap label label-danger" ><span class="glyphicon glyphicon-tag"></span> 建筑</span>
		              <span class="text-nowrap label label-info" ><span class="glyphicon glyphicon-tag"></span> IT</span>
		              <span class="text-nowrap label label-primary" ><span class="glyphicon glyphicon-tag"></span> 教育</span>
		          </div>
		          <div class="col-md-6">
		              <p class="text-right">山东济南</p>
		              <p class="text-right">2018年01月31日</p>   
		          </div>
		          
		        </div>
		        <hr>
	
			</div>
		</div>
	</div>
	<!-- 内容样式 end -->
	
	
	<script>
		$(function () {

	      $('#datetimepicker1').datetimepicker({
	          format: 'YYYY-MM-DD',
	          locale: moment.locale('zh-cn')
	      });
	      
	      $('#datetimepicker2').datetimepicker({
	          format: 'YYYY-MM-DD',
	          locale: moment.locale('zh-cn')
	      });
	      
	      /* 给light-label类添加 点击变色的功能 start*/
	      $('.light-label').each(function(){
	            $(this).click(function(){
	                $(this).toggleClass("label-danger");
	            })
	        })
	      /* 给light-label类添加 点击变色的功能 end*/
	  });
	</script>
</body>
</html>