function changeStyle() {
    let nav = document.getElementById('navbar');
    let checked = document.getElementById("checker").checked;
    let searchButton = document.getElementById("search-button");


    if (checked) {
        nav.className = "navbar navbar-expand-lg navbar-dark bg-dark ";
        searchButton.className = "search-button-dark";
    } else {
        nav.className = "navbar navbar-expand-lg navbar-light bg-light";
        searchButton.className = "search-button-light";
    }
}