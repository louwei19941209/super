<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：核心竞争 添加页面
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="hexin/add.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">
            <tr>
                <th style="width: 80px">标题：</th>
                <td>
                    <input type="text" name="title" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"/>

                </td>
            </tr>
            <tr>
                <th>序号：</th>
                <td>
                    <input type="text" name="number" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"/>
                </td>
            </tr>

            <tr>
                <th style="width: 80px">内容：</th>
                <td>
                    <textarea name="content" rows="5"  style="width: 98%;"></textarea>
                </td>
            </tr>


            <tr>
                <th>序号图片：</th>
                <td>
                    <input type="file" name="file">
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

        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>

<script type="text/javascript">

    /*$(function () {
        $.ajax({
            url: 'productcategories//select/by/page.do',
            type: 'POST',
            dataType: 'json',
            success: function (data) {
                console.log(data);
                $.each(data.rows, function (index, value) {
                    $('#type').append("<option value=" + value.id + ">" + value.type + "</option>");
                });
            }
        });
    })*/

</script>
					
		

	

