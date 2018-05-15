function calcFtoC() {
    var tempF = document.getElementById('inputTemp').value;
    var tempC = ( 5 / 9 * (tempF - 32)).toFixed(1);

	if(tempC < 7.2) {
         var myActionText="Take long-johns!";
    }
    else {

        if(tempC > 26.6) {
            var myActionText = "Take sunscreen!";
        }
        else {
            var myActionText = "Just have fun!";
        }
    }
    

    newText = "If the temperature is " + tempF + "&deg;F (" + tempC +" &deg;C): " + myActionText;
    document.getElementById('calcAnswer').innerHTML = newText;
}
