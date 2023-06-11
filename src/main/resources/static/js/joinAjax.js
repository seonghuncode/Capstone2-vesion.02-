//사용자가 학과 찾기 버튼을 클릭했을 경우의 로직-------------------------------------------------------------------------------
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



//사용자가 이메일 중복확인 버튼을 클릭했을 경우의 로직------------------------------------------------------------------------------------------------
$("#emailDuplication").click(function () {

    var clubCode = $('#clubCode').val();
    var email = $('#email').val();

    function success(){
        $('#validEmail').text("사용 가능한 이메일 입니다.")
        $( "#validEmail" ).css( "color", "blue" );
    }
    function fail(){
        $('#validEmail').text("이미 존재하는 이메일 입니다.")
        $( "#validEmail" ).css( "color", "red" );
    }

    // console.log(clubCode);
    // console.log(email);

    if(clubCode == ""){
        alert("이메일 중복 확인을 위해 동아리 코드를 입력해 주세요.");
    }else if(email == ""){
        alert("이메일 중복 확인을 위해 이메일을 입력해 주세요.");
    }else{

        //동아리 코드를 받아 외부 서버랑 통신해서 해당 동아리 코드에 해당하는 학과 코드를 받아온다
        $.ajax({
            url: "/checkDuplicationEmail",
            data: {"clubCode" : clubCode, "email" : email},  //data: info, JSON.stringify(info)
            method: "get",
            dataType: "json",   //dataType : "html",
            contentType: "application/json; charset=utf-8",
            success: function (res) {
                // alert("success");
                // console.log("controller에서 받은 데이터 ==>  ")
                // console.log(res);

                if(res.result == "success"){
                    success();
                }else if(res.result == "fail"){
                    fail();
                }

            },
            error: function () {
                console.log("요청 또는 응답에 있어 문제가 발생했습니다.");
                alert("error")
            }
        });

    }


})



//사용자가 학번 중복확인을 위해 중복확인 버튼을 클릭했을 경우-------------------------------------------------------------------------------------------
//사용자가 이메일 중복확인 버튼을 클릭했을 경우의 로직------------------------------------------------------------------------------------------------
$("#studentIdDuplication").click(function () {

    var clubCode = $('#clubCode').val();
    var studentId = $('#studentId').val();

    function success(){
        $('#validStudentId').text("사용 가능한 학번 입니다.")
        $( "#validStudentId" ).css( "color", "blue" );
    }
    function fail(){
        $('#validStudentId').text("이미 존재하는 학번 입니다.")
        $( "#validStudentId" ).css( "color", "red" );
    }

    // console.log(clubCode);
    // console.log(email);

    if(clubCode == ""){
        alert("존재 하는 학번인지 확인 하기 위해서는 동아리 코드를 입력해 주세요.");
    }else if(studentId == ""){
        alert("존재하는 학번인지 확인을 위해서는 학번을 입력해 주세요.");
    }else{

        //동아리 코드를 받아 외부 서버랑 통신해서 해당 동아리 코드에 해당하는 학과 코드를 받아온다
        $.ajax({
            url: "/checkDuplicationStudentId",
            data: {"clubCode" : clubCode, "studentId" : studentId},  //data: info, JSON.stringify(info)
            method: "get",
            dataType: "json",   //dataType : "html",
            contentType: "application/json; charset=utf-8",
            success: function (res) {
                // alert("success");
                // console.log("controller에서 받은 데이터 ==>  ")
                // console.log(res);

                if(res.result == "success"){
                    success();
                }else if(res.result == "fail"){
                    fail();
                }

            },
            error: function () {
                console.log("요청 또는 응답에 있어 문제가 발생했습니다.");
                alert("error")
            }
        });

    }


})