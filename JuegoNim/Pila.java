package JuegoNim;

public class Pila {
    private int columnaa = 3;
    private int columnab = 4;
    private int columnac = 5;

    private int suma = columnaa + columnab + columnac;

    public Pila(int columnaa,int columnab,int columnac,int suma) {
        this.columnaa = columnaa;
        this.columnab = columnab;
        this.columnac = columnac;
        this.suma = suma;
    }

    public Pila() {
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getColumnaa() {
        return columnaa;
    }

    public void setColumnaa(int columnaa) {
        this.columnaa = columnaa;
    }

    public int getColumnab() {
        return columnab;
    }

    public void setColumnab(int columnab) {
        this.columnab = columnab;
    }

    public int getColumnac() {
        return columnac;
    }

    public void setColumnac(int columnac) {
        this.columnac = columnac;
    }

    public int comprobar(char letra,int cant){
        switch (letra){
            case 'A' :
                columnaa -= cant;
                break;
            case 'B' :
                columnab -= cant;
                break;
            case 'C' :
                columnac -= cant;
                break;
        }
        suma -= cant;

        return suma;
    }

    @Override
    public String toString() {
        return " A= "+ columnaa + " B= " + columnab + " C= " + columnac +" ";
    }
}
