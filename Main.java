import java.util.Scanner;

static void entry(double degree){
    if (degree >= 85){
        System.out.println("A");
    } else if (degree >= 75) {
        System.out.println("B");
    }else if (degree >= 65){
        System.out.println("C");
    }else if (degree >= 50){
        System.out.println("D");
    }else if (degree < 50){
        System.out.println("F");
    }
}

public static void main(String[] args) {
    System.out.println("Enter your degree:");
    Scanner sc = new Scanner(System.in);
    double degree = sc.nextDouble();
    entry(degree);
}