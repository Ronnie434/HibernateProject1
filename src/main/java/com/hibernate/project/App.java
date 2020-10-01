package com.hibernate.project;
import org.hibernate.Session;
import com.hibernate.project.entity.StudentEntity;
import com.hibernate.project.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		StudentEntity s1 = new StudentEntity("Ronak", "Patel", 24, "6692859198");
		StudentEntity s2 = new StudentEntity("Ruchi", "Patel", 27, "1234628768");
		StudentEntity s3 = new StudentEntity("Shivam", "Mehta", null, "237561772");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		session.getTransaction().commit();
		
		HibernateUtil.shutDown();
		
	}

}
