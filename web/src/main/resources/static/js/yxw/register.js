//发送手机验证码
function sendMobileCode() {

    //异步校验用户名是否已经注册
    $.ajax({
        url: "/yxw/ajaxCheckMobileCode.json",
        data: {"stuMobile": $("#stuMobile").val()},
        type: "POST",
        dataType: "json",
        success: function (msg) {
            if (msg == 1) {
                $("#stuMobile_msg").css('color', 'green');
                $("#stuMobile_msg").html("验证码以发送!");
            } else {
                $("#stuMobile_msg").html(msg)
            }
        },
        error: function () {
        }
    })
}

//先校验手机是否符合规范
function ajaxCheckStuMobile() {


}

//先校验用户名 是否符合 规范
function ajaxCheckStuUsername() {
    //前端正则表达式验证
    /*if (!validate_add_form_username()) {
        return false;
    }*/
    //异步校验用户名是否已经注册
    $.ajax({
        url: "/yxw/ajaxCheckStuUsername.json",
        data: {"stuUsername": $("#stuUsername").val()},
        type: "post",
        dataType: "json",
        success: function (msg) {
            if (msg == 1) {
                $("#stuUsername_msg").html("用户名已存在!");
            } else {
                //用户名可用
                $("#stuUsername_msg").html("用户名可使用")
                $("#stuUsername_msg").css('color', 'green');
            }

        },
        error: function () {
        }
    })
}

function checkStuPassword() {
    //先校验密码是否符合规范
    //前端正则表达式验证
    if (!validate_add_form_password()) {
        return false;
    }
}


