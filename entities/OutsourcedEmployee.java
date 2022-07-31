package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalEmployee;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerhour, Double additionalEmployee) {
		super(name, hours, valuePerhour);
		this.additionalEmployee = additionalEmployee;
	}

	public Double getAdditionalEmployee() {
		return additionalEmployee;
	}

	public void setAdditionalEmployee(Double additionalEmployee) {
		this.additionalEmployee = additionalEmployee;
	}
	
	
	@Override
	public double payment() {
		return super.payment() + additionalEmployee *1.1;
	}
	

}
