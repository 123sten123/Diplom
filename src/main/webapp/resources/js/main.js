/**
 * Created by Степан1 on 20.05.2018.
 */
function showMessage(close, data, Stock) {


    var arrObj=[];

    for(var i = 0; i<close.length; i++)
    {
        arrObj[i] = [data[i],close[i]];
    }

    var data = [
        { data: arrObj, label: "Oil price ($)" },
    ];

    var all_data = [
        { label: "Данные 1", data: [["2010/10/01", 0], ["2010/10/5", 1], ["2010/10/10", 7], ["2010/10/15", 8]]},
        { label: "Данные 2", data: [["2010/10/01", 13], ["2010/10/5", 23], ["2010/10/10", 32], ["2010/10/15", 33]]}
    ];
    // преобразуем даты в UTC
    for(var j = 0; j < all_data.length; ++j) {
        for(var i = 0; i < all_data[j].data.length; ++i)
            all_data[j].data[i][0] = Date.parse(all_data[j].data[i][0]);
    }

    var plot_conf = {
        series: {
            lines: {
                show: true,
                lineWidth: 2
            }
        },
        xaxis: {
            mode: "time",
            timeformat: "%y/%m/%d",
        },
        legend: {
            container: $("#legend")
        }
    };

    $.plot($("#placeholder"), data, plot_conf);
};


function showMessage2(close, data, Stock) {

    var arrObj=[];

    for(var i = 0; i<close.length; i++)
    {
        arrObj[i] = [data[i],close[i]];
    }

    var data = [
        { data: arrObj, label: "Oil price ($)" },
    ];

    var all_data = [
        { label: "Данные 1", data: [["2010/10/01", 0], ["2010/10/5", 1], ["2010/10/10", 7], ["2010/10/15", 8]]},
        { label: "Данные 2", data: [["2010/10/01", 13], ["2010/10/5", 23], ["2010/10/10", 32], ["2010/10/15", 33]]}
    ];
    // преобразуем даты в UTC
    for(var j = 0; j < all_data.length; ++j) {
        for(var i = 0; i < all_data[j].data.length; ++i)
            all_data[j].data[i][0] = Date.parse(all_data[j].data[i][0]);
    }

    var plot_conf = {
        series: {
            lines: {
                show: true,
                lineWidth: 2
            }
        },
        xaxis: {
            mode: "time",
            timeformat: "%y/%m/%d",
        },
        legend: {
            container: $("#legend")
        }
    };

    $.plot($("#placeholder2"), data, plot_conf);
};





