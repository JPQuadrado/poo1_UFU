public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1("a", 2, 3.5F);
        C2 c2 = new C2("b", 4, 5.5F);
        C3 c3 = new C3("c", 6, 7.5F,"d", 8, 9.5F);

        c1.mostrarAtributos();
        c2.mostrarAtributos();
        c2.mostrarAtributoSuper();
        c3.mostrarAtributos();
        c3.mostrarAtributoSuper();
    }
}