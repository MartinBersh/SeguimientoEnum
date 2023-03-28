package Ejer2;

public class Test {
    MEs mEs;

    public Test(MEs mEs) {
        this.mEs = mEs;
    }
    public void mesIsLike(){
        switch (mEs){
            case ENERO:
                System.out.println("Enero es de vacaciones");
                break;
            case FEBRERO:
                System.out.println(MEs.FEBRERO + " es aburrido");
                break;
            case ABRIL:
            case MARZO:
                System.out.println("Son meses con semana santa y festivos");
                break;
            case JUNIO:
            case MAYO:
                System.out.println("SOn meses malos pero se acerca vacaciones");
                break;
            case JULIO:
                System.out.println("Vacaciones!");
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test(MEs.MARZO);
        t1.mesIsLike();
    }
}
