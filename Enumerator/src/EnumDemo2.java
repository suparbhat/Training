
enum apple1{
	Jonathan,GoldenDel,RedDel,Winesap,Cortland
}
public class EnumDemo2 {
public static void main (String args[])
{
	apple1 ap;
	System.out.print("Here are the apple cobnstarints");
	//use valueS()
	apple1 allapples[] =apple1.values();
	for(apple1 a: allapples)
		System.out.println(a);
	System.out.println();
	//use valueof();
		ap= apple1.valueOf("Winesap");
		System.out.print("ap contains"+ap);
}
}
