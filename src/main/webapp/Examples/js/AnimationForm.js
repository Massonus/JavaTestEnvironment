function expand(label){
    var elemId = label.getAttribute("for");
    document.getElementById(elemId).style.height = "45px";
    document.getElementById(elemId).classList.add('my-style');
    label.style.transform = "translateY(-45px)";
}