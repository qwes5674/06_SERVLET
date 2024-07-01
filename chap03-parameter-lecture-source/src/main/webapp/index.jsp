<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Parameter</title>
</head>
<body>
    <h1>Request Parameter</h1>
    <h3>POST 방식의 요청</h3>
    <h4>form 태그를 이용한 get 방식 요청 </h4>
    <form action="querystring" method = "get">
        <label>이름 : </label><input type ="text" name="name">
        <br>
        <label>나이 : </label><input type ="number" name="age">
        <br>
        <label>생일 : </label><input type ="date" name="birthday">
        <br>
        <label>성별 : </label>
        <input type="radio" name="gender" id="male2" value="M"><label for="male2">남자</label>
        <input type="radio" name="gender" id="female2" value="M"><label for="female2">여자</label>
        <br>
        <label>국적 : </label>
        <select name ="national">
            <option value = "ko">한국</option>
            <option value = "ch">중국</option>
            <option value = "jp">일본</option>
            <option value = "etc">기타</option>
        </select>
        <br>

        <label>취미 : </label>
        <input type="checkbox" name="hobbies" id="movie2" value="movie"><label for = "movie2">영화</label>
        <input type="checkbox" name="hobbies" id="music2" value="movie"><label for = "music2">음악</label>
        <input type="checkbox" name="hobbies" id="sleep2" value="movie"><label for = "sleep2">취침</label>
        <br>

        <input type = "submit" value="get 요청">
    </form>

    <h4>a 태그의 href 속성에 파라미터를 쿼리스트링 형태로 작성하여 get 방식 요청</h4>
    <a href="http://localhost:8080/querystring?name=bear&age=20&birthday=2024-07-01&gender=M&national=ko&hobbies=movie&hobbies=movie">
        쿼리스트링을 이용한 값 전달
    </a>

    <form action="formdata" method = "post">
        <label>이름 : </label><input type ="text" name="name">
        <br>
        <label>나이 : </label><input type ="number" name="age">
        <br>
        <label>생일 : </label><input type ="date" name="birthday">
        <br>
        <label>성별 : </label>
        <input type="radio" name="gender" id="male" value="M"><label for="male">남자</label>
        <input type="radio" name="gender" id="female" value="M"><label for="female">여자</label>
        <br>
        <label>국적 : </label>
        <select name ="national">
            <option value = "ko">한국</option>
            <option value = "ch">중국</option>
            <option value = "jp">일본</option>
            <option value = "etc">기타</option>
        </select>
        <br>

        <label>취미 : </label>
        <input type="checkbox" name="hobbies" id="movie" value="movie"><label for = "movie">영화</label>
        <input type="checkbox" name="hobbies" id="music" value="movie"><label for = "music">음악</label>
        <input type="checkbox" name="hobbies" id="sleep" value="movie"><label for = "sleep">취침</label>
        <br>

        <input type = "submit" value="post 요청">
    </form>

</body>
</html>