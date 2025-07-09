document.addEventListener("DOMContentLoaded", function () {
    const keyword = document.querySelector("#keyword");
    const site = document.querySelector("#site");
    const form = document.querySelector("#form");

    const chkAll = document.querySelector(".chk_all");
    const chkItems = document.querySelectorAll(".check");
    const selectBtn = document.querySelector('input[type="button"]');
    const outputDiv = document.querySelector("#text");

    // 🔹 1. 검색창 이벤트

    // 포커스 시 노란 배경
    keyword.addEventListener("focus", () => {
        keyword.style.backgroundColor = "yellow";
    });

    // 포커스 해제 시 배경 초기화
    keyword.addEventListener("blur", () => {
        keyword.style.backgroundColor = "";
    });

    // 입력 중일 때 배경 랜덤 색상
    keyword.addEventListener("input", () => {
        const r = Math.floor(Math.random() * 256);
        const g = Math.floor(Math.random() * 256);
        const b = Math.floor(Math.random() * 256);
        const a = Math.random().toFixed(2);
        keyword.style.backgroundColor = `rgba(${r},${g},${b},${a})`;
    });

    // 🔹 2. 검색 사이트 선택 시 form action 변경
    site.addEventListener("input", () => {
        const value = site.value;
        if (value == "1") {
            form.setAttribute("action", "https://search.naver.com/search.naver");
        } else if (value == "2") {
            form.setAttribute("action", "https://www.google.com/search");
        } else if (value == "3") {
            form.setAttribute("action", "https://search.danawa.com/dsearch.php?k1=");
        }
    });

    // 🔹 3. 폼 제출 시 검색어 유효성 검사
    form.addEventListener("submit", (event) => {
        event.preventDefault();

        const value = keyword.value;
        if (value.trim().length < 2) {
            alert("검색어는 두 글자 이상 입력해주세요.");
        } else {
            form.submit();
        }
    });

    // 🔹 4. 복사 및 선택 방지
    document.addEventListener("copy", function (event) {
        event.preventDefault();
        alert("복사 금지");
    });

    document.addEventListener("selectstart", function (event) {
        event.preventDefault();
    });

    // 🔹 5. 전체선택 체크박스 기능
    chkAll.addEventListener("change", function () {
        chkItems.forEach(chk => {
            chk.checked = chkAll.checked;
        });
    });

    // 개별 체크박스 변경 시 전체선택 상태 반영
    chkItems.forEach(chk => {
        chk.addEventListener("change", function () {
            const allChecked = [...chkItems].every(item => item.checked);
            chkAll.checked = allChecked;
        });
    });

    // 선택 버튼 클릭 시 선택된 토핑 표시
    selectBtn.addEventListener("click", function () {
        const selected = [...chkItems]
            .filter(chk => chk.checked)
            .map(chk => chk.value);

        outputDiv.textContent = selected.length > 0 ? `토핑: ${selected.join(", ")}` : "토핑: 없음";
    });
});
