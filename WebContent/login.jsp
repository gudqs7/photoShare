<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>登录页面</title>
		<meta charset='utf-8'>
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
		<!-- 引入 Bootstrap -->
			<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
 
		<!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
		<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
		<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
		<![endif]-->
		<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
		<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
		<!-- 包括所有已编译的插件 -->
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
    </head>
	
	<style>
		body{
			background:#F5F5F5;
		}
		
		#login{
			padding:30px 50px; 
			height:50%;
			width:500px;
			margin:0px auto;
			margin-top:10%;
			box-shadow: 0 0px 10px black;
			background:#F5F5F5;
		}	
		
	</style>
	
	<body>
	
		<!-- 
			一个经典的模态框 
			使其显示,$("#id").modal('show')
			使其隐藏,$("#id").modal('hide')
		-->
		<div class="modal fade" id="errormsg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">登录提示</h4>
					</div>
					<div id='infoText' class="modal-body">
						${errormsg }
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
		
		<div id="login">
			<div align='center' style='margin-bottom:30px;'>
				<h2>SL会员登录</h2>
			</div>
			<form class="form form-horizontal" action="#" method="post" id="loginform">
				
				<div>
					<input required type="text" class="form-control input-lg" placeholder="请输入账号" name="userid" id='uname'>
				</div>
				<br/>
				
				<div>
					<input required type="password" class="form-control input-lg" placeholder="请输入密码" name="password" id='upwd'>
				</div>
				
				<br/>
				
				<button type="button" onclick="AjaxLogin(this)" class="btn btn-block btn-lg btn-info" data-loading-text="登录中..."> 登录 </button>
			</form>
			
			<br/>
			
			<div id='other' style="padding:20px 3px">
				<div >
					<a href="#" class="pull-left" > QQ登录 	</a>
					<a href='javascript:alert("忘记了就重新注册吧!")' class='pull-right'> 忘记密码 ? </a>
				</div>
			</div>
			
		</div>
		
    </body>
	
	<script>
		
		var name=false;
		$("#errormsg").on('hide.bs.modal',function(){
			//alert(name)
			if(name){
				$("#upwd").select();
			}else{
				$("#uname").select();
			}
		});
	
		function AjaxLogin(t){
			$(t).button("loading");
			var data=$("#loginform").serialize();
			var uname=$("#uname").val();
			var upwd=$("#upwd").val();
			if(uname.trim()!=''&&upwd.trim()!=''){
				var url='${pageContext.request.contextPath}/login.do?'+data;
				$.getJSON(url,function(rs){
					if(rs.flag=='true'){
						//alert('登录成功!')
						location.href='${pageContext.request.contextPath}/user_list.do';
					}else{
						$("#infoText").text(rs.errormsg);
						$("#errormsg").modal("show");
						name=true;
					}
					$(t).button("reset");
				});
			}else{
				$("#infoText").text("用户名或密码不能为空!");
				$("#errormsg").modal("show");
				name=false;
				$(t).button("reset");
			}
		}
		
		
	</script>
</html>