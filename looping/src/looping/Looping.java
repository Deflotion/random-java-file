package looping;

public class Looping {

    public static void main(String[] args) {
   
    int genap = 2;
    System.out.println("looping");
    while(genap < 30){
    genap = genap+2;
        System.out.print(genap + ", ");
        if (genap >= 30 ){
        break;
    }
    
}
    System.out.print("\nlooping for ");
    int b = 2;
    for(int a = 1; a <= 20; a+=2){
        System.out.print(a + ", " + b + ", ");
        b+=1;
    }
    }
}
