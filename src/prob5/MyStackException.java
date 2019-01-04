package prob5;

public class MyStackException extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ": stack is empty";
	}
}
