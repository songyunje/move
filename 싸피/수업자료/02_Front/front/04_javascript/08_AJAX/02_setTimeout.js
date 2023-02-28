function foo() {
  console.log("foo");
}

function bar() {
  console.log("bar");
}

// window 객체가 갖고 있는 메서드
// setTimeout(함수, delay) => delay 초 이후에 실행
setTimeout(foo, 4000); // 동기였다면 대기했을테지만...
setTimeout(bar, 3000); // 대기하지 않고 그 다음 문장을 바로 실행
