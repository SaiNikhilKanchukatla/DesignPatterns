package com.company;

interface AbstractFactory {
 Bank getBank(int bankName);
 BillPayment modeOfBillPayment(int mode);
}
