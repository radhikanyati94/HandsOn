package com.training.entity;
import com.training.entity.*;
import com.training.IEntity.IDonor;
import java.util.*;



public class DonorImpl implements IDonor {
	
	private List<Donor> donarList;
	
	

	public DonorImpl(List<Donor> donarList) {
		super();
		this.donarList = donarList;
	}
	
	

	public DonorImpl() {
		super();
		donarList = new ArrayList<Donor>();
	}



	@Override
	public boolean addDonor(Donor obj) {
		boolean result= false;
		result = donarList.add(obj);
		return result;
	}

	@Override
	public boolean[] addDonors(Donor... dnrList) {
		int size = dnrList.length;
		
		boolean result[] = new boolean[size];
		int i = 0;
		for(Donor donor: dnrList)
		{
			result[i] = donarList.add(donor);
			i++;
		}
		
		return result;
	}

	@Override
	public void printDonorList() {
		for(Donor donor: donarList)
			System.out.println(donor);
	}

	@Override
	public List<Donor> getDonorList() {
		return donarList;
	}

	/*@Override
	public List<Project> getProjectList() {
		return null;
	}
	*/
	
	public void printByOrder(Comparator comparator)
	{
		Collections.sort(donarList,comparator);
		printDonorList();
	}
	

}
