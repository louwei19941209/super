<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp"%>
<%@include file="/WEB-INF/jsp/commons/jstl_message_tld.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"	+ request.getServerName() + ":" + request.getServerPort()	+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>超能鹿战队</title>
	<link href="favicon.ico" rel="SHORTCUT ICON" />
	<script type="text/javascript">
	<!--
		appWebRoot='<%=basePath%>';//网站地址
	//-->
	</script>
	
	<%@ include file="/WEB-INF/jsp/commons/include.head.jsp"%>


</head>
<body >
	<div id="sy_layout" class="easyui-layout" fit="true">
	
		<!-- 顶部-->
		<div  region="north" border="false"  style="height: 60px; padding: 1px; overflow: hidden;" >
			<div style="float: left;">
				<%--<img src="resource/images/logo/w_logo.png" style="margin-top: 5px;margin-left: 20px;"/>--%>
				<%--<img src="resource/images/logo/logo.png"   style="margin-left: 7px;margin-top: 5px;"/>--%>
			
			</div>
			
			<div style="padding-top:15px;background-color: #F9F9F9;height: 100%">
				
					<div style="float: right;">
					    <!--<a href="javascript:void(0);" class="easyui-linkbutton" plain="true" iconCls="ui-icon-lock" onclick="MUI.openDialog('系统已锁定','sy_login/lock.do?rel=jm_look','jm_look',{width:500,height:200,collapsible:false,minimizable:false,maximizable:false,closable:false,modal:true,resizable:false,draggable:false})" title="锁定系统界面"></a>-->
						
						<a href="javascript:void(0);" class="easyui-menubutton"
							menu="#layout_north_gryhMenu" iconCls="ui-icon-cog">当前用户：<my:loginTrueName type="trueName"/></a>
						
					</div>
					
					<%-- 隐藏菜单 --%>
					<div id="layout_north_gryhMenu"	style="width:150px;display: none;">
						
						<div iconCls="icon-back" onclick="goOutSystem()">安全退出</div>
						<div class="menu-sep"></div>
						<%--<div>
							<span>个人中心</span>
							<div style="width:150px;">
								<div onclick="MUI.openDialog('个人信息','user/my/info.do?rel=grbg_grse_myinfo','grbg_grse_myinfo',{width:1000,height:450})">个人信息</div>
								<div onclick="MUI.openDialog('登陆日志','log/login/my.do?rel=grbg_grse_log','grbg_grse_log',{width:1000,height:450})">登陆日志</div>
								<div onclick="MUI.openDialog('登陆管理','user/my/loginInfo.do?rel=main_login_info','main_login_info',{width:1000,height:450})">登陆管理</div>
								<div onclick="MUI.openDialog('修改密码','user/updateMyPwPage.do?rel=grsz_xgmm','grsz_xgmm',{width:750,height:350})">修改密码</div>
							</div>
						</div>--%>
						<div>
							<span>更换主题</span>
							<div style="width:150px;">
								<div onclick="changeEasyUITheme('default');">默认</div>
								<div onclick="changeEasyUITheme('gray');">灰色</div>
								<div onclick="changeEasyUITheme('bootstrap');">bootstrap</div>
								<div onclick="changeEasyUITheme('black');">黑色</div>
								<%--<div class="menu-sep"></div>
								<div onclick="changeEasyUITheme('cupertino');">cupertino</div>
								<div onclick="changeEasyUITheme('dark-hive');">dark-hive</div>
								<div onclick="changeEasyUITheme('pepper-grinder');">pepper-grinder</div>
								<div onclick="changeEasyUITheme('sunny');">sunny</div>
								--%><div class="menu-sep"></div>
								<div onclick="changeEasyUITheme('metro');">地铁</div>
								<div onclick="changeEasyUITheme('metro-blue');">地铁蓝</div>
								<div onclick="changeEasyUITheme('metro-gray');">地铁灰</div>
								<div onclick="changeEasyUITheme('metro-green');">地铁绿</div>
								<div onclick="changeEasyUITheme('metro-orange');">地铁橙</div>
								<div onclick="changeEasyUITheme('metro-red');">地铁红</div>
							</div>
						</div>

					</div>
					
				
					<div id="div_top_2" >
					
						
						<%--<shiro:hasPermission name="instantMessage:read">
						
							<div >
							<a  href="instantMessage/load.do?rel=top_grbg_jsgt"  target="dialog"  width="1000" height="450" rel="top_grbg_jsxgt" title="即时沟通">
								<img src="resource/images/menu/reply.gif" alt="即时沟通" style="vertical-align:middle;"/>(<span style="color: red" id="ft_jhst">0</span>)</a>
							</div>	
						</shiro:hasPermission>
					
						
							<div >
							<a  href="msgwarn/load.do?rel=top_grbg_xxtx" title="消息提醒"  target="dialog"  width="1000" height="450"  rel="top_grbg_xxtx">
								<img src="resource/images/menu/msg.gif" alt="消息提醒" style="vertical-align:middle;"/>(<span style="color: red" id="ft_xxtx">0</span>)</a>
							</div>
						
						
						<shiro:hasPermission name="schedule:read"> 	
							<div >
							<a  href="schedule/load.do?rel=top_grbg_rcap" title="日程安排"  target="dialog"  width="1000" height="450" rel="top_grbg_rcap">
								<img src="resource/images/menu/Schedule.gif" alt="日程安排" style="vertical-align:middle;"/>(<span style="color: red" id="ft_rcap">0</span>)</a>
							</div>
						</shiro:hasPermission>
						
						<shiro:hasPermission name="email/loadIn.do">
						
							<div >
							<a  href="email/loadIn.do?rel=top_grbg_nbyj_sjx&status=0" title="未读邮件"  target="dialog"  width="1000" height="450" rel="top_grbg_nbyj_sjx">
								<img src="resource/images/menu/mail_new.gif" alt="未读邮件" style="vertical-align:middle;"/>(<span style="color: red" id="ft_wdyj">0</span>)</a>
							</div>
						</shiro:hasPermission>
						
						
						<shiro:hasPermission name="task:read"> 		
						<div >
							<a  href="task/todo/load.do?rel=top_gzlc_dbrw"  target="dialog"  width="1000" height="450" rel="top_gzlc_dbrw" title="待办任务">
							<img src="resource/images/menu/flow.gif" alt="待办任务" style="vertical-align:middle;"/>(<span style="color: red" id="ft_flow_haveDo">0</span>)</a>
						</div>
						</shiro:hasPermission>--%>
						
						<div style="width: 200px;"><span id="clock"  ></span></div>
					
				
						
				
					</div>
				
			</div>
		</div>
		
		<!-- 中间工作区-->
		<div id="mainPanle" region="center" style="overflow: hidden;padding:1px">
			
			<div  class="easyui-tab" id="mainWorkTab" fit="true" border="false" tabHeight="35" >
				<!-- 首页 -->
				<%--<div   title="<img src='resource/images/menu/1_close.png'/> 首页"  >
							
					   <div id="sy_layout" class="easyui-layout" fit="true">
								<!-- 左侧-->
								&lt;%&ndash;<div region="west" split="true"  title="导航菜单" style="width:230px; padding: 1px;">
									<%@ include file="/WEB-INF/jsp/main/left.jsp"%>
								</div>&ndash;%&gt;
								<!-- 中间-->
								&lt;%&ndash;<div  region="center" style="overflow: hidden;border-top: none" >
								
									<div  class="maintabs"  fit="true" border="false" >
										<div  id="tab-mainPage" title="首页"  href="main/home.do"	tools="#tab-mainPage_tools">
											
										</div>
										
									</div>
								</div>&ndash;%&gt;
					  </div>
				</div>--%>
				
				<c:forEach var="m" items="${requestScope.menus }" >
					<c:if test="${m.id!='0' }">
					<div   title="<img src='${m.menuIcon }'> ${m.menuName }"  href="menu/my_menu.do?id=${m.id }">
					
					</div>
					</c:if>
				</c:forEach>
				
			</div>
			
		</div>
		
		<!-- 底部 -->
		<div region="south" border="false"  style="height: 30px; overflow: hidden;">
		
			<div id="div_footer" >
	
				 Copyright &copy; 2018
				
			</div>
		</div>
		<script type="text/javascript">
			
			<!--
				//获取一些基本信息
				
				var scheduleWarn=<%=request.getAttribute("scheduleWarn") %>;
				
				var msgWarnTime=<%=request.getAttribute("msgWarnTime") %>;
			 
				loginUserId='<%=(String)request.getAttribute("userId") %>';
				loginName='<%=(String)request.getAttribute("trueName") %>';
				loginDeptId='<%=(String)request.getAttribute("deptId") %>';
				loginDeptName='<%=(String)request.getAttribute("deptName") %>';
				$(function(){
					var isLock=<%=session.getAttribute("lock") %>;
					if(isLock){
						//锁定界面
						MUI.openDialog('系统已锁定','sy_login/lock.do?rel=jm_look','jm_look',{width:500,height:200,collapsible:false,minimizable:false,maximizable:false,closable:false,modal:true,resizable:false,draggable:false});
					}
				});
				
			//-->
		</script>
		<%@ include file="/WEB-INF/jsp/main/commons-menu.jsp"%>
	
	</div>
</body>
</html>