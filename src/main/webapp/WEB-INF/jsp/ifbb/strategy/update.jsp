<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：IFBB战略 修改
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="ifbbstrategy/update.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">

            <tr>
                <th style="width: 100px">战略内容：</th>
                <td>
                    <textarea name="content" rows="5" class="editor" style="width: 100%;">${ifbbStrategy.content}</textarea>
                </td>
            </tr>

            <tr>
                <th>配图：</th>


                <td>
                    <img src="${ifbbStrategy.image}">
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

        <input type="hidden" name="id" value="${requestScope.ifbbStrategy.id }"/>
        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>
										
						
					