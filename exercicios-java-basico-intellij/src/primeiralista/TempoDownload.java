package primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempoDownload {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println("Informe o tamanho do arquivo em MB");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Informe a velocidade de download em MB/s");
        double velocidadeDownload = scan.nextDouble();

        double tempoDownloadMin = (int)(tamanhoArquivo / velocidadeDownload) / 60;
        double tempoDownloadSec = ((((tamanhoArquivo / velocidadeDownload) / 60) - tempoDownloadMin) * 60) / 100;
        double tempoDownload = tempoDownloadMin + tempoDownloadSec;
        System.out.println("O seu arquivo irá baixar em " + decimalFormat.format(tempoDownload) + " minutos.");

    }
}
