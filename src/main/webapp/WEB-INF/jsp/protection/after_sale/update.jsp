<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：售后保障 修改
--%>


<script type="text/javascript">



</script>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="protection/update.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">
            <tr>
                <th style="width: 80px">标题：</th>
                <td>
                    <input type="text" name="titile" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" value="${protection.titile}"/>

                </td>
            </tr>

            <tr>
                <th style="width: 80px">内容：</th>
                <td>
                    <textarea name="content" rows="5" class="editor"  style="width: 98%;">${protection.content}</textarea>
                </td>
            </tr>


            <tr>
                <th></th>
                <td>
                    <%--<div  style="margin-top: 10px;margin-bottom: 10px;">--%>
                    <div style="text-align:center;">
                        <button type="submit" class="btn btn-primary">保存</button>&nbsp;&nbsp;&nbsp;&nbsp;
                        <%--  <button type="button" class="btn clear" >清空</button>--%>
                    </div>
                </td>
            </tr>

        </table>
        <input type="hidden" name="id" value="${requestScope.protection.id }"/>
        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>


					
		

	

