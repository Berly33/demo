<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
</head>
<% String err = (String) request.getAttribute("err");
%>
<body style="background-color: grey">
<div class="container" style="background-color: white; margin-top: 200px;width: 500px;">
    <div class="text-center" style="margin: 50px;">
        <h1 class="h1">登录界面</h1>
        <form action="/login" method="post">
            <div class="form-group input-group">
                <label class="input-group-addon" for="username">用户名</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名">
            </div>
            <div class="form-group input-group">
                <label class="input-group-addon" for="password">密码</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
            </div>
            <% if(err !=null){%>
            <span style="color: red">帐号密码错误</span>
            <% }%>
            <button type="submit" class="btn btn-success btn-group-sm">登录</button>
            <a href=" " type="button" class="btn btn-primary btn-group-sm">去注册</a >
        </form>
    </div>
</div>

</body>
</html>」

