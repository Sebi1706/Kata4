package main;
import java.util.List;
import model.*;
import view.*;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Sebi\\Documents\\NetBeansProjects\\Kata4\\email.txt";

        List<Mail> mailList = new MailListReader().read(fileName);

        Histogram<String> histogram = new MailHistogramBuilder().build(mailList);

        HistogramDisplay histoDisplay = new HistogramDisplay(histogram, "Histograma Dominios de correos");

        histoDisplay.execute();
    }

}
