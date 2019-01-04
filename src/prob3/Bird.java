package prob3;

public abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected abstract void fly();

	protected abstract void sing() ;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(this instanceof Duck) {
			return "오리의 이름은 "+getName()+" 입니다.";
		}else {
			return "참새의 이름은 "+getName()+" 입니다.";
		}
	}
}
