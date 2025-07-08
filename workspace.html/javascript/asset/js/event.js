console.log('hello js')
const c = document.querySelector(`#console`)
//순서상으로 <div가 상대주소로 불러온 js 코드 보다 아래에 
// 있기 때문에 아무런 값도 들어가지 않는다.>

console.log(c)

window.addEventListener(`load`,init);
function init(){ //초기에 세팅해야 하는것들 (정해진 방법은 아님)
    const c = document.querySelector(`#console`);
    console.log(c);

    bind();
}

function bind(){ //추가적인 기능들 (정해진 방법은 아님)
    const msg = document.querySelector("#console");
    const btn1 = document.querySelector('#btn1');
    btn1.onclick = function(){
        msg.innerHTML +='<br>버튼1 클릭'
    }
    const btn2 = document.querySelector("#btn2");
    btn2.addEventListener("click", function(){
        msg.innerHTML +='<br>버튼2 클릭'
    })
    //onclick은 변수라서 마지막 값만 저장된다.
    //addevent는 계속 동일한 이벤트를 추가할수 있다. 

    const login = document.querySelector("#login");
    login.addEventListener("click", loginClick)

    window.addEventListener('resize', function(){
        console.log("resize");

    })
}


//null값이 출력되긴 하지만 출력 자체가 된다는것에 의미

//add 이벤트 리스너 이기 떄문에 여러번 사용할수 있다  

// window.addEventListener(`load`,init);
// window.onload; 둘은 같다고 생각하면 됨


// window.onload = init; 
//하나밖에 넣을수 없다는 단점이 있다.
// 페이지가 여러개일때 마지막거 하나만 실해오디고 만다


// addEventListener가 여러개를 추가 할수 있다는 것이 장점이기에 좀더 쓰이는 추세

function btnClick(){
    const msg = document.querySelector("#console");
    msg.innerHTML += '<br>btnClick 실행';


// 로그인 버튼을 눌렀을떄 값이  null값이 아니라면, 아아디,비밀번호 출력
//하나라도 없으면 아이디나 비밀번호는 필수입니다. 출력



}

function loginClick(){
    const id = document.querySelector("#id").value;
    const pw = document.querySelector("#pw").value;
    const msg = document.querySelector("#console");
       
        if(id !="" && pw !=""){
            if(id == "0" || pw == "0"){
                if(id =="0" && pw =="0"){
                    msg.innerHTML += `<br> ${id},${pw}`;
                }
                else {
                    //ID가 0일경우나 pw가 영일 경우만 고려해놔
                }
            }
            //type이 text와 password이기 떄문에 null값이 아닌 문자열로 취급한다.
            msg.innerHTML += `<br> ${id},${pw}`;
        } else {
            msg.innerHTML += `<br>아이디나 비밀번호를 확인해 주세요`;
        }
      

    

}

