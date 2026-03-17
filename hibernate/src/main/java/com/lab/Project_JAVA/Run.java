package com.lab.Project_JAVA;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lab.util.HibernateConnection;

public class Run {
        @SuppressWarnings("deprecation")
        public static void main(String[] args) {

                try {
                        Customer c1 = new Customer(10001, "Somchai Srisuk", 812345678, "somchai@gmail.com", "Bangkok",
                                        "somchai01",
                                        "1234");
                        Customer c2 = new Customer(10002, "Kanya Wongchai", 823456789, "kanya@gmail.com", "Chiang Mai",
                                        "kanya02",
                                        "1234");
                        Customer c3 = new Customer(10003, "Anan Prasert", 834567890, "anan@gmail.com", "Khon Kaen",
                                        "anan03",
                                        "1234");
                        Customer c4 = new Customer(10004, "Narin Chaiyasit", 845678901, "narin@gmail.com", "Bangkok",
                                        "narin04",
                                        "1234");
                        Customer c5 = new Customer(10005, "Suda Preecha", 856789012, "suda@gmail.com", "Phuket",
                                        "suda05", "1234");
                        Customer c6 = new Customer(10006, "Thanawat Sukjai", 867890123, "thanawat@gmail.com", "Bangkok",
                                        "thanawat06", "1234");
                        Customer c7 = new Customer(10007, "Pimchanok Saelim", 878901234, "pimchanok@gmail.com",
                                        "Chiang Rai",
                                        "pim07", "1234");
                        Customer c8 = new Customer(10008, "Kritsada Meechai", 889012345, "kritsada@gmail.com",
                                        "Ayutthaya",
                                        "krit08", "1234");
                        Customer c9 = new Customer(10009, "Arisa Phonchai", 890123456, "arisa@gmail.com", "Bangkok",
                                        "arisa09",
                                        "1234");
                        Customer c10 = new Customer(10010, "Teerapat Boonmee", 891234567, "tee@gmail.com", "Phuket",
                                        "tee10",
                                        "1234");
                        Customer c11 = new Customer(10011, "Chalita Rung", 892345678, "chalita@gmail.com", "Bangkok",
                                        "chalita11",
                                        "1234");
                        Customer c12 = new Customer(10012, "Natthapon Sri", 893456789, "nat@gmail.com", "Chonburi",
                                        "nat12",
                                        "1234");
                        Customer c13 = new Customer(10013, "Nuttida Meechai", 894567890, "nuttida@gmail.com", "Bangkok",
                                        "nuttida13", "1234");
                        Customer c14 = new Customer(10014, "Pakorn Kham", 895678901, "pakorn@gmail.com",
                                        "Nakhon Pathom",
                                        "pakorn14", "1234");
                        Customer c15 = new Customer(10015, "Supaporn Dee", 896789012, "supaporn@gmail.com", "Bangkok",
                                        "supaporn15",
                                        "1234");
                        Customer c16 = new Customer(10016, "Kittipong Man", 897890123, "kitti@gmail.com", "Nonthaburi",
                                        "kitti16",
                                        "1234");
                        Customer c17 = new Customer(10017, "Sirinapa Tan", 898901234, "siri@gmail.com", "Chiang Mai",
                                        "siri17",
                                        "1234");
                        Customer c18 = new Customer(10018, "Apinya Run", 899012345, "apinya@gmail.com", "Bangkok",
                                        "api18", "1234");
                        Customer c19 = new Customer(10019, "Preecha Sri", 900123456, "preecha@gmail.com", "Phuket",
                                        "pre19",
                                        "1234");
                        Customer c20 = new Customer(10020, "Nuttagon", 631812362, "nuttagon@gmail.com", "USA",
                                        "nuttagonEx",
                                        "nuttagon001");

                        Technician t1 = new Technician(20001, "Nattapong Tech", 891111111, "tech1@gmail.com",
                                        "Hardware Specialist");
                        Technician t2 = new Technician(20002, "Chaiwat Tech", 892222222, "tech2@gmail.com",
                                        "Software Specialist");
                        Technician t3 = new Technician(20003, "Somchai Engineer", 893333333, "tech3@gmail.com",
                                        "Senior Technician");
                        Technician t4 = new Technician(20004, "Thanawat Tech", 894444444, "tech4@gmail.com",
                                        "Laptop Specialist");
                        Technician t5 = new Technician(20005, "Kritsada Tech", 895555555, "tech5@gmail.com",
                                        "PC Technician");
                        Technician t6 = new Technician(20006, "Preecha Tech", 896666666, "tech6@gmail.com",
                                        "Hardware Specialist");
                        Technician t7 = new Technician(20007, "Sakda Engineer", 897777777, "tech7@gmail.com",
                                        "Network Technician");
                        Technician t8 = new Technician(20008, "Anucha Tech", 898888888, "tech8@gmail.com",
                                        "Laptop Specialist");
                        Technician t9 = new Technician(20009, "Teerapat Tech", 899999999, "tech9@gmail.com",
                                        "Senior Technician");
                        Technician t10 = new Technician(20010, "Kittipong Engineer", 890000001, "tech10@gmail.com",
                                        "PC Technician");
                        Technician t11 = new Technician(20011, "Supachai Tech", 890000002, "tech11@gmail.com",
                                        "Hardware Specialist");
                        Technician t12 = new Technician(20012, "Natthapon Tech", 890000003, "tech12@gmail.com",
                                        "Software Specialist");
                        Technician t13 = new Technician(20013, "Apichai Engineer", 890000004, "tech13@gmail.com",
                                        "Senior Technician");
                        Technician t14 = new Technician(20014, "Chatchai Tech", 890000005, "tech14@gmail.com",
                                        "Laptop Specialist");
                        Technician t15 = new Technician(20015, "Warit Tech", 890000006, "tech15@gmail.com",
                                        "PC Technician");
                        Technician t16 = new Technician(20016, "Narin Engineer", 890000007, "tech16@gmail.com",
                                        "Network Technician");
                        Technician t17 = new Technician(20017, "Sittichai Tech", 890000008, "tech17@gmail.com",
                                        "Hardware Specialist");
                        Technician t18 = new Technician(20018, "Pongsak Tech", 890000009, "tech18@gmail.com",
                                        "Laptop Specialist");
                        Technician t19 = new Technician(20019, "Rachata Engineer", 890000010, "tech19@gmail.com",
                                        "Senior Technician");
                        Technician t20 = new Technician(20020, "Kawin Tech", 890000011, "tech20@gmail.com",
                                        "Software Specialist");

                        Supplier s1 = new Supplier(30001, "JIB Computer", 210178888, "contact@jib.co.th", "Bangkok");
                        Supplier s2 = new Supplier(30002, "Advice IT", 210179999, "contact@advice.co.th", "Bangkok");
                        Supplier s3 = new Supplier(30003, "Banana IT", 210180000, "contact@banana.co.th", "Bangkok");
                        Supplier s4 = new Supplier(30004, "IT City", 210181111, "contact@itcity.co.th", "Bangkok");
                        Supplier s5 = new Supplier(30005, "Compute And More", 210182222, "contact@compute.co.th",
                                        "Bangkok");
                        Supplier s6 = new Supplier(30006, "Speed Computer", 210183333, "contact@speed.co.th",
                                        "Bangkok");
                        Supplier s7 = new Supplier(30007, "Hardware House", 210184444, "contact@hardware.co.th",
                                        "Bangkok");
                        Supplier s8 = new Supplier(30008, "Tech Distribution", 210185555, "contact@techdist.co.th",
                                        "Bangkok");
                        Supplier s9 = new Supplier(30009, "NextGen IT", 210186666, "contact@nextgen.co.th", "Bangkok");
                        Supplier s10 = new Supplier(30010, "Global Parts", 210187777, "contact@globalparts.co.th",
                                        "Bangkok");
                        Supplier s11 = new Supplier(30011, "Synnex Thailand", 212345678, "contact@synnex.co.th",
                                        "Bangkok");
                        Supplier s12 = new Supplier(30012, "Ascenti Resources", 223456789, "contact@ascenti.co.th",
                                        "Bangkok");
                        Supplier s13 = new Supplier(30013, "Ingram Micro Thailand", 234567890,
                                        "contact@ingrammicro.co.th",
                                        "Bangkok");
                        Supplier s14 = new Supplier(30014, "D Computer Supply", 245678901, "contact@dcomputer.co.th",
                                        "Bangkok");
                        Supplier s15 = new Supplier(30015, "TK Computer", 256789012, "contact@tkcom.co.th", "Bangkok");
                        Supplier s16 = new Supplier(30016, "Jedi IT Distribution", 267890123, "contact@jedi.co.th",
                                        "Bangkok");
                        Supplier s17 = new Supplier(30017, "Hardware Hub", 278901234, "contact@hardwarehub.co.th",
                                        "Bangkok");
                        Supplier s18 = new Supplier(30018, "Digital System Supply", 289012345,
                                        "contact@digitalsystem.co.th",
                                        "Bangkok");
                        Supplier s19 = new Supplier(30019, "ProTech Distribution", 290123456, "contact@protech.co.th",
                                        "Bangkok");
                        Supplier s20 = new Supplier(30020, "Smart IT Supply", 201234567, "contact@smartit.co.th",
                                        "Bangkok");

                        SparePart sp1 = new SparePart(40001, "Kingston NV2 SSD 1TB", 2900, 20);
                        SparePart sp2 = new SparePart(40002, "Samsung 980 SSD 500GB", 2200, 15);
                        SparePart sp3 = new SparePart(40003, "Corsair Vengeance 16GB RAM", 2100, 30);
                        SparePart sp4 = new SparePart(40004, "ASUS RTX 3060 GPU", 12500, 5);
                        SparePart sp5 = new SparePart(40005, "CoolerMaster 650W PSU", 1800, 10);
                        SparePart sp6 = new SparePart(40006, "WD Blue HDD 1TB", 1500, 25);
                        SparePart sp7 = new SparePart(40007, "Samsung DDR4 8GB", 900, 40);
                        SparePart sp8 = new SparePart(40008, "Intel i5 12400 CPU", 7200, 8);
                        SparePart sp9 = new SparePart(40009, "AMD Ryzen 5 5600", 6800, 7);
                        SparePart sp10 = new SparePart(40010, "ASUS B550 Motherboard", 4200, 6);
                        SparePart sp11 = new SparePart(40011, "Laptop Cooling Fan", 600, 20);
                        SparePart sp12 = new SparePart(40012, "Laptop Battery Dell", 1500, 10);
                        SparePart sp13 = new SparePart(40013, "Laptop Battery HP", 1400, 12);
                        SparePart sp14 = new SparePart(40014, "Laptop Keyboard ASUS", 800, 15);
                        SparePart sp15 = new SparePart(40015, "Laptop Screen 15.6", 2500, 8);
                        SparePart sp16 = new SparePart(40016, "MacBook SSD Adapter", 1200, 5);
                        SparePart sp17 = new SparePart(40017, "MacBook Battery", 3500, 4);
                        SparePart sp18 = new SparePart(40018, "Gaming Cooling System", 2200, 6);
                        SparePart sp19 = new SparePart(40019, "Laptop Charger 65W", 700, 30);
                        SparePart sp20 = new SparePart(40020, "Laptop Charger 90W", 900, 20);
                        SparePart sp21 = new SparePart(40021, "RAM DDR4 32GB", 4500, 10);
                        SparePart sp22 = new SparePart(40022, "NVMe SSD 2TB", 5200, 5);
                        SparePart sp23 = new SparePart(40023, "GPU RTX 4070", 21000, 3);
                        SparePart sp24 = new SparePart(40024, "Power Supply 750W", 2500, 8);
                        SparePart sp25 = new SparePart(40025, "CPU Cooler RGB", 1300, 12);
                        SparePart sp26 = new SparePart(40026, "Laptop Hinges", 400, 25);
                        SparePart sp27 = new SparePart(40027, "Keyboard Mechanical", 1800, 7);
                        SparePart sp28 = new SparePart(40028, "Gaming Mouse", 900, 20);
                        SparePart sp29 = new SparePart(40029, "WiFi Card", 500, 18);
                        SparePart sp30 = new SparePart(40030, "Bluetooth Module", 350, 15);

                        Calendar phDate1 = Calendar.getInstance();
                        phDate1.set(2025, 0, 5);
                        Purchase p1 = new Purchase(50001, s1, phDate1, 32000);
                        Calendar phDate2 = Calendar.getInstance();
                        phDate2.set(2025, 2, 14);
                        Purchase p2 = new Purchase(50002, s2, phDate2, 28000);
                        Calendar phDate3 = Calendar.getInstance();
                        phDate3.set(2025, 5, 3);
                        Purchase p3 = new Purchase(50003, s3, phDate3, 36000);
                        Calendar phDate4 = Calendar.getInstance();
                        phDate4.set(2025, 7, 21);
                        Purchase p4 = new Purchase(50004, s4, phDate4, 25000);
                        Calendar phDate5 = Calendar.getInstance();
                        phDate5.set(2025, 3, 11);
                        Purchase p5 = new Purchase(50005, s5, phDate5, 42000);
                        Calendar phDate6 = Calendar.getInstance();
                        phDate6.set(2025, 9, 8);
                        Purchase p6 = new Purchase(50006, s6, phDate6, 39000);
                        Calendar phDate7 = Calendar.getInstance();
                        phDate7.set(2025, 4, 17);
                        Purchase p7 = new Purchase(50007, s7, phDate7, 31000);
                        Calendar phDate8 = Calendar.getInstance();
                        phDate8.set(2025, 1, 9);
                        Purchase p8 = new Purchase(50008, s8, phDate8, 27000);
                        Calendar phDate9 = Calendar.getInstance();
                        phDate9.set(2025, 10, 6);
                        Purchase p9 = new Purchase(50009, s9, phDate9, 44000);
                        Calendar phDate10 = Calendar.getInstance();
                        phDate10.set(2025, 6, 25);
                        Purchase p10 = new Purchase(50010, s10, phDate10, 30000);
                        Calendar phDate11 = Calendar.getInstance();
                        phDate11.set(2025, 8, 4);
                        Purchase p11 = new Purchase(50011, s11, phDate11, 35000);
                        Calendar phDate12 = Calendar.getInstance();
                        phDate12.set(2025, 3, 19);
                        Purchase p12 = new Purchase(50012, s12, phDate12, 41000);
                        Calendar phDate13 = Calendar.getInstance();
                        phDate13.set(2025, 11, 7);
                        Purchase p13 = new Purchase(50013, s13, phDate13, 29000);
                        Calendar phDate14 = Calendar.getInstance();
                        phDate14.set(2025, 0, 28);
                        Purchase p14 = new Purchase(50014, s14, phDate14, 37000);
                        Calendar phDate15 = Calendar.getInstance();
                        phDate15.set(2025, 2, 12);
                        Purchase p15 = new Purchase(50015, s15, phDate15, 33000);
                        Calendar phDate16 = Calendar.getInstance();
                        phDate16.set(2025, 5, 16);
                        Purchase p16 = new Purchase(50016, s16, phDate16, 26000);
                        Calendar phDate17 = Calendar.getInstance();
                        phDate17.set(2025, 9, 2);
                        Purchase p17 = new Purchase(50017, s17, phDate17, 31000);
                        Calendar phDate18 = Calendar.getInstance();
                        phDate18.set(2025, 4, 30);
                        Purchase p18 = new Purchase(50018, s18, phDate18, 28000);
                        Calendar phDate19 = Calendar.getInstance();
                        phDate19.set(2025, 7, 13);
                        Purchase p19 = new Purchase(50019, s19, phDate19, 39000);
                        Calendar phDate20 = Calendar.getInstance();
                        phDate20.set(2025, 1, 22);
                        Purchase p20 = new Purchase(50020, s20, phDate20, 42000);

                        PurchaseDetail pd1 = new PurchaseDetail(60001, p1, sp1, 3, 2800);
                        PurchaseDetail pd2 = new PurchaseDetail(60002, p1, sp2, 2, 2100);
                        PurchaseDetail pd3 = new PurchaseDetail(60003, p2, sp3, 4, 2000);
                        PurchaseDetail pd4 = new PurchaseDetail(60004, p2, sp4, 1, 12000);
                        PurchaseDetail pd5 = new PurchaseDetail(60005, p3, sp5, 2, 1700);
                        PurchaseDetail pd6 = new PurchaseDetail(60006, p3, sp6, 3, 1400);
                        PurchaseDetail pd7 = new PurchaseDetail(60007, p4, sp7, 5, 850);
                        PurchaseDetail pd8 = new PurchaseDetail(60008, p4, sp8, 2, 7000);
                        PurchaseDetail pd9 = new PurchaseDetail(60009, p5, sp9, 2, 6500);
                        PurchaseDetail pd10 = new PurchaseDetail(60010, p5, sp10, 1, 4000);
                        PurchaseDetail pd11 = new PurchaseDetail(60011, p6, sp11, 4, 550);
                        PurchaseDetail pd12 = new PurchaseDetail(60012, p6, sp12, 2, 1300);
                        PurchaseDetail pd13 = new PurchaseDetail(60013, p7, sp13, 2, 1200);
                        PurchaseDetail pd14 = new PurchaseDetail(60014, p7, sp14, 3, 750);
                        PurchaseDetail pd15 = new PurchaseDetail(60015, p8, sp15, 1, 2400);
                        PurchaseDetail pd16 = new PurchaseDetail(60016, p8, sp16, 1, 1100);
                        PurchaseDetail pd17 = new PurchaseDetail(60017, p9, sp17, 1, 3300);
                        PurchaseDetail pd18 = new PurchaseDetail(60018, p9, sp18, 2, 2000);
                        PurchaseDetail pd19 = new PurchaseDetail(60019, p10, sp19, 6, 650);
                        PurchaseDetail pd20 = new PurchaseDetail(60020, p10, sp20, 4, 850);
                        PurchaseDetail pd21 = new PurchaseDetail(60021, p11, sp21, 2, 4400);
                        PurchaseDetail pd22 = new PurchaseDetail(60022, p11, sp22, 1, 5100);
                        PurchaseDetail pd23 = new PurchaseDetail(60023, p12, sp23, 1, 20500);
                        PurchaseDetail pd24 = new PurchaseDetail(60024, p12, sp24, 2, 2400);
                        PurchaseDetail pd25 = new PurchaseDetail(60025, p13, sp25, 2, 1200);
                        PurchaseDetail pd26 = new PurchaseDetail(60026, p13, sp26, 5, 380);
                        PurchaseDetail pd27 = new PurchaseDetail(60027, p14, sp27, 2, 1700);
                        PurchaseDetail pd28 = new PurchaseDetail(60028, p14, sp28, 3, 850);
                        PurchaseDetail pd29 = new PurchaseDetail(60029, p15, sp29, 4, 480);
                        PurchaseDetail pd30 = new PurchaseDetail(60030, p15, sp30, 3, 330);
                        PurchaseDetail pd31 = new PurchaseDetail(60031, p16, sp1, 2, 2800);
                        PurchaseDetail pd32 = new PurchaseDetail(60032, p16, sp3, 2, 2000);
                        PurchaseDetail pd33 = new PurchaseDetail(60033, p17, sp5, 2, 1700);
                        PurchaseDetail pd34 = new PurchaseDetail(60034, p17, sp7, 4, 850);
                        PurchaseDetail pd35 = new PurchaseDetail(60035, p18, sp9, 1, 6500);
                        PurchaseDetail pd36 = new PurchaseDetail(60036, p18, sp11, 3, 550);
                        PurchaseDetail pd37 = new PurchaseDetail(60037, p19, sp13, 2, 1200);
                        PurchaseDetail pd38 = new PurchaseDetail(60038, p19, sp15, 1, 2400);
                        PurchaseDetail pd39 = new PurchaseDetail(60039, p20, sp17, 1, 3300);
                        PurchaseDetail pd40 = new PurchaseDetail(60040, p20, sp19, 5, 650);

                        Calendar jobDate1 = Calendar.getInstance();
                        jobDate1.set(2026, 0, 5);
                        Calendar jobApp1 = Calendar.getInstance();
                        jobApp1.set(2026, 0, 8);
                        RepairJob r1 = new RepairJob(70001, c1, t1, "Inspiron 15", "Laptop", "Dell", jobDate1, jobApp1,
                                        "เสร็จสิ้น");

                        Calendar jobDate2 = Calendar.getInstance();
                        jobDate2.set(2026, 0, 10);
                        Calendar jobApp2 = Calendar.getInstance();
                        jobApp2.set(2026, 0, 15);
                        RepairJob r2 = new RepairJob(70002, c2, t2, "ROG Strix G15", "Laptop", "ASUS", jobDate2,
                                        jobApp2,
                                        "เสร็จสิ้น");

                        Calendar jobDate3 = Calendar.getInstance();
                        jobDate3.set(2026, 0, 20);
                        Calendar jobApp3 = Calendar.getInstance();
                        jobApp3.set(2026, 0, 25);
                        RepairJob r3 = new RepairJob(70003, c3, t3, "Pavilion 14", "Laptop", "HP", jobDate3, jobApp3,
                                        "เสร็จสิ้น");

                        Calendar jobDate4 = Calendar.getInstance();
                        jobDate4.set(2026, 1, 1);
                        Calendar jobApp4 = Calendar.getInstance();
                        jobApp4.set(2026, 1, 5);
                        RepairJob r4 = new RepairJob(70004, c4, t4, "ThinkPad X1", "Laptop", "Lenovo", jobDate4,
                                        jobApp4,
                                        "เสร็จสิ้น");

                        Calendar jobDate5 = Calendar.getInstance();
                        jobDate5.set(2026, 1, 3);
                        Calendar jobApp5 = Calendar.getInstance();
                        jobApp5.set(2026, 1, 7);
                        RepairJob r5 = new RepairJob(70005, c5, t5, "MacBook Air M1", "Laptop", "Apple", jobDate5,
                                        jobApp5,
                                        "เสร็จสิ้น");

                        Calendar jobDate6 = Calendar.getInstance();
                        jobDate6.set(2026, 1, 10);
                        Calendar jobApp6 = Calendar.getInstance();
                        jobApp6.set(2026, 1, 12);
                        RepairJob r6 = new RepairJob(70006, c6, t6, "Nitro 5", "Laptop", "Acer", jobDate6, jobApp6,
                                        "เสร็จสิ้น");

                        Calendar jobDate7 = Calendar.getInstance();
                        jobDate7.set(2026, 1, 15);
                        Calendar jobApp7 = Calendar.getInstance();
                        jobApp7.set(2026, 1, 20);
                        RepairJob r7 = new RepairJob(70007, c7, t7, "IdeaPad Gaming 3", "Laptop", "Lenovo", jobDate7,
                                        jobApp7,
                                        "เสร็จสิ้น");

                        Calendar jobDate8 = Calendar.getInstance();
                        jobDate8.set(2026, 1, 18);
                        Calendar jobApp8 = Calendar.getInstance();
                        jobApp8.set(2026, 1, 22);
                        RepairJob r8 = new RepairJob(70008, c8, t8, "Latitude 7420", "Laptop", "Dell", jobDate8,
                                        jobApp8,
                                        "เสร็จสิ้น");

                        Calendar jobDate9 = Calendar.getInstance();
                        jobDate9.set(2026, 1, 20);
                        Calendar jobApp9 = Calendar.getInstance();
                        jobApp9.set(2026, 1, 25);
                        RepairJob r9 = new RepairJob(70009, c9, t9, "EliteBook 840", "Laptop", "HP", jobDate9, jobApp9,
                                        "เสร็จสิ้น");

                        Calendar jobDate10 = Calendar.getInstance();
                        jobDate10.set(2026, 1, 25);
                        Calendar jobApp10 = Calendar.getInstance();
                        jobApp10.set(2026, 1, 28);
                        RepairJob r10 = new RepairJob(70010, c10, t10, "MacBook Pro M2", "Laptop", "Apple", jobDate10,
                                        jobApp10,
                                        "เสร็จสิ้น");

                        Calendar jobDate11 = Calendar.getInstance();
                        jobDate11.set(2026, 2, 1);
                        Calendar jobApp11 = Calendar.getInstance();
                        jobApp11.set(2026, 2, 5);
                        RepairJob r11 = new RepairJob(70011, c11, t11, "Predator Helios", "Laptop", "Acer", jobDate11,
                                        jobApp11,
                                        "เสร็จสิ้น");

                        Calendar jobDate12 = Calendar.getInstance();
                        jobDate12.set(2026, 2, 2);
                        Calendar jobApp12 = Calendar.getInstance();
                        jobApp12.set(2026, 2, 6);
                        RepairJob r12 = new RepairJob(70012, c12, t12, "ZenBook 14", "Laptop", "ASUS", jobDate12,
                                        jobApp12,
                                        "เสร็จสิ้น");

                        Calendar jobDate13 = Calendar.getInstance();
                        jobDate13.set(2026, 2, 3);
                        Calendar jobApp13 = Calendar.getInstance();
                        jobApp13.set(2026, 2, 7);
                        RepairJob r13 = new RepairJob(70013, c13, t13, "OptiPlex 7090", "PC", "Dell", jobDate13,
                                        jobApp13,
                                        "เสร็จสิ้น");

                        Calendar jobDate14 = Calendar.getInstance();
                        jobDate14.set(2026, 2, 4);
                        Calendar jobApp14 = Calendar.getInstance();
                        jobApp14.set(2026, 2, 8);
                        RepairJob r14 = new RepairJob(70014, c14, t14, "ProDesk 600", "PC", "HP", jobDate14, jobApp14,
                                        "เสร็จสิ้น");

                        Calendar jobDate15 = Calendar.getInstance();
                        jobDate15.set(2026, 2, 5);
                        Calendar jobApp15 = Calendar.getInstance();
                        jobApp15.set(2026, 2, 9);
                        RepairJob r15 = new RepairJob(70015, c15, t15, "ThinkCentre M720", "PC", "Lenovo", jobDate15,
                                        jobApp15,
                                        "เสร็จสิ้น");

                        Calendar jobDate16 = Calendar.getInstance();
                        jobDate16.set(2026, 2, 6);
                        Calendar jobApp16 = Calendar.getInstance();
                        jobApp16.set(2026, 2, 10);
                        RepairJob r16 = new RepairJob(70016, c16, t16, "Aspire TC", "PC", "Acer", jobDate16, jobApp16,
                                        "เสร็จสิ้น");

                        Calendar jobDate17 = Calendar.getInstance();
                        jobDate17.set(2026, 2, 7);
                        Calendar jobApp17 = Calendar.getInstance();
                        jobApp17.set(2026, 2, 11);
                        RepairJob r17 = new RepairJob(70017, c17, t17, "ROG Desktop G10", "PC", "ASUS", jobDate17,
                                        jobApp17,
                                        "เสร็จสิ้น");

                        Calendar jobDate18 = Calendar.getInstance();
                        jobDate18.set(2026, 2, 8);
                        Calendar jobApp18 = Calendar.getInstance();
                        jobApp18.set(2026, 2, 12);
                        RepairJob r18 = new RepairJob(70018, c18, t18, "Vostro 3888", "PC", "Dell", jobDate18, jobApp18,
                                        "เสร็จสิ้น");

                        Calendar jobDate19 = Calendar.getInstance();
                        jobDate19.set(2026, 2, 9);
                        Calendar jobApp19 = Calendar.getInstance();
                        jobApp19.set(2026, 2, 12);
                        RepairJob r19 = new RepairJob(70019, c19, t19, "EliteDesk 800", "PC", "HP", jobDate19, jobApp19,
                                        "เสร็จสิ้น");

                        Calendar jobDate20 = Calendar.getInstance();
                        jobDate20.set(2026, 2, 10);
                        Calendar jobApp20 = Calendar.getInstance();
                        jobApp20.set(2026, 2, 12);
                        RepairJob r20 = new RepairJob(70020, c20, t20, "ThinkCentre M90", "PC", "Lenovo", jobDate20,
                                        jobApp20,
                                        "เสร็จสิ้น");

                        Calendar jobDate21 = Calendar.getInstance();
                        jobDate21.set(2026, 2, 5);
                        Calendar jobApp21 = Calendar.getInstance();
                        jobApp21.set(2026, 2, 20);
                        RepairJob r21 = new RepairJob(70021, c1, t5, "Mac Mini", "PC", "Apple", jobDate21, jobApp21,
                                        "กำลังซ่อม");

                        Calendar jobDate22 = Calendar.getInstance();
                        jobDate22.set(2026, 2, 7);
                        Calendar jobApp22 = Calendar.getInstance();
                        jobApp22.set(2026, 2, 22);
                        RepairJob r22 = new RepairJob(70022, c2, t6, "Aspire XC", "PC", "Acer", jobDate22, jobApp22,
                                        "กำลังซ่อม");

                        Calendar jobDate23 = Calendar.getInstance();
                        jobDate23.set(2026, 2, 8);
                        Calendar jobApp23 = Calendar.getInstance();
                        jobApp23.set(2026, 2, 25);
                        RepairJob r23 = new RepairJob(70023, c3, t7, "TUF Gaming Desktop", "PC", "ASUS", jobDate23,
                                        jobApp23,
                                        "รออะไหล่");

                        Calendar jobDate24 = Calendar.getInstance();
                        jobDate24.set(2026, 2, 9);
                        Calendar jobApp24 = Calendar.getInstance();
                        jobApp24.set(2026, 2, 27);
                        RepairJob r24 = new RepairJob(70024, c4, t8, "OptiPlex 3080", "PC", "Dell", jobDate24, jobApp24,
                                        "กำลังซ่อม");

                        Calendar jobDate25 = Calendar.getInstance();
                        jobDate25.set(2026, 2, 10);
                        Calendar jobApp25 = Calendar.getInstance();
                        jobApp25.set(2026, 2, 30);
                        RepairJob r25 = new RepairJob(70025, c5, t9, "ProDesk 400", "PC", "HP", jobDate25, jobApp25,
                                        "กำลังซ่อม");

                        Calendar jobDate26 = Calendar.getInstance();
                        jobDate26.set(2026, 2, 11);
                        Calendar jobApp26 = Calendar.getInstance();
                        jobApp26.set(2026, 3, 2);
                        RepairJob r26 = new RepairJob(70026, c6, t10, "ThinkStation P340", "PC", "Lenovo", jobDate26,
                                        jobApp26,
                                        "รออะไหล่");

                        Calendar jobDate27 = Calendar.getInstance();
                        jobDate27.set(2026, 2, 12);
                        Calendar jobApp27 = Calendar.getInstance();
                        jobApp27.set(2026, 3, 5);
                        RepairJob r27 = new RepairJob(70027, c7, t11, "iMac 24", "PC", "Apple", jobDate27, jobApp27,
                                        "กำลังซ่อม");

                        Calendar jobDate28 = Calendar.getInstance();
                        jobDate28.set(2026, 2, 13);
                        Calendar jobApp28 = Calendar.getInstance();
                        jobApp28.set(2026, 3, 7);
                        RepairJob r28 = new RepairJob(70028, c8, t12, "Aspire C24", "PC", "Acer", jobDate28, jobApp28,
                                        "กำลังซ่อม");

                        Calendar jobDate29 = Calendar.getInstance();
                        jobDate29.set(2026, 2, 13);
                        Calendar jobApp29 = Calendar.getInstance();
                        jobApp29.set(2026, 3, 10);
                        RepairJob r29 = new RepairJob(70029, c9, t13, "ROG G22", "PC", "ASUS", jobDate29, jobApp29,
                                        "รอซ่อม");

                        Calendar jobDate30 = Calendar.getInstance();
                        jobDate30.set(2026, 2, 13);
                        Calendar jobApp30 = Calendar.getInstance();
                        jobApp30.set(2026, 3, 12);
                        RepairJob r30 = new RepairJob(70030, c10, t14, "OptiPlex 5090", "PC", "Dell", jobDate30,
                                        jobApp30,
                                        "กำลังซ่อม");

                        Review rv1 = new Review(80001, c1, r1, 5, "ซ่อมเร็วมาก เครื่องกลับมาใช้งานได้ปกติ");
                        Review rv2 = new Review(80002, c2, r2, 4, "บริการดี อธิบายปัญหาเครื่องให้เข้าใจ");
                        Review rv3 = new Review(80003, c3, r3, 5, "เปลี่ยนอะไหล่แล้วเครื่องเร็วขึ้นมาก");
                        Review rv4 = new Review(80004, c4, r4, 4, "ซ่อมเรียบร้อย ใช้งานได้ดี");
                        Review rv5 = new Review(80005, c5, r5, 5, "พนักงานบริการดีมาก ประทับใจ");
                        Review rv6 = new Review(80006, c6, r6, 4, "ซ่อมเสร็จตามเวลาที่แจ้งไว้");
                        Review rv7 = new Review(80007, c7, r7, 5, "เครื่องกลับมาเหมือนใหม่เลย");
                        Review rv8 = new Review(80008, c8, r8, 4, "บริการรวดเร็ว ราคาไม่แพง");
                        Review rv9 = new Review(80009, c9, r9, 5, "ช่างแก้ปัญหาได้ตรงจุดมาก");
                        Review rv10 = new Review(80010, c10, r10, 4, "โดยรวมดี ใช้งานได้ปกติ");
                        Review rv11 = new Review(80011, c11, r11, 5, "เปลี่ยนพัดลมแล้วเครื่องไม่ร้อนแล้ว");
                        Review rv12 = new Review(80012, c12, r12, 4, "อธิบายขั้นตอนซ่อมละเอียดดี");
                        Review rv13 = new Review(80013, c13, r13, 5, "บริการดีมาก ประทับใจ");
                        Review rv14 = new Review(80014, c14, r14, 4, "ซ่อมเร็วกว่าเวลาที่คาดไว้");
                        Review rv15 = new Review(80015, c15, r15, 5, "เครื่องกลับมาใช้งานได้ดีมาก");
                        Review rv16 = new Review(80016, c16, r16, 4, "ราคาเหมาะสมกับงานซ่อม");
                        Review rv17 = new Review(80017, c17, r17, 5, "ช่างตรวจสอบละเอียดมาก");
                        Review rv18 = new Review(80018, c18, r18, 4, "เปลี่ยน SSD แล้วเครื่องเร็วขึ้นมาก");
                        Review rv19 = new Review(80019, c19, r19, 5, "บริการดี แนะนำร้านนี้");
                        Review rv20 = new Review(80020, c20, r20, 4, "ซ่อมเสร็จตามกำหนด เครื่องใช้งานปกติ");

                        Calendar qDate1 = Calendar.getInstance();
                        qDate1.set(2026, 2, 1);
                        Calendar wDate1 = Calendar.getInstance();
                        wDate1.set(2026, 2, 2);
                        Quotation q1 = new Quotation(r1, sp1, t1, "เปลี่ยน SSD 512GB", qDate1, 1, wDate1);

                        Calendar qDate2 = Calendar.getInstance();
                        qDate2.set(2026, 2, 1);
                        Calendar wDate2 = Calendar.getInstance();
                        wDate2.set(2026, 2, 2);
                        Quotation q2 = new Quotation(r1, sp2, t2, "เพิ่ม RAM 8GB", qDate2, 1, wDate2);

                        Calendar qDate3 = Calendar.getInstance();
                        qDate3.set(2026, 2, 2);
                        Calendar wDate3 = Calendar.getInstance();
                        wDate3.set(2026, 2, 3);
                        Quotation q3 = new Quotation(r2, sp3, t3, "เปลี่ยนพัดลม CPU", qDate3, 1, wDate3);

                        Calendar qDate4 = Calendar.getInstance();
                        qDate4.set(2026, 2, 2);
                        Calendar wDate4 = Calendar.getInstance();
                        wDate4.set(2026, 2, 3);
                        Quotation q4 = new Quotation(r2, sp4, t4, "ทำความสะอาดเครื่อง", qDate4, 1, wDate4);

                        Calendar qDate5 = Calendar.getInstance();
                        qDate5.set(2026, 2, 3);
                        Calendar wDate5 = Calendar.getInstance();
                        wDate5.set(2026, 2, 4);
                        Quotation q5 = new Quotation(r3, sp5, t5, "เปลี่ยนแบตเตอรี่ Laptop", qDate5, 1, wDate5);

                        Calendar qDate6 = Calendar.getInstance();
                        qDate6.set(2026, 2, 3);
                        Calendar wDate6 = Calendar.getInstance();
                        wDate6.set(2026, 2, 4);
                        Quotation q6 = new Quotation(r3, sp6, t6, "เปลี่ยนคีย์บอร์ด", qDate6, 1, wDate6);

                        Calendar qDate7 = Calendar.getInstance();
                        qDate7.set(2026, 2, 4);
                        Calendar wDate7 = Calendar.getInstance();
                        wDate7.set(2026, 2, 5);
                        Quotation q7 = new Quotation(r4, sp7, t7, "เปลี่ยน SSD 1TB", qDate7, 1, wDate7);

                        Calendar qDate8 = Calendar.getInstance();
                        qDate8.set(2026, 2, 4);
                        Calendar wDate8 = Calendar.getInstance();
                        wDate8.set(2026, 2, 5);
                        Quotation q8 = new Quotation(r4, sp8, t8, "เพิ่ม RAM 16GB", qDate8, 1, wDate8);

                        Calendar qDate9 = Calendar.getInstance();
                        qDate9.set(2026, 2, 5);
                        Calendar wDate9 = Calendar.getInstance();
                        wDate9.set(2026, 2, 6);
                        Quotation q9 = new Quotation(r5, sp9, t9, "เปลี่ยนหน้าจอ Laptop", qDate9, 1, wDate9);

                        Calendar qDate10 = Calendar.getInstance();
                        qDate10.set(2026, 2, 5);
                        Calendar wDate10 = Calendar.getInstance();
                        wDate10.set(2026, 2, 6);
                        Quotation q10 = new Quotation(r5, sp10, t10, "เปลี่ยนสายแพจอ", qDate10, 1, wDate10);

                        Calendar qDate11 = Calendar.getInstance();
                        qDate11.set(2026, 2, 6);
                        Calendar wDate11 = Calendar.getInstance();
                        wDate11.set(2026, 2, 7);
                        Quotation q11 = new Quotation(r6, sp11, t1, "เปลี่ยน Power Supply", qDate11, 1, wDate11);

                        Calendar qDate12 = Calendar.getInstance();
                        qDate12.set(2026, 2, 6);
                        Calendar wDate12 = Calendar.getInstance();
                        wDate12.set(2026, 2, 7);
                        Quotation q12 = new Quotation(r6, sp12, t2, "เปลี่ยนเมนบอร์ด", qDate12, 1, wDate12);

                        Calendar qDate13 = Calendar.getInstance();
                        qDate13.set(2026, 2, 7);
                        Calendar wDate13 = Calendar.getInstance();
                        wDate13.set(2026, 2, 8);
                        Quotation q13 = new Quotation(r7, sp13, t3, "เพิ่ม RAM 4GB", qDate13, 1, wDate13);

                        Calendar qDate14 = Calendar.getInstance();
                        qDate14.set(2026, 2, 7);
                        Calendar wDate14 = Calendar.getInstance();
                        wDate14.set(2026, 2, 8);
                        Quotation q14 = new Quotation(r7, sp14, t4, "เปลี่ยน SSD", qDate14, 1, wDate14);

                        Calendar qDate15 = Calendar.getInstance();
                        qDate15.set(2026, 2, 8);
                        Calendar wDate15 = Calendar.getInstance();
                        wDate15.set(2026, 2, 9);
                        Quotation q15 = new Quotation(r8, sp15, t5, "เปลี่ยนจอ PC", qDate15, 1, wDate15);

                        Calendar qDate16 = Calendar.getInstance();
                        qDate16.set(2026, 2, 8);
                        Calendar wDate16 = Calendar.getInstance();
                        wDate16.set(2026, 2, 9);
                        Quotation q16 = new Quotation(r8, sp16, t6, "ซ่อมพอร์ต USB", qDate16, 1, wDate16);

                        Calendar qDate17 = Calendar.getInstance();
                        qDate17.set(2026, 2, 9);
                        Calendar wDate17 = Calendar.getInstance();
                        wDate17.set(2026, 2, 10);
                        Quotation q17 = new Quotation(r9, sp17, t7, "เปลี่ยนพัดลม Laptop", qDate17, 1, wDate17);

                        Calendar qDate18 = Calendar.getInstance();
                        qDate18.set(2026, 2, 9);
                        Calendar wDate18 = Calendar.getInstance();
                        wDate18.set(2026, 2, 10);
                        Quotation q18 = new Quotation(r9, sp18, t8, "ทำความสะอาดเครื่อง", qDate18, 1, wDate18);

                        Calendar qDate19 = Calendar.getInstance();
                        qDate19.set(2026, 2, 10);
                        Calendar wDate19 = Calendar.getInstance();
                        wDate19.set(2026, 2, 11);
                        Quotation q19 = new Quotation(r10, sp19, t9, "เปลี่ยนการ์ดจอ", qDate19, 1, wDate19);

                        Calendar qDate20 = Calendar.getInstance();
                        qDate20.set(2026, 2, 10);
                        Calendar wDate20 = Calendar.getInstance();
                        wDate20.set(2026, 2, 11);
                        Quotation q20 = new Quotation(r10, sp20, t10, "เปลี่ยนสาย SATA", qDate20, 1, wDate20);

                        Calendar qDate21 = Calendar.getInstance();
                        qDate21.set(2026, 2, 11);
                        Calendar wDate21 = Calendar.getInstance();
                        wDate21.set(2026, 2, 12);
                        Quotation q21 = new Quotation(r11, sp21, t1, "เพิ่ม RAM 8GB", qDate21, 1, wDate21);

                        Calendar qDate22 = Calendar.getInstance();
                        qDate22.set(2026, 2, 11);
                        Calendar wDate22 = Calendar.getInstance();
                        wDate22.set(2026, 2, 12);
                        Quotation q22 = new Quotation(r11, sp22, t2, "เปลี่ยน SSD NVMe", qDate22, 1, wDate22);

                        Calendar qDate23 = Calendar.getInstance();
                        qDate23.set(2026, 2, 12);
                        Calendar wDate23 = Calendar.getInstance();
                        wDate23.set(2026, 2, 13);
                        Quotation q23 = new Quotation(r12, sp23, t3, "เปลี่ยนพัดลม CPU", qDate23, 1, wDate23);

                        Calendar qDate24 = Calendar.getInstance();
                        qDate24.set(2026, 2, 12);
                        Calendar wDate24 = Calendar.getInstance();
                        wDate24.set(2026, 2, 13);
                        Quotation q24 = new Quotation(r12, sp24, t4, "ทำความสะอาดภายในเครื่อง", qDate24, 1, wDate24);

                        Calendar qDate25 = Calendar.getInstance();
                        qDate25.set(2026, 2, 13);
                        Calendar wDate25 = Calendar.getInstance();
                        wDate25.set(2026, 2, 14);
                        Quotation q25 = new Quotation(r13, sp25, t5, "เปลี่ยนแบตเตอรี่ Laptop", qDate25, 1, wDate25);

                        Calendar qDate26 = Calendar.getInstance();
                        qDate26.set(2026, 2, 13);
                        Calendar wDate26 = Calendar.getInstance();
                        wDate26.set(2026, 2, 14);
                        Quotation q26 = new Quotation(r13, sp26, t6, "เปลี่ยนคีย์บอร์ด", qDate26, 1, wDate26);

                        Calendar qDate27 = Calendar.getInstance();
                        qDate27.set(2026, 2, 14);
                        Calendar wDate27 = Calendar.getInstance();
                        wDate27.set(2026, 2, 15);
                        Quotation q27 = new Quotation(r14, sp27, t7, "เปลี่ยน SSD 1TB", qDate27, 1, wDate27);

                        Calendar qDate28 = Calendar.getInstance();
                        qDate28.set(2026, 2, 14);
                        Calendar wDate28 = Calendar.getInstance();
                        wDate28.set(2026, 2, 15);
                        Quotation q28 = new Quotation(r14, sp28, t8, "เพิ่ม RAM 16GB", qDate28, 1, wDate28);

                        Calendar qDate29 = Calendar.getInstance();
                        qDate29.set(2026, 2, 15);
                        Calendar wDate29 = Calendar.getInstance();
                        wDate29.set(2026, 2, 16);
                        Quotation q29 = new Quotation(r15, sp29, t9, "เปลี่ยนหน้าจอ Laptop", qDate29, 1, wDate29);

                        Calendar qDate30 = Calendar.getInstance();
                        qDate30.set(2026, 2, 15);
                        Calendar wDate30 = Calendar.getInstance();
                        wDate30.set(2026, 2, 16);
                        Quotation q30 = new Quotation(r15, sp30, t10, "เปลี่ยนสายแพจอ", qDate30, 1, wDate30);

                        Calendar qDate31 = Calendar.getInstance();
                        qDate31.set(2026, 2, 16);
                        Calendar wDate31 = Calendar.getInstance();
                        wDate31.set(2026, 2, 17);
                        Quotation q31 = new Quotation(r21, sp3, t1, "เพิ่ม RAM DDR4 8GB", qDate31, 2, wDate31);

                        Calendar qDate32 = Calendar.getInstance();
                        qDate32.set(2026, 2, 16);
                        Calendar wDate32 = Calendar.getInstance();
                        wDate32.set(2026, 2, 17);
                        Quotation q32 = new Quotation(r22, sp11, t2, "เปลี่ยน SSD 512GB", qDate32, 1, wDate32);

                        Calendar qDate33 = Calendar.getInstance();
                        qDate33.set(2026, 2, 17);
                        Calendar wDate33 = Calendar.getInstance();
                        wDate33.set(2026, 2, 18);
                        Quotation q33 = new Quotation(r23, sp7, t3, "เปลี่ยนพัดลม CPU", qDate33, 1, wDate33);

                        Calendar qDate34 = Calendar.getInstance();
                        qDate34.set(2026, 2, 17);
                        Calendar wDate34 = Calendar.getInstance();
                        wDate34.set(2026, 2, 18);
                        Quotation q34 = new Quotation(r24, sp18, t4, "ทำความสะอาดภายในเครื่อง", qDate34, 1, wDate34);

                        Calendar qDate35 = Calendar.getInstance();
                        qDate35.set(2026, 2, 18);
                        Calendar wDate35 = Calendar.getInstance();
                        wDate35.set(2026, 2, 19);
                        Quotation q35 = new Quotation(r25, sp5, t5, "เปลี่ยนแบตเตอรี่ Laptop", qDate35, 1, wDate35);

                        Calendar qDate36 = Calendar.getInstance();
                        qDate36.set(2026, 2, 18);
                        Calendar wDate36 = Calendar.getInstance();
                        wDate36.set(2026, 2, 19);
                        Quotation q36 = new Quotation(r26, sp21, t6, "เปลี่ยนคีย์บอร์ด Laptop", qDate36, 1, wDate36);

                        Calendar qDate37 = Calendar.getInstance();
                        qDate37.set(2026, 2, 19);
                        Calendar wDate37 = Calendar.getInstance();
                        wDate37.set(2026, 2, 20);
                        Quotation q37 = new Quotation(r27, sp9, t7, "เปลี่ยนหน้าจอ Laptop", qDate37, 1, wDate37);

                        Calendar qDate38 = Calendar.getInstance();
                        qDate38.set(2026, 2, 19);
                        Calendar wDate38 = Calendar.getInstance();
                        wDate38.set(2026, 2, 20);
                        Quotation q38 = new Quotation(r28, sp30, t8, "เปลี่ยนสายแพจอ", qDate38, 1, wDate38);

                        Calendar qDate39 = Calendar.getInstance();
                        qDate39.set(2026, 2, 20);
                        Calendar wDate39 = Calendar.getInstance();
                        wDate39.set(2026, 2, 21);
                        Quotation q39 = new Quotation(r29, sp14, t9, "เพิ่ม RAM 16GB", qDate39, 2, wDate39);

                        Calendar qDate40 = Calendar.getInstance();
                        qDate40.set(2026, 2, 20);
                        Calendar wDate40 = Calendar.getInstance();
                        wDate40.set(2026, 2, 21);
                        Quotation q40 = new Quotation(r30, sp24, t10, "เปลี่ยน SSD NVMe", qDate40, 1, wDate40);

                        Calendar rcDate1 = Calendar.getInstance();
                        rcDate1.set(2026, 2, 3);
                        Receipt rc1 = new Receipt(90001, r1, rcDate1, 5100, "Cash");

                        Calendar rcDate2 = Calendar.getInstance();
                        rcDate2.set(2026, 2, 4);
                        Receipt rc2 = new Receipt(90002, r2, rcDate2, 14600, "Bank Transfer");

                        Calendar rcDate3 = Calendar.getInstance();
                        rcDate3.set(2026, 2, 5);
                        Receipt rc3 = new Receipt(90003, r3, rcDate3, 3300, "Cash");

                        Calendar rcDate4 = Calendar.getInstance();
                        rcDate4.set(2026, 2, 6);
                        Receipt rc4 = new Receipt(90004, r4, rcDate4, 8100, "Credit Card");

                        Calendar rcDate5 = Calendar.getInstance();
                        rcDate5.set(2026, 2, 7);
                        Receipt rc5 = new Receipt(90005, r5, rcDate5, 11000, "Bank Transfer");

                        Calendar rcDate6 = Calendar.getInstance();
                        rcDate6.set(2026, 2, 8);
                        Receipt rc6 = new Receipt(90006, r6, rcDate6, 2100, "Cash");

                        Calendar rcDate7 = Calendar.getInstance();
                        rcDate7.set(2026, 2, 9);
                        Receipt rc7 = new Receipt(90007, r7, rcDate7, 2200, "Credit Card");

                        Calendar rcDate8 = Calendar.getInstance();
                        rcDate8.set(2026, 2, 10);
                        Receipt rc8 = new Receipt(90008, r8, rcDate8, 3700, "Cash");

                        Calendar rcDate9 = Calendar.getInstance();
                        rcDate9.set(2026, 2, 11);
                        Receipt rc9 = new Receipt(90009, r9, rcDate9, 5700, "Bank Transfer");

                        Calendar rcDate10 = Calendar.getInstance();
                        rcDate10.set(2026, 2, 12);
                        Receipt rc10 = new Receipt(90010, r10, rcDate10, 1600, "Cash");

                        Calendar rcDate11 = Calendar.getInstance();
                        rcDate11.set(2026, 2, 13);
                        Receipt rc11 = new Receipt(90011, r11, rcDate11, 9700, "Cash");

                        Calendar rcDate12 = Calendar.getInstance();
                        rcDate12.set(2026, 2, 14);
                        Receipt rc12 = new Receipt(90012, r12, rcDate12, 23500, "Credit Card");

                        Calendar rcDate13 = Calendar.getInstance();
                        rcDate13.set(2026, 2, 15);
                        Receipt rc13 = new Receipt(90013, r13, rcDate13, 1700, "Bank Transfer");

                        Calendar rcDate14 = Calendar.getInstance();
                        rcDate14.set(2026, 2, 16);
                        Receipt rc14 = new Receipt(90014, r14, rcDate14, 2700, "Cash");

                        Calendar rcDate15 = Calendar.getInstance();
                        rcDate15.set(2026, 2, 17);
                        Receipt rc15 = new Receipt(90015, r15, rcDate15, 850, "Bank Transfer");

                        Calendar rcDate16 = Calendar.getInstance();
                        rcDate16.set(2026, 2, 18);
                        Receipt rc16 = new Receipt(90016, r21, rcDate16, 4200, "Cash");

                        Calendar rcDate17 = Calendar.getInstance();
                        rcDate17.set(2026, 2, 19);
                        Receipt rc17 = new Receipt(90017, r22, rcDate17, 600, "Cash");

                        Calendar rcDate18 = Calendar.getInstance();
                        rcDate18.set(2026, 2, 20);
                        Receipt rc18 = new Receipt(90018, r23, rcDate18, 900, "Credit Card");

                        Calendar rcDate19 = Calendar.getInstance();
                        rcDate19.set(2026, 2, 21);
                        Receipt rc19 = new Receipt(90019, r24, rcDate19, 2200, "Bank Transfer");

                        Calendar rcDate20 = Calendar.getInstance();
                        rcDate20.set(2026, 2, 22);
                        Receipt rc20 = new Receipt(90020, r25, rcDate20, 1800, "Cash");
                        SessionFactory sf = HibernateConnection.doHibernateConnection();
                        Session session = sf.openSession();
                        Transaction tx = session.beginTransaction();

                        session.save(c1);
                        session.save(c2);
                        session.save(c3);
                        session.save(c4);
                        session.save(c5);
                        session.save(c6);
                        session.save(c7);
                        session.save(c8);
                        session.save(c9);
                        session.save(c10);
                        session.save(c11);
                        session.save(c12);
                        session.save(c13);
                        session.save(c14);
                        session.save(c15);
                        session.save(c16);
                        session.save(c17);
                        session.save(c18);
                        session.save(c19);
                        session.save(c20);

                        session.save(t1);
                        session.save(t2);
                        session.save(t3);
                        session.save(t4);
                        session.save(t5);
                        session.save(t6);
                        session.save(t7);
                        session.save(t8);
                        session.save(t9);
                        session.save(t10);
                        session.save(t11);
                        session.save(t12);
                        session.save(t13);
                        session.save(t14);
                        session.save(t15);
                        session.save(t16);
                        session.save(t17);
                        session.save(t18);
                        session.save(t19);
                        session.save(t20);

                        session.save(s1);
                        session.save(s2);
                        session.save(s3);
                        session.save(s4);
                        session.save(s5);
                        session.save(s6);
                        session.save(s7);
                        session.save(s8);
                        session.save(s9);
                        session.save(s10);
                        session.save(s11);
                        session.save(s12);
                        session.save(s13);
                        session.save(s14);
                        session.save(s15);
                        session.save(s16);
                        session.save(s17);
                        session.save(s18);
                        session.save(s19);
                        session.save(s20);

                        session.save(sp1);
                        session.save(sp2);
                        session.save(sp3);
                        session.save(sp4);
                        session.save(sp5);
                        session.save(sp6);
                        session.save(sp7);
                        session.save(sp8);
                        session.save(sp9);
                        session.save(sp10);
                        session.save(sp11);
                        session.save(sp12);
                        session.save(sp13);
                        session.save(sp14);
                        session.save(sp15);
                        session.save(sp16);
                        session.save(sp17);
                        session.save(sp18);
                        session.save(sp19);
                        session.save(sp20);
                        session.save(sp21);
                        session.save(sp22);
                        session.save(sp23);
                        session.save(sp24);
                        session.save(sp25);
                        session.save(sp26);
                        session.save(sp27);
                        session.save(sp28);
                        session.save(sp29);
                        session.save(sp30);

                        session.save(p1);
                        session.save(p2);
                        session.save(p3);
                        session.save(p4);
                        session.save(p5);
                        session.save(p6);
                        session.save(p7);
                        session.save(p8);
                        session.save(p9);
                        session.save(p10);
                        session.save(p11);
                        session.save(p12);
                        session.save(p13);
                        session.save(p14);
                        session.save(p15);
                        session.save(p16);
                        session.save(p17);
                        session.save(p18);
                        session.save(p19);
                        session.save(p20);

                        session.save(pd1);
                        session.save(pd2);
                        session.save(pd3);
                        session.save(pd4);
                        session.save(pd5);
                        session.save(pd6);
                        session.save(pd7);
                        session.save(pd8);
                        session.save(pd9);
                        session.save(pd10);
                        session.save(pd11);
                        session.save(pd12);
                        session.save(pd13);
                        session.save(pd14);
                        session.save(pd15);
                        session.save(pd16);
                        session.save(pd17);
                        session.save(pd18);
                        session.save(pd19);
                        session.save(pd20);
                        session.save(pd21);
                        session.save(pd22);
                        session.save(pd23);
                        session.save(pd24);
                        session.save(pd25);
                        session.save(pd26);
                        session.save(pd27);
                        session.save(pd28);
                        session.save(pd29);
                        session.save(pd30);
                        session.save(pd31);
                        session.save(pd32);
                        session.save(pd33);
                        session.save(pd34);
                        session.save(pd35);
                        session.save(pd36);
                        session.save(pd37);
                        session.save(pd38);
                        session.save(pd39);
                        session.save(pd40);

                        session.save(r1);
                        session.save(r2);
                        session.save(r3);
                        session.save(r4);
                        session.save(r5);
                        session.save(r6);
                        session.save(r7);
                        session.save(r8);
                        session.save(r9);
                        session.save(r10);
                        session.save(r11);
                        session.save(r12);
                        session.save(r13);
                        session.save(r14);
                        session.save(r15);
                        session.save(r16);
                        session.save(r17);
                        session.save(r18);
                        session.save(r19);
                        session.save(r20);
                        session.save(r21);
                        session.save(r22);
                        session.save(r23);
                        session.save(r24);
                        session.save(r25);
                        session.save(r26);
                        session.save(r27);
                        session.save(r28);
                        session.save(r29);
                        session.save(r30);

                        session.save(rv1);
                        session.save(rv2);
                        session.save(rv3);
                        session.save(rv4);
                        session.save(rv5);
                        session.save(rv6);
                        session.save(rv7);
                        session.save(rv8);
                        session.save(rv9);
                        session.save(rv10);
                        session.save(rv11);
                        session.save(rv12);
                        session.save(rv13);
                        session.save(rv14);
                        session.save(rv15);
                        session.save(rv16);
                        session.save(rv17);
                        session.save(rv18);
                        session.save(rv19);
                        session.save(rv20);

                        session.save(q1);
                        session.save(q2);
                        session.save(q3);
                        session.save(q4);
                        session.save(q5);
                        session.save(q6);
                        session.save(q7);
                        session.save(q8);
                        session.save(q9);
                        session.save(q10);
                        session.save(q11);
                        session.save(q12);
                        session.save(q13);
                        session.save(q14);
                        session.save(q15);
                        session.save(q16);
                        session.save(q17);
                        session.save(q18);
                        session.save(q19);
                        session.save(q20);
                        session.save(q21);
                        session.save(q22);
                        session.save(q23);
                        session.save(q24);
                        session.save(q25);
                        session.save(q26);
                        session.save(q27);
                        session.save(q28);
                        session.save(q29);
                        session.save(q30);
                        session.save(q31);
                        session.save(q32);
                        session.save(q33);
                        session.save(q34);
                        session.save(q35);
                        session.save(q36);
                        session.save(q37);
                        session.save(q38);
                        session.save(q39);
                        session.save(q40);

                        session.save(rc1);
                        session.save(rc2);
                        session.save(rc3);
                        session.save(rc4);
                        session.save(rc5);
                        session.save(rc6);
                        session.save(rc7);
                        session.save(rc8);
                        session.save(rc9);
                        session.save(rc10);
                        session.save(rc11);
                        session.save(rc12);
                        session.save(rc13);
                        session.save(rc14);
                        session.save(rc15);
                        session.save(rc16);
                        session.save(rc17);
                        session.save(rc18);
                        session.save(rc19);
                        session.save(rc20);

                        tx.commit();
                        session.close();
                        System.out.println("Command completed.");
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

}
