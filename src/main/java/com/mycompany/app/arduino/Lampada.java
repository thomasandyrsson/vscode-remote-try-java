package com.mycompany.app.arduino;

    
public class Lampada implements Iluminador{

        boolean ligado = false; 

        public void ligar(){
        this.ligado = true;
        }

        public void desligar(){
        this.ligado = false;
        }

        public void exibir(){
            if(ligado){
                System.out.println("Lumus: A lâmpada está acesa");
            }
            else{
                System.out.println("Nox: Lâmpada desligada");
            }
}
}