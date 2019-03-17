var content = document.getElementById("content");
var msg1 = document.getElementById("msg1");
var msg2 = document.getElementById("msg2");
msg2.innerHTML = msg1.innerHTML;
var timer = 100;
content.scrollTop = 0;

function myScrollTop() {
    if (content.scrollTop > content.scrollHeight) {
        content.scrollTop = 0;
    } else {
        content.scrollTop++
    }
}

upScroll = setInterval('myScrollTop()', timer);
content.onmouseover = function () {
    clearInterval(upScroll);
};
content.onmouseout = function () {
    upScroll = setInterval('myScrollTop()', timer);
};