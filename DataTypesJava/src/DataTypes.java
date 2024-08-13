public class DataTypes {
    public static void main(String[] args) {
        int n = 34343;

        var salary = 1000;
        // Pension es el 3% de lo que gana
        var pension = salary - (salary * 0.03); // DOUBLE
        System.out.println(pension);
        System.out.println(salary);

        var employeeName = "Elliot Chilpa";
        System.out.println(employeeName);
    }
}
