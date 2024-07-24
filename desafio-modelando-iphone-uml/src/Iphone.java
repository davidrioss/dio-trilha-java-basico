public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página web: " + url);
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução de música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo musica: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
