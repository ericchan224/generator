<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>官网</title>
</head>
<body>
<h1>欢迎来到官网</h1>
<ul>
    <#-- 循环导航条渲染 -->
    <#list menuItems as item>
        <li><a href="${item.url}">${item.label}</a></li>
    </#list>
</ul>
<#-- 底部版权信息（注释部分，不会被输出）-->
<footer>
    ${currentYear} 陈晨官网. All rights reserved.
</footer>
</body>
</html>