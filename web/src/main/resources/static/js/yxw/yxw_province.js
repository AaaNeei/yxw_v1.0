function ajaxGetSchoolByProvinceChange() {
    //获取省份对应的编号值
    var provinceNum = $("#provinceNum").val();
    //根据身份编号值ajax加载对应的省份高校
    //alert(provinceNum);
    $.ajax({
        type: "GET",
        url: "/yxw/register_getSchoolByProvinceNum.json",
        data: {provinceNum: provinceNum},
        dataType: "json",
        success: function (data) {
           // alert(data);
            var html = '<option value="" selected>--请选择--</option>';
            for(var i = 0;i<data.length;i++) {
                html+='<option value="';
                html+=data[i].schoolNum;
                html+='">';
                html+=data[i].schoolName;
                html+='</option>';
            }
            $("#schoolNum").html(html);

        }
    });


}