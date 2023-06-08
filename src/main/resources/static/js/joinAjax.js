$("#clubCodeDuplication").click(function () {

    var clubCode = $('#clubCode').val();

    function showDepartmentCode(res){

        $('#departmentCode').remove(); //기존 학과 코드를 입력하는 태그 삭제

        //여기서 name은 controller에서 매개변수로 받는 이름과 동일 해야 받을 수 있다.
        var selectBox = $('<select>', { id: 'departmentCode',class: "form-control", name: "departmentCode"});
        $.each(res, function(index, item) {
            //사용자 한테 보여지는 부분은 학과이름, 실제 값을 사용할때는 해당 코드가 value값으로 사용
            var option = $('<option>', {
                value: item.code,
                text: item.name
            });
            selectBox.append(option);
        });

        //원하는 특정 위치에 해당 select box추가
        $('#myContainer').append(selectBox);



    }



    if(clubCode == ""){
        alert("학과 코드를 찾기 위해서는 동아리 코드를 입력해 주세요.");
    }else{

        //동아리 코드를 받아 외부 서버랑 통신해서 해당 동아리 코드에 해당하는 학과 코드를 받아온다
        $.ajax({
            url: "/fineDepartmentCode",
            data: {"clubCode" : clubCode},  //data: info, JSON.stringify(info)
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

    }


    
    

})
