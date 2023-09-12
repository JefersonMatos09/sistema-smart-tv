public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       
smartTv.diminuirCanal();
smartTv.aumentarCanal();
smartTv.aumentarCanal();
smartTv.aumentarCanal();
System.out.println("O canal atual é o: " + smartTv.canal);


       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       System.out.println("Volume atual " + smartTv.volume);

       System.out.println("Tv Ligada? " + smartTv.ligada);
       System.out.println("Canal atual: " + smartTv.canal);
       System.out.println("Volume atual: " + smartTv.volume);

       smartTv.ligar();
       System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
       System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}
