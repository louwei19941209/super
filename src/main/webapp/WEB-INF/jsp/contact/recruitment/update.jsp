<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：公共平台--公告管理--系统公告修改
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="recruitment/update.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">
           <%-- <tr>
                <th style="width: 80px">标题：</th>
                <td>
                    <input type="text" name="titile"  class="easyui-validatebox" required="true" data-options="validType:['length[1,50]']"  maxlength="50"   value=""/>

                </td>
            </tr>--%>
               <tr>
                   <th style="width: 80px">职务：</th>
                   <td>
                       <input type="text" name="position" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${recruitment.position}"/>

                   </td>
               </tr>

               <tr>
                   <th style="width: 80px">招聘人数：</th>
                   <td>
                       <input type="text" name="number" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${recruitment.number}"/>

                   </td>
               </tr>

               <tr>
                   <th style="width: 80px">招聘限制：</th>
                   <td>
                       <input type="text" name="restricts" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${recruitment.restricts}"/>

                   </td>
               </tr>


               <tr>
                   <th style="width: 80px">任职资格：</th>
                   <td>
                       <%--<input type="text" name="qualifications" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${recruitment.qualifications}"/>--%>
                       <textarea name="qualifications" rows="5" <%--class="editor"--%> style="width: 98%;">${recruitment.qualifications}</textarea>
                   </td>
               </tr>

               <tr>
                   <th style="width: 80px">发送简历地址：</th>
                   <td>
                       <input type="text" name="resume" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${recruitment.resume}"/>

                   </td>
               </tr>

               <tr>
                   <th>工资待遇：</th>
                   <td>
                       <%--<input type="text" name="treatment" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${recruitment.treatment}"/>--%>
                       <textarea name="treatment" rows="5" <%--class="editor"--%> style="width: 98%;">${recruitment.treatment}</textarea>
                   </td>
               </tr>


            <tr>
                <th></th>
                <td>
                    <%--<div  style="margin-top: 10px;margin-bottom: 10px;">--%>
                    <div style="text-align:center;">
                        <button type="submit" class="btn btn-primary">保存</button>&nbsp;&nbsp;&nbsp;&nbsp;
                        <%--<button type="button" class="btn clear" >清空</button>--%>
                    </div>
                </td>
            </tr>

        </table>

        <input type="hidden" name="id" value="${requestScope.recruitment.id }"/>
        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>
										
						
					