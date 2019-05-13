<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：运动团队 修改
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="ifbbnutritionteam/update.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">
            <tr>
                <th style="width: 80px">名称：</th>
                <td>
                    <input type="text" name="name" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"
                           value="<c:out value="${requestScope.ifbbNutritionTeam.name }" />"/>

                </td>
            </tr>

            <tr>
                <th>身份：</th>
                <td>
                    <textarea name="identity" rows="5" style="width: 98%;">${ifbbNutritionTeam.identity}</textarea>
                </td>
            </tr>

            <tr>
                <th>简介：</th>
                <td>
                    <textarea name="introduction" rows="5" <%--class="editor"--%>
                              style="width: 98%;">${ifbbNutritionTeam.introduction}</textarea>
                </td>
            </tr>

            <tr>
                <th>人物图：</th>


                <td>
                    <img src="${ifbbNutritionTeam.image}">
                </td>
                <td>
                    <input type="file" name="file" class="easyui-validatebox">
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

        <input type="hidden" name="id" value="${requestScope.ifbbNutritionTeam.id }"/>
        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>
										
						
					