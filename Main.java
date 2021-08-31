class Example {
	private int x;
	private int y;

	Example(int a, int b){
		x = a;
		y = b;
	}

	Example(){
		x = 0;
		y = 0;
	}

	void setXY(int a, int b){
		x = a;
		y = b;
	}

	void func(Example a){
		this.x += a.x;
		this.y += a.y;
		a.x++;
		a.y++;
	}

	public String toString(){
		return "x = " + x + ", y = " + y;
	}
}

class Main{
	public static void main(String [] args){
		Example a = new Example(10, 20);
		Example b = new Example();

		b.setXY(40, 10);

		System.out.println("Class a: " + a);
		System.out.println("Class b: " + b);

		a.func(b);
		System.out.println("After a.func(b) call: ");
		System.out.println("Class a: " + a);
		System.out.println("Class b: " + b);

		a.func(a);
		System.out.println("After a.func(a) call: ");
		System.out.println("Class a: " + a);
		System.out.println("Class b: " + b);
	}
}