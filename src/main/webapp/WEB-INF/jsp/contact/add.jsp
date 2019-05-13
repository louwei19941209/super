<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：公共平台--公告管理 --系统公告添加
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="contact/add.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

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
                <th style="width: 80px">公司名称：</th>
                <td>
                    <input type="text" name="company" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"/>

                </td>
            </tr>

            <tr>
                <th style="width: 80px">地址：</th>
                <td>
                    <input type="text" name="address" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"/>

                </td>
            </tr>

            <tr>
                <th style="width: 80px">加盟咨询：</th>
                <td>
                    <input type="text" name="phone" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50" />

                </td>
            </tr>

            <tr>
                <th style="width: 80px">网址：</th>
                <td>
                    <input type="text" name="url" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"/>

                </td>
            </tr>

            <tr>
                <th style="width: 80px">邮箱：</th>
                <td>
                    <input type="text" name="email" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"/>

                </td>
            </tr>

            <tr>
                <th style="width: 80px">公众号：</th>
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
										
						
					
		

	

