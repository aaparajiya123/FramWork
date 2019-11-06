package sample;

public class Class1 {
public int add(int a, int b) {
	int result;
	result = a+b;
	return result;
}
public static void main(String[] args) {
Class1 obj = new Class1();
int res;
res= obj.add(100, 225);
System.out.println(res);
}

}
