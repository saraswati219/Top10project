package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc {

	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	public void addCourse() {

		System.out.println("Enter a course details");
		Course c = new Course();
		System.out.println("Enter Course Id:");
		int cid = sc.nextInt();
		c.setCid(cid);
		System.out.println("Enter Course Name:");
		String cname = sc.next();
		c.setCname(cname);
		clist.add(c);
	}

	public void viewCourse() {

		for (Course cl : clist) {
			System.out.println("CId: " + cl.getCid() + " CName:" + cl.getCname());
		}

	}
	
	

	public void addfaculty() {
		
		if(clist.isEmpty()){
			System.out.println("Add course first ");
			return;
		}
		Faculty f = new Faculty();
		System.out.println("Enter faculty details");
		System.out.println("Enter Faculty Id:");
		f.setFid(sc.nextInt());
		System.out.println("Enter Faculty Name:");
		f.setFname(sc.next());
		
		for(Course cl:clist)
		{
			System.out.println("CId: "+cl.getCid()+" CName: "+cl.getCname());
		}
		
		System.out.println("Enter a course id to add course to perticuar faculty ");
		int cid	= sc.nextInt();
		for(Course c : clist) {
			if(c.getCid()==cid) {
				f.setCourse(c);
			}
		}
		flist.add(f);
	}
		@Override
		public void viewFaculty() {
			for(Faculty fl :flist)
			{
				System.out.println("FID:"+fl.getFid()+" FName:"+fl.getFname()+" CId:"+fl.getCourse().getCid()+" CName:"+fl.getCourse().getCname());
			}

		}
	
	
	@Override
	public void addBatch()
	{
		if(flist.isEmpty()){
			System.out.println("Add faculty first ");
			return;
		}
		Batch b = new Batch();
		System.out.println("Enter batch details");
		System.out.println("Enter Batch Id:");
		b.setBid(sc.nextInt());
		System.out.println("Enter Faculty Name:");
		b.setBname(sc.next());
		
		for(Faculty fl:flist)
		{
			System.out.println("FId: "+fl.getFid()+" FName: "+fl.getFname());
		}
		
		System.out.println("Enter a course id to add faculty to perticuar Batch ");
		int fid	= sc.nextInt();
		for(Faculty f: flist) {
			if(f.getFid()==fid) {
				b.setFaculty(f);
			}
		}
		blist.add(b);
	}
		
		@Override
		public void viewBatch() {
			for(Batch bl:blist)
			{
				System.out.println("BId:"+bl.getBid()+" BName:"+bl.getBname()+" FId:"+bl.getFaculty().getFid()+" FName:"+bl.getFaculty().getFname());
			}
		}
	
	



	@Override
	public void addStudent() {
		if(blist.isEmpty()){
			System.out.println("Add Batch first ");
			return;
		}
		Student s = new Student();
		System.out.println("Enter Batch details");
		System.out.println("Enter Student Id:");
		s.setSid(sc.nextInt());
		System.out.println("Enter Student Name:");
		s.setSname(sc.next());
		
		for(Batch bl:blist)
		{
			System.out.println("BId: "+bl.getBid()+" BName: "+bl.getBname());
		}
		
		System.out.println("Enter a course id to add faculty to perticuar Batch ");
		int bid	= sc.nextInt();
		for(Batch b: blist) {
			if(b.getBid()==bid) {
				s.setBatch(b);
			}
		}
		slist.add(s);
		
	}
		
		@Override
		public void viewStudent() {
			for(Student sl :slist)
			{
				System.out.println("SId:"+sl.getSid()+" SName:"+sl.getSname()+" BId:"+sl.getBatch().getBid()+" BName:"+sl.getBatch().getBname()+" FID:"+sl.getBatch().getFaculty().getFid()+" FName:"+sl.getBatch().getFaculty().getFname()+" CID:"+sl.getBatch().getFaculty().getCourse().getCid()+" cName:"+sl.getBatch().getFaculty().getCourse().getCname());
			}
			
		
		}

	

	
	

	
}