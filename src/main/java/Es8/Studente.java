package Es8;

public class Studente {
    private String nome, cognome;
    private int matricola;

    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String toString() {
        return "Studente{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + ", matricola=" + matricola + '}';
    }
}
