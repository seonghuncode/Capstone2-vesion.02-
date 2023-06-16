
//사용자가 사이드바의 메뉴 생성 아이콘을 클릭할 경우 생성 페이지 팝업이 뜨고 추가하기 버튼을 클릭할때 실행 되는 부분
$("#makeNewMenu").click(function () {


    var title= $('#inputName').val();
    var type = $('input[name=chk_info]:checked').val();

    // console.log(title);
    // console.log(type);

    $.ajax({
        url: "/makeNewMenu",
        data: {"title": title, "type" : type},  //data: info, JSON.stringify(info)
        method: "get",
        dataType: "json",   //dataType : "html",
        contentType: "application/json; charset=utf-8",
        success: function (res) {
            // alert("success");
            // console.log("controller에서 받은 데이터 ==>  ")
            console.log(res);

            if(res.result == "success"){
                alert("새로운 메뉴를 정상적으로 추가 했습니다.")
            }else if(res.result == "fail"){
                alert("새로운 메뉴를 추가를 실패 했습니다. 관리자 에게 문의 하세요.")
            }



        },
        error: function () {
            console.log("요청 또는 응답에 있어 문제가 발생했습니다.");
            alert("error")
        }
    });


})



