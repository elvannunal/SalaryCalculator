public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        System.out.println("Salary: "+salary);
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public void tax(){
        if(this.salary<=1000){
            System.out.println("No tax applied.");
        } else if (this.salary>1000) {
            this.salary-= (this.salary*3)/100;
            System.out.println("Name: "+this.name+" \nTaxed Salary: "+this.salary);
        }
    }
    public void Bonus(){
        if(this.workHours>=40){
            this.salary+=30;
            System.out.println("Bonus Salary: "+this.salary);
        }
    }

    public void raiseSalary(){
        if(hireYear>=2011){
            this.salary+=(this.salary*5/100);
            System.out.println("Salary Increase: "+this.salary);
        } else if (hireYear<=2012 && hireYear>=2001) {
            this.salary+=(this.salary*10/100);
            System.out.println("Salary Increase: "+this.salary);
        } else if (hireYear<=2002) {
            this.salary+=(this.salary*15/100);
            System.out.println("Salary Increase: "+this.salary);
        }else {
            System.out.println("No salary increase.");
        }
    }

}

