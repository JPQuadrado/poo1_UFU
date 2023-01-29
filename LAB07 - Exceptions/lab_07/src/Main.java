public class Main {
    public static void main(String[] args) {

        C_Funcionario f = new C_Funcionario();
        System.out.println();
        System.out.println("Passe valores float para representar as porcentagens [ 0.5 -> 50/100 , 1 -> 100/100 ]");
        f.setSal(40000);
        System.out.println();
        try {
            f.aumentaSalario((float) 1);
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println();
            System.out.println(f.getSal());
        }

    }
}