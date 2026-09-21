class Shape{
            double area;
                      void CalculatArea(Triangle t){
                      area=0.5*t.base*t.hight;
                      System.out.println("Area of triangle: "+area);
                      }

                      void CalculatArea(Rectangle r){
                      area=r.length*r.breadth;
                      System.out.println("Area of rectangle: "+area);
                      }

                      void CalculatArea(Circle c){
                      area=3.14*c.radius*c.radius;
                      System.out.println("Area of circle: "+area);
                      }
                      }//class Shape ends here
class Triangle{
              double base;
              double hight;
              
             Triangle(double base,double hight){
                      this.base=base;
                      this.hight=hight;
}
}

class Rectangle{
              double length;
              double breadth;
              
             Rectangle(double length,double breadth){
                      this.length=length;
                      this.breadth=breadth;
}
}

class Circle{
             double radius;
             
             Circle(double radius){
                 this.radius=radius;
}
}
      

class TestShape{
                public static void main(String[] args){
                Shape s1;//reference
                s1=new Shape();

                Triangle t=new Triangle(10,5);
                Rectangle r=new Rectangle(8,6);
                Circle c=new Circle(7);
                
                s1.CalculatArea(t);
                s1.CalculatArea(r);
                s1.CalculatArea(c);
                 }
}