class Soldado {
    private String nome;
    private int posicao;
    private String arma;
    private static int quantSoldado=0;


    public Soldado(String nome){
        this.nome = nome;
        this.posicao= 0;
        this.arma= "punho";
        this.quantSoldado++;
    }
    
    public void movimentar(int distancia){
        Mover(distancia);
        System.out.println("o soldado percorreu "+ distancia+" posicoes");
    }

    public void movimentar(){
        Mover(10);
        System.out.println("o soldado percorreu 10 posicoes");
    }

    public void atacar(){
        if(tamanhoExercito()){
            setArma("fuzil");
            System.out.println("O soldado "+this.nome+ " está atacando com o"+ this.arma);
        }else{
            System.out.println(" ainda não, esperando o numero do exercito ficar maior");
        }
    }

    public void atacar(String arma){
        if(tamanhoExercito()){
            setArma(arma);
            System.out.println("O soldado "+this.nome+ " está atacando com o"+ this.arma);
        }else{
            System.out.println(" ainda não, esperando o numero do exercito ficar maior");
        }
    }

    public boolean tamanhoExercito(){
        return this.quantSoldado>=10;
    }

    // get e sets
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setArma(String arma){
        this.arma= arma;
    }

    public void Mover(int distancia){
        this.posicao+= distancia; 
    }


    // pensar sobre o controle de instância

    //pensar a sobrecarga

    // public void movimentar

    // public void atacar

    //gets e sets
}