package com.training.entity;

import com.training.entity.*;
	
	public class Donor implements Comparable<Donor>{
		

		private long donorCode;
		private String donorName;
		private long handPhone;
		private String email;
		private double amountDonated;
		
		
		public Donor() {
			super();
		}

		public Donor(long donorCode, String donorName, long handPhone, String email, double amountDonated) {
			super();
			this.donorCode = donorCode;
			this.donorName = donorName;
			this.handPhone = handPhone;
			this.email = email;
			this.amountDonated = amountDonated;
		}

		public long getDonorCode() {
			return donorCode;
		}

		public void setDonorCode(long donorCode) {
			this.donorCode = donorCode;
		}

		public String getDonorName() {
			return donorName;
		}

		public void setDonorName(String donorName) {
			this.donorName = donorName;
		}

		public long getHandPhone() {
			return handPhone;
		}

		public void setHandPhone(long handPhone) {
			this.handPhone = handPhone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public double getAmountDonated() {
			return amountDonated;
		}

		public void setAmountDonated(double amountDonated) {
			this.amountDonated = amountDonated;
		}
		
		@Override
		public String toString() {
			StringBuffer buffer = new StringBuffer();
			
			buffer = buffer.append(donorCode).append(".").append(donorName).append(".").append(handPhone).append(".").append(email).append(".").append(amountDonated);
			
			return buffer.toString();
		}
		

		@Override
		public int compareTo(Donor obj) {
			
			if(this.handPhone>obj.handPhone) return 1;
			if(this.handPhone<obj.handPhone) return -1;
			
			return 0;
		}
		
		

	}

	
