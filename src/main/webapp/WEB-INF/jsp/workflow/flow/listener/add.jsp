<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：工作流程--流程管理----监听器管理--添加监听器
--%>

<div style="width: 600px;margin: 0 auto;" >
				
<form method="post" action="flowListener/add.do" onsubmit="return validateSubmitForm(this)">
						
	 <table class="table table-bordered ">
			
			<tr>
				<th style="width: 70px">名称：</th>
				<td>
					<input  type="text" name="name"  class="easyui-validatebox" required="true" validType="minlength[1]"  maxlength="255" />
				</td>
			</tr>
			<tr>
				<th>类型：</th>
				<td>
					<select   name="type" onchange="changeLsType(this)"  class="easyui-validatebox" required="true">
						<option value="">--请选择--</option>
						<option value="1">执行监听器</option>
						<option value="2">用户任务监听器</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>事件：</th>
				<td>
					<%-- 执行监听器 --%>
					<label class="execution_event radio inline" style="display: none;"><input type="radio" name="event" value="start"/>start</label>
					<label class="execution_event radio inline" style="display: none;"><input type="radio" name="event" value="end"/>end</label>
					<label class="execution_event radio inline" style="display: none;"><input type="radio" name="event" value="take"/>take</label>
					<%-- 用户任务监听器 --%>
					<label class="task_event radio inline" style="display: none;"><input type="radio" name="event" value="create"/>create</label>
					<label class="task_event radio inline" style="display: none;"><input type="radio" name="event" value="assignment"/>assignment</label>
					<label class="task_event radio inline" style="display: none;"><input type="radio" name="event" value="complete"/>complete</label>
					
				</td>
			</tr>
			<tr>
				<th>执行类型：</th>
				<td>
					<select  name="valueType" class="easyui-validatebox" required="true" >
						<option value="">--请选择--</option>
						<option value="1">Java Class</option>
						<option value="2">expression</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>执行内容:</th>
				<td>
					<textarea  name="value" class="easyui-validatebox" required="true" validType="minlength[1]" rows="2" style="width: 400px;" maxlength="255"></textarea>
					<br/><span class="text-info">类全名,或表达式。根据选择的执行类型填写。</span>
				</td>
			</tr>
			<tr>
				<th>备注：</th>
				<td>
					<textarea  name="desc"  rows="2" style="width: 400px;" maxlength="255"></textarea>
				</td>
			</tr>
			<tr>
				<th></th>
				<td>
					<div  style="margin-top: 10px;margin-bottom: 10px;">
						  <button type="submit" class="btn btn-primary" >保存</button>&nbsp;&nbsp;&nbsp;&nbsp;
						  <button type="button" class="btn clear" >清空</button>
					</div>
				</td>
			 </tr>
		 </table>	 
	
	
	 <input type="hidden" name="datagridId" value="${param.rel }_datagrid" />	
	 <input type="hidden" name="currentCallback" value="close" />
	
</form>

</div>

<script type="text/javascript">
<!--
	//修改监听器类型
	function changeLsType(sel){
		
		var $this=$(sel);
		var $form=$this.closest("form");
		if($this.val()=="1"){
			//执行监听器
			$(".task_event",$form).hide().find("input").removeAttr("checked");
			$(".execution_event",$form).show().find("input[value='start']").prop("checked",true);
			
		}else if($this.val()=="2"){
			//任务监听器
			$(".execution_event",$form).hide().find("input").removeProp("checked");
			$(".task_event",$form).show().find("input[value='create']").prop("checked",true);
		}else{
			$(".execution_event",$form).hide().find("input").removeProp("checked");
			$(".task_event",$form).hide().find("input").removeProp("checked");
		}
	}
//-->
</script>									
						
					
		

	

