package com.learning;

public class PiggyBank {
    // 1. กําหนด Fields
    String ownerName;
    double money;

    // 2. สร้าง Constructor
    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0;
    }

    // 3. สร้าง Methods
    public void addMoney(double amount) {
        this.money += amount;
        System.out.println("หยอดเงินใส่กระปุกของ " + this.ownerName + " จํานวน " + amount + " บาท");
    }

    public void showMoney() {
        System.out.println("กระปุกของ " + this.ownerName + " มีเงินทั้งหมด " + this.money + " บาท");
    }
}
