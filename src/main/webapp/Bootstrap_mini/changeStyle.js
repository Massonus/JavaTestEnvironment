function changeStyle() {
    let nav = document.getElementById('navbar');
    let checked = document.getElementById("checker").checked;
    let search = document.getElementById("search");


    if (checked) {
        nav.className = "navbar navbar-expand-lg navbar-dark bg-dark ";

    } else {
        nav.className = "navbar navbar-expand-lg navbar-light bg-light";
    }


}