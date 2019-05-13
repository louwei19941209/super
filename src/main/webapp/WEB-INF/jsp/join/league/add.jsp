<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：公共平台--公告管理 --系统公告添加
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="" enctype="multipart/form-data" onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">
            <%--<tr>
                <th style="width: 80px">标题：</th>
                <td>
                    <input type="text" name="titile" class="easyui-validatebox" required="true" data-options="validType:['length[1,50]']"  maxlength="50"   />
                    &nbsp;&nbsp;&nbsp;<label class="checkbox inline" style="margin-top: -15px">
                </td>
            </tr>--%>
            <%--<tr>
                <th>公告类型：</th>
                <td>
                    <select  name="afficheType"  class="easyui-validatebox" required="true">
                        <option value="">--请选择类型--</option>
                        <my:outOptions type="7"/>
                    </select>
                </td>
            </tr>--%>

            <tr>
                <th style="width: 80px">姓名：</th>
                <td>
                    <input type="text" name="titile" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" value="${league.name}"/>
                </td>
            </tr>
            <tr>
                <th style="width: 80px">性别：</th>
                <td>
                    <input type="text" name="sex" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" value="${league.sex}"/>
                </td>
            </tr>
            <tr>
                <th style="width: 80px">电话：</th>
                <td>
                    <input type="text" name="phone" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" value="${league.phone}"/>
                </td>
            </tr>
            <tr>
                <th style="width: 80px">省份：</th>
                <td>
                    <input type="text" name="titile" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" value="${league.pro}"/>
                </td>
            </tr>
            <tr>
                <th style="width: 80px">城市：</th>
                <td>
                    <input type="text" name="titile" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" value="${league.city}"/>
                </td>
            </tr>
            <tr>
                <th style="width: 80px">区：</th>
                <td>
                    <input type="text" name="titile" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" value="${league.area}"/>
                </td>
            </tr>


            <tr>
                <th></th>
                <td>
                    <%--<div  style="margin-top: 10px;margin-bottom: 10px;">--%>
                    <div style="text-align:center;">
                        <%--<button type="submit" class="btn btn-primary">保存</button>&nbsp;&nbsp;&nbsp;&nbsp;--%>
                        <%--  <button type="button" class="btn clear" >清空</button>--%>
                    </div>
                </td>
            </tr>

        </table>

        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>
										
						
					
		

	

