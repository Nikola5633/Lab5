package ex3;

public class PerecheNumere {
    private int n1;
    private int n2;

    public PerecheNumere() {
    }

    public PerecheNumere(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getNumar1() {
        return n1;
    }

    public void setNumar1(int numar1) {
        this.n1 = n2;
    }

    public int getNumar2() {
        return n2;
    }

    public void setNumar2(int numar2) {
        this.n2 = numar2;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "numar1: " + n1 +
                ", numar2: " + n2 +
                '}';
    }
}

