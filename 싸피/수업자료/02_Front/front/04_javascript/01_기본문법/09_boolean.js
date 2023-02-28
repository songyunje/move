console.log(!!0);
console.log(!!"");
console.log(!!null);
console.log(!!undefined);
console.log(!!NaN);
console.log(!!"0"); // 빈문자열이 아닌 것
console.log(!!Number("0"));
console.log(Boolean());

let id;
console.log(id);
if (id) {
  console.log("id 값이 있는 경우.");
} else {
  console.log("id 값이 없는 경우");
}
