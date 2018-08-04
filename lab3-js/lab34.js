var a = null;
var b = null;
var c = null;
function  lamLai() {
    a = null;
    b = null;
    c = null;
}
function toanTu(x) {
    c = x;
}
function toanHang(x) {
    if (a==null){
        a = x;
    }else {
        b = x;
    }
}
function thucHien() {
    switch (c){
        case "+":
            var ketqua = a+b;
            alert("Tổng: "+ketqua);
            break;
        case "-":
            var ketqua1 = a-b;
            alert("Hiệu: "+ketqua1);
            break;
        case "*":
            var ketqua2 = a*b;
            alert("Tích: "+ketqua2);
            break;
        case "/":
            var ketqua3 = a/b;
            alert("Thương: "+ketqua3 );
            break;
        default:
            alert(c +"không phải là toán tử");
            break;
    }
    lamLai();
}