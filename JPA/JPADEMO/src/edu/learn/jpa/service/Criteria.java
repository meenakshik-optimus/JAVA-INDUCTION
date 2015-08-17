package edu.learn.jpa.service;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import edu.learn.jpa.bean.CriteriaEmployee;

/**
 * 
 * @author optimus
 *
 */
public class Criteria 
{
	
	/**
	 * main starts here
	 * @param args
	 */
	public static void main(String[] args) {
		   
		   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPADEMO" );
		   EntityManager entitymanager = emfactory.createEntityManager( );
		   CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
		   CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		   Root<CriteriaEmployee> from = criteriaQuery.from(CriteriaEmployee.class);

		   /**
		    * select all records
		    */
		   System.out.println("Select all records");
		   CriteriaQuery<Object> select = criteriaQuery.select(from);
		   TypedQuery<Object> typedQuery = entitymanager.createQuery(select);
		   List<Object> resultlist = typedQuery.getResultList();

		   for(Object object:resultlist) {
			   CriteriaEmployee employee = (CriteriaEmployee)object;
		      System.out.println("EID : " + employee.getEid() + " Ename : " + employee.getEname());
		   }

		   /**
		    * Ordering the records 
		    */
		   System.out.println("Select all records by follow ordering");
		   CriteriaQuery<Object> selectOne = criteriaQuery.select(from);
		   selectOne.orderBy(criteriaBuilder.asc(from.get("ename")));
		   TypedQuery<Object> typedQuery1 = entitymanager.createQuery(selectOne);
		   List<Object> resultlist1 = typedQuery1.getResultList();

		   for(Object object:resultlist1){
			   CriteriaEmployee employee=(CriteriaEmployee)object;
		      System.out.println("EID : " + employee.getEid() + " Ename : " + employee.getEname());
		   }

		   entitymanager.close( );
		   emfactory.close( );
		   }
}
