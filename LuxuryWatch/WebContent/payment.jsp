
<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri ="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>

<html>
<head>

<title>Luxury Watches A Ecommerce Category Flat Bootstarp
    Resposive Website Template | Checkout :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
    media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="js/jquery-1.11.0.min.js"></script>
<!--Custom-Theme-files-->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
    content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
    
    
    
     addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!--start-menu-->
<script src="js/simpleCart.min.js">
    
</script>
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>
    $(document).ready(function() {
        $(".memenu").memenu();
    });
</script>
<!--dropdown-->
<script src="js/jquery.easydropdown.js"></script>
</head>
<body>
    <!--top-header-->
    <div class="top-header">
        <div class="container">
            <div class="top-header-main">
                <div class="col-md-6 top-header-left">
                    <div class="drop">
                        <div class="box">
                            <select tabindex="4" class="dropdown drop">
                                <option value="" class="label">Dollar :</option>
                                <option value="1">Dollar</option>
                                <option value="2">Euro</option>
                            </select>
                        </div>
                        <div class="box1">
                            <select tabindex="4" class="dropdown">
                                <option value="" class="label">English :</option>
                                <option value="1">English</option>
                                <option value="2">French</option>
                                <option value="3">German</option>
                            </select>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="col-md-6 top-header-left">
                    <div class="cart box_1">
                        <a href="checkout.jsp">
                        <c:out value="${sessionScope.userBean.email}"></c:out>
                            <div class="total">
                                <span class="simpleCart_total"></span>
                            </div> <img src="images/cart-1.png" alt="" />
                        <div class="address" style="float:left ; margin-right: 105px" >
                            <form action= "Login" method="get">
                            <input type="submit" value="SignOut">
                            </form>
                            </div>
                        </a>
                        <p>
                            <a href="javascript:;" class="simpleCart_empty" style="float: right;">Empty Cart</a>
                        </p>
                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <!--top-header-->
    <!--start-logo-->
    <div class="logo">
        <a href="index.html"><h1>Luxury Watches</h1></a>
    </div>
    <!--start-logo-->
    <!--bottom-header-->
    <div class="header-bottom">
        <div class="container">
            <div class="header">
                <div class="col-md-9 header-left">
                    <div class="top-nav">
                        <ul class="memenu skyblue">
                            <li class="active"><a href="index.html">Home</a></li>
                            <li class="grid"><a href="#">Men</a>
                                <div class="mepanel">
                                    <div class="row">
                                        <div class="col1 me-one">
                                            <h4>Shop</h4>
                                            <ul>
                                                <li><a href="products.html">New Arrivals</a></li>
                                                <li><a href="products.html">Blazers</a></li>
                                                <li><a href="products.html">Swem Wear</a></li>
                                                <li><a href="products.html">Accessories</a></li>
                                                <li><a href="products.html">Handbags</a></li>
                                                <li><a href="products.html">T-Shirts</a></li>
                                                <li><a href="products.html">Watches</a></li>
                                                <li><a href="products.html">My Shopping Bag</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Style Zone</h4>
                                            <ul>
                                                <li><a href="products.html">Shoes</a></li>
                                                <li><a href="products.html">Watches</a></li>
                                                <li><a href="products.html">Brands</a></li>
                                                <li><a href="products.html">Coats</a></li>
                                                <li><a href="products.html">Accessories</a></li>
                                                <li><a href="products.html">Trousers</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="products.html">499 Store</a></li>
                                                <li><a href="products.html">Fastrack</a></li>
                                                <li><a href="products.html">Casio</a></li>
                                                <li><a href="products.html">Fossil</a></li>
                                                <li><a href="products.html">Maxima</a></li>
                                                <li><a href="products.html">Timex</a></li>
                                                <li><a href="products.html">TomTom</a></li>
                                                <li><a href="products.html">Titan</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div></li>
                            <li class="grid"><a href="#">Women</a>
                                <div class="mepanel">
                                    <div class="row">
                                        <div class="col1 me-one">
                                            <h4>Shop</h4>
                                            <ul>
                                                <li><a href="products.html">New Arrivals</a></li>
                                                <li><a href="products.html">Blazers</a></li>
                                                <li><a href="products.html">Swem Wear</a></li>
                                                <li><a href="products.html">Accessories</a></li>
                                                <li><a href="products.html">Handbags</a></li>
                                                <li><a href="products.html">T-Shirts</a></li>
                                                <li><a href="products.html">Watches</a></li>
                                                <li><a href="products.html">My Shopping Bag</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Style Zone</h4>
                                            <ul>
                                                <li><a href="products.html">Shoes</a></li>
                                                <li><a href="products.html">Watches</a></li>
                                                <li><a href="products.html">Brands</a></li>
                                                <li><a href="products.html">Coats</a></li>
                                                <li><a href="products.html">Accessories</a></li>
                                                <li><a href="products.html">Trousers</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="products.html">499 Store</a></li>
                                                <li><a href="products.html">Fastrack</a></li>
                                                <li><a href="products.html">Casio</a></li>
                                                <li><a href="products.html">Fossil</a></li>
                                                <li><a href="products.html">Maxima</a></li>
                                                <li><a href="products.html">Timex</a></li>
                                                <li><a href="products.html">TomTom</a></li>
                                                <li><a href="products.html">Titan</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div></li>
                            <li class="grid"><a href="#">Kids</a>
                                <div class="mepanel">
                                    <div class="row">
                                        <div class="col1 me-one">
                                            <h4>Shop</h4>
                                            <ul>
                                                <li><a href="products.html">New Arrivals</a></li>
                                                <li><a href="products.html">Blazers</a></li>
                                                <li><a href="products.html">Swem Wear</a></li>
                                                <li><a href="products.html">Accessories</a></li>
                                                <li><a href="products.html">Handbags</a></li>
                                                <li><a href="products.html">T-Shirts</a></li>
                                                <li><a href="products.html">Watches</a></li>
                                                <li><a href="products.html">My Shopping Bag</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Style Zone</h4>
                                            <ul>
                                                <li><a href="products.html">Shoes</a></li>
                                                <li><a href="products.html">Watches</a></li>
                                                <li><a href="products.html">Brands</a></li>
                                                <li><a href="products.html">Coats</a></li>
                                                <li><a href="products.html">Accessories</a></li>
                                                <li><a href="products.html">Trousers</a></li>
                                            </ul>
                                        </div>
                                        <div class="col1 me-one">
                                            <h4>Popular Brands</h4>
                                            <ul>
                                                <li><a href="products.html">499 Store</a></li>
                                                <li><a href="products.html">Fastrack</a></li>
                                                <li><a href="products.html">Casio</a></li>
                                                <li><a href="products.html">Fossil</a></li>
                                                <li><a href="products.html">Maxima</a></li>
                                                <li><a href="products.html">Timex</a></li>
                                                <li><a href="products.html">TomTom</a></li>
                                                <li><a href="products.html">Titan</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div></li>
                            <li class="grid"><a href="typo.html">Blog</a></li>
                            <li class="grid"><a href="contact.html">Contact</a></li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="col-md-3 header-right">
                    <div class="search-bar">
                        <input type="text" value="Search" onfocus="this.value = '';"
                            onblur="if (this.value == '') {this.value = 'Search';}">
                        <input type="submit" value="">
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <!--bottom-header-->
    <!--start-breadcrumbs-->
    <div class="breadcrumbs">
        <div class="container">
            <div class="breadcrumbs-main">
                <ol class="breadcrumb">
                    <li><a href="index.html">Home</a></li>
                    <li class="active">Checkout</li>
                </ol>
            </div>
        </div>
    </div>
    <!--end-breadcrumbs-->
    <!--start-ckeckout-->
    <div class="ckeckout">
        <div class="container">
            <div class="ckeck-top heading">
                <h2>YOUR BILL IS</h2>

            </div>