package net.springorm.com.SpringORM.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;


import net.springorm.com.SpringORM.entities.Student;

public class StudentDao 
{
	
	public HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Student st)
	{
		Integer r= (Integer)this.hibernateTemplate.save(st);
		return r;
	}
	
	//select a record
	public Student getstudent(int stdid)
	{
		Student st = this.hibernateTemplate.get(Student.class,stdid);
		return st;
	}
	
	//select all report
	public List<Student> getallstudent()
	{
		java.util.List<Student> stdall = this.hibernateTemplate.loadAll(Student.class);
		return stdall;
	}
	
	//delete
	@Transactional
	public void deletestudent(int stdid)
	{
		Student destd = this.hibernateTemplate.get(Student.class,stdid);
		this.hibernateTemplate.delete(destd);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
