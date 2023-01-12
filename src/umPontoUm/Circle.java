package umPontoUm;

public class Circle {
	private double radius;
	   private String color;
	   private double circumference;
	   
	   // Constructors (overloaded)
	   /** Constructs a Circle instance with default value for radius and color */
	   public Circle() {  // 1st (default) constructor
	      radius = 1.0;
	      color = "red";
	      circumference = 13.82;
	   }
	   
	   /** Constructs a Circle instance with the given radius and default color */
	   public Circle(double radius) {  // 2nd constructor
	      this.radius = radius;
	      color = "red";
	   }
	   
	   /** Returns the radius */
	   public double getRadius() {
	     return radius; 
	   }
	   
	   /** Returns the area of this Circle instance */
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   public Circle (double r, String c) {
		   radius = r;
		   color = c;
	   }
	   
	   // Resolução 
	   public String getColor() {
		   return color;
	   }
	   
	   public double getCircumference() {
		   return circumference;
	   }
	   
	// Setter for instance variable radius
	   public void setRadius(double radius) {
	      this.radius = radius;
	   }
	    
	   // Setter for instance variable color
	   public void setColor(String color) {
		   this.color = color;
	   }
	   /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
	   public String toString() {
	      return "Circle[radius=" + radius + " color=" + color + "]";
	   }
	   
	   public void setCircumference(double circumference) {
		   this.circumference = circumference;
	   }
}
