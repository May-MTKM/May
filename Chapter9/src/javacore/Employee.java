package javacore;

import java.util.Objects;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Employee {
	
	private int empId;
	private String name;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(empId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(name, other.name);
	}
	
	
}