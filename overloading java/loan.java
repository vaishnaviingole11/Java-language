class student
{
       int rollno;
       string name;
       double percentage;

           void student (int rollno, string name,double percentage)
           { 
             this.rollno=rollno;
             this.name=name;
             this.percentage=percentage;
            }
           

class employee
{
         void employee (int id,string name,double annualsalary)
          { 
                this.id=id;
                this.name=name;
                this.annualsalary=annualsalary;
           }
class bank
{
      void approveloan(student s){
       if(percentage>80)
       System.out.println("approve loan is:"200000);
       if else(percentage>=60 && percentaage<=80)
       System.out.println("approve loan is:"100000);
       if else(percentage>=40 && percentaage<=60)
        System.out.println("approve loan is:"50000);
        if else(percentage<40)
        System.out.println("no loan approved");

     }

 void approveloan(employee e){
       if(annual salary>1200000)
       System.out.println("approve loan is:"700000);
       if else(annual salary>=100000&& anual salary<=1200000)
       System.out.println("approve loan is:"600000);
       if else(annual salary>=600000&& anual salary<=100000)
        System.out.println("approve loan is:"50000);
        if else(annual salary>=400000&& anual salary<=600000)
        System.out.println("loan approved 400000");
        if else(annual salary <400000)
         System.out.println(" no loan approved ");


     }
}
class Teststudent{
      public static void main(String []args){
       student s1;
      student s1=new student();

       student s=new student();
       employee e=new employee();

       s1.approveloan(s);
       s1.approveloan(e);
}
}

         
         
    

  