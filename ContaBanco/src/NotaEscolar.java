public class NotaEscolar {

    public static void main(String[] args) {
        int nota = 10;
		System.out.println(nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"));
	}
}
