package mypack;

import java.util.List;

import org.hibernate.*;

public class TestHibernate {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public static void findAll(){
		org.hibernate.Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try{
			Query query = session.createQuery("from Iotid  ");
			List<Iotid> list=query.list();
			   for(Iotid admin:list){
			    System.out.println(admin.getid());
			   }
			  }finally{
			   if(session!=null)
				   session.close();
			  }
	}

}
