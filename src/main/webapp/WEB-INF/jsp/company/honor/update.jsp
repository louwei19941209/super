<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：荣誉 修改
--%>

<div style="width: 98%;margin: 0 auto ;">

    <form method="post" action="enterprisehonor/update.do" enctype="multipart/form-data" onsubmit="return validateSubmitForm(this)">

        <table class="table table-bordered ">
           <%-- <tr>
                <th style="width: 80px">标题：</th>
                <td>
                    <input type="text" name="titile" class="easyui-validatebox" required="true"
                           data-options="validType:['length[1,50]']" maxlength="50"
                           value="<c:out value="${requestScope.enterpriseHonor.titile }" />"/>

                </td>
            </tr>--%>

            <tr>
                <th>内容：</th>
                <td>
                    <textarea name="content" rows="5" <%--class="editor"--%>
                              style="width: 98%;">${enterpriseHonor.content}</textarea>
                </td>
            </tr>

            <tr>
                <th>荣誉图：</th>


                <td>
                    <%--<img src="${enterpriseHonor.image}">--%>
                        <c:if test="${requestScope.files != null}">
                            <c:forEach var="f" items="${requestScope.files }">
                                <c:url var="url_download" value="${f.path}">
                                    <%--<c:param name="newName" value="${f.new_name }"/>
                                    <c:param name="name" value="${f.old_name}"/>
                                    <c:param name="ext" value="${f.ext}"/>--%>
                                </c:url>
                                <div><a href="${url_download }" target="_blank">
                                    <img src="resource/images/icons/${f.ext }.gif"
                                         onerror="javascript:this.src='resource/images/icons/page.gif'"
                                         align="top"/>&nbsp;<c:out value="${f.old_name }"/>&nbsp;&nbsp;&nbsp;下载</a>
                                    &nbsp;&nbsp;
                                </div>

                            </c:forEach>
                        </c:if>
                </td>
                <td>
                    <input type="file" name="file" multiple class="easyui-validatebox">
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

        <input type="hidden" name="id" value="${requestScope.enterpriseHonor.id }"/>
        <input type="hidden" name="datagridId" value="${param.rel }_datagrid"/>
        <input type="hidden" name="currentCallback" value="close"/>

    </form>
</div>
										
						
					