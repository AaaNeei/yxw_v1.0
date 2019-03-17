$('.conLeft li').on('click', function () {
    $(this).addClass('bg').siblings().removeClass('bg');
    var intername = $(this).children('.liRight').children('.intername').text();
    $('.headName').text(intername);
    $('.newsList').html('');
})
$('.sendBtn').on('click', function () {
    var news = $('#dope').val();
    if (news == '') {
        alert('涓嶈兘涓虹┖');
    } else {
        $('#dope').val('');
        var str = '';
        str += '<li>' +
            '<div class="nesHead"><img src="img/6.jpg"/></div>' +
            '<div class="news"><img class="jiao" src="img/20170926103645_03_02.jpg">' + news + '</div>' +
            '</li>';
        $('.newsList').append(str);
        setTimeout(answers, 1000);
        $('.conLeft').find('li.bg').children('.liRight').children('.infor').text(news);
        $('.RightCont').scrollTop($('.RightCont')[0].scrollHeight);
    }

})

function answers() {
    var arr = ["浣犲ソ", "浠婂ぉ澶╂皵寰堟鍟�", "浣犲悆楗簡鍚楋紵", "鎴戞渶缇庢垜鏈€缇�", "鎴戞槸鍙埍鐨勫兊灏忛奔", "浣犱滑蹇嶅績杩欐牱瀛愬鎴戝悧锛�", "spring澶╀笅鏃犳晫锛屽疄涔犲伐璧�850", "鎴戜笉绠★紝鎴戞渶甯咃紝鎴戞槸浣犱滑鐨勫皬鍙埍", "娈靛弸鍑哄緛锛屽鑽変笉鐢�", "涓€鍏ユ瀛愭繁浼兼捣锛屼粠姝よ妭鎿嶆槸璺汉", "棣掑ご锛氬椃", "绐佺劧鎯冲紑涓溅", "娈靛瓙鐣屾贩鐨勬渶鎯ㄧ殑涓や釜鐙楋細鎷夋柉锛屾櫘鎷夎揪銆傘€傘€�"];
    var aa = Math.floor((Math.random() * arr.length));
    var answer = '';
    answer += '<li>' +
        '<div class="answerHead"><img src="img/tou.jpg"/></div>' +
        '<div class="answers"><img class="jiao" src="img/jiao.jpg">' + arr[aa] + '</div>' +
        '</li>';
    $('.newsList').append(answer);
    $('.RightCont').scrollTop($('.RightCont')[0].scrollHeight);
}

$('.ExP').on('mouseenter', function () {
    $('.emjon').show();
})
$('.emjon').on('mouseleave', function () {
    $('.emjon').hide();
})
$('.emjon li').on('click', function () {
    var imgSrc = $(this).children('img').attr('src');
    var str = "";
    str += '<li>' +
        '<div class="nesHead"><img src="img/6.jpg"/></div>' +
        '<div class="news"><img class="jiao" src="img/20170926103645_03_02.jpg"><img class="Expr" src="' + imgSrc + '"></div>' +
        '</li>';
    $('.newsList').append(str);
    $('.emjon').hide();
    $('.RightCont').scrollTop($('.RightCont')[0].scrollHeight);
})