/**
 * Created by Степан1 on 20.05.2018.
 */
$(document).ready(function() {
    $("trigger").toggle(function() {
            // Отображаем скрытый блок
            $("placeholder2").fadeIn(); // fadeIn - плавное появление
            alert("Типо закрыли");
            return false; // не производить переход по ссылке
        },
        function() {
            // Скрываем блок
            $("placeholder2").fadeOut(); // fadeOut - плавное исчезновение
            alert("Скрыли");
            return false; // не производить переход по ссылке
        }); // end of toggle()
}); // end of ready()


$(document).ready(function (){
    $("#sels").change(function(){
        var result = $('#sels :selected').val();

        if(result=="NYSE"){

            $('#sels2').hide();
            $('#sels1').show();

        }

        else{
            $('#sels1').hide();
            $('#sels2').show();

        }
    });
});


$(document).ready(function (){
    $("#sels3").change(function(){
        var result = $('#sels3 :selected').val();

        if(result=="NYSE"){
            $('#sels5').hide();
            $('#sels4').show();}
        else{
            $('#sels4').hide();
            $('#sels5').show();}
    });
});



