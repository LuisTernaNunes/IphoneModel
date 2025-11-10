public class main {
    public static void main(String[] args) {
        Iphone phone = new Iphone(43931312,"JoaoPerera@gmail.com");

        phone.selecionarMusica("Hey Jude - The Beatles");
        phone.tocar();
        phone.pausar();

        phone.ligar("+55 11 7474-787");
        phone.atender();
        phone.iniciarCorreioVoz();

        phone.exibirPagina("https://www.apple.com");
        phone.atualizarPagina();
    }
}
