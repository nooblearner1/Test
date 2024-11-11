public class Main {
	public static void main(String[] args) {
	    
	}
	
	public static int sumPriceA(int appleWeight,int strawberryWeight){
	    return 8*appleWeight+13*strawberryWeight;
	}
	
	public static int sumPriceB(int appleWeight,int strawberryWeight,int mangoWeight){
	    return 8*appleWeight+13*strawberryWeight+20*mangoWeight;
	}
	
	public static int sumPriceC(int appleWeight,int strawberryWeight,int mangoWeight){
	    int applePrice = 8*appleWeight;
	    int strawberryPrice = 13*strawberryWeight*0.8;
        int mangoPrice = 20*mangoWeight;
	    return applePrice+strawberryPrice+mangoPrice;
	}
	
	
	public static int sumPriceD(int appleWeight,int strawberryWeight,int mangoWeight){
	   int applePrice = 8*appleWeight;
	    int strawberryPrice = 13*strawberryWeight*0.8;
        int mangoPrice = 20*mangoWeight;
	    int sumPrice = applePrice+strawberryPrice+mangoPrice;
	    int flag = sumPrice/100
	    return sumPrice- flag*10;
	}
}
