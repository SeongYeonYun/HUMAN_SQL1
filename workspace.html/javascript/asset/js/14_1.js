window.addEventListener("load", bind);

function bind() {
    const keyword = document.querySelector("#keyword");

    // 포커스 되었을 때 배경 노란색
    keyword.addEventListener("focus", () => {
        keyword.style.backgroundColor = "yellow";
    });

    // 포커스가 해제되었을 때 배경색 초기화
    keyword.addEventListener("blur", () => {
        keyword.style.backgroundColor = "";
    });

    // 입력 중일 때 배경색 랜덤하게 변경
    keyword.addEventListener("input", () => {
        const r = Math.floor(Math.random() * 256);
        const g = Math.floor(Math.random() * 256);
        const b = Math.floor(Math.random() * 256);
        const a = Math.random().toFixed(2); // 소수점 두 자리로 제한하면 더 깔끔

        keyword.style.backgroundColor = `rgba(${r},${g},${b},${a})`;
    });

    document.querySelector("#site")
        .addEventListener("input", () =>{
            const form = document.querySelector("#form")
            const value = document.querySelector("#site").value
            if(value =="1"){
                form.setAttribute("action", "https://search.naver.com/search.naver")
                //naver
            } else if(value == "2"){
                form.setAttribute("action", "https://www.google.com/search")
                //google https://search.danawa.com/dsearch.php?k1=
            } else if(value == "3"){
                form.setAttribute("action", "https://search.danawa.com/dsearch.php?k1=")
                //danawa
            }

    });

    document.querySelector("#form").addEventListener("submit", (event) =>{
        console.log(123);
        // alert(1)

        event.preventDefault(); 
        //html 태그의 기본 기능을 막아줌
        //여기서는 submut기능을 막아줌

        const value = document.querySelector("#keyword").value;
        if(value.trim().length<2){
            alert("검색어는 두글자 이상");

        } else{
            //submit
            document.querySelector("#form").submit();
        }
    });

    addEventListener("copy", function(event){
        event.preventDefault();
        this.alert("복사금지");
            //ctrl x -> cut
    });

    addEventListener("selectstart",(event) => {
        event.preventDefault(); //아예 드래그 블락
    })
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    //전체 선택 박스
    const chkAll = document.querySelector(".chk_all");

    //체크박스 
    const chkItems = document.querySelectorAll(".check");

    //선택 버튼
    const selectBtn = document.querySelector('input[type="button"]');

    //출력 부분
    const outputDiv = document.querySelector("#text");    

    // 1. 전체 선택 / 해제
    chkAll.addEventListener("change", function () {
        chkItems.forEach(chk => {

    // 전체 선택 박스가 체크 됬는지 여부를 각각의 박스에 저장
            chk.checked = chkAll.checked;
        });
    });



    // 2. 개별 체크박스 변경 시 전체선택 상태 동기화
    //방법 1 : 하나하나 확인
    chkItems.forEach(chk => {
        chk.addEventListener("change", function () {
            const allChecked = [...chkItems].every(item => item.checked); 
            //[]...~~~] ~~~의 요소들로 만든 배열
            //arr.every(callback(element[, index[, array]])[, thisArg]) 조건을 만족하는 배열 검사, 
            // 배열의 모든 요소가 콜백 함수의 요건을 만족하면 true, 아니면 false , 논리 연산자 "and" 같은 녀석
            chkAll.checked = allChecked;
        });
    });

    //방법 2 : 전채 개수와 체크된 개수가 같은지 여부로 판단 : 훨씬더 효율적인 방법인거 같다. 시간이 단축되지 않을까???
    //chkAll.length == chkItems.checked 가 같은 경우로 판단

    // 3. 선택 버튼 클릭 시 출력
    selectBtn.addEventListener("click", function () {
        const selected = [...chkItems]
            //filter, mpa은 메서드, filter은 말 그대로 필터링, map은 해당값 반환 , 
            // dictionary로 치면 key: value같은 느낌
            .filter(chk => chk.checked)
            .map(chk => chk.value);

        if (selected.length > 0) {
            //outputDiv = html에 특정 요소를 가져온다
            //join(", ")은 배열의 요소들을 쉼표+공백으로 이어붙인 문자열로 바끈다.

            outputDiv.textContent = "토핑: " + selected.join(", ");
        } else {
            outputDiv.textContent = "토핑: 없음";
        }
    });

    document.querySelector("#parent").addEventListener("click", function(){
        console.log("부모 클릭");
       
    });
    document.querySelector("#child1").addEventListener("click", function(event){
        console.log("자식1 클릭");
        event.stopPropagation();//멈춰, 부모로 전달되는것을 막음
    });





    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    const outputDiv2 = document.querySelector("#text2");  
    const name = document.querySelector("#name");
    const name2 = document.querySelector("#name2");
    const address = document.querySelector("#address");
    const phone = document.querySelector("#phone");
    const data = [
        ["윤성연", "000-0000-0000", "천안"],
        ["홍길동", "000-0000-0001", "서울"],
        ["금자", "000-0000-0002", "경주"],
    ]
    

    document.querySelector("#form_2").addEventListener("submit", (event) =>{
            
            // alert(1)
            // console.log(123);
            event.preventDefault(); 
            //html 태그의 기본 기능을 막아줌
            //여기서는 submut기능을 막아줌

            const value = document.querySelector("#keyword2").value;
            if (value.length <2){
                alert("값을 입력하시오")
            } else{
                 outputDiv2.innerHTML += `<span>${value}</span><br>`;

            }
            // console.log(value)
            // console.log(123);
            //submit 페이지를 새로고침함
            // document.querySelector("#form_2").submit();
        
            // outputDiv2.innerHTML += `<span>${value}</span><br>`;

            //문제 2번 value값을 이용하자
            for(let x = 0; x<data.length;x++){
                if (data[x][0] == value){
                    let name_list = data[x][0]
                    let phone_num = data[x][1]
                    let address_list = data[x][2]
                    console.log("list_make")

                    name.innerHTML = "name :"+ name_list;                    
                    phone.innerHTML = "phone :" +phone_num;
                    name2.innerHTML = "name :"+ name_list;
                    address.innerHTML = "address :" +address_list;

                    // return address_list;



                } else { //만일 입력값이 있어서 if문에서 출력되면 이거 안돌아가게 return
                    console.log("입력한 정보가 올바르지 않습니다.")
                    // return false;
                }
            }
            


        });

    

 











    //피자정보을 담는 변수 생성
    const outputDiv4 = document.querySelector(".pizza_info2");
    const outputDiv3 = document.querySelector("#pizza_info");  
    //버튼을 만들고 값을 각각 받아서 출려 시키자.
    document.querySelector("#pizza_option").addEventListener("submit",function(event) {
        event.preventDefault(); 
        let pizza_size = document.getElementById("pizza_size").value;
        let pizza_topping = document.getElementById("pizza_topping").value;
        let pizza_dow = document.getElementById("pizza_dow").value;
        let pizza_menu = document.getElementById("pizza_menu").value;
        
        
        outputDiv3.innerHTML = `
            메뉴 : ${pizza_menu}<br>
            사이즈 : ${pizza_size}<br>
            토핑 : ${pizza_topping}<br>
            도우 : ${pizza_dow}`

        outputDiv4.innerHTML = `
            메뉴 : ${pizza_menu}<br>
            사이즈 : ${pizza_size}<br>
            토핑 : ${pizza_topping}<br>
            도우 : ${pizza_dow}`



    })

    const pizzaImg = document.getElementById("pizza_img");
const zoomDiv = document.getElementById("img_zoom");

let isZoomed = false;

const pizzaImages = {
    menu1: "cheezepizza.png",
    menu2: "combepizza.png",
    menu3: "gogumapizza.png"
};

const menuButtons = ["menu1", "menu2", "menu3"];
// const sp = document.querySelector("#span")

menuButtons.forEach(menuId => {
    const button = document.getElementById(menuId);
    
    button.addEventListener("click", function () {
        // 이미지 변경
        pizzaImg.src = pizzaImages[menuId]; //배송정보에 menuid 추가
        // console.log(menuId)
        // sp.innerHTML = `메뉴 : ${button.value} `

        // 확대 초기화
        isZoomed = false;
        zoomDiv.innerHTML = "";

        // 버튼 색상 초기화 및 현재 버튼 파란색
        menuButtons.forEach(id => {
            document.getElementById(id).style.backgroundColor = ""; // 초기화
        });
        button.style.backgroundColor = "green"; // 선택된 버튼 파란색
        button.style.color = "black"; // 텍스트 색상도 잘 보이게
    });
});

// 이미지 클릭 시 한 번만 확대
pizzaImg.addEventListener("click", function () {
    if (!pizzaImg.src) return;

    if (!isZoomed) {
        zoomDiv.innerHTML = `<img src="${pizzaImg.src}" style="width:${pizzaImg.clientWidth * 1.5}px;">`;
        isZoomed = true;
    } else {
        console.log("이미 확대됨");
    }
});

//appendchild와 textcontent를 활용해서 입력을 구현하자. 
//remove메서드로 삭제를 구현하자

document.querySelector("#insert_button").addEventListener("click", function () {
    const todoInput = document.getElementById("todo_text");
    const value = todoInput.value.trim();
    if (!value) return;

    // 전체 항목을 감쌀 div
    const itemWrapper = document.createElement("div");
    itemWrapper.style.display = "flex";
    itemWrapper.style.border = "1px solid black";
    itemWrapper.style.marginTop = "5px";

    // 좌측 영역
    const leftDiv = document.createElement("div");
    leftDiv.style.width = "500px";

    const checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.className = "check";
    checkbox.value = value;

    const label = document.createElement("span");
    label.textContent = " " + value;

    // 체크 시 취소선 토글
    checkbox.addEventListener("change", function () {
        if (checkbox.checked) {
            label.style.textDecoration = "line-through";
        } else {
            label.style.textDecoration = "none";
        }

        // 전체선택 상태도 동기화
        const allCheckboxes = document.querySelectorAll(".check");
        const allChecked = [...allCheckboxes].every(cb => cb.checked);
        document.querySelector(".chk_all2").checked = allChecked;
    });

    leftDiv.appendChild(checkbox);
    leftDiv.appendChild(label);

    // 우측 빈 div
    const rightDiv = document.createElement("div");
    rightDiv.style.width = "80px";

    itemWrapper.appendChild(leftDiv);
    itemWrapper.appendChild(rightDiv);

    document.querySelector(".todo_list").appendChild(itemWrapper);
    todoInput.value = "";
});

//  전체선택 기능
document.querySelector(".chk_all2").addEventListener("change", function () {
    const checkboxes = document.querySelectorAll(".check");
    checkboxes.forEach(cb => {
        cb.checked = this.checked;

        // 취소선 동기화
        const label = cb.nextElementSibling;
        label.style.textDecoration = cb.checked ? "line-through" : "none";
    });
});

//  선택된 항목 전체삭제
document.querySelector(".unchk_all").addEventListener("change", function () {
    const checkboxes = document.querySelectorAll(".check");
    checkboxes.forEach(cb => {
        if (cb.checked) {
            cb.closest("div").parentElement.remove();
        }
    });

    // 삭제 후 체크박스 상태 초기화
    this.checked = false;
    document.querySelector(".chk_all2").checked = false;
});




   
    
    // const btn2 = document.querySelector("#menu2");
    // btn2.addEventListener("click", function(){
    //     const a = document.getElementById("pizza_img")
    //         a.addEventListener("click", function(){
    //         a.setAttribute("src", "combepizza.png")
            
    //             if (cnt ==0){
    //                 zoom.innerHTML = `<img src="${img.src}" style="width:${img.clientWidth * 1.5}px;">`;
    //                 cnt ++;
    //             } else {
    //                 console.log("MAX!!!!!!!") //이거 왜 콘솔 안찍힘??? 변수를 안에다 넣어서 애당초 0으로 리셋이 되어버리면 안되지 않을까? 정신차려

    //             }
        
    //     })

        
    // })
    // document.getElementById("pizza_img").addEventListener("click", function(){
        
    //     if (cnt ==0){
    //         zoom.innerHTML = `<img src="${img.src}" style="width:${img.clientWidth * 1.5}px;">`;
    //         cnt ++;
    //     } else {
    //         console.log("MAX!!!!!!!") //이거 왜 콘솔 안찍힘??? 변수를 안에다 넣어서 애당초 0으로 리셋이 되어버리면 안되지 않을까? 정신차려

    //     }

        

        

        
    // })

  

    

    



    





}


//dom tree가 다 만들어진후 발생하는 이벤트, 
// 둠이 생성되기전 둠을 조작하는 자바 스크립트 코드가 실행되어 원하지 않는 결과를 반환하는것을 예방
//load는 둠트라 이후 모든 리소스까지 완벽히 끝난후 발생하는 이벤트

// document.addEventListener("DOMContentLoaded", function () {

//     //전체 선택 박스
//     const chkAll = document.querySelector(".chk_all");

//     //체크박스 
//     const chkItems = document.querySelectorAll(".check");

//     //선택 버튼
//     const selectBtn = document.querySelector('input[type="button"]');

//     //출력 부분
//     const outputDiv = document.querySelector("#text");    

//     // 1. 전체 선택 / 해제
//     chkAll.addEventListener("change", function () {
//         chkItems.forEach(chk => {

//     // 전체 선택 박스가 체크 됬는지 여부를 각각의 박스에 저장
//             chk.checked = chkAll.checked;
//         });
//     });



//     // 2. 개별 체크박스 변경 시 전체선택 상태 동기화
//     chkItems.forEach(chk => {
//         chk.addEventListener("change", function () {
//             const allChecked = [...chkItems].every(item => item.checked); 
//             //[]...~~~] ~~~의 요소들로 만든 배열
//             //arr.every(callback(element[, index[, array]])[, thisArg]) 조건을 만족하는 배열 검사, 
//             // 배열의 모든 요소가 콜백 함수의 요건을 만족하면 true, 아니면 false , 논리 연산자 "and" 같은 녀석
//             chkAll.checked = allChecked;
//         });
//     });

//     // 3. 선택 버튼 클릭 시 출력
//     selectBtn.addEventListener("click", function () {
//         const selected = [...chkItems]
//             //filter, mpa은 메서드, filter은 말 그대로 필터링, map은 해당값 반환 , 
//             // dictionary로 치면 key: value같은 느낌
//             .filter(chk => chk.checked)
//             .map(chk => chk.value);

//         if (selected.length > 0) {
//             //outputDiv = html에 특정 요소를 가져온다
//             //join(", ")은 배열의 요소들을 쉼표+공백으로 이어붙인 문자열로 바끈다.

//             outputDiv.textContent = "토핑: " + selected.join(", ");
//         } else {
//             outputDiv.textContent = "토핑: 없음";
//         }
//     });
// });
