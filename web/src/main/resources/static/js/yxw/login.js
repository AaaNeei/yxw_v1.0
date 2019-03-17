$(function () {
    $("#user_insert_btn").click(function () {
        var username = $("#stuUsername").val();
        var password = $("#stuPassword").val();
        var kaptcha = $("#kaptcha").val();
        if (username.length == 0) {
            $("#stuUsername_msg").html("用户名不能为空!");
            return false;
        }
        if (password.length == 0) {
            $("#stuPassword_msg").html("密码不能为空!");
            return false;
        }
        if (kaptcha.length == 0) {
            $("#kaptcha_msg").html("验证码不能为空!");
            return false;
        }
        return true;

    });
});
