window.onload = function () {
  const container = document.getElementById("resizable-draggable");
  const resizer = container.querySelector(".resizer");

  let isDragging = false;
  let isResizing = false;
  let offsetX, offsetY, startX, startY, startWidth, startHeight;

  // 드래그 시작
  container.addEventListener("mousedown", function (e) {
    if (e.target === resizer) return; // 리사이저 클릭은 드래그 제외
    isDragging = true;
    offsetX = e.clientX - container.offsetLeft;
    offsetY = e.clientY - container.offsetTop;
  });

  // 리사이즈 시작
  resizer.addEventListener("mousedown", function (e) {
    e.stopPropagation(); // 드래그 이벤트와 겹치지 않게 막기
    isResizing = true;
    startX = e.clientX;
    startY = e.clientY;
    startWidth = parseInt(window.getComputedStyle(container).width, 10);
    startHeight = parseInt(window.getComputedStyle(container).height, 10);
  });

  // 마우스 이동 처리
  document.addEventListener("mousemove", function (e) {
    if (isDragging) {
      container.style.left = (e.clientX - offsetX) + "px";
      container.style.top = (e.clientY - offsetY) + "px";
    }

    if (isResizing) {
      const newWidth = startWidth + (e.clientX - startX);
      const newHeight = startHeight + (e.clientY - startY);
      container.style.width = newWidth + "px";
      container.style.height = newHeight + "px";
    }
  });

  // 드래그 & 리사이즈 종료
  document.addEventListener("mouseup", function () {
    isDragging = false;
    isResizing = false;
  });
};
