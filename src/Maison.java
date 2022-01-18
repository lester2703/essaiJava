public class Maison extends Logement {
    private int m_nbreEtages;

    public Maison(int _superficie, String _adresse, int _nbreEtages)
    {
        super(_superficie, _adresse);
        m_nbreEtages = _nbreEtages;
    }

    @Override
    public void description() {
        System.out.println("Je suis une maison avec " + m_nbreEtages + " étages.");
        System.out.println("Je suis une grande maison avec " + m_nbreEtages + " étages.");
    }
}
