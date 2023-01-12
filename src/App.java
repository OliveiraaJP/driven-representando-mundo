public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("000.123.465-50", "Joao", "Rua daora");
        aluno1.curso.setName("Matematica");
        aluno1.curso.setDuration(30);
    }
}
