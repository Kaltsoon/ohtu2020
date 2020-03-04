package laskin;

public abstract class Komento {
  protected Sovelluslogiikka sovellus;

  public Komento(Sovelluslogiikka sovellus) {
    this.sovellus = sovellus;
  }

  public abstract void suorita(String syote);

  public abstract void peru();
}