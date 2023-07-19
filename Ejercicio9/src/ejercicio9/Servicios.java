package ejercicio9;

public class Servicios {

    public double devolverMayor(Matematica mat) {
        double mayor = Math.max(mat.getNum1(), mat.getNum2());
        return mayor;
        //Una forma larga de hacer esto...
//        if (mat.getNum1() > mat.getNum2()) {
//            System.out.println("El numero 1 es mayor al numero 2");
//        } else if (mat.getNum1() < mat.getNum2()) {
//            System.out.println("El numero 2 es mayor al numero 1");
//        } else {
//            System.out.println("Los numeros son iguales");
//        }
    }
    
    public int calcularPotencia(Matematica mat) {
        
        double mayor = devolverMayor(mat);
        double menor = Math.min(mat.getNum1(), mat.getNum2());
        
        int mayorRedondeado = (int) mayor;
        int menorRedondeado = (int) menor;
        
        return (int) Math.pow(mayorRedondeado, menorRedondeado);
//        int num1Redondeado = (int) Math.round(mat.getNum1());
//        int num2Redondeado = (int) Math.round(mat.getNum2());
//        
//        
//        mat.getNum2();
//        if (mat.getNum1() > mat.getNum2()) {
//            System.out.println("La potencia del numero 1 elevado al numero 2 es: ");
//            System.out.println(Math.pow(num1Redondeado, num2Redondeado));
//        } else if (mat.getNum1() < mat.getNum2()) {
//            System.out.println("La potencia del numero 2 elevado al numero 1 es: ");
//            System.out.println(Math.pow(num2Redondeado, num1Redondeado));
//
//        } else {
//            System.out.println("Los numeros son iguales y no lo voy a elevar a la potencia");
//        }
    }
    
    public double calcularRaiz(Matematica mat) {
        
        double menor = Math.min(mat.getNum1(), mat.getNum2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
//        
//        int num1Redondeado = (int) Math.round(mat.getNum1());
//        int num2Redondeado = (int) Math.round(mat.getNum2());
//        
//        
//        mat.getNum2();
//        if (mat.getNum1() > mat.getNum2()) {
//            System.out.println("La raiz cuadrada del numero 1 es ");
//            System.out.println(Math.sqrt(Math.abs(num1Redondeado)));
//            
//        } else if (mat.getNum1() < mat.getNum2()) {
//            System.out.println("La raiz cuadrada del numero 2 es ");
//            System.out.println(Math.sqrt(Math.abs(num2Redondeado)));
//
//        } else {
//            System.out.println("Los numeros son iguales y no lo hice echar raices!");
//        }
    }
}
