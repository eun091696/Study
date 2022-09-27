const button = document.querySelector("button");

let userList = new Array();

button.onclick = () => {
  addUser();
  loadList();
}

function addUser() { //유저 정보 입력
  const inputs = document.querySelectorAll("input");

  let user = {
    name2: inputs[0].value,
    address: inputs[1].value,
    phone: inputs[2].value
  }

  userList.push(user);

}

function loadList() { //리스트 만들기
  const tbody = document.querySelector("tbody");

  tbody.innerHTML = ""; //tbody의 HTML값 초기화

  userList.forEach((user, index) => {
    tbody.innerHTML += `
      <tr>
        <td>${index}</td>
        <td>${user.name2}</td>
        <td>${user.address}</td>
        <td>${user.phone}</td>
      </tr>
      `
  });
  
}