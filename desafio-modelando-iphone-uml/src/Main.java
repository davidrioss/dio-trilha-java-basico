public class Main {
public static void main(String[] args) {
    Iphone iphone = new Iphone();
    System.out.println();
    System.out.println("TESTANDO APARELHO TELEFONICO");
    iphone.ligar("123456789");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    System.out.println();
    System.out.println("TESTANDO REPRODUTOR MUSICAL");
    iphone.selecionarMusica("Hino Nacional");
    iphone.pausar();
    iphone.tocar();

    System.out.println();
    System.out.println("TESTANDO NAVEGADOR DE INTERNET");
    iphone.adicionarNovaAba();
    iphone.exibirPagina("www.google.com");
    iphone.atualizarPagina();
}
}
