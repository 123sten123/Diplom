<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
  <title>Index Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">

  <c:url value="/resources/css/superfish.css" var="superfish" />
  <link href="${superfish}" rel="stylesheet"  media="screen">

    <c:url value="/resources/css/nivo.css" var="nivo"/>
  <link rel="stylesheet" href="${nivo}" media="all">

      <c:url value="/resources/css/tweet.css" var="tweet"/>
  <link rel="stylesheet" href="${tweet}" media="all">

        <c:url value="/resources/css/style.css" var="style"/>
        <link rel="stylesheet" href="${style}">

          <c:url value="/resources/css/lessframework.css" var="lessframework"/>
  <link  href="${lessframework}" rel="stylesheet"  media="all">

 <script src="<c:url value="/resources/js/modernizr-2.5.3.min.js"/>"></script>

</head>

<body>

<!-- WRAPPER -->
<div class="wrapper cf">
    <header class="cf">
        <!-- social-bar -->
        <div id="social-bar-holder">
            <ul id="social-bar" class="cf">
                <li class="dribbble"><a href="#" title="Dribbble"></a></li>
                <li class="facebook"><a href="#" title="Facebook"></a></li>
                <li class="forrst"><a href="#" title="forrst"></a></li>
                <li class="googleplus"><a href="#" title="googleplus"></a></li>
                <li class="twitter"><a href="#" title="twitter"></a></li>
            </ul>
        </div>
        <div class="cf"></div>
        <!-- ENDS social-bar -->
        <div id="logo" class="cf"> <a href="/one"><img src="/resources/img/logo.png" alt=""></a> </div>
        <!-- nav -->
        <nav class="cf">
            <ul id="nav" class="sf-menu">
                <li><a href="/one"><span>HOME</span></a></li>
                <li  class="current-menu-item"><a href="/one/userJSP"><span>Анализ</span></a>
                    <ul>
                        <li><a href="/one/userJSP">Корреляция</a></li>
                    </ul>
                </li>
                <li><a href="blog.html"><span>Прогнозирование</span></a>
                    <ul>
                        <li><a href="/one/bayes">Байс</a></li>
                    </ul>
                </li>


                <li><a href="portfolio.html"><span>HFT</span></a></li>
                <li><a href="contact.html"><span>Информация</span></a></li>
            </ul>
            <div id="combo-holder"></div>
        </nav>
        <!-- ends nav -->
    </header>
    <!-- MAIN -->
    <div role="main" id="main" class="cf">
        <!-- SLIDER -->
        <div class="slider-wrapper theme-halftone">
            <div id="slider" class="nivoSlider"> <img src="/resources/img/dummies/slides/01.jpg" alt=""> <img src="/resources/img/dummies/slides/02.jpg" alt=""> <img src="/resources/img/dummies/slides/03.jpg" alt=""> </div>
            <div class="slider-left"></div>
            <div class="slider-right"></div>
        </div>
        <!-- ENDS SLIDER -->
        <!-- headline -->
        <div class="headline">HALFTONE IS STYLISH AND CUTE</div>
        <!-- ENDS headline -->
        <!-- featured -->
        <ul class="feature cf">
            <li> <a href="single.html" class="thumb"> <img src="/resources/img/dummies/t1.jpg" alt="">
                <div class="img-overlay"><i class="icon-plus-sign"></i></div>
                <div class="date"><span class="m">JAN</span><span class="d">09</span></div>
            </a> <a href="single.html"  class="excerpt">Pellentesque habitant morbi tristique senectus</a>
                <div class="categories"><a href="#">webdesign, </a><a href="#">print, </a><a href="#">photo, </a></div>
            </li>
            <li> <a href="single.html" class="thumb"> <img src="/resources/img/dummies/t2.jpg" alt="">
                <div class="img-overlay"><i class="icon-plus-sign"></i></div>
                <div class="date"><span class="m">JAN</span><span class="d">09</span></div>
            </a> <a href="single.html"  class="excerpt">Pellentesque habitant morbi tristique senectus</a>
                <div class="categories"><a href="#">webdesign, </a><a href="#">print, </a><a href="#">photo, </a></div>
            </li>
            <li> <a href="single.html" class="thumb"> <img src="/resources/img/dummies/t3.jpg" alt="">
                <div class="img-overlay"><i class="icon-plus-sign"></i></div>
                <div class="date"><span class="m">JAN</span><span class="d">09</span></div>
            </a> <a href="single.html"  class="excerpt">Pellentesque habitant morbi tristique senectus</a>
                <div class="categories"><a href="#">webdesign, </a><a href="#">print, </a><a href="#">photo, </a></div>
            </li>
        </ul>
        <!-- ENDS featured -->
    </div>
    <!-- ENDS MAIN -->
    <footer>
        <!-- twitter -->
        <div id="twitter-holder">
            <div class="ribbon-left"></div>
            <div class="ribbon">
                <div id="tweets-bar" class="tweet">
                    <ul class="tweet_list">
                        <li class="tweet_first tweet_odd"><span class="tweet_time"><a href="#">about 13 hours ago</a></span> <span class="tweet_text">Vestibulum tortor quam, feugiat vitae, ultricies eget <a href="#">domain.com</a></span></li>
                    </ul>
                </div>
            </div>
            <div class="ribbon-right"></div>
        </div>
        <!-- ENDS twitter -->
        <!-- widgets -->
        <ul  class="widget-cols cf">
            <li class="first-col">
                <div class="widget-block">
                    <h4>RECENT POSTS</h4>
                    <div class="recent-post cf"> <a href="#" class="thumb"><img src="/resources/img/dummies/54x54.gif" alt=""></a>
                        <div class="post-head"> <a href="#">Pellentesque habitant morbi senectus </a><span> March 12, 2011</span> </div>
                    </div>
                    <div class="recent-post cf"> <a href="#" class="thumb"><img src="/resources/img/dummies/54x54b.gif" alt=""></a>
                        <div class="post-head"> <a href="#">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span> </div>
                    </div>
                    <div class="recent-post cf"> <a href="#" class="thumb"><img src="/resources/img/dummies/54x54c.gif" alt=""></a>
                        <div class="post-head"> <a href="#">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span> </div>
                    </div>
                </div>
            </li>
            <li class="second-col">
                <div class="widget-block">
                    <h4>ABOUT</h4>
                    <p>Vintage Template it's completely free this means you don't have to pay anything.</p>
                    <p>Placeholder images by "twistedfork.me"</p>
                    <p>Visit our site and find the most beautiful free templates up to date.</p>
                </div>
            </li>
            <li class="third-col">
                <div class="widget-block">
                    <h4>DUMMY TEXT</h4>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. </p>
                </div>
            </li>
            <li class="fourth-col">
                <div class="widget-block">
                    <h4>CATEGORIES</h4>
                    <ul>
                        <li class="cat-item"><a href="#">Design</a></li>
                        <li class="cat-item"><a href="#">Photo</a></li>
                        <li class="cat-item"><a href="#">Art</a></li>
                        <li class="cat-item"><a href="#">Game</a></li>
                        <li class="cat-item"><a href="#">Film</a></li>
                        <li class="cat-item"><a href="#">TV</a></li>
                    </ul>
                </div>
            </li>
        </ul>
        <!-- ENDS widgets -->
        <!-- bottom -->
        <div id="bottom">
            <div id="widget-trigger-holder"><a id="widget-trigger" href="#" title="View More" class="poshytip"></a></div>
            <div id="content">&copy; Copyright 2012 <a href="#">Company Name</a> All Rights Reserved | Website Template By <a target="_blank" href="http://www.luiszuno.com">luiszuno</a></div>
        </div>
        <!-- ENDS bottom -->
    </footer>
</div>

<!-- JavaScript at the bottom for fast page loading -->
<script src="<c:url value="/resources/js/jquery-1.7.1.min.js"/>"></script>
<!-- scripts concatenated and minified via build script -->
<script src="<c:url value="/resources/js/custom.js"/>"></script>
<!-- superfish -->
<script src="<c:url value="/resources/js/superfish-1.4.8/js/hoverIntent.js"/>"></script>
<script src="<c:url value="/resources/js/superfish-1.4.8/js/superfish.js"/>"></script>
<script src="<c:url value="/resources/js/superfish-1.4.8/js/supersubs.js"/>"></script>
<!-- ENDS superfish -->
<script src="<c:url value="/resources/js/jquery.nivo.slider.js"/>"></script>
<script src="<c:url value="/resources/js/css3-mediaqueries.js"/>"></script>
<script src="<c:url value="/resources/js/tabs.js"/>"></script>
<script src="<c:url value="/resources/js/poshytip-1.1/src/jquery.poshytip.min.js"/>"></script>
<!-- end scripts -->


</body>

</html>