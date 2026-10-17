// Superclass
class Staff {
    String staffNo;
    String staffName;
    int staffAge;

    Staff(String staffNo, String staffName, int staffAge) {
        this.staffNo = staffNo;
        this.staffName = staffName;
        this.staffAge = staffAge;
    }

    void display() {
        System.out.println("Staff No: " + staffNo);
        System.out.println("Name: " + staffName);
        System.out.println("Age: " + staffAge);
    }
}

// Fulltime subclass
class FulltimeStaff extends Staff {
    double basicSalary;

    FulltimeStaff(String staffNo, String staffName, int staffAge, double basicSalary) {
        super(staffNo, staffName, staffAge);
        this.basicSalary = basicSalary;
    }

    // Simple statutory deduction example (e.g. 10%)
    double getNetPay() {
        return basicSalary * 0.9;   // 10% deduction
    }

    @Override
    void display() {
        System.out.println("Staff No: " + staffNo);
        System.out.println("Name: " + staffName);
        System.out.println("Age: " + staffAge);
        System.out.println("Monthly Net Pay: " + getNetPay());
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Staff No: ");
        String no = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        FulltimeStaff ft = new FulltimeStaff(no, name, age, salary);
        ft.display();
    }
}

// Parttime subclass
class ParttimeStaff extends Staff {
    int hoursWorked;
    final double ratePerHour = 10;   // property of the class, not local variable

    ParttimeStaff(String staffNo, String staffName, int staffAge, int hoursWorked) {
        super(staffNo, staffName, staffAge);
        this.hoursWorked = hoursWorked;
    }

    double getNetPay() {
        double gross = hoursWorked * ratePerHour;
        return gross * 0.7;   // 30% tax
    }

    @Override
    void display() {
        System.out.println("Staff No: " + staffNo);
        System.out.println("Name: " + staffName);
        System.out.println("Age: " + staffAge);
        System.out.println("Monthly Net Pay: " + getNetPay());
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Staff No: ");
        String no = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();

        ParttimeStaff pt = new ParttimeStaff(no, name, age, hours);
        pt.display();
    }
}