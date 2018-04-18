package epm.com.jdk4;

	import java.util.Date;

	public class Account {
		private String accountnumber;
		private String owner;
		private String currency;
		private double ammount;
		private Date opendate;


		public Account(String accountnumber, String owner, String currency) {
			this.accountnumber = accountnumber;
			this.owner = owner;
			this.currency = currency;
			this.ammount = 0.0;
		}

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((accountnumber == null) ? 0 : accountnumber.hashCode());
			long temp;
			temp = Double.doubleToLongBits(ammount);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((currency == null) ? 0 : currency.hashCode());
			result = prime * result + ((opendate == null) ? 0 : opendate.hashCode());
			result = prime * result + ((owner == null) ? 0 : owner.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Account other = (Account) obj;
			if (accountnumber == null) {
				if (other.accountnumber != null)
					return false;
			} else if (!accountnumber.equals(other.accountnumber))
				return false;
			if (Double.doubleToLongBits(ammount) != Double.doubleToLongBits(other.ammount))
				return false;
			if (currency == null) {
				if (other.currency != null)
					return false;
			} else if (!currency.equals(other.currency))
				return false;
			if (opendate == null) {
				if (other.opendate != null)
					return false;
			} else if (!opendate.equals(other.opendate))
				return false;
			if (owner == null) {
				if (other.owner != null)
					return false;
			} else if (!owner.equals(other.owner))
				return false;
			return true;
		}


		public String getowner() {
			return owner;
		}

		public void setopendate(Date opendate) {
			this.opendate = opendate;
		}



		public Date getopendate() {
			return this.opendate;
		}


		public boolean addtransaction(double delta, String currency) {
			if (this.currency.contentEquals(currency)) {
				this.ammount = this.ammount + delta;
				return true;
			} else {
				return false;
			}
		}

		public boolean minustransaction(double delta, String currency) {
			if (this.currency.contentEquals(currency)) {
				this.ammount = this.ammount - delta;
				return true;
			} else {
				return false;
			}
		}
		@Override
		public String toString() {
		return "Account [" + accountnumber + "], " +owner + ", " + ammount + " "+ currency + ".";
		}
		


	}

