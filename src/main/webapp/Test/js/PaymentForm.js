function testFunction() {
    /*let p = document.getElementById('p1');
    p.style.color = "blue";*/
    let userRating = prompt("Rate your experience from 1 to 5:");
    console.log("Thank you for rate us " + userRating);
}

function processFormData() {
    let form = document.getElementById('myForm');

    let cardNumber = form.elements.number.value;
    let holder = form.elements.holder.value;
    let method = form.elements.pay.value;

    //Insert data into table with predefined function
    insertdata(cardNumber, holder, method);

    // Clear the form fields
    clearFormData();
};