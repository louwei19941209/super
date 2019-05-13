<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/commons/include.inc.jsp" %>
<%--
	模块：新闻列表页
--%>

<div id="${param.rel}_toolbar" class="search-div">
    <form onsubmit="return datagridSearch(this,'${param.rel }_datagrid');">
        <div class="search-content ">
			<span>
				<label>标题：</label>
				<input type="text" name="titile" class="span2"/>
				&nbsp;<i class="boot_icon-question-sign" selectLike="tooltip"></i>
			</span>


        </div>

        <div class="search-toolbar">
			<span style="float:left;">
				<%--<a class="easyui-linkbutton clearDgChecked"  icon="icon-redo"	plain="true"  title="清空所有勾选项" >清空勾选</a>--%>
				

					<a class="easyui-linkbutton" icon="icon-add" plain="true"
                       href="news/addPage.do?rel=${param.rel }" target="dialog" width="1000" height="450"
                       rel="${param.rel }_add" title="添加新闻">添加</a>

					<a class="easyui-linkbutton" icon="icon-edit" plain="true"
                       href="news/update/page.do?id={id}&rel=${param.rel}" target="dialog" width="1000"
                       height="1000" rel="${param.rel}_update" warn="请先选择一条信息" title="编辑">编辑</a>


					<a class="easyui-linkbutton" icon="icon-remove" plain="true"
                       href="news/delete.do" target="selectedTodo" title="确定要删除吗?" warn="至少勾选一个">批量删除</a>

				
				<%--<a class="easyui-linkbutton"  icon="ui-icon-excel" plain="true"
				   href="info/export.do"  targetType="export" >导出</a>--%>
			</span>


            <span style="float:right">
				<button class="btn btn-primary btn-small" type="submit">查询</button>&nbsp;
				<button class="btn btn-small clear" type="button">清空</button>&nbsp;
			</span>

        </div>
    </form>

</div>

<table id="${param.rel }_datagrid" toolbar="#${param.rel}_toolbar"></table>


<script type="text/javascript">
    <!--

    $(function () {

        $('#<%=request.getParameter("rel")%>_datagrid').datagrid({
            nowrap: false,
            url: "news/select/by/page.do",
            columns: [[

                {
                    field: "ck",
                    title: "勾选",
                    checkbox: true
                },
                {
                    field: "titile",
                    title: "标题",
                    width: 150,
                    align: "center",
                    sortable: true
                },
				{
                    field: "type",
                    title: "类型",
                    width: 150,
                    align: "center",
                    sortable: true,
					formatter: function (value, row, index) {
                        if (value === "1") {
                            return "新闻快讯";
						} else {
                            return "媒体报道"
						}
                    }

                },
                {
                    field: "createTime",
                    title: "创建时间",
                    width: 150,
                    align: "center",
                    sortable: true,
                    formatter: function (value, row, index) {
                        return new Date(value).format("yyyy-MM-dd  HH:mm:ss");
                    }

                }

            ]]
        });

    });

    //-->
</script>
