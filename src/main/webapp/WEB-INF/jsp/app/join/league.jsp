<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>加盟申请</title>
    <meta name="keywords" content="加盟申请"/>
    <meta name="description" content="加盟申请"/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
    <!-- <link rel="stylesheet" href="/assets/js/vendor/wow/animate.min.css"></script> -->
    <link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
    <link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
    <link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
    <script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
    <!-- <script type="text/javascript" src="/assets/js/vendor/wow/wow.min.js"></script> -->
    <script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
    <script type="text/javascript" src='<%=path%>/assets/js/index.js'></script>
    <script type="text/javascript" src='<%=path%>/assets/js/common.js'></script>
    <!--[if lte IE 9]>
<!--<script type="text/javascript" src="/js/vendor/respond.min.js"></script>-->
    <![endif]-->
</head>
<body>
<!-- 头部 -->
<div id="head">
    <jsp:include page="/web/index/head.do"/>
</div>
<!-- 超能鹿战队万家门店 -->
<section class="txtWithBg">
    <img src="<%=path%>/assets/imgs/banner/banner_0.jpg" alt="">
</section>
<section class="brand clearfix">
    <div class="wrapper clearfix">
        <div>
            <h5 class="red">超能鹿战队</h5>
            <h5 class="black">值得用生命打造的事业！</h5>
            <p>超能鹿战队是一个致力于功能性商业健身餐的品牌，经营理念是带给现代年轻人积极向上的生活态度，在吃饱的基础上产品以健身的专业功能性为出发点、以减肥的需求为核心、真实效果为口碑，满足用户需求。
            </p>
            <%--<p>--%>
                <%--不论在大中小城市、集贸市场、大街小巷、公园、小区，还是夜市休闲与小吃摊点，烧烤行业随处可见，它已成为众多消费者饮食中不可缺少的一部分，造就了一个庞大的消费市场。约上几个朋友围桌而坐，叫上冰凉的鲜啤酒，边烤边吃、边喝边聊，四溢的烤肉香加上“滋滋”的烤肉声，都是令人垂涎欲滴的理由，足以让每一位食客按捺不住。烧烤的花样、品种繁多，有肉类、蔬菜类，甚至连香蕉、苹果等时蔬水果都是烧烤的新贵。</p>--%>
        </div>
        <img src="<%=path%>/assets/imgs/league/a.jpg" alt="">
    </div>
    <img src="<%=path%>/assets/imgs/league/bg-line.png" alt="">
</section>
<%--<section class="hot">
    <div class="wrapper limitWidth-percentWidth">
        <img src="<%=path%>/assets/imgs/league/hot.png" alt="">
        <div>
            <span></span>
            <p>热销单品</p>
        </div>
    </div>
    <img src="<%=path%>/assets/imgs/league/bg1.png" class="left" alt="">
    <img src="<%=path%>/assets/imgs/league/bg-line.png" class="right" alt="">
</section>
<section class="shop limitWidth-percentWidth">
    <img src="<%=path%>/assets/imgs/league/shop.png" alt="">
    <div>
        <span></span>
        <p>门店形象</p>
    </div>
</section>
<section class="money">
    <img src="<%=path%>/assets/imgs/league/money-bg.png" alt="">
    <div>
        <span></span>
        <p>超能鹿战队加盟费用</p>
    </div>
</section>
<section class="shop flow limitWidth-percentWidth">
    <img src="<%=path%>/assets/imgs/league/flow.png" alt="">
    <div>
        <span></span>
        <p>超能鹿战队加盟流程</p>
    </div>
</section>--%>
<%--<section class="long-img">
    <img src="<%=path%>/assets/imgs/league/center.jpg" alt="">
</section>--%>
<section class="apply clearfix">
    <div class="wrapper  limitWidth-percentWidth clearfix">
        <div>
            <span></span>
            <p>超能鹿战队加盟流程</p>
            <form action="">
                <div>
                    <input type="text" id='name' placeholder="姓名"></input>
                </div>
                <div>
                    <input type="text" id='sex' placeholder="性别"></input>
                </div>
                <div>
                    <input type="text" id='phone' placeholder="手机号"></input>
                </div>
                <div class="select-list clearfix">
                    <span>意向城市</span>
                    <div class="city">
                        <select name="" id="pro">
                            <option value="0" data='0'>请选择省份</option>
                            <option value="北京市" data="402881ec3f74d2d5013f74dc2e3d0f38">北京市</option>
                            <option value="天津市" data="402881ec3f74d2d5013f74dc2e5d0f4b">天津市</option>
                            <option value="河北省" data="402881ec3f74d2d5013f74dc2e5d0f5e">河北省</option>
                            <option value="山西省" data="402881ec3f74d2d5013f74dc2ebb1021">山西省</option>
                            <option value="内蒙古" data="402881ec3f74d2d5013f74dc2f3810af">内蒙古</option>
                            <option value="辽宁省" data="402881ec3f74d2d5013f74dc2f861129">辽宁省</option>
                            <option value="吉林省" data="402881ec3f74d2d5013f74dc300211aa">吉林省</option>
                            <option value="黑龙江" data="402881ec3f74d2d5013f74dc305011f8">黑龙江</option>
                            <option value="上海市" data="402881ec3f74d2d5013f74dc310c1294">上海市</option>
                            <option value="江苏省" data="402881ec3f74d2d5013f74dc311b12a8">江苏省</option>
                            <option value="浙江省" data="402881ec3f74d2d5013f74dc32c0132d">浙江省</option>
                            <option value="安徽省" data="402881ec3f74d2d5013f74dc334e139e">安徽省</option>
                            <option value="福建省" data="402881ec3f74d2d5013f74dc3409142a">福建省</option>
                            <option value="江西省" data="402881ec3f74d2d5013f74dc34671492">江西省</option>
                            <option value="山东省" data="402881ec3f74d2d5013f74dc34d4150c">山东省</option>
                            <option value="河南省" data="402881ec3f74d2d5013f74dc358f15bb">河南省</option>
                            <option value="湖北省" data="402881ec3f74d2d5013f74dc37a2167d">湖北省</option>
                            <option value="湖南省" data="402881ec3f74d2d5013f74dc386d16fe">湖南省</option>
                            <option value="广东省" data="402881ec3f74d2d5013f74dc39191794">广东省</option>
                            <option value="广  西" data="402881ec3f74d2d5013f74dc3a411836">广 西</option>
                            <option value="海南省" data="402881ec3f74d2d5013f74dc3c5518c0">海南省</option>
                            <option value="重庆市" data="402881ec3f74d2d5013f74dc3ca318dd">重庆市</option>
                            <option value="四川省" data="402881ec3f74d2d5013f74dc3cd11907">四川省</option>
                            <option value="贵州省" data="402881ec3f74d2d5013f74dc3e7719e4">贵州省</option>
                            <option value="云南省" data="402881ec3f74d2d5013f74dc3f611a49">云南省</option>
                            <option value="西  藏" data="402881ec3f74d2d5013f74dc406b1ae3">西 藏</option>
                            <option value="陕西省" data="402881ec3f74d2d5013f74dc40c81b35">陕西省</option>
                            <option value="甘肃省" data="402881ec3f74d2d5013f74dc41641bb5">甘肃省</option>
                            <option value="青海省" data="402881ec3f74d2d5013f74dc42201c26">青海省</option>
                            <option value="宁  夏" data="402881ec3f74d2d5013f74dc428d1c5b">宁 夏</option>
                            <option value="新  疆" data="402881ec3f74d2d5013f74dc42db1c7b">新 疆</option>
                            <option value="台湾省" data="402881ec3f74d2d5013f74dc43961cf0">台湾省</option>
                            <option value="香  港" data="402881ec3f74d2d5013f74dc43a61cf1">香 港</option>
                            <option value="澳  门" data="402881ec3f74d2d5013f74dc43a61cf2">澳 门</option>
                        </select> <br>
                        <select name="" id="city">
                            <option value="0">请选择城市</option>
                        </select><br>
                        <select name="" id="area">
                            <option value="0">请选择区/县</option>
                        </select>
                    </div>
                </div>
                <!-- 					<div class="select-list clearfix">
                <span>意向品牌</span>
                <div class="city">
                    <select name="" id="">超能鹿战队
                        <option value="">正烧记</option>
                        <option value="">超能鹿战队鸭脖</option>
                    </select>
                </div>
            </div> -->
                <div>
                    <input type="text" id='address' placeholder="补充详细地址"></input>
                </div>
                <div>
                    <textarea rows="30" id='message' cols="30" placeholder="留言"></textarea>
                </div>
                <!-- 按钮 -->
                <a class="btn clearfix" onClick='addleague()'>
                    提交
                    <span>&gt;</span>
                </a>
            </form>
        </div>
        <img src="<%=path%>/assets/imgs/league/tel-right.png" alt="">
    </div>
    <img src="<%=path%>/assets/imgs/league/bg1.png" class="left" alt="">
    <img src="<%=path%>/assets/imgs/league/bg2.png" class="right" alt="">
</section>
<div class="pop-up">
    <img src="<%=path%>/assets/imgs/index/ewm-01.png">
</div>

<div id="foot">
    <jsp:include page="/WEB-INF/jsp/app/foot.jsp"/>
</div>
</body>
<script>
    /*$(function(){
        $('#head').load('head.html');
        $('#foot').load('foot.html');
    })*/


    function addleague() {
        var name = $("#name").val();
        var sex = $("#sex").val();
        var phone = $("#phone").val();
        var pro = $("#pro").val();
        var city = $("#city").val();
        var area = $("#area").val();
        var address = $("#address").val();
        var message = $("#message").val();
        if (name == "") {
            alert("请填写姓名！");
            return false;
        }
        if (sex == "") {
            alert("请填写性别！");
            return false;
        }
        var reg = /^1[0-9]{10}$/;
        if (phone == "") {
            alert("请填写手机号！");
            return false;
        }
        if (!reg.test(phone)) {
            alert("请填写正确的手机号！");
            return false;
        }
        if (pro == 0 || city == 0 || area == 0 || pro == '' || city == "" || area == '') {
            alert("请选择意向城市！");
            return false;
        }
        if (address == "") {
            alert("请填写详细地址！");
            return false;
        }
        var post_url = "<%=path%>/web/league/add.do";

        $.ajax({
            type: "post",
            async: true,
            //默认设置下，所有请求均为异步请求。如果需要发送同步请求，请将此选项设置为 false。注意，同步请求将锁住浏览器，用户其它操作必须等待请求完成才可以执行。
            url: post_url,
            data: {
                name: name,
                sex: sex,
                phone: phone,
                pro: pro,
                city: city,
                area: area,
                address: address,
                message: message,

            },
            dataType: "json",
            beforeSend: function () {
            },
            success: function (data, textStatus) {
                console.log(data);
                if (data.statusCode === "200") {
                    alert(data.message);
                    window.location.href = "<%=path%>/web/league/index.do";

                    return false;
                } else {
                    alert(data.message);
                    return false;
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                if (errorThrown.message) {
                    alert("请求出现问题：" + errorThrown.message);
                } else {
                    alert("请求出现问题：请检查网络是否畅通！");
                }
                return false;
            }
        });
    }

    $('#pro').on('change', function () {
        var pro_id = $('#pro').find('option:selected').attr('data');
        $('#city').html("<option value='0' data='0'>请选择城市</option>");
        $('#area').html("<option value='0' data='0'>请选择区/县</option>");
        if (pro_id == 0) {

            return false;
        }
        var post_url = "<%=path%>/web/league/select/city.do";

        $.ajax({
            type: "post",
            async: true,
            //默认设置下，所有请求均为异步请求。如果需要发送同步请求，请将此选项设置为 false。注意，同步请求将锁住浏览器，用户其它操作必须等待请求完成才可以执行。
            url: post_url,
            data: {
                id: pro_id
            },
            dataType: "json",
            beforeSend: function () {
            },
            success: function (data, textStatus) {
                console.log(data);

                $.each(data, function (index, value) {
                    $('#city').append("<option value='"+value.dis_name+"' data='"+value.id+"'>"+value.dis_name+"</option>");
                });

                /*if (data.result) {

                    $('#city').html(data.list);
                    return false;
                } else {
                    $('#city').html(data.list);
                    return false;
                }*/
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                if (errorThrown.message) {
                    alert("请求出现问题：" + errorThrown.message);
                } else {
                    alert("请求出现问题：请检查网络是否畅通！");
                }
                return false;
            }
        });
    });


    $('#city').on('change', function () {
        var city_id = $('#city').find('option:selected').attr('data');
        $('#area').html("<option value='0' data='0'>请选择区/县</option>");
        if (city_id == 0) {

            return false;
        }
        var post_url = "<%=path%>/web/league/select/city.do";

        $.ajax({
            type: "post",
            async: true,
            //默认设置下，所有请求均为异步请求。如果需要发送同步请求，请将此选项设置为 false。注意，同步请求将锁住浏览器，用户其它操作必须等待请求完成才可以执行。
            url: post_url,
            data: {
                id: city_id,
            },
            dataType: "json",
            beforeSend: function () {
            },
            success: function (data, textStatus) {

                $.each(data, function (index, value) {
                    $('#area').append("<option value='"+value.dis_name+"' data='"+value.id+"'>"+value.dis_name+"</option>");
                });
                // if (data.result) {
                //
                //     $('#area').html(data.list);
                //     return false;
                // } else {
                //     $('#area').html(data.list);
                //     return false;
                // }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                if (errorThrown.message) {
                    alert("请求出现问题：" + errorThrown.message);
                } else {
                    alert("请求出现问题：请检查网络是否畅通！");
                }
                return false;
            }
        });
    });
</script>
</html>
