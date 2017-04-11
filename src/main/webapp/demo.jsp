<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
<script src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
<script type="text/javascript">
$(function () {
	
	$.ajax({
		
		
	});
	
	
    $('#container').highcharts({
        xAxis: {
            type: 'datetime'
        },
        series: [{
            data: [
                [Date.UTC(2010, 0, 1), 29.9],
                [Date.UTC(2010, 0, 2), 71.5],
                [Date.UTC(2010, 0, 3), 106.4],
                [Date.UTC(2010, 0, 4), 129.2],
                [Date.UTC(2010, 0, 5), 144.0],
                [Date.UTC(2010, 0, 6), 176.0],
                [Date.UTC(2010, 0, 7), 176.0],
                [Date.UTC(2010, 0, 8), 176.0],
                [Date.UTC(2010, 0, 9), 176.0],
                [Date.UTC(2010, 0, 10), 176.0],
                [Date.UTC(2010, 0, 11), 176.0],
                [Date.UTC(2010, 0, 12), 176.0],
                [Date.UTC(2010, 0, 13), 176.0],
                [Date.UTC(2010, 0, 14), 176.0],
            ]
        }]
    });
});


</script>
</head>
<body>
	<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
</body>
</html>