public class Usuario {
    public static void main(String[] args) throws Exception {
       
        int numero1 = 1;
        String numero2 = "2";
        System.out.println(numero1+numero2); 
        
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
        System.out.println("Canal Atual: " + smartTV.canal);
        
        smartTV.mudarCanal(22);

        System.out.println("TV Ligada: " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTV.ligada);

    }
}
