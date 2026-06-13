package practiceJava;

import java.lang.module.ModuleDescriptor.Builder;

public class BuilderPattern {

	public static void main(String[] args) {
	
        LoanApplication loanApp = new LoanApplication.Builder()
        		            .amount(1000)
        		            .Name("Saiteja")
        		            .age(26)
        		            .tenure(10)
        		            .Build();
        System.out.println("Loan created for: " + loanApp);
	}

}

//cretae one seperate class 
class LoanApplication{
	private String Name;
	private int tenure;
	private int age;
	private double amount;
	//in class create constructor params with builder class
	private LoanApplication(Builder builder) {
		this.Name = builder.Name;
		this.amount = builder.amount;
		this.age = builder.age;
		this.tenure = builder.tenure;
	}
	//create static buider class having builder params to get with there respective params with each methods
	public static class Builder{
		private String Name;
		private int tenure;
		private int age;
		private double amount;
		
		public Builder Name(String Name){
			this.Name = Name;
			return this;
		}
		public Builder age(int  age){
			this.age = age;
			return this;
		}
		public Builder tenure(int tenure){
			this.tenure = tenure;
			return this;
		}
		public Builder amount(double amount){
			this.amount = amount;
			return this;
		}
		//create build method to build 
		public LoanApplication Build() {
			return new LoanApplication(this);
		}
	}
	
}
