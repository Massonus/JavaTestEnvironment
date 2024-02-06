function processFormData() {

    let email = document.getElementById('email').value;
    let password = document.getElementById('pass').value;
    let isSubscribed = document.getElementById('subscribe').checked;

    //Insert data into table with predefined function
    insertdata(email, password, isSubscribed);

    // Clear the form fields
    document.getElementById('email').value = '';
    document.getElementById('pass').value = '';

};