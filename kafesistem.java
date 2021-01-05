package dersler;

public class kafesistem {
    public static void main(String[] args) {

        personel mudur = new personel("Anna",280,-8);
        System.out.println(mudur);

    }
}

class personel extends Object{
    private String ad;
    private int id;
    private int yas;

    public personel() {
        ad = "Qeyd edilmeyi";
        id = 0;
        yas = 18;
    }

    public personel(String ad, int id, int yas) {
        this.ad = ad;
        this.id = id;
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18)
        this.yas = yas;
        else this.yas = 18;
    }

    @Override
    public String toString() {
        return "personel{" +
                "ad='" + ad + '\'' +
                ", id=" + id +
                ", yas=" + yas +
                '}';
    }
}
