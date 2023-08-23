package classes;


public class Computador {
    
    public String processador;
    public String placaVideo;
    public String memoria;
    public String placaMae;
    public String fonte;
    public String armazenamento;
    private boolean ligado;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void usar(){
        if(this.ligado == true){
            System.out.println("É possivel usar o computador? ");
    
        }else{
            System.out.println("Não É possivel usar o computador? ");
        }
    }   

    public void status(){
        System.out.println("Processador: " + this.processador);
        System.out.println("Plava de Vídeo: " + this.placaVideo);
        System.out.println("Memória: " + this.memoria);
        System.out.println("Placa Mãe: " + this.placaMae);
        System.out.println("Fonte: " + this.fonte);
        System.out.println("Armazenamento: " + this.armazenamento);
    }
}
