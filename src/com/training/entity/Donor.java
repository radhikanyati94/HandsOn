package com.training.entity;

import com.training.entity.*;
	
	public class Donor {
		

		private long donorCode;
		private String donorName;
		private long handPhone;
		private String email;
		private double amountDonated;
		
		
		public Donor(long donorCode, String donorName, long handPhone, String email) {
			super();
			this.donorCode = donorCode;
			this.donorName = donorName;
			this.handPhone = handPhone;
			this.email = email;
		}

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

		public void setDonorCode(int donorCode) {
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
			
			buffer = buffer.append("Dono Id: ").append(donorCode).append("\tDonor Name: ").append(donorName).append("\tHandPhone: ").append(handPhone).append("\tEmail: ").append(email).append("\n");
			
			return buffer.toString();
		}
		

		
		

	}

	
