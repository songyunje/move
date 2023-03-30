<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- 부트스트랩 CSS -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />
    <!-- 부트스트랩 icon -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css"
    />
    <link
    href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
    rel="stylesheet"
    />
   <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
      crossorigin="anonymous"
    ></script>
<style type="text/css">
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style: none;
}

/* a {
  text-decoration: none;
  color: whitesmoke;
} */

.side {
  width: 10%;
}

.main {
  width: 80%;
  display: flex;
  flex-direction: column;
}

.recent-videos {
}

.content {
  margin: 10px 30px;
  display: flex;
}

.content-workout-list {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
}

.contain {
  display: flex;
  flex-direction: row;
}
#videoList img {
  width: 300px;
}
#videoList > div:nth-child(2) {
  display: flex;
}
a {
  text-decoration: none;
  color: black;
}

.list {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  justify-content: space-around;
}

</style>


<title>HEALTH</title>
</head>
<body>
	<%@ include file="/common/header.jsp" %>
<!-- Header Start -->
    <header style="height: 320px;">
      <nav class="navbar navbar-dark bg-dark" style="height: 70px;">
        <div class="container-fluid" >
          <a class="navbar-brand" href="#" style="display: flex;">SSAFIT</a>
          <ul class="nav justify-content-end">
            <li class="nav-item">
              <div>
                <a class="nav-link text-secondary" href="#">HOME</a>
              </div>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="#">헬스장찾기</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="#">회원가입</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="#">로그아웃</a>
            </li>
          </ul>
        </div>
      </nav>
      <div>
        <div >
            <div id="carouselExample0" class="carousel slide" style="height: 200px;">
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img
                      src="img/헬스장1.PNG"
                      class="d-block w-100"
                      style="height: 250px;"
                      alt="..."

                    />
                  </div>
                  <div class="carousel-item">
                    <img
                    src="img/헬스장2.PNG"
                      class="d-block w-100"
                      style="height: 250px;"
                      alt="..."
                    />
                  </div>
                  <div class="carousel-item">
                    <img
                    src="img/헬스장3.PNG"
                      class="d-block w-100"
                      style="height: 250px;"
                      alt="..."
                    />
                  </div>
                </div>
                <button
                  class="carousel-control-prev"
                  type="button"
                  data-bs-target="#carouselExample0"
                  data-bs-slide="prev"
                >
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Previous</span>
                </button>
                <button
                  class="carousel-control-next"
                  type="button"
                  data-bs-target="#carouselExample0"
                  data-bs-slide="next"
                >
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
      </div>
    </header>
    <!-- Header End -->
    <!-- Main Start -->
    <main class="content">
      <div class="side"></div>
      <div class="main">
            <div >
                <h1 style="text-align: center;">추천 영상</h1>
                <div style= "display: flex;">
                <div style="width: 25%;"></div>
                <div style="width: 60%;">
                <div>
                  <div id="carouselExample" class="carousel slide">
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <a href="https://www.youtube.com/embed/gMaB-fG4u4g">
                        <img
                        src="img/추천1.PNG"
                          class="d-block w-20"
                          width="1000x"
                          alt="..."
                        /></a>
                      </div>
                      <div class="carousel-item">
                        <a href="https://www.youtube.com/embed/u5OgcZdNbMo">
                        <img
                        src="img/추천4.PNG"
                          class="d-block w-20"
                          width="1000px"
                          alt="..."
                        /></a>
                      </div>
                      <div class="carousel-item">
                        <a href="https://www.youtube.com/embed/PjGcOP-TQPE">
                        <img
                        src="img/추천7.PNG"
                          class="d-block w-20"
                          width="1000px"
                          alt="..."
                        /></a>
                      </div>
                    </div>
                    <button
                      class="carousel-control-prev"
                      type="button"
                      data-bs-target="#carouselExample"
                      data-bs-slide="prev"
                    >
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Previous</span>
                    </button>
                    <button
                      class="carousel-control-next"
                      type="button"
                      data-bs-target="#carouselExample"
                      data-bs-slide="next"
                    >
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Next</span>
                    </button>
                  </div>
                </div>
                <div style="width: 30%;"></div>
              </div>
            </div>
            <br>
            <div style="text-align: center;">   
              <section class="content-workout">
               <h2>운동 영상 목록</h2>
                <div style="text-align: center; display: flex; flex-wrap: wrap; justify-content: space-between" >
                
				<c:forEach items="${list}" var="video">
						<a href="video?act=detail&id=${video.id}">
							<img src = "img/${video.img}"
							style="height: 200px; width: 300px">
						</a>
					</c:forEach>

                </div>
              </section>
            </div>
      </div>
      <div class="side"></div>



</body>
</html>