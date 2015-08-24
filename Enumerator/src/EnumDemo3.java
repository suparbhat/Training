
enum Apple{
	Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);
	private int price;
	Apple(int p)
	{
		price=p;
	}
	int getPrice()
	{
		return price;
	}
}
public class EnumDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Apple ap;
     System.out.println("Winesap costs" + Apple.Winesap.getPrice() + "cents.\n");
     
     System.out.print("all apple prices;");
     for (Apple a: Apple.values())
    	 System.out.println(a+"costs"+ a.getPrice() + "cents.");
	}

}
