<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/header.jsp"%>
    <title>角色管理</title>
</head>
<body class="rightBody">
<form id="form" name="form" action="/role/insert" method="post" >
    <div class="p_d_1">
        <div class="p_d_1_1">
            <div class="content_info">
    <div class="c_crumbs"><div><b></b><strong>角色管理</strong>&nbsp;-&nbsp;新增角色</div></div>
    <div class="tableH2">新增角色</div>
    <table id="baseInfo" width="100%" align="center" class="list" border="0" cellpadding="0" cellspacing="0"  >
        <tr>
            <td class="tdBg" width="200px">角色名称：</td>
            <td><input name="name" /></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">角色权限：</td>
            <td>
                <input name="privilegeIds" type="checkbox" value="1" />工作主页
                <input name="privilegeIds" type="checkbox" value="2" />行政管理
                <input name="privilegeIds" type="checkbox" value="3" />后勤服务
                <input name="privilegeIds" type="checkbox" value="4" />在线学习
                <input name="privilegeIds" type="checkbox" value="5" />纳税服务
            </td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">状态：</td>
            <td>
                <input name="state" type="radio" value="有效" checked/>有效
                <input name="state" type="radio" value="无效" />无效
            </td>
        </tr>
    </table>
    
    <div class="tc mt20">
        <input type="submit" class="btnB2" value="保存" />
        &nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button"  onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
    </div>
    </div></div></div>
    
   
</form>
</body>
</html>