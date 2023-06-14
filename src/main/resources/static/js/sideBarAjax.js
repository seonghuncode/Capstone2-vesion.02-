
$("#makeNewMenu").click(function () {

    const newMenu = prompt('추가할 메뉴 이름을 입력해 주세요.');
    console.log(newMenu);


    $.ajax({
        url: "/makeNewMenu",
        data: {"newMenu" : newMenu},  //data: info, JSON.stringify(info)
        method: "get",
        dataType: "json",   //dataType : "html",
        contentType: "application/json; charset=utf-8",
        success: function (res) {
            // alert("success");
            // console.log("controller에서 받은 데이터 ==>  ")
            // console.log(res);

            //전달 받은 학과 정보를 통해 select box를 만드는 함수
            showDepartmentCode(res);

        },
        error: function () {
            console.log("요청 또는 응답에 있어 문제가 발생했습니다.");
            alert("error")
        }
    });


})



