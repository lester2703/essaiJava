public abstract class Logement {
    private int m_superficie;
    private String m_adresse;

    public abstract void description();

    public Logement(int _superficie, String _adresse)
    {
        m_superficie = _superficie;
        m_adresse = _adresse;
    }
}
