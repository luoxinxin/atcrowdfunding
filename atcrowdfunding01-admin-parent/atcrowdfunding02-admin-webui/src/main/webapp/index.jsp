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
        $(function(){
            $("#btn1").click(function () {
                // $.get();
                // $.post();
                $.ajax({
                    "url": "send/array/one.html",
                    "type": "post",
                    "data": {
                        "array":[5,8,12]
                    },
                    "dataType": "text",
                    "success": function(response) {
                        alert(response);

                    },
                    "error": function(response) {
                        alert(response);
                    }
                })
            })


            $("#btn2").click(function () {
                // $.get();
                // $.post();
                $.ajax({
                    "url": "send/array/two.html",
                    "type": "post",
                    "data": {
                        "array[0]":5,
                        "array[1]":8,
                        "array[2]":12
                    },
                    "dataType": "text",
                    "success": function(response) {
                        alert(response);

                    },
                    "error": function(response) {
                        alert(response);
                    }
                })
            })

            var array = [5,8,12];
            var requestBody = JSON.stringify(array);

            $("#btn3").click(function () {
                // $.get();
                // $.post();
                $.ajax({
                    "url": "send/array/three.html",
                    "type": "post",
                    "data": requestBody,
                    "contentType":"application/json;charset=UTF-8",
                    "dataType": "text",
                    "success": function(response) {
                        alert(response);

                    },
                    "error": function(response) {
                        alert(response);
                    }
                })
            })

            $("#btn4").click(function (){
                var student = {
                    "stuId":5,
                    "stuName":"tom",
                    "address":{
                        "province":"shanghai",
                        "city":"huangpu",
                        "street":"hello"
                    },
                    "schoolList":[
                        {
                            "subjectName":"shuxue",
                            "subjectScore":22
                        }
                    ],
                    "map":{
                        "yingyu":"100",
                        "shuxue":"20"
                    }
                }

                var requestBody = JSON.stringify(student);
                $.ajax({
                    "url":"send/compose/object.html",
                    "type":"post",
                    "data":requestBody,
                    "contentType":"application/json;charset=UTF-8",
                    "dataType":"text",
                    "success":function(response){
                        console.log(response);
                    },
                    "error":function(response){
                        console.log(response);
                    }
                })
            })

            $("#btn5").click(function (){
                var student = {
                    "stuId":5,
                    "stuName":"tom",
                    "address":{
                        "province":"shanghai",
                        "city":"huangpu",
                        "street":"hello"
                    },
                    "schoolList":[
                        {
                            "subjectName":"shuxue",
                            "subjectScore":22
                        }
                    ],
                    "map":{
                        "yingyu":"100",
                        "shuxue":"20"
                    }
                }

                var requestBody = JSON.stringify(student);
                $.ajax({
                    "url":"send/compose/object_result.html",
                    "type":"post",
                    "data":requestBody,
                    "contentType":"application/json;charset=UTF-8",
                    "dataType":"json",
                    "success":function(response){
                        console.log(response);
                    },
                    "error":function(response){
                        console.log(response);
                    }
                })
            })


        })
    </script>
</head>

<body>
    <a href="test/ssm.html">测试ssm整合环境</a>

    <br/>

    <a href="/test/ssm_util.html">测试ssm整合环境util</a>

    <br/>

    <button id="btn1">Send [5,8,12] One</button>

    <br/>

    <button id="btn2">Send [5,8,12] Two</button>

    <br/>

    <button id="btn3">Send [5,8,12] Three</button>

    <br/>

    <button id="btn4">Send [5,8,12] Four</button>

    <br/>

    <button id="btn5">Send [5,8,12] Five</button>
</body>
</html>
