import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Movie {

    private String name;
    private String basedOn;
    private String director;
    private String nominations;
    private LocalDate premiereDate;
    private String rateSource;
    private double rate;



    public Movie(String name, String basedOn, String director, String nominations, LocalDate premiereDate, double rate, String rateSource){
        this.name = name;
        this.basedOn = basedOn;
        this.director = director;
        this.nominations = nominations;
        this.premiereDate = premiereDate;
        this.rateSource = rateSource;
        this.rate = rate;
    }

    public  String printInfo(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("ru"));
        String formattedDate = premiereDate.format(formatter);

        return  "\33[32mНазвание фильма\33[0m:\t" + name + "\n" +
                "\33[32mОснован на:\33[0m\t" + basedOn + "\n" +
                "\33[32mРежиссер:\33[0m\t" + director + "\n" +
                "\33[32mНоминации:\33[0m\t" + nominations + "\n" +
                "\33[32mДата премьеры:\33[0m\t" + formattedDate + "\n"+
                "\33[32mРейтинг:\33[0m\t"+ rateSource +"("+rateSource+")\n";

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


    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(LocalDate premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }
    public String getRateSource() {
        return rateSource;
    }

    public void setRateSource(String rateSource) {
        this.rateSource = rateSource;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
