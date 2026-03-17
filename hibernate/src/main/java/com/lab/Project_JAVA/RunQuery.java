package com.lab.Project_JAVA;

import org.hibernate.query.Query;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lab.util.HibernateConnection;

public class RunQuery {
    @SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
    public static void main(String[] args) {
        SessionFactory sf = HibernateConnection.doHibernateConnection();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        try {
            // 1 งานที่กำลังซ่อม
            String hql1 = "SELECT r.jobID, c.customerName, r.status "
                    + "FROM RepairJob r JOIN r.customer c "
                    + "WHERE r.status = :status";
            Query query1 = session.createQuery(hql1);
            query1.setParameter("status", "กำลังซ่อม");
            List<Object[]> rows1 = query1.getResultList();

            System.out.println("//---------------(1)---------------//");
            for (Object[] row : rows1) {
                System.out.println("JobID: " + row[0] + " Customer: " + row[1] + " Status: " + row[2]);
            }

            // 2 หาอะไหล่ที่ใกล้หมด
            String hql2 = "SELECT partName, QtySpare "
                    + "FROM SparePart "
                    + "WHERE QtySpare < :qty";

            Query query2 = session.createQuery(hql2);
            query2.setParameter("qty", 5);
            List<Object[]> rows2 = query2.getResultList();

            System.out.println("//---------------(2)---------------//");
            for (Object[] row : rows2) {
                System.out.println(row[0] + " " + row[1]);
            }

            // 3 ดูงานที่มีรีวิวคะแนนมากกว่า 4
            String hql3 = "SELECT rj.jobID, c.customerName, r.rating "
                    + "FROM Review r "
                    + "JOIN r.customer c "
                    + "JOIN r.repairJob rj "
                    + "WHERE r.rating > :score";
            Query query3 = session.createQuery(hql3);
            query3.setParameter("score", 4);
            List<Object[]> rows3 = query3.getResultList();

            System.out.println("//---------------(3)---------------//");
            for (Object[] row : rows3) {
                System.out.println("JobID: " + row[0] + " Customer: " + row[1] + " Rating = " + row[2]);
            }

            // 4 รวมจำนวนอะไหล่ที่ใช้ในแต่ละงาน
            String hql4 = "SELECT r.jobID, SUM(q.amount) "
                    + "FROM Quotation q "
                    + "JOIN q.repairJob r "
                    + "GROUP BY r.jobID";
            Query query4 = session.createQuery(hql4);
            List<Object[]> rows4 = query4.getResultList();

            System.out.println("//---------------(4)---------------//");
            for (Object[] row : rows4) {
                System.out.println("JobID: " + row[0] + " Amount: " + row[1]);
            }

            // 5 เรียงราคาของของงานจากมากไปน้อย
            String hql5 = "SELECT r.jobID, MAX(rc.totalPrice) "
                    + "FROM Receipt rc "
                    + "JOIN rc.repairJob1 r "
                    + "GROUP BY r.jobID "
                    + "ORDER BY MAX(rc.totalPrice) DESC";
            Query query5 = session.createQuery(hql5, Object[].class);
            List<Object[]> rows5 = query5.getResultList();

            System.out.println("//---------------(5)---------------//");
            for (Object[] row : rows5) {
                System.out.println("JobID: " + row[0] + " TotalPrice: " + row[1]);
            }

            // 6 นับจำนวนงานซ่อมทั้งหมด
            String hql6 = "SELECT COUNT(jobID) "
                    + "FROM RepairJob";
            Query query6 = session.createQuery(hql6, Long.class);
            Long totalJobs = (Long) query6.uniqueResult();

            System.out.println("//---------------(6)---------------//");
            System.out.println("Total Repair Jobs: " + totalJobs);

            // 7 แสดงลูกค้าทุกคนพร้อมงานซ่อม
            String hql7 = "SELECT c.customerName, r.jobID "
                    + "FROM RepairJob r "
                    + "LEFT JOIN  r.customer c";
            Query query7 = session.createQuery(hql7, Object[].class);
            List<Object[]> rows7 = query7.getResultList();

            System.out.println("//---------------(7)---------------//");
            for (Object[] row : rows7) {
                System.out.println("Customer: " + row[0] + " JobID: " + row[1]);
            }

            // 8 หาลูกค้าที่มีงานซ่อมมากกว่า 1 งาน
            String hql8 = "SELECT c.customerName, COUNT(r.jobID) "
                    + "FROM RepairJob r "
                    + "JOIN r.customer c "
                    + "GROUP BY c.customerName "
                    + "HAVING COUNT(r.jobID) > 1";
            Query q8 = session.createQuery(hql8, Object[].class);
            List<Object[]> rows8 = q8.getResultList();

            System.out.println("//---------------(8)---------------//");
            for (Object[] r : rows8) {
                System.out.println("Customer: " + r[0] + " Jobs: " + r[1]);
            }

            // 9 หางานซ่อมที่มีคะแนนรีวิวเฉลี่ยมากกว่า 4
            String hql9 = "SELECT rj.jobID, AVG(rv.rating) "
                    + "FROM Review rv "
                    + "JOIN rv.repairJob rj "
                    + "GROUP BY rj.jobID "
                    + "HAVING AVG(rv.rating) > :score";
            Query query9 = session.createQuery(hql9, Object[].class);
            query9.setParameter("score", 4.0);
            List<Object[]> rows9 = query9.getResultList();

            System.out.println("//---------------(9)---------------//");
            for (Object[] row : rows9) {
                System.out.println("JobID: " + row[0] + " Average Rating: " + row[1]);
            }

            // 10 แสดงใบเสร็จของลูกค้าตามรหัสลูกค้า
            String hql10 = "SELECT rc.receiptID, r.jobID, rc.dateIssued, r.customer.customerName, rc.totalPrice "
                    + "FROM Receipt rc "
                    + "JOIN rc.repairJob1 r "
                    + "WHERE r.customer.customerID = :ID";
            Query query10 = session.createQuery(hql10, Object[].class);
            query10.setParameter("ID", 10001);
            List<Object[]> rows10 = query10.getResultList();

            System.out.println("//---------------(10)---------------//");
            SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
            for (Object[] row : rows10) {
                Calendar date = (Calendar) row[2];
                System.out.println("ReceiptID: " + row[0]
                        + "\nJobID: " + row[1]
                        + "\nDateIssued: " + fm.format(date.getTime())
                        + "\nCustomer: " + row[3]
                        + "\nTotalPrice: " + row[4]);
            }

            tx.commit();
            session.close();
            System.out.println("Command completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
