import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Phone, MusicPlayer, Browser {
    private List<Song> playListMuisc;
    private Song currentMusic;
    private List<BrowserTab> tabsBrowser;
    private Boolean voiceMailActive;
    private int telephoneNumber;
    private String mail;
    private Boolean isPlayMusic;

    public Iphone(int telephoneNumber, String mail) {
        this.telephoneNumber = telephoneNumber;
        this.mail = mail;
        this.isPlayMusic = false;
        this.voiceMailActive = false;
        this.tabsBrowser = new ArrayList<>();
        this.playListMuisc = new ArrayList<>();
    }

    @Override
    public void exibirPagina(String url) {
        adicionarNovaAba();
        BrowserTab t = new BrowserTab(url);
        System.out.println("exibindo site :" + url);
        this.tabsBrowser.add(t);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando Pagina");
    }

    @Override
    public void tocar() {
        if(!isPlayMusic && currentMusic != null){
            System.out.println("Tocando Musica");
            isPlayMusic = true;
        }
    }

    @Override
    public void pausar() {
        if(isPlayMusic){
            System.out.println("Musica pausada");
            isPlayMusic = false;
        }else{
            System.out.println("Nenhuma musica tocado");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        Song s = new Song(musica);
        playListMuisc.add(s);
        currentMusic = s;
        System.out.println("Musica tocando é :" + musica);
        isPlayMusic = true;
    }

    @Override
    public void ligar(String numero) {
        System.out.println(this.telephoneNumber + " esta ligando para : " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada Atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        voiceMailActive = true;
        System.out.println("Correio de voz ativo");
    }
}
