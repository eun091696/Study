const button = document.querySelector("button");
const inputs = document.querySelectorAll("input");

button.onclick = () => {
    for(let i = 0; i < 4; i++){
        document.getElementById("test").innerHTML = "<tr>" +
            "<td>" + (i + 1) + "</td>" +
            "<td>" + 2+ "</td>" +
            "<td>" + 3 + "</td>" +
            "<td>" + 4 + "</td>" +
        "</tr>"
        break;
        }
}
