<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
   <button onClick = "loadList()"> 멤버 리스트 가져오기 </button>
   <div id = "list"></div>
   <script>
      function loadList(){
         $.ajax({
            url : "member", //localhost:port-num/contextroot/member(loadList()를 불러오는 경로)
            //Spring boot에서 자체적으로 tomcat서버를 가지고 내부 서버로 동작시킴
            // => application properties 에서 설정 
            type : "get", //요청방식
            dataType : "json", //응답 받는 데이터 형식 지정 
            success : function(res){ //요청 -응답 성공
               console.log(res)
               let t ="<table>"
               for(let i = 0; i<res.length; i++){
            	   t+="<tr>"
            	   t+="<td>"+res[i].id+"</td>"
            	   t+="<td>"+res[i].pw+"</td>"
            	   t+="<td>"+res[i].nick+"</td>"
            	   	
            	   t+="</tr>"
               }
               t+="</table>"
               $("#list").append(t)
            },
            error : function(){  //요청-응답 실패 
               alert("통신 실패")
            }
         })
      }
   </script>
</body>
</html>