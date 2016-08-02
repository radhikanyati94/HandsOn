package com.training.IEntity;

import com.training.entity.*;
import java.util.*;

/**
 * @author rnyati
 *
 */
public interface IDonor {
	
	public boolean  addDonor(Donor obj);
	public boolean[] addDonors(Donor... dnrList);
	public void printDonorList();
	public List<Donor> getDonorList();
	//public List<Project> getProjectList();
	
}
