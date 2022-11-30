package ex_classeAbstrata;

public class OpDiv extends OpMat {
	private double n1, n2;

	@Override
	public double calcula() {
		return n1/n2;
	}

}
