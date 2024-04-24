public class Movie {

    private String name;
    private String basedOn;
    private String director;
    private String nominations;
    private String premiereDate;
    private String rateAndSource;


    public Movie(String name,String basedOn,  String director,String nominations,String premiereDate, String rateAndSource){
        this.name = name;
        this.basedOn = basedOn;
        this.director = director;
        this.nominations = nominations;
        this.premiereDate = premiereDate;
        this.rateAndSource = rateAndSource;
    }

    public  String printInfo(){

        return  "\33[32mНазвание фильма\33[0m:\t" + name + "\n" +
                "\33[32mОснован на:\33[0m\t" + basedOn + "\n" +
                "\33[32mРежиссер:\33[0m\t" + director + "\n" +
                "\33[32mНоминации:\33[0m\t" + nominations + "\n" +
                "\33[32mДата премьеры:\33[0m\t" + premiereDate + "\n"+
                "\33[32mРейтинг:\33[0m\t"+ rateAndSource +"\n";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNominations() {
        return nominations;
    }

    public void setNominations(String nominations) {
        this.nominations = nominations;
    }


    public String getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(String premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }
    public String getRateAndSource() {
        return rateAndSource;
    }

    public void setRateAndSource(String rateAndSource) {
        this.rateAndSource = rateAndSource;
    }

}
