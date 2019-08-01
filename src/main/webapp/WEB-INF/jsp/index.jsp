<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->

<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>

<script type="text/javascript">

    $(document).ready(function(){

        var param = {};

        $("#aj_btn").click(function(){
            $.post("${pageContext.request.contextPath }/relationJzaj/batchRelationJzaj", param, function(data,status){
                    alert("返回状态："+data);
            });
        });



        $("#jq_btn").click(function(){
            $.post("${pageContext.request.contextPath }/relationJzjq/batchRelationJzjq", param, function(data,status){
                alert("返回状态："+status);
            });
        });

    });

</script>
<head>
    <title>Title</title>
</head>
<body>
    <div class="body_wrap">
    <div class="container">
        <div class="alert alert-success text-center" role="alert">调用接口接收数据</div>
        <div>
                案件接口:<input type="button" value="案件接口" id="aj_btn"><br/><br/>
                警情接口:<input type="button" value="警情接口" id="jq_btn">
        </div>
    </div>
</div>
</body>
</html>
