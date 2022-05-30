package prova;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
            
		DecimalFormat df = new DecimalFormat("0.00");
                
	Produto p1 = new Produto("Biscoito WAfer Umbucaja", 2.15);
	Produto p2 = new Produto("sabap Po Cbsi Tamrindo", 9.25);
	Produto p3 = new Produto("Refrigerante Tangerina", 6.45);
	Produto p4 = new Produto("Creme Dental Umbu 120 G", 3.59);
		
	p1.atualizarEstoque("e", 350);
        p1.atualizarEstoque("s", 100);
	p1.atualizarEstoque("e", 550);
	p1.atualizarEstoque("s", 200);

	p2.atualizarEstoque("e", 1100);
        p2.atualizarEstoque("s", 200);
	p2.atualizarEstoque("e", 800);
	p2.atualizarEstoque("s", 900);

	
	System.out.println("Atualizando estoque .....");
	System.out.println("Cód: "+p1.getCodigo()+"  Desc: "+p1.getDescricao()+"  Estoque: "
			+p1.getEstoque()+"  Custo: "+p1.getValorDeCusto()+"   Venda: "
			+df.format(p1.getValorDeVenda())+"    Promo: "+p1.getValorPromocional());
	System.out.println("Cód: "+p2.getCodigo()+"  Desc: "+p2.getDescricao()+"   Estoque: "
			+p2.getEstoque()+"  Custo: "+p2.getValorDeCusto()+"   Venda: "
			+df.format(p2.getValorDeVenda())+"   Promo: "+p2.getValorPromocional());
	
	System.out.println();
	
	p3.atualizarValorPromo(6.19);
	p4.atualizarValorPromo(3.02);
	
	System.out.println("Atualizando Promoção .....");
	System.out.println("Cód: "+p3.getCodigo()+"  Desc: "+p3.getDescricao()+"   Estoque: "
			+p3.getEstoque()+"    Custo: "+p3.getValorDeCusto()+"   Venda: "
			+df.format(p3.getValorDeVenda())+"    Promo: "+p3.getValorPromocional());
	System.out.println("Cód: "+p4.getCodigo()+"  Desc: "+p4.getDescricao()+"  Estoque: "
			+p4.getEstoque()+"    Custo: "+p4.getValorDeCusto()+"   Venda: "
			+df.format(p4.getValorDeVenda())+"    Promo: "+p4.getValorPromocional());
	
	System.out.println();
	
	p1.setValorDeCusto(2.99);
	p2.setValorDeCusto(11.88);
	
	System.out.println("Estoque Total da Empresa: "+Produto.valorEstoqueTotal);
	
	System.out.println();
	
	System.out.println("Atualizando estoque .....");
	System.out.println("Cód: "+p1.getCodigo()+"  Desc: "+p1.getDescricao()+"  Estoque: "
			+p1.getEstoque()+"  Custo: "+p1.getValorDeCusto()+"   Venda: "
			+df.format(p1.getValorDeVenda())+"   Promo: "+p1.getValorPromocional());
	System.out.println("Cód: "+p2.getCodigo()+"  Desc: "+p2.getDescricao()+"   Estoque: "
			+p2.getEstoque()+"  Custo: "+p2.getValorDeCusto()+"  Venda: "
			+df.format(p2.getValorDeVenda())+"  Promo: "+p2.getValorPromocional());
	
	
	
	
	
	
	
	
	
}
	

}
