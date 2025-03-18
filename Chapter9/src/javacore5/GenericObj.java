package javacore5;

public class GenericObj<M> {


	M obj;
	void add(M obj){
	this.obj=obj;
	}
	M get(){
	return obj;
	}
	@Override
	public String toString() {
		return "GenericObj [obj=" + obj + "]";
	}
	
	

}

