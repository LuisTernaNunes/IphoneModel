## Diagrama UML — iPhone

```plantuml
@startuml
title UML - iPhone (MusicPlayer, Phone, Browser)

interface MusicPlayer {
  +tocar()
  +pausar()
  +selecionarMusica(musica: String)
}

interface Phone {
  +ligar(numero: String)
  +atender()
  +iniciarCorreioVoz()
}

interface Browser {
  +exibirPagina(url: String)
  +adicionarNovaAba()
  +atualizarPagina()
}

class Song {
  -titulo: String
  +Song(titulo: String)
  +getTitulo(): String
}

class BrowserTab {
  -url: String
  +BrowserTab(url: String)
  +getUrl(): String
  +setUrl(url: String)
}

class iPhone {
  -playlistMusic: List<Song>
  -currentSong: Song
  -isPlaying: boolean
  -tabsBrowser: List<BrowserTab>
  -voicemailActive: boolean
  +iPhone()
}

MusicPlayer <|.. iPhone
Phone <|.. iPhone
Browser <|.. iPhone
Song --> iPhone : uses
BrowserTab --> iPhone : uses

@enduml
