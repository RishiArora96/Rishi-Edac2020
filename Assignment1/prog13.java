public class prog13 {
 
   public static void main(String[] strings) {

        final double w = 5.6;
        final double h = 8.5;

        double p = 2*(h + w);
		
        double a = w * h;			
		
	System.out.printf("Area is %.1f * %.1f = %.2f \n", w, h, a);
	System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", w, h, p);

    }
}