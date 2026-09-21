class calculator{
//addition//
void add(int a,int b){
int c=a+b;
System.out.println(c);
}

void add(double a,int b){
double c=a+b;

System.out.println(c);
}

void add(int a,double b){
double c=a+b;

System.out.println(c);
}

void add(double a,double b){
double c=a+b;

System.out.println(c);
}

//////subtracton/////

void sub(int a,int b){
int c=a-b;

System.out.println(c);
}

void sub(double a,int b){
double c=a-b;

System.out.println(c);
}

void sub(int a,double b){
double c=a-b;

System.out.println(c);
}

void sub(double a,double b){
double c=a-b;

System.out.println(c);
}

//multiplication


void mul(int a,int b){
int c=a*b;

System.out.println(c);
}

void mul(double a,int b){
double c=a*b;

System.out.println(c);
}

void mul(int a,double b){
double c=a*b;

System.out.println(c);
}

void mul(double a,double b){
double c=a*b;

System.out.println(c);
}

//division//
void div(int a,int b){
int c=a/b;

System.out.println(c);
}

void div(double a,int b){
double c=a/b;

System.out.println(c);
}

void div(int a,double b){
double c=a/b;

System.out.println(c);
}

void div(double a,double b){
double c=a/b;

System.out.println(c);
}
}

//class calculator ends here

class TestCalculator{
public static void main(String[] args)
{
///additon//
System.out.println("addtion");
calculator c1;//reference
c1=new calculator();
c1.add(10,10);
c1.add(10.5,10);
c1.add(20,10.4);
c1.add(2.5,12.4);


//subtraction///
System.out.println("subtraction");
calculator c2;
c2=new calculator();
c2.sub(10,10);
c2.sub(10.5,10);
c2.sub(20,10.4);
c2.sub(2.5,12.4);

//multiplication//
System.out.println("multiplication");
calculator c3;
c3=new calculator();
c3.mul(10,10);
c3.mul(10.5,10);
c3.mul(20,10.4);
c3.mul(2.5,12.4);

//division//
System.out.println("division");
calculator c4;
c4=new calculator();
c4.div(10,10);
c4.div(10.5,10);
c4.div(20,10.4);
c4.div(2.5,12.4);

}
}



