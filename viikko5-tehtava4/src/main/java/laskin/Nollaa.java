package laskin;

public class Nollaa extends Komento {
  public Nollaa(Sovelluslogiikka sovellus) {
    super(sovellus);
  }

  @Override
  public void suorita(String syote) {
    sovellus.nollaa();
  }

  @Override
  public void peru() {}
}