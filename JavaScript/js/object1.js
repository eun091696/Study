const inputs = document.querySelectorAll("input");
const button = document.querySelector("button");

let validStatus = [false, false, false, false, false];

let inputObjects = new Array();

button.onclick = () => {

  inputs.forEach((input, index) => {

    let test = 10; //키값과 벨류값 확인을 위한 예시 변수임.

    let inputObj = {
      value: input.value,
      placeholder: input.placeholder,
      print: () => {
        console.log(inputObj.placeholder + "print 메소드 실행")
      },
      "test": test //키값과 벨류값이 같을 때에는 키 값에 큰 따움표 적용하면 같이 사용 가능.
    }

    inputObjects.push(inputObj);

    validStatus[index] = !inputIsEmpty(input.value);
  });

  console.log(inputObjects);

  if(validStatus.includes(false)){ //includes = 포함
      for(let i = 0; i < validStatus.length; i++) {
        if(!validStatus[i]) {
          alert(inputs[i].placeholder + "이 입력되지 않았습니다.");
          break;
        }
      }
    }else { 
      alert("검사 완료.")
    }
 }

function inputIsEmpty(str){
  return str == null || str == "" || str == undefined;
}

/*
Array 사용해야 한다.
검사하기를 눌렸을 때 모든 input에 값이 입력되어 있어야만
검사완료 메세지를 보여준다.

만약 하나라도 입력되어있지 않으면 순서대로 "00번이 입력되지 않았습니다." 메세지 출력

*/