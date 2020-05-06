public class BankAccount {
	    private long balance;

	        public long getBalance(){
			        return balance;
				    }

		    public void deposit(long value){
			            if (value> 0) {
					                this.balance += value;
							        }
				        }

		        public void withdraw(long value){
				        if (value > 0) {
						            this.balance -= value;
							            }
					    }

			    public void withdraw(long foreignValue, double conversionfactor){
				            long newValue = (long) Math.ceil(foreignValue * conversionfactor);

					            balance -= newValue;
						        }

			        public static void main(String[] args) {
					        BankAccount konto = new BankAccount();

						        konto.deposit(3000);
							        System.out.println(konto.getBalance());

								        konto.withdraw(32, 0.8);
									        System.out.println(konto.getBalance());

										    }

}
