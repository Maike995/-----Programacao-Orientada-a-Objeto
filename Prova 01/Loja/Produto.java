package prova;

public class Produto {

	
	public int codigo;
	public String descricao;
	public int estoque;
	public double valorDeCusto;
	public double valorDeVenda;
	public double valorPromocional;
	public static int contador;
	public double promocaoAplicada;
	public static double valorEstoqueTotal;
	
	public Produto(String descricao, double pValorCusto) {
		this.descricao = descricao;
		valorDeCusto = pValorCusto;
		contador++;
		this.codigo = contador;
		estoque = 0;
		this.valorDeVenda=valorDeCusto*1.2;
                
		}

        public void atualizarValorPromo(double valorPromocional) {
            if(valorPromocional>100){
                System.out.println();
                System.out.println("Promoção Invalida");
                System.out.println();
            }else if(valorPromocional<0){
                System.out.println();
                System.out.println("Promoção Invalida");
                System.out.println();
            }else{
                this.valorPromocional=valorPromocional;
		this.promocaoAplicada=this.valorPromocional*100;
                this.valorDeVenda=this.valorDeVenda-(this.valorDeVenda*(this.valorPromocional/100));
            }
		
		
	}

	public void atualizarEstoque(String movimento, int atualiza) {
            valorEstoqueTotal=valorEstoqueTotal-(valorDeCusto*estoque);
            
		if(movimento.equalsIgnoreCase("E")) {
			estoque=estoque+atualiza;
		}
		if(movimento.equalsIgnoreCase("S") && atualiza<=estoque)  {
			estoque=estoque-atualiza;
		}
		
            valorEstoqueTotal=valorEstoqueTotal+(valorDeCusto*estoque);
	}
        
        public double getValorDeCusto() {
		return valorDeCusto;
	}

	public void setValorDeCusto(double valorDeCusto) {
		this.valorDeCusto = valorDeCusto;
		this.valorDeVenda=this.valorDeCusto+(this.valorDeCusto*0.2);
	}
        
        public double getValorPromocional() {
		return valorPromocional;
	}

	public void setValorPromocional(double valorPromocional) {
		this.valorPromocional = valorPromocional;
	}
        
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public double getValorPromoc() {
		return valorPromocional;
	}
        

	public void setValorPromoc(double valorPromocional) {
		this.valorPromocional = valorPromocional;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Produto.contador = contador;
	}
	
	public double getPromocaoAplicada() {
		return promocaoAplicada;
	}

	public void setPromocaoAplicada(double promocaoAplicada) {
		this.promocaoAplicada = promocaoAplicada;
	}

	
	
	
	
}
