package sampleoracle;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Createstudent {

	 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("sampleoracle");
		  EntityManager entitymanager = emFactory.createEntityManager();
		  entitymanager.getTransaction().begin();
		  
		  
		  //removing a row
			student student= entitymanager.find(student.class, 102);
			entitymanager.remove(student);
			
			//updating a column
			student student= entitymanager.find(student.class, 101);
			student.setNum(1848);
		  
		//creating a row
		//student stu = new student();
		  //stu.setId(1);
		  //stu.setEname("akem");
		  //stu.setFee(255000);
		  //stu.setNum(5000);
		  
		  entitymanager.persist(student);
		  entitymanager.getTransaction().commit();
		  
		  entitymanager.close();
		  emFactory.close();
		  
		 }
		}
