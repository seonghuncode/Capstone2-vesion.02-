<!-- 조직도 구현 -->

    google.charts.load('current', {packages:["orgchart"]});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
    var data = new google.visualization.DataTable();
    data.addColumn('string', 'Name');
    data.addColumn('string', 'Manager');
    data.addColumn('string', 'ToolTip');

    // For each orgchart box, provide the name, manager, and tooltip to show.

    data.addRows([
    ['반장', '', 'head'],
    ['팀장1', '반장', 'head의 하위 항목1'],
    ['팀장2', '반장', 'head의 하위 항목2'],
    ['미분류', '반장', 'head의 하위 항목2'],
    ['일반 회원1', '팀장1', 'head의 하위 항목2'],
    ['일반 회원2', '일반 회원1', 'head의 하위 항목2'],
    ['일반 회원3', '일반 회원2', 'head의 하위 항목2'],
    ['일반 회원4', '팀장2', 'head의 하위 항목2'],
    ['일반 회원5', '일반 회원4', 'head의 하위 항목2'],
    ['일반 회원6', '일반 회원5', 'head의 하위 항목2'],
    ['일반 회원7', '일반 회원6', 'head의 하위 항목2'],
    ['미승인 회원8', '미분류', 'head의 하위 항목2'],
    ['미승인 회원9', '미승인 회원8', 'head의 하위 항목2'],
    ['미승인 회원10', '미승인 회원9', 'head의 하위 항목2']
    ]);

    // Create the chart.
    var chart = new google.visualization.OrgChart(document.getElementById('chart_div'));
    // Draw the chart, setting the allowHtml option to true for the tooltips.
    const option = {'allowHtml':true, 'color':'#ffffff', 'size':'large'}
    chart.draw(data, option);
}
