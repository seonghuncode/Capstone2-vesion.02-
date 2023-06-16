//사용자가 사이드바의 메뉴 생성 아이콘을 클릭할 경우 생성 페이지 팝업이 뜨고 추가하기 버튼을 클릭할때 실행 되는 부분
$("#makeNewMenu").click(function () {


    var title = $('#inputName').val();
    var type = $('input[name=chk_info]:checked').val();

    // console.log(title);
    // console.log(type);

    $.ajax({
        url: "/makeNewMenu",
        data: {"title": title, "type": type},  //data: info, JSON.stringify(info)
        method: "get",
        dataType: "json",   //dataType : "html",
        contentType: "application/json; charset=utf-8",
        success: function (res) {
            // alert("success");
            // console.log("controller에서 받은 데이터 ==>  ")
            console.log(res);

            if (res.result == "success") {
                alert("새로운 메뉴를 정상적으로 추가 했습니다.")
            } else if (res.result == "fail") {
                alert("새로운 메뉴를 추가를 실패 했습니다. 관리자 에게 문의 하세요.")
            }


        },
        error: function () {
            console.log("요청 또는 응답에 있어 문제가 발생했습니다.");
            alert("error")
        }
    });


})


//사용자가 메뉴 수정 아이콘을 클릭했을 경우 메뉴 이름 수정 페이지로 이동하면서 해당 id값을 파라미터로 넘겨주는 로직
function modifyMenu(menuId) {
    var url = '/doModifyMenu?menuId=' + menuId;
    window.open(url, '메뉴 수정', 'width=640, height=400');

    console.log(url);

}


//메뉴 이름 수정 페이지 에서 사용자가 수정한 정보를 통해 외부 서버와 통신해서 수정을 진행하는 로직
$("#modifyMenu").click(function () {


    var title = $('#inputName').val();
    var type = $('input[name=chk_info]:checked').val();
    var menuId = menu_id;

    // console.log(title);
    // console.log(type);
    // console.log("-----------------");
    // console.log(menuId);
    // console.log(title);

    if(title == ""){
        alert("수정할 메뉴 이름을 입력해 주세요.");
    }else{

        $.ajax({
            url: "/modifyMenu",
            data: {"title": title, "type": type, "menuId" : menuId},  //data: info, JSON.stringify(info)
            method: "get",
            dataType: "json",   //dataType : "html",
            contentType: "application/json; charset=utf-8",
            success: function (res) {
                // alert("success");
                // console.log("controller에서 받은 데이터 ==>  ")
                // console.log(res);

                if (res.result == "success") {
                    alert("메뉴 수정을 완료 했습니다.")
                } else if (res.result == "fail") {
                    alert("메뉴 수정을 실패 했습니다.. 관리자 에게 문의 하세요.")
                }


            },
            error: function () {
                console.log("요청 또는 응답에 있어 문제가 발생했습니다.");
                alert("error")
            }
        });

    }
    
})


//사용자가 메뉴 삭제 아이콘을 클릭했을 경우 해당 controller로 파라미터값을 포함하여 전송해주는 부분
function deleteMenu(menu_id) {
    var url = '/deleteMenu?menu_id=' + menu_id;
    // URL 이동
    window.location.href = url;
}








