package com.company.phone;

public class MainPhone {

    public static void main(String[] args) {
        ITelephone vitaPhone;
        vitaPhone = new DeskPhone(123456);
        vitaPhone.powerOn();
        vitaPhone.callPhone(123456);
        vitaPhone.answer();

        vitaPhone = new MobilePhone(24565);
        vitaPhone.powerOn();
        vitaPhone.callPhone(24565);
        vitaPhone.answer();

    }
}
