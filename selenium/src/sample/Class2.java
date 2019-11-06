package sample;

public class Class2 {
public int mul (int x, int y) {
	int res2;
	res2 = x*y;
	return res2;
}
public static void main(String[] args) {

Class2 obj1 = new Class2();
int res2 = obj1.mul(50, 60);
System.out.println(res2);

//call class1 from other class
Class1 obj = new Class1();
int res1 = obj.add(111, 222);
System.out.println(res1);
}

}
