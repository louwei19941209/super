<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：公共平台--公告管理--系统公告修改
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="productcategories/update.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">

            <tr>
                <th style="width: 80px">标题：</th>
                <td>
                    <input type="text" name="type"  class="easyui-validatebox" required="true" data-options="validType:['length[1,50]']"  maxlength="50"   value="${productCategories.type}"/>

                </td>
            </tr>

            <tr>
                <th>图片：</th>
                <td>
                    <img src="${productCategories.image}">
                </td>
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
                        <%--<button type="button" class="btn clear" >清空</button>--%>
                    </div>
                </td>
            </tr>

        </table>

        <input type="hidden" name="id" value="${requestScope.productCategories.id }"/>
        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>
										
						
					