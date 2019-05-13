<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：公共平台--公告管理--系统公告修改
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="franchisee/update.do" enctype="multipart/form-data"
          onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">
           <%-- <tr>
                <th style="width: 80px">标题：</th>
                <td>
                    <input type="text" name="titile"  class="easyui-validatebox" required="true" data-options="validType:['length[1,50]']"  maxlength="50"   value=""/>

                </td>
            </tr>--%>
               <tr>
                   <th style="width: 80px">标题：</th>
                   <td>
                       <input type="text" name="title" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${franchisee.title}"/>

                   </td>
               </tr>

               <tr>
                   <th style="width: 80px">专访人物：</th>
                   <td>
                       <input type="text" name="characters" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${franchisee.characters}"/>

                   </td>
               </tr>

               <tr>
                   <th style="width: 80px">人物描述：</th>
                   <td>
                       <input type="text" name="description" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${franchisee.description}"/>

                   </td>
               </tr>


               <tr>
                   <th style="width: 80px">人物身份：</th>
                   <td>
                       <input type="text" name="identity" class="easyui-validatebox" required="true"
                              data-options="validType:['length[1,50]']" maxlength="50" value="${franchisee.identity}"/>

                   </td>
               </tr>

               <tr>
                   <th>详情：</th>
                   <td>
                       <textarea name="details" rows="5" <%--class="editor"--%> style="width: 98%;">${franchisee.details}</textarea>
                   </td>
               </tr>


               <tr>
                   <th>人物图片：</th>
                   <td>
                       <img src="${franchisee.image}">
                   </td>
                   <td>
                       <input  type="file" name="file" class="easyui-validatebox">
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

        <input type="hidden" name="id" value="${requestScope.franchisee.id }"/>
        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>
										
						
					