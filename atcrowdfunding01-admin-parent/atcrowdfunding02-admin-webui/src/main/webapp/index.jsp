<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2020/10/22
  Time: 9:15 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <script type="text/javascript" src="jquery/jquery-2.1.1.min.js"></script>
<%--    <script type="text/javascript" src="https://cdn.bootcdn.net/ajax/libs/jquery/2.1.1/jquery.min.js"></script>--%>
    <script type="text/javascript">
        // $(function() {
        //     $("#btn1").click(function () {
        //         $.ajax({
        //             "url": "send/array.html",
        //             "type": "post",
        //                          "data": {
        //                              "array":[5,8,12]
        //                          },
        //                          "dataType": "text",
        //                  "success":function (response) { //response是响应体参数
        //                     alert(response)
        //                 },
        //                 "error":function (response) {
        //                     alert(response)
        //                 }
        //             }
        //         )
        //     })
        // })
        $(function(){
            $("#btn1").click(function () {
                // $.get();
                // $.post();
                $.ajax({
                    "url": "send/array.html",
                    "type": "post",
                    "data": {
                        "array":[5,8,12]
                    },
                    "dataType": "text",
                    "success": function(response) {

                    },
                    "error": function(response) {

                    }
                })
            })
        })
    </script>
</head>

<body>
    <a href="test/ssm.html">测试ssm整合环境</a>

    <br/>

    <button id="btn1">Send [5,8,12] One</button>
</body>
</html>
