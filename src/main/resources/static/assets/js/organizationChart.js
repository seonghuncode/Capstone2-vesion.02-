<!-- 조직도 구현 -->

google.charts.load('current', {packages: ["orgchart"]});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {

    var receivedData1 = test2;
    console.log(receivedData1);

    var data = new google.visualization.DataTable();
    data.addColumn('string', 'Name');
    data.addColumn('string', 'Manager');
    data.addColumn('string', 'ToolTip');

    // For each orgchart box, provide the name, manager, and tooltip to show.

    // data.addRows([
    // ['반장', '', 'head'],
    // ['팀장1', '반장', 'head의 하위 항목1'],
    // ['팀장2', '반장', 'head의 하위 항목2'],
    // ['미분류', '반장', 'head의 하위 항목2'],
    // ['일반 회원1', '팀장1', 'head의 하위 항목2'],
    // ['일반 회원2', '일반 회원1', 'head의 하위 항목2'],
    // ['일반 회원3', '일반 회원2', 'head의 하위 항목2'],
    // ['일반 회원4', '팀장2', 'head의 하위 항목2'],
    // ['일반 회원5', '일반 회원4', 'head의 하위 항목2'],
    // ['일반 회원6', '일반 회원5', 'head의 하위 항목2'],
    // ['일반 회원7', '일반 회원6', 'head의 하위 항목2'],
    // ['미승인 회원8', '미분류', 'head의 하위 항목2'],
    // ['미승인 회원9', '미승인 회원8', 'head의 하위 항목2'],
    // ['미승인 회원10', '미승인 회원9', 'head의 하위 항목2']
    // ]);

    //서버 에서 받은 데이터를 반복문을 통해 재정리----------------------------------------------
    receivedData1.forEach(function (obj) {
        var parent = obj.parent_id ? String(obj.parent_id) : '';
        var chId = obj.id ? String(obj.id) : '';
        // var row = [String(obj.name), parent, obj.path];
        var row = [chId, parent, obj.path];
        data.addRow(row);
        console.log(row);
    });

    //현재 위에서 정리한 값을 보면 id, parent_id와 비교해서 차트를 만드는데 위의 방식으로 하면 네모 박스안에 id값이 나오기 때문에
    //id , parent_id를 비교후 id부분에 name값을 넣어 결론적으로 네모박스 차트 안에 팀명이 나오도록 한다
    var view = new google.visualization.DataView(data);
    view.setColumns([
        {calc: function(dt, row) { return raw_data[row].name; }, type:'string'},
        1,
        2
    ]);

    var chart = new google.visualization.OrgChart(document.getElementById('chart_div'));
    chart.draw(view, {allowHtml:true});

    // id 값을 name 값으로 대체하여 표시
    for (var i = 0; i < receivedData1.length; i++) {
        var formattedValue = receivedData1[i].name;
        data.setFormattedValue(i, 0, formattedValue);
    }
    //-------------------------------------------------------------------------------------------------------------------------

    // Create the chart.
    var chart = new google.visualization.OrgChart(document.getElementById('chart_div'));
    // Draw the chart, setting the allowHtml option to true for the tooltips.
    const option = {'allowHtml': true, 'color': '#ffffff', 'size': 'large'}
    chart.draw(data, option);

}

//----------------------------------------------------------------------------------------------------------------------




