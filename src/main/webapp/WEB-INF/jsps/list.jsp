<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<%--<head profile="http://www.w3.org/2005/10/profile">--%>
<head>
    <%--Подключаем с самого начала--%>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.css">
        <%--Для не стандартных шрифтов и знаков--%>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <%--Подключени иконки для браузера : не сработало, надо разобраться--%>
        <link rel="shortcut icon" type="image/x-icon" href="/resources/img/icons8-Коди%20Filled-50.png">
        <%--Шрифты от гугл--%>
        <link href="https://fonts.googleapis.com/css?family=Merriweather|PT+Sans+Caption:400,700" rel="stylesheet">


        <link  href="<c:url value="/resources/css/list.css"/>" rel="stylesheet" >


    <title>Work&Blog</title>

    <%--<style class="header">--%>
        <%--body {--%>
                       <%--background: url("/resources/img/fons/fon1.jpg");--%>
                       <%--background-attachment: fixed;--%>
        <%--}--%>
        <%--div{--%>
            <%--opacity: 0.6;--%>
            <%--background: #fbefef;--%>
            <%--padding: 5px;--%>
        <%--}--%>
    <%--</style>--%>



</head>
<body>




<%--<h3> Hello man!!</h3>--%>
<%--<img src="/resources/img/java1_bg.jpg" alt="Пет проект" class="fon">--%>

<%--....................................
HEADER
....................................--%>

<div class="header">


    <div class="header__title">Work&Blog</div><br>
<div class="header__slogan"> Сделай работу ярче</div><br>
<%--сайт для скачивания иконок   http://fontawesome.io/icons/--%>
    <div class="header__arrow">
    <i class="fa fa-chevron-down" aria-hidden="true" style="opacity: 0.70;">
    </i>
    </div><br>
</div>
<%--.................................
Information
..................................--%>

<div class="information">
    <%--Ссылка для перехода--%>
    <a name="inf" style="font-size: 0;"></a>


    <div class="information__border">

    <div class="border" style="border:2px white  solid; width:60%; height: 60%">
        <p class="info__logo">О нас </p>
        <div class="info__line" style="opacity:0.70;"></div>
        <div class="info__content">
            Этот сайт предназначен для работодателей, соискателей, а также
            разработчиков-блогеров.<br> Сайт позволит Вам разместить Вашу вакансию, найти
            перспективную работу. Если Вы опытный разработчик и умелый блогер
            приглашаем Вас на наше пространство для обмена опытом.
        </div>
    </div>

    </div>
</div>


<%--....................................
PORTFOLIO
....................................--%>

<div class="portfolio">

    <%--&lt;%&ndash;Ссылка для перехода&ndash;%&gt;--%>
    <%--<a name="portfolio" style="font-size: 0;"></a>--%>

    <div class="container">

        <div class="title">
            Портфолио
        </div>

     <div class="row">
         <%--Добавление вакансии работодателем--%>
        <div class="col-4">
            <div class="portfolio-item">
                <div class="portfolio-item__img">
                    <img src="/resources/img/portfolio/worker.jpg" width="335" height="250" alt="Работодатель">
                </div>
                <div class="portfolio-item__title">
                    <a href="#">Создать вакансию</a>
                </div>
                <div class="portfolio-item__text">
                    <p> Краткое описание вакансии </p>
                </div>
            </div>
        </div>

             <%--Поиск работы соискателем. Создание резюме--%>
             <div class="col-4">
                 <div class="portfolio-item">
                     <div class="portfolio-item__img" >
                         <img src="/resources/img/portfolio/freelancer.jpg" width="335" height="250" alt="Соискатель">
                     </div>
                     <div class="portfolio-item__title">
                         <a href="#">Найти работу</a>
                     </div>
                     <div class="portfolio-item__text">
                         <p> Краткое описание вакансии </p>
                     </div>
                 </div>
             </div>

             <%--Написание блоги, написание блога, регистрация блогера--%>
             <div class="col-4">
                 <div class="portfolio-item">
                     <div class="portfolio-item__img">
                         <img src="/resources/img/portfolio/bloger.jpg" width="335" height="250" alt="Блогер">
                     </div>
                     <div class="portfolio-item__title">
                         <a href="#">Статьи фрилансера</a>
                     </div>
                     <div class="portfolio-item__text">
                         <p> Краткое описание вакансии </p>
                     </div>
                 </div>
             </div>
     </div>
    </div>
</div>

<%--....................................
FOOTER
....................................--%>

<div class="footer">
    <div class="container">
        <%--Ряды--%>
        <div class="row">
            <div class="col-4">
                <p class="footer__name">Work&Blog</p>
                <p> © Пространство программистов 2017</p>

            </div>

            <div class="col-4">
                <div class="menu">
              <div class="footer__menu">МЕНЮ</div>
                    <div class="footer__menu__list">
                        <div><a href="#"> Главная </a></div>

                        <div>
                            <a href="#inf"> О нас </a>
                        </div>

                        <div><a href="#"> Контакты </a></div>
                        <div><a href="#"> Вход </a></div>
                    </div>

                </div>
            </div>

            <div class="col-4">
                <div class="footer__social__form" >
                <div class="footer__social">МЫ В СОЦ СЕТЯХ</div>
                <%--<div><a href="#">LinkedIn</a></div>--%>
                <%--Или иконка--%>

                <div class="footer__social__icons">
                    <a href="#">
                    <i class="fa fa-linkedin" aria-hidden="true"> </i>
                    </a>
                </div>
                <div class="footer__social__icons"><a href="https://www.facebook.com/profile.php?id=100013264323185"> Facebook</a></div>

                </div>
            </div>

            <%--<div class="t475__line" style="opacity:0.70;"></div>--%>

        </div>
    </div>
</div>


</body>
</html>
