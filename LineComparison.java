public class LineComparison{
	public double length(int x1,int x2,int y1,int y2){
		double l = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2-y1)));
		return l;
	}
}
