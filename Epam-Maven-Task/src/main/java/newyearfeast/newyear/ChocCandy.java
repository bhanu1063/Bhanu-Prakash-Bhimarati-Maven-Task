package newyearfeast.newyear;
public class ChocCandy {

	public class ChocCandy extends Candies {
	    ChocCandy(int price,int weight)
	    {
	        super(price,weight);
	    }  
	    public String className()
	    {
	        return "chocCandy";
	    }
	}