package com.training.IEntity;

import com.training.entity.*;
import java.util.*;

/**
 * @author rnyati
 *
 */
public interface IDonor {
	
	public int addDonor(Donor obj);
	public int addDonors(Donor... dnrList);
	public void printDonorList();
	//public List<Donor> getDonorList();
	public Set<DonorProject> getProjectList(long donorId);
	
}
