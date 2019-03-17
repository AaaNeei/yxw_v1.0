//显示验证结果
function show_validate_msg(ele, status, msg) {
    if ("success" == status) {
        // 让父容器变色
        $(ele).parent().addClass("has-success");
        // 给sapn赋值正确信息
        $(ele + "_msg").css('color', 'green');
        $(ele + "_msg").text(msg);
    } else if ("error" == status) {
        // 让父容器变色
        $(ele).parent().addClass("has-error");
        // 给sapn赋值错误信息
        $(ele + "_msg").css('color', 'red');
        $(ele + "_msg").text(msg);
    }
}

// 验证手机号
function validate_add_form_mobile() {
    var mobile = $("#stuMobile").val();
    var reg_mobile = /(^1[3-9][0-9]{9})/;
    if (!reg_mobile.test(mobile)) {
        show_validate_msg("#stuMobile", "error", "手机号格式不符!");
        return false;
    } else {
        show_validate_msg("#stuMobile", "success", "手机号可用使用!");
    }
}

// 验证用户名
function validate_add_form_username() {
    var name = $("#stuUsername").val();
    var reg_name = /(^[a-zA-Z0-9_-]{6,19}$)|(^[\u2E80-\u9FFF]{2,5})/;
    if (!reg_name.test(name)) {
        show_validate_msg("#stuUsername", "error", "用户名必须是2-5位中文或6-19位英文和数字的组合");
        return false;
    } else {
        show_validate_msg("#stuUsername", "success", "");
    }
}

// 验证密码
function validate_add_form_password() {
    // 验证密码
    var password = $("#stuPassword").val();
    var reg_password = /(^[a-zA-Z0-9_-]{6,19}$)/;
    if (!reg_password.test(password)) {
        show_validate_msg("#stuPassword", "error", "密码必须是6-19位英文和数字的组合");
        return false;
    } else {
        show_validate_msg("#stuPassword", "success", "");
    }
    return true;
}

