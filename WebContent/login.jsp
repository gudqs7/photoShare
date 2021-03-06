<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>登录页面</title>
<meta charset='utf-8'>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://static.geetest.com/static/tools/gt.js"></script>

</head>

<style>
body {
	background: #F1F1F1;
}

input{outline:none} 

#login {
	padding: 30px 50px;
	height: 50%;
	width: 400px;
	border-radius: 5px;
	margin: 0px auto;
	margin-top: 10%;
	box-shadow: 0 0px 20px #ccc;
	background: #fff;
}

.jian {
	color: #969696;
	padding: 10px;
	margin: 0px 25px;
}

.jian:hover {
	text-decoration: none;
	color: #EA6F5A;
	border-bottom: 2px solid #EA6F5A;
}

.now {
	color: #EA6F5A;
	border-bottom: 2px solid #EA6F5A;
	font-weight: bold;
}

b {
	color: #969696;
}

.line {
	background-color: #C8C8C8;
	height: 1px;
	width: 100%;
}

.foot {
	display: inline;
	border: none;
	padding: 15px 10px;
	margin-left: 8px;
	background: #F7F7F7;
}

.top {
	display: inline;
	border: none;
	padding: 15px 10px;
	margin-left: 8px;
	background: #F7F7F7;
}

.left {
	padding-left: 20px;
}

#area {
	border: 1px solid #C8C8C8;
	border-radius: 5px;
	background: #F7F7F7;
}

#notice, #wait {
	border: 1px solid #C8C8C8;
	border-radius: 5px;
	background: #F7F7F7;
	padding: 10px 20px;
	margin-top: 20px;
}
</style>

<body>

	<!-- 
			一个经典的模态框 
			使其显示,$("#id").modal('show')
			使其隐藏,$("#id").modal('hide')
		-->
	<div class="modal fade" id="errormsg" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">登录提示</h4>
				</div>
				<div id='infoText' class="modal-body">${errormsg }</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>

	<div id="login">
		<div align='center' style='margin-top:30px;margin-bottom:70px'>
			<h4>
				<a class='now jian' href='login.jsp'>登录</a> <b>·</b> <a
					class='jian' href='register.jsp'>注册</a>
			</h4>
		</div>


		<div id='area'>
			<div>
				<span class="glyphicon glyphicon-user left" style="color: #959595;"></span>
				<input required type="tel" class="top" placeholder="请输入手机号"
					name="userid" id='phone'>

			</div>
			<div class='line'></div>
			<div>
				<span class="glyphicon glyphicon-lock left" style="color: #959595;"></span>
				<input required type="password" class="foot" placeholder="请输入密码"
					name="password" id='pwd'>
			</div>
		</div>

		<br />
		<!-- 留着放验证码 -->
		<div id="embed-captcha"></div>
		<p id="wait" class="show">正在加载验证码......</p>
		<p id="notice" class="hide">请先拖动验证码到相应位置</p>

		<br>
		<button type="button" id="embed-submit"
			class="btn btn-block btn-lg btn-primary" data-loading-text="登录中...">
			登录</button>
		<a href="other.jsp" class="btn btn-block btn-lg btn-success">
			通过短信验证码登录 </a> <br />
	</div>

</body>

<script>
	var isVefiry = false;
	var handlerEmbed = function(captchaObj) {
		$("#embed-submit").click(function(e) {
			var validate = captchaObj.getValidate();
			if (!validate) {
				$("#notice")[0].className = "show";
				setTimeout(function() {
					$("#notice")[0].className = "hide";
				}, 2000);
				e.preventDefault();
			} else {
				console.log("ok");
			}
		});
		// 将验证码加到id为captcha的元素里，同时会有三个input的值：geetest_challenge, geetest_validate, geetest_seccode
		captchaObj.appendTo("#embed-captcha");
		captchaObj.onReady(function() {
			$("#wait")[0].className = "hide";
		});
		captchaObj
				.onSuccess(function() {
					var validate = captchaObj.getValidate();
					$
							.ajax({
								url : "${pageContext.request.contextPath}/gtverify", // 进行二次验证
								type : "post",
								dataType : "json",
								data : {
									username : $('#phone').val(),
									password : $('#pwd').val(),
									geetest_challenge : validate.geetest_challenge,
									geetest_validate : validate.geetest_validate,
									geetest_seccode : validate.geetest_seccode
								},
								success : function(data) {
									if (data && (data.status === "success")) {
										isVefiry = true;
									} else {
										isVerify = false;
										$
												.ajax({
													// 获取id，challenge，success（是否启用failback）
													url : "${pageContext.request.contextPath}/gtregister?t="
															+ (new Date())
																	.getTime(), // 加随机数防止缓存
													type : "get",
													dataType : "json",
													success : function(data) {
														// 使用initGeetest接口
														// 参数1：配置参数
														// 参数2：回调，回调的第一个参数验证码对象，之后可以使用它做appendTo之类的事件
														initGeetest(
																{
																	gt : data.gt,
																	challenge : data.challenge,
																	product : "float", // 产品形式，包括：float，embed，popup。注意只对PC版验证码有效
																	offline : !data.success
																// 表示用户后台检测极验服务器是否宕机，一般不需要关注
																// 更多配置参数请参见：http://www.geetest.com/install/sections/idx-client-sdk.html#config
																}, handlerEmbed);
													}
												});
									}
								}
							});
				});
		// 更多接口参考：http://www.geetest.com/install/sections/idx-client-sdk.html
	};
	$.ajax({
		// 获取id，challenge，success（是否启用failback）
		url : "${pageContext.request.contextPath}/gtregister?t="
				+ (new Date()).getTime(), // 加随机数防止缓存
		type : "get",
		dataType : "json",
		success : function(data) {
			// 使用initGeetest接口
			// 参数1：配置参数
			// 参数2：回调，回调的第一个参数验证码对象，之后可以使用它做appendTo之类的事件
			initGeetest({
				gt : data.gt,
				challenge : data.challenge,
				product : "float", // 产品形式，包括：float，embed，popup。注意只对PC版验证码有效
				offline : !data.success
			// 表示用户后台检测极验服务器是否宕机，一般不需要关注
			// 更多配置参数请参见：http://www.geetest.com/install/sections/idx-client-sdk.html#config
			}, handlerEmbed);
		}
	});
</script>

<script>
	var name = false;
	$("#errormsg").on('hide.bs.modal', function() {
		//alert(name)
		if (name) {
			$("#upwd").select();
		} else {
			$("#uname").select();
		}
	});

	$("#embed-submit")
			.click(
					function() {
						if (!isVefiry) {
							return;
						}
						var that = this;
						$(that).button("loading");
						var uname = $("#phone").val();
						var upwd = $("#pwd").val();
						if (uname.trim() != '' && upwd.trim() != '') {
							var data = 'phone=' + uname + '&pwd=' + upwd;
							var url = '${pageContext.request.contextPath}/login_pwd.do?'
									+ data;
							$
									.getJSON(
											url,
											function(rs) {
												if (rs.flag == 'true') {
													//alert('登录成功!')
													location.href = '${pageContext.request.contextPath}/try.html';
												} else {
													$("#infoText").text(
															rs.errormsg);
													$("#errormsg")
															.modal("show");
													name = true;
												}
												$(that).button("reset");
											});
						} else {
							$("#infoText").text("用户名或密码不能为空!");
							$("#errormsg").modal("show");
							name = false;
							$(that).button("reset");
						}
					});
</script>
</html>