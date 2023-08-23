

import classes.Computador;

public class ProgramaComputador {
    public static void main(String[] args) throws Exception {
        
        Computador comp= new Computador();

        comp.processador = "Intel i9 13900k";
        comp.placaVideo = "Nvidea Geforce RTX 4090 TI";
        comp.memoria = "Corsair RGB128GB ram ddr5";
        comp.placaMae = "asus Tuf Gaming h980 ultra full power";
        comp.fonte = "Corsair 1200w full modular";
        comp.armazenamento = "Kingston ssd nvme 2T 1000MB/s LeE";
        comp.ligar();
        comp.desligar();
        comp.usar();
        comp.status();

    }
}
