package com.training.apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.entity.*;
import com.training.utility.DonorImpl;


public class Application {

	public static void main(String[] args)
	{
		
		DonorImpl implObj = new DonorImpl();
		implObj.addDonor(new Donor(101,"Ramesh",8999,"Ram@abc.com",5000));
		
		implObj.printDonorList();
		
		Donor donor1 = new Donor(102,"John",83999,"John@abc.com",200);
		
		Donor donor2 = new Donor(103,"Tom",895699,"tom@abc.com",300);
		Donor donor3 = new Donor(104,"Tarng",895899,"tara@abc.com",500);
		
		implObj.addDonors(donor1,donor2,donor3);
		
		/*List<Donor> donorList = implObj.printDonorList();
		
		for(Donor obj: donorList)
		{
			System.out.println(obj);
		}*/
		
		List <String> nameList = new ArrayList<String>();
		nameList.add(new String("Zahir"));
		nameList.add(new String("Abhi"));
		nameList.add(new String("Yasif"));
		nameList.add(new String("Babu"));
		
		Collections.sort(nameList);
		System.out.println(nameList);
		
		//Collections.sort(donorList);
		System.out.println("sort by phone number");
		implObj.printDonorList();
				
		System.out.println("sort by Name");
		
		
		
		//implObj.printByOrder(new NameComparator());
		
		//System.out.println("sort by Donor code");
		//implObj.printByOrder(new DonorCodeComparator());
		
	}
}
