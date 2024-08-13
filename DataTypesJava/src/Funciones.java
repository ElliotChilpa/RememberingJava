public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        // Area de un circulo
        // pi * r2
        double area = circleArea(y);

        System.out.println(area);

        System.out.println("PESOS A DOLARES: " + convertToDolars(200, "MXN"));

    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }
    public static double sphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius,2);
    }

    public static double spheraVolumen(double radius) {
        return (4/3) * Math.PI * Math.pow(radius,3);
    }

    public static double convertToDolars(double quantity, String currency){
        // MXN o COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}

