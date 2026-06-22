package pk_nuevaespecie;

public class Mamifero implements IAmamantar {

    public int getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(int nroPatas) {
        this.nroPatas = nroPatas;
    }

    private int nroPatas;

    @Override
    public boolean amamantar() {
        throw new UnsupportedOperationException("Amamantando como tu madre... '");
    }


}
