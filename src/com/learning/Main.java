package com.learning;

public class Main {
    public static void main(String[] args) {
        // สร้างกระปุกใบแรก : สร้าง Object จาก Class PiggyBank โดยตั้งชื่อเจ้าของว่า "น้องพอใจ"
        PiggyBank nongPorjai = new PiggyBank("น้องพอใจ");

        // ดูเงินครั้งแรก : เรียกใช้เมธอด showMoney() ของ "น้องพอใจ" เพื่อดูว่าตอนแรกมีเงินเท่าไหร่ (ควรจะเป็น 0)
        nongPorjai.showMoney();

        // หยอดเงิน: เรียกใช้เมธอด addMoney() 2-3 ครั้ง เพื่อหยอดเงินใส่กระปุก (เช่น หยอด 20 บาท, หยอด 50 บาท)
        nongPorjai.addMoney(20);
        nongPorjai.addMoney(50);

        // ดูเงินอีกครั้ง : เรียกใช้เมธอด showMoney() อีกครั้ง เพื่อดูยอดเงินล่าสุดหลังจากหยอดเงินไปแล้ว
        nongPorjai.showMoney();
    }
}
